package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Permission;
import com.ecetech.bti4.itproject.classified.common.DBAction;

/**
 * Represente une permission
 * @author Maeva, Adrien, Moaz
 *
 */

public class PermissionDAO {
	/** public fonction getAllPermission()
	 * \breif Affiche les permissions des utilisateurs
	 * 
	 * Renvoie une Arraylist contenant toutes les permissions de la base de donnee
	**/
	public static ArrayList<Permission> getAllPermission() throws SQLException {
        DBAction.DBConnexion();
        ArrayList<Permission> permission = new ArrayList<>();
        String req = ("SELECT * FROM Permission");
        
        try {
            DBAction.setRes(DBAction.getStm().executeQuery(req));
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        }

        while (DBAction.getRes().next()) {
        	Permission perm = new Permission(DBAction.getRes().getString(1));
        	permission.add(perm);
        		
        }

        DBAction.DBClose();

        return permission;
    }   
	
	/** public fonction hasPermission()
	 * \breif Affiche la permission de utilisateur
	 * 
	 * Renvoie un boolean
	**/
	public static boolean hasPermission( String idUser, String id_Permission ){
		 DBAction.DBConnexion();
		 boolean verif = false;
	
		
			 String req = ("SELECT idUser FROM USER where idUser='" + idUser +"'  AND Permission_idPermission='"+id_Permission+"'" );
			 try {
		            DBAction.setRes(DBAction.getStm().executeQuery(req));
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        try {
					if (DBAction.getRes().next()) {
						
						return verif = true; 	
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        DBAction.DBClose();
			
			
			 
		return verif;
	}
	
	/** public fonction setPermission()
	 * \breif Modifie la permission d'un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	
	public void setPermission( String idUser, String id_Permission ) {
		
		 DBAction.DBConnexion();
		 
			String req = ("UPDATE `user` SET `Permission_idPermission`='" + id_Permission +"' WHERE idUser ='" + idUser + "'");
			try {
		            DBAction.getStm().executeLargeUpdate(req);
		            System.out.println(" Votre permission a été modifié avec succès.");
		            
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        DBAction.DBClose();
		
	}
	
	/** public fonction addPermission()
	 * \breif Ajoute une permission a un utilisateur
	 * 
	 * Ne renvoie rien
	**/
	public void addPermi( String id_Permission ){
		
		DBAction.DBConnexion();
		
		String req = ("INSERT INTO `permission`(`idPermission`) VALUES ('"+ id_Permission+"')");
		try {
	            DBAction.getStm().executeLargeUpdate(req);
	            System.out.println(" Votre permission a été ajouté avec succès.");
	            
	        } catch (SQLException ex) {
	        	System.out.println("Cette permission existe déjà ! ");
	        }

	        DBAction.DBClose();
		
	}
	
	

}
