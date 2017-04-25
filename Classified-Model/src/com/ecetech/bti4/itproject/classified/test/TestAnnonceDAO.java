package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

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
			e.printStackTrace();
		}
		java.sql.Date dateAnnonce = new java.sql.Date(ndateAnnonce.getTime());
		java.sql.Date dateFin = new java.sql.Date(ndateFinAnnonce.getTime());

		Annonce annonce = new Annonce();

		assertTrue(AnnonceDAO.newAnnonce(annonce));

	}

	@Test
	public void test3ChangeAnnonce() {
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
			e.printStackTrace();
		}
		java.sql.Date dateAnnonce = new java.sql.Date(ndateAnnonce.getTime());
		java.sql.Date dateFin = new java.sql.Date(ndateFinAnnonce.getTime());

		Annonce annonce = new Annonce();
		assertTrue(AnnonceDAO.changeAnnonce(annonce));

	}

	@Test
	public void test4GetAnnonce() throws SQLException {
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
			e.printStackTrace();
		}
		java.sql.Date dateAnnonce = new java.sql.Date(ndateAnnonce.getTime());
		java.sql.Date dateFin = new java.sql.Date(ndateFinAnnonce.getTime());

		Annonce annonce = new Annonce();
		assertTrue(annonce.equals(AnnonceDAO.getAnnonce("ffe35927-ba0b-11e6-a706-000000000")));

	}

	

	@Test
	public void test5DelAnnonce() {
		String idAnnonceDel = "ffe35927-ba0b-11e6-a706-000000000";
		assertTrue(AnnonceDAO.delAnnonce(idAnnonceDel));
	}

	public void affichArayList(ArrayList<Annonce> annonces) {

		ListIterator<Annonce> list = annonces.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next().toString());

		}
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
