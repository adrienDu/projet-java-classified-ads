package com.ecetech.bti4.itproject.classified.beans;

public class Annonce {
	/**
	 * Attributs 
	 */
	private String idUser;
	private String nomAss;
	private String siretAss;
	private int numAdAss;
	private String rueAdAss;
	private int cpAdAss;
	private String villeAdAss;
	private int telAss;
	
	/**
	 * Constructor
	 * @param idUser
	 * @param nomAss
	 * @param siretAss
	 * @param numAdAss
	 * @param rueAdAss
	 * @param cpAdAss
	 * @param villeAdAss
	 * @param telAss
	 */
	public Annonce(String idUser, String nomAss, String siretAss, int numAdAss, String rueAdAss, int cpAdAss,
			String villeAdAss, int telAss) {
		super();
		this.idUser = idUser;
		this.nomAss = nomAss;
		this.siretAss = siretAss;
		this.numAdAss = numAdAss;
		this.rueAdAss = rueAdAss;
		this.cpAdAss = cpAdAss;
		this.villeAdAss = villeAdAss;
		this.telAss = telAss;
	}
	

	public Annonce() {
		this("","","",0,"",0,"",0);
	}

	/**
	 * Getters and setters
	 * @return
	 */

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
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
