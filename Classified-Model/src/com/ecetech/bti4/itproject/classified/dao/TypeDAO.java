package com.ecetech.bti4.itproject.classified.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Categorie;
import com.ecetech.bti4.itproject.classified.beans.Type;
import com.ecetech.bti4.itproject.classified.common.DBAction;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
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
		ArrayList<Type> result = null;
		ResultSet res;
		Type type = null;
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


	/** public fonction changeType()
	 * \breif Modifie le type
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
