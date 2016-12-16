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
			userDAO.addPartUser("claireralou@mail.com", "CR123", "classique", "Claire", "Ralou", 34,
					"Rue des glycines", 75017, "Paris", 0342422312);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

}
