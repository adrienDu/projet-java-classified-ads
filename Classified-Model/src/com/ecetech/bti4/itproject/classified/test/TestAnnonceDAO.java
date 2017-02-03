package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;

public class TestAnnonceDAO {

	@Test
	public void test1GetAllAnnonce() {
		ArrayList<Annonce> annonces = AnnonceDAO.getAllAnnonce();
		assertTrue("All Annonce", annonces != null);
	}

	@Test
	public void test2NewAnnonce() {
		boolean res;

		String stringDatepostAnnonce = "2016-12-17";
		String stringDatefinAnnonce = "2016-12-20";
		String stringDatecreaAnnonce = "2016-12-15";

		Date ndateAnnonce = null;
		Date ndateFinAnnonce = null;
		Date ndateCreaAnnonce = null;

		try {
			ndateAnnonce = new SimpleDateFormat("yyyy-MM-dd").parse(stringDatepostAnnonce);
			ndateFinAnnonce = new SimpleDateFormat("yyyy-MM-dd").parse(stringDatefinAnnonce);

		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date dateAnnonce = new java.sql.Date(ndateAnnonce.getTime());
		java.sql.Date dateFin = new java.sql.Date(ndateFinAnnonce.getTime());

		Annonce annonce = new Annonce("", "ceci est une annonce de test d insert", " ", 75000, dateAnnonce, dateFin, 0,
				"E1", 0);

		
		assertTrue(AnnonceDAO.newAnnonce(annonce));
		//res = AnnonceDAO.newAnnonce(annonce);
		//System.out.println(res);
	}

	@Test
	public void test3ChangeAnnonce() {
		fail("Not yet implemented");
	}

	@Test
	public void test4GetAnnonce() {
		fail("Not yet implemented");
	}

	@Test
	public void test5DelAnnonce() {
		fail("Not yet implemented");
	}

	@Test
	public void test4AffichAnnonceUserString() {
		fail("Not yet implemented");
	}

	@Test
	public void test5AffichAnnonceUserInt() {
		fail("Not yet implemented");
	}

}
