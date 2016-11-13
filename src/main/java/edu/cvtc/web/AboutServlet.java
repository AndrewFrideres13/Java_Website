package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/About")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<link rel='stylesheet' href='styles.css'>\n\t\t<title>About</title>");
		response.getWriter().append("\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t<li><a href='Contact'>Contact Me</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Home'>Home</a>\n\t\t\t\t</li>\n\t\t\t\t<li><a href='Secret'>TOP SECRET</a>\n\t\t\t\t</li>\n\t\t\t</ul>\n\t\t</nav>\n\t</head>");
		response.getWriter().append("\n\t<body>\n\t\t<h1>About Me</h1>\n\t\t<p>My name is Andrew Frideres, I am currently enrolled in the IT Software Developer program. ");
		response.getWriter().append("I am really big into playing and tinkering around with computers, and whenever i have the free time for it I'm a pretty big gamer as well!");
		response.getWriter().append(" Some of my favorite games include DOOM, and Deus Ex, and too many others to list. I also am a big fan of classic rock, usually when i need to get stuff done I'm blasting it so i can get through it easier.");
		response.getWriter().append("</p>\n\t</body>\n\t<footer>&copy; 2016 Andrew Frideres</footer>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
