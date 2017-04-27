package com.ecetech.bti4.itproject.classified.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Categorie;
import com.ecetech.bti4.itproject.classified.beans.Type;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Represente une categorie d'annonce
 * @author Maeva, Adrien, Moaz
 *
 */

public class CategorieDAO {
	/** public fonction getAllCat()
	 * \breif Affiche toutes les categories 
	 * 
	 * Renvoie une Arraylist contenant toutes les categories de la base de donnee
	**/
	public static ArrayList<Categorie> getAllCat() {
		ArrayList<Categorie> result = new ArrayList<Categorie>();
		ResultSet res;
		Categorie categorie = new Categorie();
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM categorie");
			res = req.executeQuery();
			while (res.next()) {
				categorie = new Categorie(res.getInt(1), res.getString(2), res.getInt(3));
				result.add(categorie);
			}
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	/**
	 * getCat permet de recuperer une categorie dupuis un type
	 * @param idCat
	 * @return
	 * @throws SQLException
	 */
	public static Categorie getType(String idCat) throws SQLException {
		DBAction.DBConnexion();
		Categorie cat = new Categorie();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;
		try {
			req = (PreparedStatement) con
					.prepareStatement("SELECT * FROM `caterorie` WHERE `idCategorie` ='" + idCat + "';");
			res = req.executeQuery();
			cat = new Categorie(res.getInt(1), res.getString(2), res.getInt(3));
			req.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cat;
	}


	/** public fonction changeCat()
	 * \breif Modifie une categorie
	 * 
	 * Renvoie un boolean
	**/
	public static boolean changeCat(Categorie categorie) {
		boolean result;
		int nb;
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("UPDATE categorie SET nomCategorie=? WHERE idCategorie=?");
			req.setString(1, categorie.getNomCategorie());
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
}