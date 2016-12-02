package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class UserDAO {
	public static User getUer(String id) throws SQLException {
        DBAction.DBConnexion();
        User Resultat = new User();
        String req = ("SELECT * FROM User WHERE idUser='" + id + "'");

        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	Resultat.setIdSocialUser((DBAction.getRes().getIdSocialUser(2)))
        	Resultat.setMailUser((DBAction.getRes().getMailDate(3)));
        	Resultat.setMdpUser(DBAction.getRes().getMdpUser(4));
        	Resultat.setEtatUser(DBAction.getRes().getEtatUser(5));
        	Resultat.setDateInUser(DBAction.getRes().getDateInUser(6));
        	Resultat.setTypeUser(DBAction.getRes().getTypeUser(7));
        	Resultat.setPermission_idPermission(DBAction.getRes().getPermission_idPermission(8));
        	
        }

        DBAction.DBClose();

        return Resultat;
    }   
	
	public static ArrayList getAllUser() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<User> alluser = new ArrayList<User>();
		return null;
    }   
	
	public static int setUser(String id, String newName, String newMail, String newPSW) throws SQLException {
		return 1;
    }   

	public static int setUser(String id, User usertoadd) throws SQLException {
		return 1;
    }   

}
