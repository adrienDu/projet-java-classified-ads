package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

/**
 * Represente une association
 * @author Maeva, Adrien, Moaz
 *
 */

public class AssociationDAO {

	/** public fonction getAssoUser()
	 * \breif Affiche une association
	 * 
	 * Renvoie une Arraylist contenant une association de la base de donnee
	**/
	public static Association getAssoUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		Association Resultat = new Association();
		String req = ("SELECT * FROM user JOIN association ON user.idUser=association.User_idUser WHERE idUser='"
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
			Resultat.setNomAss(DBAction.getRes().getString(10));
			Resultat.setSiretAss(DBAction.getRes().getString(11));
			Resultat.setNumAdAss(DBAction.getRes().getInt(12));
			Resultat.setRueAdAss(DBAction.getRes().getString(13));
			Resultat.setCpAdAss(DBAction.getRes().getInt(14));
			Resultat.setVilleAdAss(DBAction.getRes().getString(15));
			Resultat.setTelAss(DBAction.getRes().getInt(16));
		}

		DBAction.DBClose();

		return Resultat;
	}

	/** public fonction addAssoUser()
	 * \breif Ajoute une association a la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void addAssoUser(String MailUser, String MdpUser, String PermissionUser, String NomAss,
			String SiretAss, int NumAdAss, String RueAdAss, int CpAdAss, String VilleAdAss, int TelAss)
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
		String TypeUser = "A";
		// requete
		String req1 = ("INSERT INTO user (idUser, idSocialUser, mailUser, mdpUser, etatUser, dateInUser, typeUser, Permission_idPermission)  VALUES ('"
				+ IdUser + "','" + IdSocialUSer + "','" + MailUser + "','" + MdpUser + "','" + EtatUser + "','"
				+ formater.format(DateInUser) + "','" + TypeUser + "','" + PermissionUser + "')");
		String req2 = ("INSERT INTO association (User_idUser, nomAss, siretAss, numAdAss, rueAdAss, cpAdAss, villeAdAss, telAss) VALUES('"
				+ IdUser + "','" + NomAss + "','" + SiretAss + "','" + NumAdAss + "','" + RueAdAss + "','" + CpAdAss
				+ "','" + VilleAdAss + "','" + TelAss + "')");
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

	/** public fonction deleteAssoUser()
	 * \breif Supprime une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void deleteAssoUser(String idUser) throws SQLException {
		DBAction.DBConnexion();

		String req1 = ("DELETE FROM association WHERE User_idUser ='" + idUser + "'");
		String req2 = ("DELETE FROM user WHERE idUser ='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req1);
		} catch (SQLException ex) {
			System.out.println(req1);
			System.out.println("Requête 1 non valide " + ex.getErrorCode());
		}
		try {
			DBAction.getStm().executeUpdate(req2);
			System.out.println("L'utilisateur ayant l'id=" + idUser + " a bien été supprimé.");
		} catch (SQLException ex) {
			System.out.println(req2);
			System.out.println("Requête 2 non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateNomAssoAsso()
	 * \breif Modifie le nom d'une association
	 * 
	 * Ne renvoie rien
	**/
	public static void updateNomAsso(String idUser, String nomAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET nomAss='" + nomAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le nom de l'association ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}
	/** public fonction updateNumAsso()
	 * \breif Modifie le numero d'une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void updateNumAdAsso(String idUser, int numAdAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET numAdAss='" + numAdAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le numéro de rue de l'association ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateRueAsso()
	 * \breif Modifie la rue d'une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void updateRueAdAsso(String idUser, String rueAdAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET rueAdAss='" + rueAdAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le nom de rue de l'association ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateCpAssor()
	 * \breif Modifie le numero d'une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void updateCpAdAsso(String idUser, int cpAdAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET cpAdAss='" + cpAdAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le CP de l'adresse de l'association ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateVilleAdAsso()
	 * \breif Modifie la ville d'une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void updateVilleAdAsso(String idUser, String VilleAdAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET villeAdAss='" + VilleAdAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("La ville de l'adresse de l'association ayant l'id=" + idUser + " a bien été modifiée.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateTelAsso()
	 * \breif Modifie le numero de telephone d'une association de la base de donnee
	 * 
	 * Ne renvoie rien
	**/
	public static void updateTelAsso(String idUser, int TelAsso) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE association SET telAss='" + TelAsso + "' WHERE User_idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le tel de l'association ayant l'id=" + idUser + " a bien été modifiée.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}
	
}
