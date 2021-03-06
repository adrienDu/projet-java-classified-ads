package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.sql.ResultSet;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Categorie;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Represente une Annonce
 * 
 * @author Maeva, Adrien, Moaz
 */

public class AnnonceDAO {

	/**
	 * public fonction getAllAnnonce() \breif Affiche toutes les annonces
	 * 
	 * Renvoie une Arraylist contenant toutes les annonces de la base de donnee
	 **/
	public static ArrayList<Annonce> getAllAnnonce() {
		ArrayList<Annonce> result = new ArrayList<Annonce>();
		ResultSet res;
		Annonce annonce = new Annonce();
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce");
			res = req.executeQuery();
			while (res.next()) {
				annonce = new Annonce(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getInt(5), res.getFloat(6), res.getString(7), res.getDate(8), res.getDate(9),
						res.getInt(10), res.getDate(11), res.getString(12), res.getInt(13), res.getInt(14));
				result.add(annonce);
			}
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static ArrayList<Annonce> getAnnonceReq(String r) {
		String requete = r;
		ArrayList<Annonce> result = new ArrayList<Annonce>();
		ResultSet res;
		Annonce annonce = new Annonce();
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement(requete);
			res = req.executeQuery();
			while (res.next()) {
				annonce = new Annonce(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getInt(5), res.getFloat(6), res.getString(7), res.getDate(8), res.getDate(9),
						res.getInt(10), res.getDate(11), res.getString(12), res.getInt(13), res.getInt(14));
				result.add(annonce);
			}
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * public fonction getAnnonce() \breif Affiche une annonce
	 * 
	 * Renvoie une Arraylist contenant une annonce de la base de donnee
	 **/
	public static Annonce getAnnonce(String idAnnonce) throws SQLException {
		DBAction.DBConnexion();
		Annonce annonce = new Annonce();
		String req = ("SELECT * FROM `annonce` WHERE `idAnnonce` ='" + idAnnonce + "';");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while (DBAction.getRes().next()) {
				annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
						DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
						DBAction.getRes().getFloat(6), DBAction.getRes().getString(7), DBAction.getRes().getDate(8),
						DBAction.getRes().getDate(9), DBAction.getRes().getInt(10), DBAction.getRes().getDate(11),
						DBAction.getRes().getString(12), DBAction.getRes().getInt(13), DBAction.getRes().getInt(14));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		DBAction.DBClose();

		return annonce;
	}

	/**
	 * public fonction newAnnonce() \breif Cree une nouvelle annonce
	 * 
	 * Renvoie un boolean
	 **/

	public static boolean newAnnonce(Annonce annonce) {
		boolean result;
		int nb;
		if (annonce.getIdAnnonce() == "" || annonce.getIdAnnonce() == null) {
			annonce.setIdAnnonce(MakeUUID.generate());
		}

		// date du jour
		java.sql.Date dateCreaAnnonce = new java.sql.Date(Calendar.getInstance().getTime().getTime());

		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("INSERT INTO annonce VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			req.setString(1, annonce.getIdAnnonce());
			req.setString(2, annonce.getTitreAnnonce());
			req.setString(3, annonce.getDescAnnonce());
			req.setString(4, annonce.getPhotoAnnonce());
			req.setInt(5, annonce.getZoneAnnonce());
			req.setFloat(6, annonce.getPrix());
			req.setString(7, annonce.getContact());
			req.setDate(8, annonce.getDateAnnonce());
			req.setDate(9, annonce.getFinAnnonce());
			req.setInt(10, annonce.getImportanceAnnonce());
			req.setDate(11, dateCreaAnnonce);
			req.setString(12, annonce.getUser_idUser());
			req.setInt(13, annonce.getCat_idCategorie());
			req.setInt(14, annonce.getType_idType());

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

	/**
	 * public fonction delAnnonce() \breif Supprime une annocne
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

	/**
	 * public fonction changelAnnonce() \breif Modifie une annonce
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

	/**
	 * public fonction affichAnnonceUser() \breif Affiche toutes les annonces
	 * d'un user
	 * 
	 * Renvoie une Arraylist contenant toutes les annonces d'un user
	 **/
	public ArrayList<Annonce> affichAnnonceUser(String idUser) {
		ArrayList<Annonce> annonces = new ArrayList<Annonce>();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce WHERE idUser = ?");
			req.setString(1, idUser);
			res = req.executeQuery();
			while (res.next()) {
				Annonce annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
						DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
						DBAction.getRes().getFloat(6), DBAction.getRes().getString(7), DBAction.getRes().getDate(8),
						DBAction.getRes().getDate(9), DBAction.getRes().getInt(10), DBAction.getRes().getDate(11),
						DBAction.getRes().getString(12), DBAction.getRes().getInt(13), DBAction.getRes().getInt(14));
				annonces.add(annonce);
			}
		} catch (SQLException e) {

		}

		return annonces;
	}

	/**
	 * public fonction afficheAnnonceUser() \breif Affiche tout les types
	 * d'annonces
	 * 
	 * Renvoie une Arraylist contenant toutes les types d'annonces de la base de
	 * donnee
	 **/
	public ArrayList<Annonce> affichAnnonceUser(int type) {
		ArrayList<Annonce> annonces = new ArrayList<Annonce>();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM annonce WHERE idType = ?");
			req.setInt(1, type);
			res = req.executeQuery();
			while (res.next()) {
				Annonce annonce = annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
						DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
						DBAction.getRes().getFloat(6), DBAction.getRes().getString(7), DBAction.getRes().getDate(8),
						DBAction.getRes().getDate(9), DBAction.getRes().getInt(10), DBAction.getRes().getDate(11),
						DBAction.getRes().getString(12), DBAction.getRes().getInt(13), DBAction.getRes().getInt(14));
				annonces.add(annonce);
			}
		} catch (SQLException e) {

			// TODO: handle exception
		}

		return annonces;
	}
}