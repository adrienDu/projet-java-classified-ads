package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class UserDAO {
	public static User getUser(String idUser) throws SQLException {
        DBAction.DBConnexion();
        User Resultat = new User();
        String req = ("SELECT * FROM user WHERE idUser='" + idUser + "'");
        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println("toto "+ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	Resultat.setIdSocialUser(DBAction.getRes().getString(2));
        	Resultat.setMailUser(DBAction.getRes().getString(3));
        	Resultat.setMdpUser(DBAction.getRes().getString(4));
        	Resultat.setEtatUser(DBAction.getRes().getString(5));
        	Resultat.setDateInUser(DBAction.getRes().getDate(6));
        	Resultat.setTypeUser(DBAction.getRes().getString(7));
        	Resultat.setPermission_idPermission(DBAction.getRes().getString(8));
        	
        }

        DBAction.DBClose();

        return Resultat;
    }   
	
	public static ArrayList getAllUser() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<User> alluser = new ArrayList<User>();
		String req = ("SELECT * FROM user");
        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	User Resultat = new User();
        	alluser.add(Resultat);
        }

        DBAction.DBClose();

        return alluser;
    }   
	
	public static int setUser(String id, String newName, String newMail, String newPSW) throws SQLException {
		return 1;
    }   

	public static int setUser(String id, User usertoadd) throws SQLException {
		return 1;
    }   

}
