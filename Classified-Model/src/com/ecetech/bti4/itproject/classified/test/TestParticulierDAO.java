package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Particulier;
import com.ecetech.bti4.itproject.classified.dao.AssociationDAO;
import com.ecetech.bti4.itproject.classified.dao.ParticulierDAO;

public class TestParticulierDAO {

	@Test
	  public void testGetPartUser() {
	    System.out.println("get user");
	    ParticulierDAO userDAO = new ParticulierDAO();
	    try {
	      Particulier user = userDAO.getPartUser("P1");
	      System.out.println(user.toString());
	    } catch (SQLException e) {
	      e.printStackTrace();
	      System.out.println("erreur de connexion");
	    }
	  }
	
	@Test
	public void testAddPartUser() {
		System.out.println("ajouter un user particulier");
		ParticulierDAO userDAO = new ParticulierDAO();
		try {
			userDAO.addPartUser("eliottheinz@mail.com", "Eli123", "classique", "Eliott", "Heinz", 3,
					"Rue Jean Racine", 75015, "Paris", 0342423456);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

}
