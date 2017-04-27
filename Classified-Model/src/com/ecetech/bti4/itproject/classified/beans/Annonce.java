package com.ecetech.bti4.itproject.classified.beans;

import java.sql.Date;


/**
 * Represente une Annonce
 * 
 * @author Maeva, Adrien, Moaz
 */

public class Annonce {
	/**
	 * Attributs
	 */
	private String idAnnonce;
	private String titreAnnonce;
	private String descAnnonce;
	private String photoAnnonce;
	private int zoneAnnonce;
	private float prix;
	private String contact;
	private java.sql.Date debAnnonce;
	private java.sql.Date finAnnonce;
	private int importanceAnnonce;
	private java.sql.Date dateAnnonce;
	private String user_idUser;
	private int cat_idCategorie;
	private int type_idType;

	/**
	 * Constructor
	 * 
	 * @param idAnnonce
	 * @param titreAnnonce
	 * @param descAnnonce
	 * @param photoAnnonce
	 * @param zoneAnnonce
	 * @param dateAnnonce
	 * @param finAnnonce
	 * @param importanceAnnonce
	 * @param user_idUser
	 * @param type_idType
	 */

	// constructeur complet

	public Annonce(String idAnnonce, String titreAnnonce, String descAnnonce, String photoAnnonce, int zoneAnnonce,
			float prix, String contact, Date debAnnonce, Date finAnnonce, Date dateAnnonce, int importanceAnnonce,
			String user_idUser, int cat_idCategorie, int type_idType) {
		super();
		this.idAnnonce = idAnnonce;
		this.titreAnnonce = titreAnnonce;
		this.descAnnonce = descAnnonce;
		this.photoAnnonce = photoAnnonce;
		this.zoneAnnonce = zoneAnnonce;
		this.prix = prix;
		this.contact = contact;
		this.debAnnonce = debAnnonce;
		this.finAnnonce = finAnnonce;
		this.dateAnnonce = dateAnnonce;
		this.importanceAnnonce = importanceAnnonce;
		this.user_idUser = user_idUser;
		this.cat_idCategorie = cat_idCategorie;
		this.type_idType = type_idType;
	}

	public Annonce(String idAnnonce, String titreAnnonce, String descAnnonce, String photoAnnonce, int zoneAnnonce,
			float prix, String contact, Date debAnnonce, Date finAnnonce, int importanceAnnonce, Date dateAnnonce,
			String user_idUser, int cat_idCategorie, int type_idType) {
		super();
		this.idAnnonce = idAnnonce;
		this.titreAnnonce = titreAnnonce;
		this.descAnnonce = descAnnonce;
		this.photoAnnonce = photoAnnonce;
		this.zoneAnnonce = zoneAnnonce;
		this.prix = prix;
		this.contact = contact;
		this.debAnnonce = debAnnonce;
		this.finAnnonce = finAnnonce;
		this.importanceAnnonce = importanceAnnonce;
		this.dateAnnonce = dateAnnonce;
		this.user_idUser = user_idUser;
		this.cat_idCategorie = cat_idCategorie;
		this.type_idType = type_idType;
	}

	public Annonce(String titreAnnonce, String descAnnonce, String photoAnnonce, int zoneAnnonce, float prix, String contact,
			java.sql.Date dateAnnonce, java.sql.Date dateFin, int importanceAnnonce, Date dateCreaAnnonce,
			String user_idUser, int cat_idCategorie, int type_idType) {
		super();
		idAnnonce = null;
		this.titreAnnonce = titreAnnonce;
		this.descAnnonce = descAnnonce;
		this.photoAnnonce = photoAnnonce;
		this.zoneAnnonce = zoneAnnonce;
		this.prix = prix;
		this.contact = contact;
		this.dateAnnonce = (Date) dateAnnonce;
		this.finAnnonce = (Date) dateFin;
		this.importanceAnnonce = importanceAnnonce;
		this.user_idUser = user_idUser;
		this.cat_idCategorie = cat_idCategorie;
		this.type_idType = type_idType;
	}

	public Annonce(String titreAnnonce, String descAnnonce, String photoAnnonce, int zoneAnnonce,
			java.util.Date dateAnnonce, java.util.Date dateFin, int importanceAnnonce, String user_idUser,
			int cat_idCategorie, int type_idType) {
		super();
		idAnnonce = null;
		this.titreAnnonce = titreAnnonce;
		this.descAnnonce = descAnnonce;
		this.photoAnnonce = photoAnnonce;
		this.zoneAnnonce = zoneAnnonce;
		this.dateAnnonce = (Date) dateAnnonce;
		this.finAnnonce = (Date) dateFin;
		this.importanceAnnonce = importanceAnnonce;
		this.user_idUser = user_idUser;
		this.cat_idCategorie = cat_idCategorie;
		this.type_idType = type_idType;
	}



	public Annonce() {
		super();
	}


	/**
	 * getters and setters
	 * 
	 * @return
	 */
	public String getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(String idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getTitreAnnonce() {
		return titreAnnonce;
	}

	public void setTitreAnnonce(String titreAnnonce) {
		this.titreAnnonce = titreAnnonce;
	}

	public String getDescAnnonce() {
		return descAnnonce;
	}

	public void setDescAnnonce(String descAnnonce) {
		this.descAnnonce = descAnnonce;
	}

	public String getPhotoAnnonce() {
		return photoAnnonce;
	}

	public void setPhotoAnnonce(String photoAnnonce) {
		this.photoAnnonce = photoAnnonce;
	}

	public int getZoneAnnonce() {
		return zoneAnnonce;
	}

	public void setZoneAnnonce(int zoneAnnonce) {
		this.zoneAnnonce = zoneAnnonce;
	}

	public Date getDateAnnonce() {
		return dateAnnonce;
	}

	public void setDateAnnonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
	}

	public Date getFinAnnonce() {
		return finAnnonce;
	}

	public void setFinAnnonce(Date finAnnonce) {
		this.finAnnonce = finAnnonce;
	}

	public int getImportanceAnnonce() {
		return importanceAnnonce;
	}

	public void setImportanceAnnonce(int importanceAnnonce) {
		this.importanceAnnonce = importanceAnnonce;
	}

	public int getCat_idCategorie() {
		return cat_idCategorie;
	}

	public void setCat_idCategorie(int cat_idCategorie) {
		this.cat_idCategorie = cat_idCategorie;
	}

	public String getUser_idUser() {
		return user_idUser;
	}

	public void setUser_idUser(String user_idUser) {
		this.user_idUser = user_idUser;
	}

	public int getType_idType() {
		return type_idType;
	}

	public void setType_idType(int type_idType) {
		this.type_idType = type_idType;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	/*
	 * toString
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", titreAnnonce=" + titreAnnonce + ", descAnnonce=" + descAnnonce
				+ ", photoAnnonce=" + photoAnnonce + ", zoneAnnonce=" + zoneAnnonce + ", dateAnnonce=" + dateAnnonce
				+ ", finAnnonce=" + finAnnonce + ", importanceAnnonce=" + importanceAnnonce + ", user_idUser="
				+ user_idUser + ", cat_idCategorie=" + cat_idCategorie + ", type_idType=" + type_idType + "]";
	}

}
