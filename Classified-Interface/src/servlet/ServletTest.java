package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTest
 **
 */


@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static String       VUE            = "/WEB-INF/error.jsp";
	 public static final String CHAMP_ID    = "id";
     public static final String CHAMP_EMAIL    = "email";
     public static final String CHAMP_PASS     = "motdepasse";
     public static final String CHAMP_IDSOCIAL    = "idsocial";
     public static final String ATT_ERREURS    = "erreurs";
     public static final String ATT_RESULTAT   = "resultat";
     public static final String CHAMP_ETATUSER    = "etatuser";
     public static final String CHAMP_DATEIN    = "dateinuser";
     public static final String CHAMP_TYPEUSER    = "typeuser";
     public static final String CHAMP_PERMISSION    = "idpermission";
     public static final String CHAMP_CONFMAIL = "confirmemail";
     public static final String CHAMP_CONFMDP  = "confirmotdepasse";
     HttpSession session;
     
    /**
     * Default constructor. 
     */
    public ServletTest(){
    }
    
    
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
//      if ((action != null) || (action.length() != 0)) {
        if ((action == null)) {    // no action param
            VUE = "/WEB-INF/error.jsp";
        } else {                   // action param

            // Acces à la page d'authentification
            if (action.equals("register")) {
                //if(session.getId().isEmpty()){                 
                    VUE = "/WEB-INF/register.jsp";
               // }else{                   
                   // VUE = "/WEB-INF/denied.jsp";
                }
                
            //inscritpion au site renvoie la page de formulaire d'inscription
            if (action.equals("inscription")) {
            	String inscription = null; 
            	
            	 try{
                     inscription = (String)session.getAttribute("inscription");
                     }
                     catch(Exception e){
                         
                     }
                      if(inscription == null){
                VUE = "/WEB-INF/index.jsp";
                      }
                      else if(inscription == "part"){
                          VUE = "/WEB-INF/inscriptionFormPart.jsp";

                      }
                      else if(inscription == "ent"){
                          VUE = "/WEB-INF/inscriptionFormEnt.jsp";

                      }
                      else if(inscription == "assos"){
                          VUE = "/WEB-INF/inscriptionFormAssos.jsp";

                      }
            }

            
            /*formulaire d'inscription */
            
            //particulier
            if (action.equals("inscriptionFormPart")) {
                
            	String nom = null;
            	String prenom = null;
            	String numRue = null;
            	String rue = null;
            	String ville = null;
            	String codePost = null;
            	String numTel = null;
            	String mail = null;
            	String mdp = null;
            	String verifMdp = null;
            	String premium = null;
                // verifier champs 
                try{
                mail = (String)session.getAttribute("email");
                }
                catch(Exception e){
                    
                }
                 if(mail == null){
                    VUE = "/WEB-INF/inscriptionPart.jsp";
                }else{
                    VUE = "/WEB-INF/denied.jsp";
                }
            }
          //entreprise
            if (action.equals("inscriptionFormEnt")) {
                
            	String nom = null;
            	String siren = null;
            	String logo = null;
            	String numRue = null;
            	String rue = null;
            	String ville = null;
            	String codePost = null;
            	String numTel = null;
            	String mail = null;
            	String mdp = null;
            	String verifMdp = null;
            	String premium = null;
                // verifier champs 
                try{
                mail = (String)session.getAttribute("email");
                }
                catch(Exception e){
                    
                }
                 if(mail == null){
                    VUE = "/WEB-INF/inscriptionEnt.jsp";
                }else{
                    VUE = "/WEB-INF/denied.jsp";
                }
            }
            //assciation
            if (action.equals("inscriptionFormAssos")) {
                
            	String nom = null;
            	String siren = null;
            	String logo = null;
            	String numRue = null;
            	String rue = null;
            	String ville = null;
            	String codePost = null;
            	String numTel = null;
            	String mail = null;
            	String mdp = null;
            	String verifMdp = null;
            	String premium = null;
                // verifier champs 
                try{
                mail = (String)session.getAttribute("email");
                }
                catch(Exception e){
                    
                }
                 if(mail == null){
                    VUE = "/WEB-INF/inscriptionAssos.jsp";
                }else{
                    VUE = "/WEB-INF/denied.jsp";
                }
            }
         

            if (action.equals("candidature")) {
                String mail = null;
                try{
                mail = (String)session.getAttribute("email");
                }
                catch(Exception e){
                    
                }
                 if(mail == null){
                    
                    VUE = "/WEB-INF/denied.jsp";
                }else{
                     VUE = "/WEB-INF/candidatureView.jsp";
                }
                
                
                
            }

            if (action.equals("confirmeConnexion")) {
                String              resultat;
                ArrayList<Eleve>    Informations = new ArrayList<Eleve>();
                Map<String, String> erreurs      = new HashMap<String, String>();
                String              email        = request.getParameter(CHAMP_EMAIL);
                String              motDePasse   = request.getParameter(CHAMP_PASS);

                try {
                    //Recherche de l'élève dans la base de donnée.
                    Informations = validationEleve(email, motDePasse);

                    // validationMotsDePasse(motDePasse);
                } catch (Exception e) {
                    erreurs.put(CHAMP_EMAIL, e.getMessage());
                }
                if(!Informations.isEmpty()){
                    
                
                        /* Initialisation du résultat global de la validation. */
                        if (erreurs.isEmpty()) {
                            resultat = "Succès de la connexion.";

                            /* Stockage du résultat et des messages d'erreur dans l'objet request */
                            request.setAttribute(ATT_ERREURS, erreurs);
                            request.setAttribute(ATT_RESULTAT, resultat);
                            session = request.getSession();
                            session.setAttribute("email", email);
                            session.setAttribute("prenom", Informations.get(0).getName());
                            session.setAttribute("nom", Informations.get(0).getSurname());
                            session.setAttribute("role", Informations.get(0).getType());
                            session.setAttribute("candidature", Informations.get(0).getCandidature());
                            request.setAttribute("etat", "connexion");
                            VUE = "/WEB-INF/index.jsp";
                        } else {
                            resultat = "Échec de la connexion.";

                            /* Stockage du résultat et des messages d'erreur dans l'objet request */
                            request.setAttribute(ATT_ERREURS, erreurs);
                            request.setAttribute(ATT_RESULTAT, resultat);
                            VUE = "/WEB-INF/connexionFail.jsp";
                        }
                }else{
                    resultat = "Échec de la connexion.";
                    /* Stockage du résultat et des messages d'erreur dans l'objet request */
                            request.setAttribute(ATT_ERREURS, erreurs);
                            request.setAttribute(ATT_RESULTAT, resultat);
                            VUE = "/WEB-INF/connexionFail.jsp";
                }
            }

            if (action.equals("inscription")) {
                VUE = "/WEB-INF/indexNew.jsp";

                String              resultat;
                Map<String, String> erreurs      = new HashMap<String, String>();
                String              email        = request.getParameter(CHAMP_EMAIL);
                String              motDePasse   = request.getParameter(CHAMP_PASS);
                String              confirmPasse = request.getParameter(CHAMP_CONFMDP);
                String              confirmMail  = request.getParameter(CHAMP_CONFMAIL);
                String              nom          = request.getParameter(CHAMP_NOM);
                String              prenom       = request.getParameter(CHAMP_PREN);

                try {
                    validationEmail(email, confirmMail);
                } catch (Exception e) {
                    erreurs.put(CHAMP_EMAIL, e.getMessage());
                }

                try {
                   // validationMDP(motDePasse, confirmPasse);
                } catch (Exception e) {
                    erreurs.put(CHAMP_PASS, e.getMessage());
                }

                if (erreurs.isEmpty()) {
                    try {
                        ajoutCompte(nom, prenom, email, motDePasse);
                    } catch (Exception e) {
                        erreurs.put("Request", e.getMessage());
                    }
                }

                /* Initialisation du résultat global de la validation. */
                if (erreurs.isEmpty()) {
                    resultat = "Succès de l'inscription.";

                    /* Stockage du résultat et des messages d'erreur dans l'objet request */
                    request.setAttribute(ATT_ERREURS, erreurs);
                    request.setAttribute(ATT_RESULTAT, resultat);
                    session = request.getSession();
                    session.setAttribute("email", email);
                     session.setAttribute("prenom", prenom);
                     session.setAttribute("nom", nom);
                     session.setAttribute("role", "1");
                     session.setAttribute("candidature", "0");
                     request.setAttribute("etat", "connexion");

                    /* Transmission de la paire d'objets request/response à notre JSP */
                    VUE = "/WEB-INF/indexNew.jsp";
                } else {
                    resultat = "Échec de l'inscription.";

                    /* Stockage du résultat et des messages d'erreur dans l'objet request */
                    request.setAttribute(ATT_ERREURS, erreurs);
                    request.setAttribute(ATT_RESULTAT, resultat);
                    VUE = "/WEB-INF/error.jsp";

                    /* Transmission de la paire d'objets request/response à notre JSP */
                }
            }

            if (action.equals("newCandidature")) {
                String mail = null;
                mail = (String)session.getAttribute("email");
                String              resultat;
                Map<String, String> erreurs      = new HashMap<String, String>();
                String              email        = request.getParameter(CHAMP_EMAIL);
                String              nom          = request.getParameter(CHAMP_NOM);
                String              prenom       = request.getParameter(CHAMP_PREN);
                String              civ          = request.getParameter(CHAMP_CIV);
                String              adress       = request.getParameter(CHAMP_ADRESS);
                String              city         = request.getParameter(CHAMP_CITY);
                String              birthdate    = request.getParameter(CHAMP_BIRTHD);
                String              birthplace   = request.getParameter(CHAMP_BIRTHP);
                String              birthcountry = request.getParameter(CHAMP_BIRTHC);
                String              nation       = request.getParameter(CHAMP_NATION);
                String              school       = request.getParameter(CHAMP_SCHOOL);
                String              yearwish     = request.getParameter(CHAMP_YEARW);
                String              grade        = request.getParameter(CHAMP_GRADE);
                String              homephone    = request.getParameter(CHAMP_HPHONE);
                String              cellphone    = request.getParameter(CHAMP_CPHONE);

                try {
                    ajoutCandidature(mail, nom, prenom, civ, adress, city, birthdate, birthplace, birthcountry,
                                     nation, school, yearwish, grade, homephone, cellphone);
                } catch (Exception e) {
                    erreurs.put("Request", e.getMessage());
                }

                /* Initialisation du résultat global de la validation. */
                if (erreurs.isEmpty()) {
                    resultat = "Succès de l'inscription.";
                    session.setAttribute("candidature", "1");
                    VUE = "/WEB-INF/succes.jsp";
                } else {
                    resultat = "Échec de l'inscription.";
                    VUE      = "/WEB-INF/error.jsp";
                }

                /* Stockage du résultat et des messages d'erreur dans l'objet request */
                request.setAttribute(ATT_ERREURS, erreurs);
                request.setAttribute(ATT_RESULTAT, resultat);

                /* Transmission de la paire d'objets request/response à notre JSP */
            }
            
            if(action.equals("AllCandidature"))
            {   
                String mail = null;
                try{
                mail = (String)session.getAttribute("email");
                }
                catch(Exception e){
                    
                }
                 if(mail == null){
                    
                    VUE = "/WEB-INF/denied.jsp";
                }else{
                    VUE      = "/WEB-INF/allcandidature.jsp";
                }
                ArrayList<Candidature> allCandidature = new ArrayList<Candidature>();
                allCandidature = CandidatureDAO.getAllCandidature();
                request.setAttribute("AllCandidature",allCandidature);
                
            }
            
            if(action.equals("deconnexion"))
            { 
                //HttpSession session=request.getSession();
                if(session!=null){
                    session.removeAttribute("email"); //TODO : Vider autre champs
                    session.removeAttribute("candidature");
                     session.removeAttribute("prenom");
                           session.removeAttribute("nom");
                            session.removeAttribute("role");
                           
                            
                    session.invalidate();
                    //request.setAttribute("etat", "deco");
                }
                  VUE      = "/WEB-INF/indexNew.jsp";
            }
        }

        // dispatcher vers les jsp correspondantes aux forward
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletInit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
