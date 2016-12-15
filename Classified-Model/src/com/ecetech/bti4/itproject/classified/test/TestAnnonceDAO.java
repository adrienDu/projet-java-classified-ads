package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class TestAnnonceDAO {
	

	@Test
	public void testGetAllAnnonce() {
		ArrayList<Annonce> annonces = new ArrayList<>();
		annonces = AnnonceDAO.getAllAnnonce();
		affichArayList(annonces);

	}
/*
	@Test
	public void testGetAnnonce() {
		Annonce annonce = new Annonce();
		try {
			annonce = AnnonceDAO.getAnnonce("ffe35927-ba0b-11e6-a706-5c514fc83452");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(annonce == null){
			System.out.println("pas de resultat trouvé");
		}
		else {
			System.out.println(annonce.toString());

		}
	}

	@Test
	public void testNewAnnonce() {
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
				
		Annonce annonce = new Annonce("", "ceci est une annonce de test d insert", " ",75000, dateAnnonce, dateFin, 0, "E1",0);

			res = AnnonceDAO.newAnnonce(annonce);	
			System.out.println(res);
	}
	
	@Test
	public void testDelAnnonce(){
		boolean res;
		String idAnnonceDel = "ffe35927-ba0b-11e6-a706-5c514fc83452";
		res = AnnonceDAO.delAnnonce(idAnnonceDel);
		System.out.println(res);
	}
*/
	public void affichArayList(ArrayList<Annonce> annonces) {

		ListIterator<Annonce> list = annonces.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next().toString());

		}
	}
	

}




