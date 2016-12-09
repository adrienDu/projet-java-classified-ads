package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Permission;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class PermissionDAO {

	public static ArrayList<Permission> getAllPermission() throws SQLException {
        DBAction.DBConnexion();
        ArrayList<Permission> permission = new ArrayList<>();
        String   req = ("SELECT * FROM Permission'");
        
        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	Permission perm= (Permission) DBAction.getRes();
        	permission.add(perm);
        	permission.clear();
        	
        }

        DBAction.DBClose();

        return permission;
    }   
	
	//public String hasPermission(){
		// DBAction.DBConnexion();
	    // ArrayList<Permission> permission = new ArrayList<>();
	     //String   req = ("SELECT * FROM Permission WHERE permission = 1");
	//}

}
