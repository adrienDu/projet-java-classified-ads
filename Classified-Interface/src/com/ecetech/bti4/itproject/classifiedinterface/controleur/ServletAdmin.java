package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.beans.UserSes;

/**
 * Servlet implementation class ServletAdmin
 */
@WebServlet("/admin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SESSION_ADMIN = "sessionUtilisateur";
	public static String VUE = "/WEB-INF/error.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		response.getWriter().append("Served at: ").append(request.getContextPath());
		if(session.getAttribute(SESSION_ADMIN) != null){System.out.println("attribute "+session.getAttribute(SESSION_ADMIN).toString());}
		User user = (User) session.getAttribute(SESSION_ADMIN);
		
		if (user != null) {
			System.out.println("if null" + user.toString() + "permission" + user.getPermission_idPermission());
			if ("admin".compareTo(user.getPermission_idPermission()) == 0) {
				System.out.println("if admin");

				VUE = "/WEB-INF/admin/index.jsp";
			}
		} else {
			System.out.println("else");

			VUE = "/WEB-INF/admin/loginAdmin.jsp";
		}
		//VUE = "/WEB-INF/admin/loginAdmin.jsp";

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
