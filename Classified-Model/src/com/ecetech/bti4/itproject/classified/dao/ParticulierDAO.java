package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.beans.Particulier;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;

public class ParticulierDAO {
	// Afficher un User Association en fonction de son id
	public static Particulier getPartUser(String idUser) throws SQLException {
		DBAction.DBConnexion();
		Particulier Resultat = new Particulier();
		String req = ("SELECT * FROM user JOIN particulier ON user.idUser=particulier.User_idUser WHERE idUser='"
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
			Resultat.setNomPart(DBAction.getRes().getString(10));
			Resultat.setPrenomPart(DBAction.getRes().getString(11));
			Resultat.setNumAdPart(DBAction.getRes().getInt(12));
			Resultat.setRueAdPart(DBAction.getRes().getString(13));
			Resultat.setCpAdPart(DBAction.getRes().getInt(14));
			Resultat.setVilleAdPart(DBAction.getRes().getString(15));
			Resultat.setTelPart(DBAction.getRes().getInt(16));
		}

		DBAction.DBClose();

		return Resultat;
	}
	
	// Ajouter un user Particulier dans la BDD
		public static void addPartUser(String MailUser, String MdpUser, String PermissionUser,
				String NomPart, String PrenomPart, int NumAdPart, String RueAdPart, int CpAdPart, String VilleAdPart, int TelPart)
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
			String TypeUser="P";
			// requete
			String req1 = ("INSERT INTO user (idUser, idSocialUser, mailUser, mdpUser, etatUser, dateInUser, typeUser, Permission_idPermission)  VALUES ('"
					+ IdUser + "','" + IdSocialUSer + "','" + MailUser + "','" + MdpUser + "','" + EtatUser + "','"
					+ formater.format(DateInUser) + "','" + TypeUser + "','" + PermissionUser
					+ "')");
			String req2 = ("INSERT INTO particulier (User_idUser, nomPart, prenomPart, numAdPart, rueAdPart, cpAdPart, villeAdPart, telPart) VALUES('"
					+ IdUser + "','" + NomPart + "','" + PrenomPart + "','" + NumAdPart + "','" + RueAdPart + "','"
					+ CpAdPart + "','" + VilleAdPart + "','" + TelPart
					+ "')");
			try {
				DBAction.getStm().executeUpdate(req1);
				
			} catch (SQLException ex) {
				System.out.println(req1);
				System.out.println("catch" + ex.getErrorCode());
			}
			try {
				DBAction.getStm().executeUpdate(req2);
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println(req2);
				System.out.println("catch" + e.getErrorCode());
			}
			DBAction.DBClose();
		}
}
