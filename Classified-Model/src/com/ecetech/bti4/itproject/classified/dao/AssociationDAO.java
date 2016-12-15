package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

public class AssociationDAO {

	// Afficher un User Association en fonction de son id
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

	// Ajouter un user Association dans la BDD
	public static void addAssoUser(String MailUser, String MdpUser, String PermissionUser,
			String NomAss, String SiretAss, int NumAss, String RueAss, int CpAss, String VilleAss, int TelAss)
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
		//type
		String TypeUser="A";
		// requete
		String req1 = ("INSERT INTO user (idUser, idSocialUser, mailUser, mdpUser, etatUser, dateInUser, typeUser, Permission_idPermission)  VALUES ('"
				+ IdUser + "','" + IdSocialUSer + "','" + MailUser + "','" + MdpUser + "','" + EtatUser + "','"
				+ formater.format(DateInUser) + "','" + TypeUser + "','" + PermissionUser
				+ "')");
		String req2 = ("INSERT INTO association (User_idUser, nomAss, siretAss, numAdAss, rueAdAss, cpAdAss, villeAdAss, telAss) VALUES('"
				+ IdUser + "','" + NomAss + "','" + SiretAss + "','" + NumAss + "','" + RueAss + "','"
				+ CpAss + "','" + VilleAss + "','" + TelAss
				+ "')");
		try {
			DBAction.getStm().executeUpdate(req1);
			DBAction.getStm().executeUpdate(req2);
		} catch (SQLException ex) {
			System.out.println(req1);
			System.out.println("catch" + ex.getErrorCode());
		}
		DBAction.DBClose();
	}

}
