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
	
	// UPDATE
		@Test
		public void TestUpdateNomPart() {
			System.out.println("modifier le nom d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateNomPart("P1", "Weider");;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}

		@Test
		public void TestUpdatePrenomPart() {
			System.out.println("modifier le nom d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updatePrenomPart("P1", "Léa");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}
		
		@Test
		public void TestUpdateNumAdPart() {
			System.out.println("modifier le num de rue d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateNumAdPart("P1", 33);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}
		
		@Test
		public void TestUpdateRueAdPart() {
			System.out.println("modifier la rue d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateRueAdPart("P1", "avenue Garnier");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}
		
		@Test
		public void TestUpdateCpAdPart(){
			System.out.println("modifier le cp de l'adresse d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateCpAdPart("P1",75003);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}
		
		@Test
		public void TestUpdateVilleAdPart(){
			System.out.println("modifier la ville de l'adresse d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateVilleAdPart("P1","Paris");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}
		
		@Test
		public void TestUpdateTelAdPart(){
			System.out.println("modifier le tel d'une personne");
			ParticulierDAO userDAO = new ParticulierDAO();
			try {
				userDAO.updateTelPart("P1", 675432343);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur de connexion");
			}
		}

}
