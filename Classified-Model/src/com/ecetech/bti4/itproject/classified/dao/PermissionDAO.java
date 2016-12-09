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
	
	public boolean hasPermission( String idUser, String id_Permission ){
		 DBAction.DBConnexion();
		 boolean verif = false;
	
		
			 String req = ("SELECT " + idUser + "FROM User WHERE Permission_idPermission = "+ id_Permission );
			 try {
		            DBAction.setRes(DBAction.getStm().executeQuery(req));
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        if (DBAction.getRes() != null) {
		        	
		        	verif = true; 	
		        }

		        DBAction.DBClose();
			
			
			 
		return verif;
	}
	
	//public void setPermission( String idUser, String id_Permission ) {
		
		// DBAction.DBConnexion();
		 
			// String req = ("UPDATE " + idUser + "FROM User WHERE Permission_idPermission = "+ id_Permission );
			// try {
		      //      DBAction.setRes((DBAction.getStm().executeUpdate(req));
		       // } catch (SQLException ex) {
		       // 	System.out.println(ex.getErrorCode());
		       // }

		       // DBAction.DBClose();
		
	//}
	
	public void ajoutPermission(){


	}

}
