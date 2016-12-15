package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Date;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

public class UserDAO {
	// Afficher un User en fonction de son id
	public static User getUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		User Resultat = new User();
		String req = ("SELECT * FROM user WHERE idUser='" + idUser + "'");
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

<<<<<<< HEAD
	// Afficher un User en fonction de son id
	/*
	 * public static User getUser(String idUser) throws SQLException {
	 * DBAction.DBConnexion(); User Resultat = new User(); String req =
	 * ("SELECT * FROM user WHERE idUser='" + idUser + "'"); try {
	 * DBAction.setRes(DBAction.getStm().executeQuery(req)); } catch
	 * (SQLException ex) { System.out.println("Requête non valide " +
	 * ex.getErrorCode()); }
	 * 
	 * while (DBAction.getRes().next()) {
	 * Resultat.setIdUser(DBAction.getRes().getString(1));
	 * Resultat.setIdSocialUser(DBAction.getRes().getString(2));
	 * Resultat.setMailUser(DBAction.getRes().getString(3));
	 * Resultat.setMdpUser(DBAction.getRes().getString(4));
	 * Resultat.setEtatUser(DBAction.getRes().getString(5));
	 * Resultat.setDateInUser(DBAction.getRes().getDate(6));
	 * Resultat.setTypeUser(DBAction.getRes().getString(7));
	 * Resultat.setPermission_idPermission(DBAction.getRes().getString(8)); }
	 * 
	 * DBAction.DBClose();
	 * 
	 * return Resultat; }
	 */

	// Afficher les users en fonction de leur type
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

=======
>>>>>>> 0ee6a75eab8c827bbb2e48ac3f6b639aedd9bbce
	// Afficher tous les users
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

	// Ajouter un user classique dans la BDD
	public static void addUser(String MailUser, String MdpUser, String TypeUser, String PermissionUser) throws SQLException {
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
			System.out.println("catch" + ex.getErrorCode());
		}
		DBAction.DBClose();
	}
	
	// supprimer 1 user en fonction de son id
	public static void deleteUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		String req = ("DELETE FROM user WHERE idUser ='"+ idUser +"'");
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("L'utilisateur ayant l'id="+idUser+" a bien été supprimé.");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}
	
	// modifier un user
	/*public static void updateUser(String idUser, String mailUser, String mdpUser, ) throws SQLException {
		DBAction.DBConnexion();
		String req = ();
		try {
			DBAction.getStm().executeUpdate(req);
			System.out.println("");
		} catch (SQLException ex) {
			System.out.println(req);
			System.out.println("Requête non valide " + ex.getErrorCode());
		}
		DBAction.DBClose();
	}*/
	
	
}
