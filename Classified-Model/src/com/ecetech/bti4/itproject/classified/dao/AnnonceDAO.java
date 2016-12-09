package com.ecetech.bti4.itproject.classified.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.common.DBAction;

public class AnnonceDAO {

	public static ArrayList<Annonce> getAllAnnonce() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<Annonce> annonces = new ArrayList<>();
		String req = ("SELECT * FROM annonce");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println("toto " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Annonce annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getDate(7), DBAction.getRes().getInt(8),
					DBAction.getRes().getString(9), DBAction.getRes().getInt(10));
			annonces.add(annonce);

		}

		DBAction.DBClose();

		return annonces;
	}

	public static ArrayList<Annonce> getAnnonce() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<Annonce> annonces = new ArrayList<>();
		String req = ("SELECT * FROM annonce");
		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println("toto " + ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Annonce annonce = new Annonce(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4), DBAction.getRes().getInt(5),
					DBAction.getRes().getDate(6), DBAction.getRes().getDate(7), DBAction.getRes().getInt(8),
					DBAction.getRes().getString(9), DBAction.getRes().getInt(10));
			annonces.add(annonce);

		}

		DBAction.DBClose();

		return annonces;
	}
}
