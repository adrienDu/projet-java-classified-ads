package com.ecetech.bti4.itproject.classified.beans;

public class Association {
	
	/**
	 * Attributs
	 */
	private String User_idUser;
	private String nomAss;
	private String siretAss;
	private int numAdAss;
	private String rueAdAss;
	private int cpAdAss;
	private String villeAdAss;
	private int telAss;
	
	
	/**
	 * Constructeurs
	 */
	public Association(){
		this("","","",0,"",0,"",0);
	}
	
	public Association(String user_idUser, String nomAss, String siretAss, int numAdAss, String rueAdAss, int cpAdAss,
			String villeAdAss, int telAss) {
		super();
		User_idUser = user_idUser;
		this.nomAss = nomAss;
		this.siretAss = siretAss;
		this.numAdAss = numAdAss;
		this.rueAdAss = rueAdAss;
		this.cpAdAss = cpAdAss;
		this.villeAdAss = villeAdAss;
		this.telAss = telAss;
	}


	/**
	 * Getters & Setters
	 */
	
	public String getUser_idUser() {
		return User_idUser;
	}

	public void setUser_idUser(String user_idUser) {
		User_idUser = user_idUser;
	}

	public String getNomAss() {
		return nomAss;
	}

	public void setNomAss(String nomAss) {
		this.nomAss = nomAss;
	}

	public String getSiretAss() {
		return siretAss;
	}

	public void setSiretAss(String siretAss) {
		this.siretAss = siretAss;
	}

	public int getNumAdAss() {
		return numAdAss;
	}

	public void setNumAdAss(int numAdAss) {
		this.numAdAss = numAdAss;
	}

	public String getRueAdAss() {
		return rueAdAss;
	}

	public void setRueAdAss(String rueAdAss) {
		this.rueAdAss = rueAdAss;
	}

	public int getCpAdAss() {
		return cpAdAss;
	}

	public void setCpAdAss(int cpAdAss) {
		this.cpAdAss = cpAdAss;
	}

	public String getVilleAdAss() {
		return villeAdAss;
	}

	public void setVilleAdAss(String villeAdAss) {
		this.villeAdAss = villeAdAss;
	}

	public int getTelAss() {
		return telAss;
	}

	public void setTelAss(int telAss) {
		this.telAss = telAss;
	}
}
