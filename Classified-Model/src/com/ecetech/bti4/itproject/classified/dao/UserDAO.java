package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Date;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

/**
 * @author Maeva, Adrien, Moaz
 *
 */

public class UserDAO {
	/** public fonction getUser()
	 * \breif Affiche un utilisateur 
	 * 
	 * Renvoie une Arraylist contenant un utilisateur
	**/

	public static User getUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		User Resultat = new User();
		String req = ("SELECT * FROM user WHERE idUser='" + idUser + "' ");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
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
		}

		DBAction.DBClose();

		return Resultat;
	}

	
	/** public fonction getTypeUser()
	 * \breif Afficher les users en fonction de leur type
	 * 
	 * Renvoie une Arraylist contenant un utilisateur en fonction de son type
	**/
	public static ArrayList getTypeUser(String typeUser) throws SQLException {
		DBAction.DBConnexion();
		ArrayList<User> typeuser = new ArrayList<User>();
		String req = ("SELECT * FROM user WHERE typeUser='" + typeUser + "'");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println("Requête non valide " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			User Resultat = new User(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getString(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getString(7), DBAction.getRes().getString(8));
			typeuser.add(Resultat);
		}

		DBAction.DBClose();

		return typeuser;
	}

	
	/** public fonction getAllUser()
	 * \breif Afficher les users 
	 * 
	 * Renvoie une Arraylist contenant les utilisateurs
	**/
	public static ArrayList getAllUser() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<User> alluser = new ArrayList<User>();
		String req = ("SELECT * FROM user");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			User Resultat = new User(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getString(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getString(7), DBAction.getRes().getString(8));
			alluser.add(Resultat);
		}

		DBAction.DBClose();

		return alluser;
	}

	/** public fonction addUser()
	 * \breif Ajoute un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void addUser(String MailUser, String MdpUser, String TypeUser, String PermissionUser)
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
		// requete
		String req = ("INSERT INTO user (idUser, idSocialUser, mailUser, mdpUser, etatUser, dateInUser, typeUser, Permission_idPermission)  VALUES ('"
				+ IdUser + "','" + IdSocialUSer + "','" + MailUser + "','" + MdpUser + "','" + EtatUser + "','"
				+ formater.format(DateInUser) + "','" + TypeUser + "','" + PermissionUser + "')");

		try {
			DBAction.getStm().executeUpdate(req);
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("catch" + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction deleterUser()
	 * \breif Supprime un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void deleteUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("DELETE FROM user WHERE idUser ='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("L'utilisateur ayant l'id=" + idUser + " a bien été supprimé.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateMailUser()
	 * \breif Modifie le mail d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void updateMailUser(String idUser, String mailUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE user SET mailUser='" + mailUser + "' WHERE idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le mail de l'utilisateur ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateMdpUser()
	 * \breif Modifie le mot de passe d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void updateMdpUser(String idUser, String mdpUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE user SET mdpUser='" + mdpUser + "' WHERE idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le mot de passe de l'utilisateur ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateEtatUser()
	 * \breif Modifie l'etat d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void updateEtatUser(String idUser, String etatUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE user SET etatUser='" + etatUser + "' WHERE idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("L'état de l'utilisateur ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updateTypeUser()
	 * \breif Modifie le type d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void updateTypeUser(String idUser, String typeUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE user SET typeUser='" + typeUser + "' WHERE idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Le type de l'utilisateur ayant l'id=" + idUser + " a bien été modifié.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

	/** public fonction updatePermissionUser()
	 * \breif Modifie la permission d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public static void updatePermissionUser(String idUser, String permissionUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("UPDATE user SET Permission_idPermission='" + permissionUser + "' WHERE idUser='" + idUser + "'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("Les permissions de l'utilisateur ayant l'id=" + idUser + " ont bien été modifiées.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

}
