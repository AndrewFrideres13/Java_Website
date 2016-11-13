package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<link rel='stylesheet' href='styles.css'>\n\t\t<title>Home\n\t\t</title>");
		response.getWriter().append("\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t<li><a href='About'>About Me</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Contact'>Contact Me</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Secret'>TOP SECRET</a>\n\t\t\t\t</li>\n\t\t\t</ul>\n\t\t</nav>\n\t</head>");
		response.getWriter().append("\n\t<body>\n\t\t<h1>Home</h1>\n\t\t<p>Use the above navigation to move around the site.</p>\n\t\t<p>Use the Contact Page to submit some info about yourself and get a hold of me. Read the About page to read about me.\n\t\t</p>\n\t</body>");
		response.getWriter().append("\n\t<footer>&copy; 2016 Andrew Frideres </footer>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
