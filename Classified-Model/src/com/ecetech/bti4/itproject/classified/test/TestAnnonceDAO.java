package com.ecetech.bti4.itproject.classified.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.common.MakeUUID;
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
		//affichArayList(annonces);

	}
	@Test
	public void testGetAnnonce(){
		Annonce annonce = new Annonce();
		try{
			annonce = AnnonceDAO.getAnnonce("ffe35927-ba0b-11e6-a706-5c514fc83452");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(annonce.toString());
	}

	@Test
	public void testNewAnnonce(){
		java.sql.Date dateAnnonce = new java.sql.Date(2016, 12, 13);
		java.sql.Date dateFin = new java.sql.Date(2016, 12, 13);
		System.out.println(dateAnnonce);
		//Annonce annonce = new Annonce("Annonce de test", "ceci est une annonce de test d insert", "",75000, dateAnnonce, dateFin, 0, "E1", 0);
	}
	public void affichArayList(ArrayList<Annonce> annonces){
		
		ListIterator<Annonce> list = annonces.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next().toString());
			
		}
	}
	

}
