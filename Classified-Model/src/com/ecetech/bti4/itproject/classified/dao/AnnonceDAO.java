package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.sql.ResultSet;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * Represente une Annonce
 * @author Maeva, Adrien, Moaz
 */

public class AnnonceDAO {

	/** public fonction getAllAnnonce()
	 * \breif Affiche toutes les annonces 
	 * 
	 * Renvoie une Arraylist contenant toutes les annonces de la base de donnee
	**/
	public static ArrayList<Annonce> getAllAnnonce() {
		ArrayList<Annonce> annonces = null;
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce");
			res = req.executeQuery();
			while (res.next()) {
				Annonce annonce = new Annonce(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getInt(5), res.getDate(6), res.getDate(7), res.getInt(8), res.getDate(9), res.getString(10),
						res.getInt(11));
				annonces.add(annonce);
			}
		} catch (SQLException e) {

			// TODO: handle exception
		}

		return annonces;
	}

	/** public fonction getAnnonce()
	 * \breif Affiche une annonce 
	 * 
	 * Renvoie une Arraylist contenant une annonce de la base de donnee
	**/
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

	/** public fonction newAnnonce()
	 * \breif Cree une nouvelle annonce
	 * 
	 * Renvoie un boolean 
	**/

	public static boolean newAnnonce(Annonce annonce) {
		boolean result;
		int nb;
		if(annonce.getIdAnnonce() == ""){
			annonce.setIdAnnonce(MakeUUID.generate());
		}

		// date du jour
		java.sql.Date dateCreaAnnonce = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		annonce.setDateCreaAnnonce(dateCreaAnnonce);

		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("INSERT INTO annonce VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			req.setString(1, annonce.getIdAnnonce());
			req.setString(2, annonce.getTitreAnnonce());
			req.setString(3, annonce.getDescAnnonce());
			req.setString(4, annonce.getPhotoAnnonce());
			req.setInt(5, annonce.getZoneAnnonce());
			req.setDate(6, annonce.getDateAnnonce());
			req.setDate(7, annonce.getFinAnnonce());
			req.setInt(8, annonce.getImportanceAnnonce());
			req.setDate(9, dateCreaAnnonce);
			req.setString(10, annonce.getUser_idUser());
			req.setInt(11, annonce.getType_idType());

			nb = req.executeUpdate();

			result = true;
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;

	}

	
	/** public fonction delAnnonce()
	 * \breif Supprime une annocne
	 * 
	 * Renvoie un boolean
	**/
	public static boolean delAnnonce(String idAnnonce) {
		boolean result;
		int nb;
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("DELETE FROM `annonce` WHERE `idAnnonce`=?");
			req.setString(1, idAnnonce);
			nb = req.executeUpdate();
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = false;
		}

		return result;

	}

	/** public fonction changelAnnonce()
	 * \breif Modifie une annonce
	 * 
	 * Renvoie un boolean
	**/
	public static boolean changeAnnonce(Annonce annonce) {
		boolean result;
		int nb;
		String idAnnonce = MakeUUID.generate();
		annonce.setIdAnnonce(idAnnonce);
		// date du jour
		java.sql.Date dateCreaAnnonce = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		annonce.setDateCreaAnnonce(dateCreaAnnonce);

		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement(
					"UPDATE annonce SET titreAnnonce=?,descAnnonce=?,photoAnnonce=?,zoneAnnonce=?,dateAnnonce=?,finAnnonce=?,importanceAnnonce=? WHERE idAnnonce=?");
			req.setString(1, annonce.getTitreAnnonce());
			req.setString(2, annonce.getDescAnnonce());
			req.setString(3, annonce.getPhotoAnnonce());
			req.setInt(4, annonce.getZoneAnnonce());
			req.setDate(5, annonce.getDateAnnonce());
			req.setDate(6, annonce.getFinAnnonce());
			req.setInt(7, annonce.getImportanceAnnonce());
			req.setString(8, annonce.getIdAnnonce());

			nb = req.executeUpdate();

			result = true;
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;

	}

	/** public fonction affichAnnonceUser()
	 * \breif Affiche toutes les annonces d'un user
	 * 
	 * Renvoie une Arraylist contenant toutes les annonces d'un user
	**/
	public ArrayList<Annonce> affichAnnonceUser(String idUser) {
		ArrayList<Annonce> annonces = null;
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce WHERE idUser = ?");
			req.setString(1, idUser);
			res = req.executeQuery();
			while (res.next()) {
				Annonce annonce = new Annonce(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getInt(5), res.getDate(6), res.getDate(7), res.getInt(8), res.getDate(9), res.getString(10),
						res.getInt(11));
				annonces.add(annonce);
			}
		} catch (SQLException e) {

		}

		return annonces;
	}

	/** public fonction afficheAnnonceUser()
	 * \breif Affiche tout les types d'annonces
	 * 
	 * Renvoie une Arraylist contenant toutes les types d'annonces de la base de donnee
	**/
	public ArrayList<Annonce> affichAnnonceUser(int type) {
		ArrayList<Annonce> annonces = null;
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce WHERE idType = ?");
			req.setInt(1, type);
			res = req.executeQuery();
			while (res.next()) {
				Annonce annonce = new Annonce(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getInt(5), res.getDate(6), res.getDate(7), res.getInt(8), res.getDate(9), res.getString(10),
						res.getInt(11));
				annonces.add(annonce);
			}
		} catch (SQLException e) {

			// TODO: handle exception
		}

		return annonces;
	}
}