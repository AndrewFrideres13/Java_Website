package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/Contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<link rel='stylesheet' href='styles.css'>\n\t\t<title>Contact</title>");
		response.getWriter().append("\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t<li><a href='About'>About Me</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Home'>Home</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Secret'>TOP SECRET</a>\n\t\t\t\t</li>\n\t\t\t</ul>\n\t\t</nav>\n\t</head>");
		response.getWriter().append("\n\t<body>\n\t\t<h1>Enter your contact info</h1>\n\t\t<form method='post' action='*'> \n\t\t\t<label for='fName'>First Name:</label>");
		response.getWriter().append("\n\t\t\t<input name='fName' id='fName'>");
		response.getWriter().append("\n\n\t\t\t<label for='lName'>Last Name:</label>\n\t\t\t<input name='lName' id='lName'>");
		response.getWriter().append("\n\n\t\t\t<label for='myEmail'>E-mail:</label>\n\t\t\t<input required type='email' name='myEmail' id='myEmail'>");
		response.getWriter().append("\n\n\t\t\t<label for='fakePass'>(FAKE) Password:</label>\n\t\t\t<input required type='password' name='fakePass' id='fakePass'>");
		response.getWriter().append("\n\n\t\t\t<input type='submit' value='Submit'>\n\t\t</form>\n\t\t<p>Please submit your info or I can be contacted at andrewfrideres13@gmail.com\n\t\t</p\n\t</body>\n\t<footer>&copy; 2016 Andrew Frideres</footer>\n</html>");
	
		final int password = request.getParameter("fakePass").trim().length(); 
		if (password < 8) {
			request.setAttribute("fakePass", "");
			response.getWriter().append("\n\t<p>Password is too short\n\t</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
