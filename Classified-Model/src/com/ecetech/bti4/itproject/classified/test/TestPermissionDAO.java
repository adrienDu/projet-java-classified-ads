package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.Permission;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.PermissionDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;

public class TestPermissionDAO {
	
	
	
	@Test
	public void testGetAllPermission() {
		System.out.println("||Test de GetAllPermission||");
		ArrayList<Permission> permission = new ArrayList<>();
		try {
			permission = PermissionDAO.getAllPermission();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		affichArayList(permission);
		System.out.println("--TEST OK--");
		
	}
	
	@Test
	public void testHasPermission() {
		System.out.println("||Test de HasPermission||");
		boolean permission = PermissionDAO.hasPermission("A2", "classique");
		System.out.println(permission);
		System.out.println("--TEST OK--");
		
	
	}
	
	@Test
	public void testsetPermission() {
		System.out.println("||Test de SetPermission||");
		PermissionDAO p = new PermissionDAO();
		p.setPermission("A1","classique");
		System.out.println("--TEST OK--");
	
	}
	
	
	@Test
	public void testAddPermi() {
		System.out.println("||Test de addPermission||");
		PermissionDAO p = new PermissionDAO();
		p.addPermi("Modérateur");
		System.out.println("--TEST OK--");
	
	}
	
	
	
	
public void affichArayList(ArrayList<Permission> permission){
		
		ListIterator<Permission> list = permission.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next().toString());
			
		}
	}


}
