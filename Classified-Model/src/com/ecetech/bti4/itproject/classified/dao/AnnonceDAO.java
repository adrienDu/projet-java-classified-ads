package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class AnnonceDAO {

	UUID uuid = UUID.randomUUID();
	// afficher toutes les annonces

	public static ArrayList<Annonce> getAllAnnonce() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<Annonce> annonces = new ArrayList<>();
		String req = ("SELECT * FROM annonce");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println("toto " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Annonce annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getDate(7), DBAction.getRes().getInt(8),
					DBAction.getRes().getDate(9), DBAction.getRes().getString(10), DBAction.getRes().getInt(11));
			annonces.add(annonce);

		}

		DBAction.DBClose();

		return annonces;
	}

	public static ArrayList<Annonce> getAnnonce() throws SQLException {
		ArrayList<Annonce> annonces = new ArrayList<>();
		String req = ("SELECT * FROM annonce");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println("toto " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Annonce annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getDate(7), DBAction.getRes().getInt(8),
					DBAction.getRes().getDate(9), DBAction.getRes().getString(10), DBAction.getRes().getInt(11));
			annonces.add(annonce);

		}

		DBAction.DBClose();

		return annonces;
	}

	// afficher une annonce particuliere
	public static Annonce getAnnonce(String idAnnonce) throws SQLException {
		DBAction.DBConnexion();
		Annonce annonce = null;
		String req = ("SELECT * FROM `annonce` WHERE `idAnnonce` ='" + idAnnonce + "';");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while (DBAction.getRes().next()) {
				annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
						DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
						DBAction.getRes().getDate(6), DBAction.getRes().getDate(7), DBAction.getRes().getInt(8),
						DBAction.getRes().getDate(9), DBAction.getRes().getString(10), DBAction.getRes().getInt(11));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		DBAction.DBClose();

		return annonce;
	}

	// insert annonce

	public static void newAnnonce(Annonce annonce){
		String idAnnonce =MakeUUID.generate();
		//date du jour
		java.sql.Date dateCreaAnnonce = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		String req = ("INSERT INTO `annonce`(`idAnnonce`, `titreAnnonce`, `descAnnonce`, `photoAnnonce`, `zoneAnnonce`, `dateAnnonce`, `finAnnonce`, `importanceAnnonce`, `User_idUser`, `Type_idType`, `dateCreaAnnonce`) VALUES"
				+ " ('"+idAnnonce+"','"+annonce.getTitreAnnonce()+"','"+annonce.getDescAnnonce()+"','"+annonce.getPhotoAnnonce()+"','"+annonce.getZoneAnnonce()+"','"+annonce.getDateAnnonce()+"','"+annonce.getFinAnnonce()+"','"+annonce.getImportanceAnnonce()+"','"+dateCreaAnnonce+"','"+annonce.getUser_idUser()+"','"+annonce.getType_idType()+"';");
		try{
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		}catch(SQLException e){
			System.out.println(e.getErrorCode());
		}
	}
	// delete annonce

	// modifier annonce

	// afficher par categorie

	// afficher toutes les annonces d'un utilisateur

	// afficher par categorie et type

	// afficher par date

	// afficher par prix

	//afficher annonces expiré
	
	//afficher annonces en cours 
	

}
