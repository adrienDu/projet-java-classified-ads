package com.ecetech.bti4.itproject.classified.test;

import java.sql.SQLException;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestUserDAO {

	@Test
	public void testGetUser() {
	UserDAO userDAO = new UserDAO();
	try {
	User user =	userDAO.getUser("A1");
	System.out.println(user.toString());	
	} 
	catch (SQLException e) {
	e.printStackTrace();

	System.out.println("erreur de connexion");
}
	}

	@Test
	public void testGetAllUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUserStringStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUserStringUser() {
		fail("Not yet implemented");
	}

}
