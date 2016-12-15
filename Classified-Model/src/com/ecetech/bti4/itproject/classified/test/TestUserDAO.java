package com.ecetech.bti4.itproject.classified.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Association;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestUserDAO {
	
	@Test
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
	
	/*@Test
	public void testGetUserById() {
		System.out.println("get user");
		UserDAO userDAO = new UserDAO();
		try {
			Association userA = userDAO.getUser("A1");
			System.out.println(userA.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}*/
	/*@Test
	public void testGetUserByType() {
		System.out.println("get user by type");
		ArrayList<User> typeuser = new ArrayList<>();
		try {
			typeuser = UserDAO.getTypeUser("A");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
		affichArayList(typeuser);
	}

	@Test
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

	@Test
	public void testAddUser() {
		System.out.println("ajouter un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser("test@test.fr","testpassword","P","classique");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}
	
	@Test
	public void testDeleteUser() {
		System.out.println("supprimer un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.deleteUser("7be84569-bba0-4195-b332-b53373b4361");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}
	
	//UPDATE
	@Test
	public void TestUpdateMailUser(){
		System.out.println("modifier le mail d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateMailUser("A1","artisansmeunuisiers@am.fr");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}
	
	@Test
	public void TestUpdateMdpUser(){
		System.out.println("modifier le mail d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateMdpUser("A1","4rtisansM3");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	public void TestUpdateEtatUser(){
		System.out.println("modifier l'etat d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateEtatUser("A1","OK");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}
	
	@Test
	public void TestUpdateTypeUser(){
		System.out.println("modifier le type d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updateTypeUser("A1","A");
			UserDAO.getAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur de connexion");
		}
	}

	@Test
	public void TestUpdatePermissionUser(){
		System.out.println("modifier les permissions d'un user");
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.updatePermissionUser("A1","admin");
			UserDAO.getAllUser();
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
	}*/

}
