package com.ecetech.bti4.itproject.classified.beans;

public class Type {
	
	/**
	 * Attributs
	 */
	
	private int idType;
	private String nomType;
	
	/**
	 * Constructor
	 * @param idType
	 * @param nomType
	 */
	
	public Type(int idType, String nomType) {
		super();
		this.idType = idType;
		this.nomType = nomType;
	}
	public Type(){
		this(0,"");
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public String getNomType() {
		return nomType;
	}
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	
	
	
	
}
