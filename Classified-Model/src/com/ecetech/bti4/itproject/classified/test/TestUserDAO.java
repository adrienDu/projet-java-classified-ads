package com.ecetech.bti4.itproject.classified.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;
import org.junit.Test;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestUserDAO {

	/**
	 * Test la Class UserDAO
	 * @author Maeva, Adrien, Moaz
	 *
	 */

	
	/**
	 * @Test
	 * Test GetUser
	 */
	public void testGetUser() {
		System.out.println("get user");
		UserDAO userDAO = new UserDAO();
		try {
			User user = userDAO.getUser("A1");
			System.out.println(user.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test GetUserByType
	 */
	public void testGetUserByType() {
		System.out.println("get user by type");
		ArrayList<User> typeuser = new ArrayList<>();
		try {
			typeuser = UserDAO.getTypeUser("P");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test GetAllUser
	 */
	public void testGetAllUser() {
		System.out.println("get all user");
		ArrayList<User> allusers = new ArrayList<>();
		try {
			allusers = UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		affichArayList(allusers);

	}


	/**
	 * @Test
	 * Test AddUser
	 */
	public void testAddUser() {
		System.out.println("ajouter un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser("maeva@margueritat.fr", "123AZERTY", "P", "classique");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test deleteUser
	 */
	public void deleteUser() {
		System.out.println("Supprimer un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.deleteUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test UpdateMailUser
	 */
	public void testUpdateMailUser() {
		System.out.println("modifier le mail d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateMailUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5", "adrien@duhoux.fr");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test UpdateMdpUser
	 */
	public void testUpdateMdpUser() {
		System.out.println("modifier le mail d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateMdpUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5", "123AZERTY");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	
	/**
	 * @Test
	 * Test UpdateEtatUser
	 */
	public void testUpdateEtatUser() {
		System.out.println("modifier l'etat d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateEtatUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5", "BlackList");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	/**
	 * @Test
	 * Test UpdateTypeUser
	 */
	public void testUpdateTypeUser() {
		System.out.println("modifier le type d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateTypeUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5", "A");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	/**
	 * @Test
	 * Test UpdatePermissionUser
	 */
	public void testUpdatePermissionUser() {
		System.out.println("modifier les permissions d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updatePermissionUser("7710c2fe-29e3-428a-9aa2-b142e8dd56a5", "admin");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	public void affichArayList(ArrayList<User> allusers) {
		ListIterator<User> list = allusers.listIterator();
		int i = 1;
		while (list.hasNext()) {
			System.out.println(i + " " + list.next().toString());
			i++;
		}
	}

}
