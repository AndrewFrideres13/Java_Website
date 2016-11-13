/**
 * 
 */
package edu.cvtc.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;

/**
 * @author Andrew
 *
 */
public class PasswordEncrypt {

	public static String hashPassword(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.reset();
		md.update(password.getBytes());
		byte[] mdArray = md.digest();
		StringBuilder sb = new StringBuilder(mdArray.length * 2);
		for (byte b : mdArray) {
			int i = b & 0xff;
			if (i < 16) {
				sb.append('0');
			}
			sb.append(Integer.toHexString(i));
		}
		return sb.toString();
	}
	
	public static String getSalt() {
		Random r = new SecureRandom();
		byte[] saltBytes = new byte[32];
		r.nextBytes(saltBytes);
		return Base64.getEncoder().encodeToString(saltBytes);
	}
	
	public static String fullyEncryptedPassword(String password) throws NoSuchAlgorithmException {
		String salt = getSalt();
		return hashPassword(password + salt);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Hash for 'EasyPassword123' : " + hashPassword("EasyPassword123"));
			System.out.println("Salt for 'EasyPassword123' : " + getSalt());
			System.out.println("Fully hashed and salted 'EasyPassword123' : " + fullyEncryptedPassword("EasyPassword123"));
		} catch (NoSuchAlgorithmException ex) {
			System.out.println(ex);
		}

	}

}
