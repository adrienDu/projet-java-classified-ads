package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String VUE = "/WEB-INF/error.jsp";

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		VUE = "/WEB-INF/error.jsp";
		// @param forward page vers laquelle la requette est dispatché
		// @param action
		String action = request.getParameter("action");
		String log = request.getParameter("log");
		// on verifie si une action est bien demandée
		// if ((action != null) || (action.length() != 0)) {
		if ((action == null)) { // no action param
			VUE = "/WEB-INF/error.jsp";
		} else { // action param

			// Acces à la page d'authentification
			if (action.equals("register")) {
				// if(session.getId().isEmpty()){
				VUE = "/WEB-INF/register.jsp";
				// }else{
				// VUE = "/WEB-INF/denied.jsp";
			}
			switch (action) {
			case "home":
				//servlet home
				break;
			case "connection":
				//serlvet connection 
				break;
			case "inscriptionPart":
				//servlet inscription part
				break;
			case "inscriptionEnt":
				//servlet inscription ent
				break;
			case "inscriptionAssos":
				//servlet inscription assos
				break;
			case "logOff":
				//servlet inscription assos
				break;
			case "error":

				break;

			default:
				break;
			}
		}

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
