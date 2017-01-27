package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Entreprise;
import com.ecetech.bti4.itproject.classified.beans.Particulier;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.EntrepriseDAO;
import com.ecetech.bti4.itproject.classified.dao.ParticulierDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestEntrepriseDAO {
	
	/**
	 * Test la Class EntrepriseDAO
	 * @author Maeva, Adrien, Moaz
	 *
	 */


	@Test
	/**
	 * Test GetEntUser
	 */
	  public void testGetEntUser() {
	    System.out.println("get user");
	    EntrepriseDAO userDAO = new EntrepriseDAO();
	    try {
	      Entreprise user = userDAO.getEntUser("E1");
	      System.out.println(user.toString());
	    } catch (SQLException e) {
	      e.printStackTrace();
	      System.out.println("erreur de connexion");
	    }
	  }
	
	@Test
	/**
	 * Test AddEntUser
	 */
	public void testAddEntUser() {
		System.out.println("ajouter un user particulier");
		EntrepriseDAO userDAO = new EntrepriseDAO();
		try {
			userDAO.addEntUser("p&g@mail.com", "pg123", "classique", "P&G", 109,
					"Rue des martyrs", 75009, "Paris", 0453553456, "JFOREJO4K3OPK4O");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}
	
	/*
	 * Manque partie 
	 */
}
