package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.AssociationDAO;


public class TestAssociationDAO {

	@Test
	  public void testGetAssoUser() {
	    System.out.println("get user");
	    AssociationDAO userDAO = new AssociationDAO();
	    try {
	      User user = userDAO.getAssoUser("A1");
	      System.out.println(user.toString());
	    } catch (SQLException e) {
	      e.printStackTrace();
	      System.out.println("erreur de connexion");
	    }
	  }

}
