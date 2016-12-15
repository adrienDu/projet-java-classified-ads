/**
 * 
 */
package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Entreprise;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

/**
 * @author saad9_000
 *
 */
public class EntrepriseDAO extends UserDAO {

	public static ArrayList getAllEntreprise() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<Entreprise> alluser = new ArrayList<Entreprise>();
		String req = ("SELECT entreprise.idUser, user.idSocialUser, user.mdpUser FROM entreprise INNER JOIN user on entreprise.idUser=user.idUser");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Entreprise Resultat = new Entreprise(DBAction.getRes().getString(1), DBAction.getRes().getString(2), 0, "", 0,"", 0);
			User user = new User(DBAction.getRes().getString(1), req, req, req, req, null, req, req);
			
			alluser.add(Resultat);
		}

		DBAction.DBClose();

		return alluser;
	}

	
}
