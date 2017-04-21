package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String VUE = "/WEB-INF/error.jsp";

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");

		// @param forward page vers laquelle la requette est dispatch�
		// @param action
		String idaction = request.getParameter("idaction");
		// on verifie si une action est bien demand�e
		// if ((action != null) || (action.length() != 0)) {
		if ((idaction == null)) { // no action param
			VUE = "/WEB-INF/error.jsp";
		} else { // action param

			// Acces � la page d'authentification
			if (idaction.equals("connexion")) {
				// if(session.getId().isEmpty()){
				VUE = "/WEB-INF/connexion.jsp";
				// }else{
				// VUE = "/WEB-INF/denied.jsp";
			}
			switch (idaction) {
			case "home":
				// servlet home
				break;
			case "connection":
				String iduser = request.getParameter("emailuser");
				String psw = request.getParameter("psw");
				// possibilité de vérification
				if (QualityDataQualification.verifData(iduser) || QualityDataQualification.verifData(psw)) {
					// retourner une erreur
				} else {
					User usertemp = UserDAO.getUserByeMail(iduser);
					if (usertemp == null) {

						// request.setAttribute(ATT_ERREURS, erreurs);
						// request.setAttribute(ATT_RESULTAT, resultat);
						VUE = "/WEB-INF/connexionFail.jsp";

						// VUE = "/WEB-INF/index.jsp"; //??

					} else {

						String type = usertemp.getTypeUser();
						if (type.equals("-1#3")) {
							// ajouter erreur 505
							VUE = "/WEB-INF/error.jsp";

						}

						boolean testPsw = QualityDataQualification.validateAndCriptPsw(psw, usertemp.getMdpUser());
						if (testPsw == false) {

							// request.setAttribute(ATT_ERREURS, erreurs);
							// request.setAttribute(ATT_RESULTAT, resultat);
							VUE = "/WEB-INF/connexionFail.jsp";

							// VUE = "/WEB-INF/index.jsp"; //??
						} else if (testPsw == true) {
							// creer une session =$û*
							
							HttpSession session = request.getSession();
							session.setAttribute("SESSION_USER", usertemp);

							VUE = "/WEB-INF/view/index.jsp";// acceuil after								// authen 

						}
					}

				}

				break;
			case "inscriptionPart":
				// servlet inscription part
				break;
			case "inscriptionEnt":
				// servlet inscription ent
				break;
			case "inscriptionAssos":
				// servlet inscription assos
				break;
			case "logOff":
				// servlet inscription assos
				break;
			case "error":

				break;

			default:
				break;
			}
		}
		// dispatcher vers les jsp correspondantes aux forward
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try {
				processRequest(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     } 	//response.getWriter().append("Served at: ").append(request.getContextPath());

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
