package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.dao.AssociationDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestAssociationDAO {

	/**
	 * Test la Class AssociationDAO
	 * @author Maeva, Adrien, Moaz
	 *
	 */

	@Test
	/**
	 * Test getAssoUser
	 */
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
	/**
	 * Test AddAssoUser
	 */
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

	@Test
	/**
	 * Test deleteAssoUser
	 */
	public void deleteAssoUser() {
		System.out.println("Supprimer un user");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.deleteAssoUser("A3");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test updateNomAsso
	 */
	public void TestUpdateNomAsso() {
		System.out.println("modifier le nom d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateNomAsso("A2", "Medecins sans frontiere");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test updateNumAdAsso
	 */
	public void TestUpdateNumAdAsso() {
		System.out.println("modifier le num de rue d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateNumAdAsso("A2", 33);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test UpdateRueAdAsso
	 */
	public void TestUpdateRueAdAsso() {
		System.out.println("modifier la rue d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateRueAdAsso("A2", "avenue Garnier");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test UpdateCpAdAsso
	 */
	public void TestUpdateCpAdAsso() {
		System.out.println("modifier le cp de l'adresse d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateCpAdAsso("A2", 75003);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test UpdateVilleAdAsso
	 */
	public void TestUpdateVilleAdAsso() {
		System.out.println("modifier la ville de l'adresse d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateVilleAdAsso("A2", "Paris");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	/**
	 * Test UpdateTelAdAsso
	 */
	public void TestUpdateTelAdAsso() {
		System.out.println("modifier le tel d'une association");
		AssociationDAO userDAO = new AssociationDAO();
		try {
			userDAO.updateTelAsso("A2", 675432343);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

}
