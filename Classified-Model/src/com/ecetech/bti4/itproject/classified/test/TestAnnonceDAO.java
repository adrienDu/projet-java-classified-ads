package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;

public class TestAnnonceDAO {

	@Test
	public void testGetAllAnnonce() {
		ArrayList<Annonce> annonces = new ArrayList<>();
		try {
			annonces = AnnonceDAO.getAllAnnonce();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affichArayList(annonces);

	}

	public void affichArayList(ArrayList<Annonce> annonces){
		ListIterator<Annonce> list = annonces.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next().toString());
			
		}
	}
	

}
