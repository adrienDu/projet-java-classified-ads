package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Date;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class UserDAO {
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
	
	public static User addUser(String MailUser, String MdpUser, String TypeUser) throws SQLException{
		DBAction.DBConnexion();
		//uuid
		String IdUSer;
		UUID uuid = UUID.randomUUID();
		//id social
		String IdSocialUSer = "";
		//etat 
		String EtatUser = "OK";
		//date in user
		Date DateInUser = new Date();	
		System.out.println("Date in"+DateInUser);
		//permission
		String PermissionUser ="classique";
		User newuser = new User(IdUSer, IdSocialUSer, EtatUser, MdpUser, EtatUser, DateInUser, TypeUser, PermissionUser);
		//newuser.add();
		return newuser;
	}
	//ajouter 1 user a partir id social
	//supprimer 1 user
	//supprimer tous les users
	//modifier permission user
	//modifier etat user
	//modifier 1 user (mail, pwd, type)
	//modifier tous les users
}
