package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.dao.AssociationDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestAssociationDAO {

	@Test
	public void testGetAssoUser() {
		System.out.println("get user");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			Association user = userDAO.getAssoUser("A1");
			System.out.println(user.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	public void testAddAssoUser() {
		System.out.println("ajouter un user association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.addAssoUser("croixrouge@mail.com", "rouge123", "classique", "La Croix Rouge", "12JOFEO23123", 55,
					"Avenue de Paris", 75004, "Paris", 0123423456);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

}
