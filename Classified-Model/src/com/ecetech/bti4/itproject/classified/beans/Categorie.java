package com.ecetech.bti4.itproject.classified.beans;

public class Categorie {

	/**
	 * Attributs
	 */

	private int idCategorie;
	private String nomCategorie;
	private int idType;

	/**
	 * Constructor
	 * @param idCategorie
	 * @param nomCategorie
	 * @param idType
	 */
	public Categorie(int idCategorie, String nomCategorie, int idType) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.idType = idType;
	}

	public Categorie() {
		this(0, "", 0);
	}

	/**
	 * Getters and setters 
	 * @return
	 */
	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", idType=" + idType + "]";
	}

	
	
}
