package com.ecetech.bti4.itproject.classified.beans;

import java.util.Date;

public class User {

	/**
	 * Attributs
	 */
	private String id;
	private String email;
	private String mdp;
	private String idUser;
	private Date date;
	private String type;

	public User() {
		this("","","","",null,"");
	}		
	
	public User(String id, String email, String mdp, String idUser, Date date, String type) {
		super();
		this.id = id;
		this.email = email;
		this.mdp = mdp;
		this.idUser = idUser;
		this.date = date;
		this.type = type;
	}
	/**
	 * Getters & Setters
	 * */
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
