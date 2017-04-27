package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet("/ServletIndex")
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";
	public static final String SESSION_ADMIN = "sessionUtilisateur";
	public static String VUE = "/WEB-INF/error.jsp";
	private ArrayList<Annonce> annonces = new ArrayList<>();
	// ErrorString
	private String errorString = null;
	private String param ="";


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletIndex() {
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
		/*
		 * response.getWriter().append("Served at: ").append(request.
		 * getContextPath()); RequestDispatcher dispatcher =
		 * this.getServletContext().getRequestDispatcher(
		 * "/WEB-INF/view/index.jsp"); dispatcher.forward(request, response);
		 */
		try {
			processRequest(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		String requete = "SELECT * FROM `annonce` WHERE idType_Type in (";
		// @param formulaire
		String trievente = request.getParameter("trievente");
		String trieachat = request.getParameter("formachat");
		System.out.println("trie achat" + trieachat);
		String trierecherche = request.getParameter("trierecherche");
		String trieinfo = request.getParameter("trieinfo");
		if (trieachat == null && trieinfo == null && trierecherche == null && trievente == null) {
			System.out.println("ifnull");
			annonces = AnnonceDAO.getAllAnnonce();
			
		} else {
			if (trieachat != null && trieachat.compareTo("submit") == 0) {
					requete = requete + "0)";
			} else if (trievente != null) {
				if (trievente.compareTo("submit") == 0) {
					requete = requete + "1) and Cat_idCategorie in (";
					if(request.getParameter("Autres") != null && request.getParameter("Autres").compareTo("10") ==0){
						addParam("10");
					}
					else if(request.getParameter("Electromenager") != null && request.getParameter("Electromenager").compareTo("1") ==0){
						addParam("1");
					}else if(request.getParameter("Evenements") != null && request.getParameter("Evenements").compareTo("8") ==0){
						addParam("8");
					}else if(request.getParameter("Immobilier") != null && request.getParameter("Immobilier").compareTo("2") ==0){
						addParam("2");
					}else if(request.getParameter("Livres") != null && request.getParameter("Livres").compareTo("6") ==0){
						addParam("6");
					}else if(request.getParameter("Loisirs") != null && request.getParameter("Loisirs").compareTo("5") ==0){
						addParam("5");
					}else if(request.getParameter("MaisonJardin") != null && request.getParameter("MaisonJardin").compareTo("9") ==0){
						addParam("9");
					}else if(request.getParameter("MaterielPro") != null && request.getParameter("MaterielPro").compareTo("7") ==0){
						addParam("7");
					}
					else if(request.getParameter("Mobilier") != null && request.getParameter("Mobilier").compareTo("3") ==0){
						addParam("3");
					}else if(request.getParameter("Multimédias") != null && request.getParameter("Multimédias").compareTo("4") ==0){
						addParam("4");
					}else if(request.getParameter("Vehicules") != null && request.getParameter("Vehicules").compareTo("0") ==0){
						addParam("0");
					}
				}
			} else if (trierecherche != null) {
				if (trierecherche.compareTo("submit") == 0) {
					requete = requete + "2)";

				}
			} else if (trieinfo != null) {
				if (trieinfo.compareTo("submit") == 0) {
					requete = requete + "3)";

				}
			}

			annonces =(ArrayList<Annonce>) AnnonceDAO.getAnnonceReq(requete);

			System.out.println("annonces "+ annonces.toString());
		}

		VUE = "/WEB-INF/view/index.jsp";
		request.setAttribute("errorString", errorString);
		request.setAttribute("annonce", annonces);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	public void addParam(String parametre){
		if(param.isEmpty()){
			param = parametre;
		}
		else{
			param = param +","+parametre;
		}
		System.out.println("param" + param);
	}
}
