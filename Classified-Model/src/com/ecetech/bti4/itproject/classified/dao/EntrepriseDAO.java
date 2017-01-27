/**
 * 
 */
package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.beans.Entreprise;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

/**
 * Represente une entreprise
 * @author Maeva, Adrien, Moaz
 *
 */
public class EntrepriseDAO {

	/** public fonction getEntUser()
	 * \breif Affiche une entreprise
	 * 
	 * Renvoie une Arraylist contenant une entreprise de la base de donnee
	**/
	public static Entreprise getEntUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		Entreprise Resultat = new Entreprise();
		String req = ("SELECT * FROM user JOIN entreprise ON user.idUser=entreprise.User_idUser1 WHERE idUser='"
				+ idUser + "'");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Resultat.setIdUser(DBAction.getRes().getString(1));
			Resultat.setIdSocialUser(DBAction.getRes().getString(2));
			Resultat.setMailUser(DBAction.getRes().getString(3));
			Resultat.setMdpUser(DBAction.getRes().getString(4));
			Resultat.setEtatUser(DBAction.getRes().getString(5));
			Resultat.setDateInUser(DBAction.getRes().getDate(6));
			Resultat.setTypeUser(DBAction.getRes().getString(7));
			Resultat.setPermission_idPermission(DBAction.getRes().getString(8));
			Resultat.setNom_Ent(DBAction.getRes().getString(10));
			Resultat.setNum_Ad_Ent(DBAction.getRes().getInt(11));
			Resultat.setRue_Ad_Ent(DBAction.getRes().getString(12));
			Resultat.setCp_Ad_Ent(DBAction.getRes().getInt(13));
			Resultat.setVille_Ad_Ent(DBAction.getRes().getString(14));
			Resultat.setTel_Ent(DBAction.getRes().getInt(15));
			Resultat.setSiren_Ent(DBAction.getRes().getString(16));
		}

		DBAction.DBClose();

		return Resultat;
	}

	/** public fonction getEntUser()
	 * \breif Modifie une entreprise
	 * 
	 * Ne renvoie rien
	**/
	public static void addEntUser(String MailUser, String MdpUser, String PermissionUser, String NomEnt,
			int NumAdEnt, String RueAdEnt, int CpAdEnt, String VilleAdEnt, int TelEnt, String SirenEnt)
			throws SQLException {
		DBAction.DBConnexion();
		// uuid
		String IdUser = MakeUUID.generate();
		// id social
		String IdSocialUSer = "";
		// etat
		String EtatUser = "OK";
		// date in user
		SimpleDateFormat formater = null;
		Date DateInUser = new Date();
		formater = new SimpleDateFormat("yyyy-MM-dd");
		// type
		String TypeUser = "E";
		// requete
		String req1 = ("INSERT INTO user (idUser, idSocialUser, mailUser, mdpUser, etatUser, dateInUser, typeUser, Permission_idPermission)  VALUES ('"
				+ IdUser + "','" + IdSocialUSer + "','" + MailUser + "','" + MdpUser + "','" + EtatUser + "','"
				+ formater.format(DateInUser) + "','" + TypeUser + "','" + PermissionUser + "')");
		String req2 = ("INSERT INTO entreprise (User_idUser1, nomEnt, numAdEnt, rueAdEnt, cpAdEnt, villeAdEnt, telEnt, sirenEnt) VALUES('"
				+ IdUser + "','" + NomEnt + "','" + NumAdEnt + "','" + RueAdEnt + "','" + CpAdEnt + "','" + VilleAdEnt
				+ "','" + TelEnt + "','" + SirenEnt + "')");
		try {
			DBAction.getStm().executeUpdate(req1);

		} catch (SQLException ex) {
			System.out.println(req1);
			System.out.println("catch req1" + ex.getErrorCode());
		}
		try {
			DBAction.getStm().executeUpdate(req2);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(req2);
			System.out.println("catch req2" + e.getErrorCode());
		}
		DBAction.DBClose();
	}


	/*Moaz
	 * public static ArrayList getAllEntreprise() throws SQLException {
	 * DBAction.DBConnexion(); ArrayList<Entreprise> alluser = new
	 * ArrayList<Entreprise>(); String req =
	 * ("SELECT entreprise.idUser, user.idSocialUser, user.mdpUser FROM entreprise INNER JOIN user on entreprise.idUser=user.idUser"
	 * ); try { DBAction.setRes(DBAction.getStm().executeQuery(req)); } catch
	 * (SQLException ex) { System.out.println(ex.getErrorCode()); }
	 * 
	 * while (DBAction.getRes().next()) { Entreprise Resultat = new
	 * Entreprise(DBAction.getRes().getString(1),
	 * DBAction.getRes().getString(2), 0, "", 0,"", 0); User user = new
	 * User(DBAction.getRes().getString(1), req, req, req, req, null, req, req);
	 * 
	 * alluser.add(Resultat); }
	 * 
	 * DBAction.DBClose();
	 * 
	 * return alluser; }
	 */

}
