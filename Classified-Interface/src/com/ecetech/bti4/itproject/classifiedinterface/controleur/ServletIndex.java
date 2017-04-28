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
	private String param = "";
	private String requete = "";

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
		requete = "SELECT * FROM `annonce` WHERE idType_Type in (";
		// @param formulaire
		String trievente = request.getParameter("trievente");
		String trieachat = request.getParameter("formachat");
		String trierecherche = request.getParameter("trierecherche");
		String triepropserv = request.getParameter("propserv");

		String trieinfo = request.getParameter("trieinfo");
		// cas generique
		if (trieachat == null && trieinfo == null && trierecherche == null && trievente == null) {
			annonces = AnnonceDAO.getAllAnnonce();

		} else {

			// trie achat
			if (trieachat != null && trieachat.compareTo("submit") == 0) {
				requete = requete + "0)";
				// test des parametres de catégorie
				testParamAchatVente(request);
				// test des parametres de zone
				testZone(request);
				// test des parametres de date
				testDate(request);

			}

			// trieVente
			else if (trievente != null) {
				if (trievente.compareTo("submit") == 0) {
					requete = requete + "1)";
					// test des categorie
					testParamAchatVente(request);
					// test de zone
					testZone(request);
					// test de la date
					testDate(request);

				}
			}
			// trie proposition service
			else if (triepropserv != null) {
				if (triepropserv.compareTo("submit") == 0) {
					requete = requete + "2)";
					{
						testParamRecherche(request);
						testZone(request);
						testDate(request);
					}

				}
			}
			// trie Recherche
			else if (trierecherche != null) {
				if (trierecherche.compareTo("submit") == 0) {
					requete = requete + "3)";
					{
						testParamRecherche(request);
						testZone(request);
						testDate(request);
					}

				}

			}
			// trie info
			else if (trieinfo != null) {
				if (trieinfo.compareTo("submit") == 0) {
					requete = requete + "4)";
					if (request.getParameter("Autres") != null || request.getParameter("Evenements") != null) {
						requete = requete + " and Cat_idCategorie in (";
						if (request.getParameter("Autres") != null
								&& request.getParameter("Autres").compareTo("10") == 0) {
							addParam("10");
						}
						if (request.getParameter("Evenements") != null
								&& request.getParameter("Evenements").compareTo("8") == 0) {
							addParam("8");
						}
						requete = requete + param + ")";
						System.out.println("requete param cat" + requete);
						param = "";
					}
					testZone(request);
					testDate(request);

				}
			}

			annonces = (ArrayList<Annonce>) AnnonceDAO.getAnnonceReq(requete);
			System.out.println("annonces " + annonces.toString());
		}

		VUE = "/WEB-INF/view/index.jsp";
		request.setAttribute("errorString", errorString);
		request.setAttribute("annonce", annonces);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

	}

	public void addParam(String parametre) {
		if (param.isEmpty()) {
			param = parametre;
		} else {
			param = param + "," + parametre;
		}
		System.out.println("param" + param);
	}

	public void testDate(HttpServletRequest request) {
		if (request.getParameter("date") != null) {
			System.out.println("if date");
			requete = requete + " ORDER BY dateAnnonce ";
			if (request.getParameter("date").compareTo("new") == 0) {
				requete = requete + "ASC";
			} else if (request.getParameter("date").compareTo("old") == 0) {
				requete = requete + "DESC";
			}

		}
	}

	public void testParamRecherche(HttpServletRequest request) {

		// test des parametres
		if (request.getParameter("Autres") != null || request.getParameter("Covoiturage") != null
				|| request.getParameter("Fomrations") != null || request.getParameter("Jobs") != null
				|| request.getParameter("PetitsBoulots") != null || request.getParameter("Stages") != null) {
			System.out.println("if categorie");
			requete = requete + " and Cat_idCategorie in (";
			if (request.getParameter("Autres") != null && request.getParameter("Autres").compareTo("10") == 0) {
				addParam("10");
			}
			if (request.getParameter("Covoiturage") != null
					&& request.getParameter("Covoiturage").compareTo("15") == 0) {
				System.out.println("15");
				addParam("15");
			}
			if (request.getParameter("Fomrations") != null && request.getParameter("Fomrations").compareTo("14") == 0) {
				addParam("14");
			}
			if (request.getParameter("Jobs") != null && request.getParameter("Jobs").compareTo("11") == 0) {
				addParam("11");
			}
			if (request.getParameter("PetitsBoulots") != null
					&& request.getParameter("PetitsBoulots").compareTo("13") == 0) {
				addParam("13");
			}
			if (request.getParameter("Stages") != null && request.getParameter("Stages").compareTo("12") == 0) {
				addParam("12");
			}
			requete = requete + param + ")";
			System.out.println("parameter " + param);

			param = "";
		}
	}

	public void testParamAchatVente(HttpServletRequest request) {
		param = "";
		if (request.getParameter("Electromenager") != null || request.getParameter("Evenements") != null
				|| request.getParameter("Immobilier") != null || request.getParameter("Livres") != null
				|| request.getParameter("Loisirs") != null || request.getParameter("MaisonJardin") != null
				|| request.getParameter("MaterielPro") != null || request.getParameter("Mobilier") != null
				|| request.getParameter("Multimédias") != null || request.getParameter("Vehicules") != null) {
			System.out.println("if categorie");
			requete = requete + " and Cat_idCategorie in (";
			if (request.getParameter("Autres") != null && request.getParameter("Autres").compareTo("10") == 0) {
				addParam("10");
			}
			if (request.getParameter("Electromenager") != null
					&& request.getParameter("Electromenager").compareTo("1") == 0) {
				addParam("1");
			}
			if (request.getParameter("Evenements") != null && request.getParameter("Evenements").compareTo("8") == 0) {
				addParam("8");
			}
			if (request.getParameter("Immobilier") != null && request.getParameter("Immobilier").compareTo("2") == 0) {
				addParam("2");
			}
			if (request.getParameter("Livres") != null && request.getParameter("Livres").compareTo("6") == 0) {
				addParam("6");
			}
			if (request.getParameter("Loisirs") != null && request.getParameter("Loisirs").compareTo("5") == 0) {
				addParam("5");
			}
			if (request.getParameter("MaisonJardin") != null
					&& request.getParameter("MaisonJardin").compareTo("9") == 0) {
				addParam("9");
			}
			if (request.getParameter("MaterielPro") != null
					&& request.getParameter("MaterielPro").compareTo("7") == 0) {
				addParam("7");
			}
			if (request.getParameter("Mobilier") != null && request.getParameter("Mobilier").compareTo("3") == 0) {
				addParam("3");
			}
			if (request.getParameter("Multimédias") != null
					&& request.getParameter("Multimédias").compareTo("4") == 0) {
				addParam("4");
			}
			if (request.getParameter("Vehicules") != null && request.getParameter("Vehicules").compareTo("0") == 0) {
				addParam("0");
			}
			requete = requete + param + ")";
			System.out.println("parameter " + param);

			param = "";
		}
	}

	public void testZone(HttpServletRequest request) {
		if (request.getParameter("75001") != null || request.getParameter("75002") != null
				|| request.getParameter("75003") != null || request.getParameter("75004") != null
				|| request.getParameter("75005") != null || request.getParameter("75006") != null
				|| request.getParameter("75007") != null || request.getParameter("75008") != null
				|| request.getParameter("75009") != null || request.getParameter("75010") != null
				|| request.getParameter("75011") != null || request.getParameter("75012") != null
				|| request.getParameter("75013") != null || request.getParameter("75014") != null
				|| request.getParameter("75015") != null || request.getParameter("75016") != null
				|| request.getParameter("75017") != null || request.getParameter("75018") != null
				|| request.getParameter("75019") != null || request.getParameter("75020") != null) {
			System.out.println("if zone");
			requete = requete + "and zoneAnnonce in(";
			if (request.getParameter("75001") != null && request.getParameter("75001").compareTo("75001") == 0) {
				addParam("75001");
			}
			if (request.getParameter("75002") != null && request.getParameter("75002").compareTo("75002") == 0) {
				addParam("75002");
			}
			if (request.getParameter("75003") != null && request.getParameter("75003").compareTo("75003") == 0) {
				addParam("75003");
			}
			if (request.getParameter("75004") != null && request.getParameter("75004").compareTo("75004") == 0) {
				addParam("75004");
			}
			if (request.getParameter("75005") != null && request.getParameter("75005").compareTo("75005") == 0) {
				addParam("75005");
			}
			if (request.getParameter("75006") != null && request.getParameter("75006").compareTo("75006") == 0) {
				addParam("75006");
			}
			if (request.getParameter("75007") != null && request.getParameter("75007").compareTo("75007") == 0) {
				addParam("75007");
			}
			if (request.getParameter("75008") != null && request.getParameter("75008").compareTo("75008") == 0) {
				addParam("75008");
			}
			if (request.getParameter("75009") != null && request.getParameter("75009").compareTo("75009") == 0) {
				addParam("75009");
			}
			if (request.getParameter("75010") != null && request.getParameter("75010").compareTo("75010") == 0) {
				addParam("75010");
			}
			if (request.getParameter("75011") != null && request.getParameter("75011").compareTo("75011") == 0) {
				addParam("75011");
			}
			if (request.getParameter("75012") != null && request.getParameter("75012").compareTo("75012") == 0) {
				addParam("75012");
			}
			if (request.getParameter("75013") != null && request.getParameter("75013").compareTo("75013") == 0) {
				addParam("75013");
			}
			if (request.getParameter("75014") != null && request.getParameter("75014").compareTo("75014") == 0) {
				addParam("75014");
			}
			if (request.getParameter("75015") != null && request.getParameter("75015").compareTo("75015") == 0) {
				addParam("75015");
			}
			if (request.getParameter("75016") != null && request.getParameter("75016").compareTo("75016") == 0) {
				addParam("75016");
			}
			if (request.getParameter("75017") != null && request.getParameter("75017").compareTo("75017") == 0) {
				addParam("75017");
			}
			if (request.getParameter("75018") != null && request.getParameter("75018").compareTo("75018") == 0) {
				addParam("75018");
			}
			if (request.getParameter("75019") != null && request.getParameter("75019").compareTo("75019") == 0) {
				addParam("75019");
			}
			if (request.getParameter("75020") != null && request.getParameter("75020").compareTo("75020") == 0) {
				addParam("75020");
			}
			System.out.println("parameter " + param);
			requete = requete + param + ")";
			param = "";
			System.out.println("requete" + requete);
		}
	}
}
