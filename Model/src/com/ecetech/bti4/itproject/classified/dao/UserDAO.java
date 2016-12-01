package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class UserDAO {
	public static User getUer(String id) throws SQLException {
        DBAction.DBConnexion();
        User Resultat  = new User();
        String                 req       = ("SELECT * FROM User WHERE idUser='" + id + "'");

        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	Resultat.setDate((DBAction.getRes().getDate(6)));
        	Resultat.setEmail(DBAction.getRes().getString(3));
        	Resultat.setMdp(DBAction.getRes().getString(4));
        	Resultat.setType(DBAction.getRes().getString(7));
        	///////.....
        }

        DBAction.DBClose();

        return Resultat;
    }   
	
	public static ArrayList getAllUser() throws SQLException {
		return null;
    }   
	
	public static int setUser(String id, String newName, String newMail, String newPSW) throws SQLException {
		return 1;
    }   

	public static int setUser(String id, User usertoadd) throws SQLException {
		return 1;
    }   

}
