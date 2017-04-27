package com.ecetech.bti4.itproject.classified.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Categorie;
import com.ecetech.bti4.itproject.classified.beans.Type;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Represente un type
 * 
 * @author Maeva, Adrien, Moaz
 *
 */

public class TypeDAO {

	/** public fonction getAllType()
	 * \breif Affiche les types 
	 * 
	 * Renvoie une Arraylist contenant tous les types de la base de donnee
	**/
	public static ArrayList<Type> getAllType() {
		ArrayList<Type> result = new ArrayList<Type>();
		ResultSet res;
		Type type = new Type();
		DBAction.DBConnexion(); 
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("SELECT * FROM type");
			res = req.executeQuery();
			while (res.next()) {
				type = new Type(res.getInt(1), res.getString(2));
				result.add(type);
			}
			req.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	/**
	 * fonction getType : permet de recuper le type d'un id
	 * 
	 * @param idType
	 * @return
	 * @throws SQLException
	 */
	public static Type getType(String idType) throws SQLException {
		DBAction.DBConnexion();
		Type type = new Type();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;
		ResultSet res;

		try {
			req = (PreparedStatement) con
					.prepareStatement("SELECT * FROM `type` WHERE `idType` ='" + idType + "';");
			res = req.executeQuery();
			type = new Type(res.getInt(1), res.getString(2));
			req.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return type;
	}

	/**
	 * public fonction changeType() \breif Modifie le type
	 * 
	 * Ne renvoie rien
	 **/
	public static boolean changeType(Type type) {
		boolean result;
		int nb;
		DBAction.DBConnexion();
		Connection con = (Connection) DBAction.getCon();
		PreparedStatement req;

		try {
			req = (PreparedStatement) con.prepareStatement("UPDATE type SET nomType=? WHERE idType=?");
			req.setString(1, type.getNomType());
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
