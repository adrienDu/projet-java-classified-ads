package com.ecetech.bti4.itproject.classified.beans;

public class Particulier extends User{
	/**
	 * Attributs
	 */
	//private String User_idUser;
	private String nomPart;
	private String prenomPart;
	private int numAdPart;
	private String rueAdPart;
	private int cpAdPart;
	private String villeAdPart;
	private int telPart;
	
	/**
	 * Constructeurs
	 */
	public Particulier(){
		super();
		nomPart="";
		prenomPart="";
		numAdPart=0;
		rueAdPart="";
		cpAdPart=0;
		villeAdPart="";
		telPart=0;
	}
	public Particulier(/*String user_idUser,*/ String nomPart, String prenomPart, int numAdPart, String rueAdPart,
			int cpAdPart, String villeAdPart, int telPart) {
		super();
		//User_idUser = user_idUser;
		this.nomPart = nomPart;
		this.prenomPart = prenomPart;
		this.numAdPart = numAdPart;
		this.rueAdPart = rueAdPart;
		this.cpAdPart = cpAdPart;
		this.villeAdPart = villeAdPart;
		this.telPart = telPart;
	}
	
	
	/**
	 * Getters & Setters
	 */
	
	/*public String getUser_idUser() {
		return User_idUser;
	}
	public void setUser_idUser(String user_idUser) {
		User_idUser = user_idUser;
	}*/
	public String getNomPart() {
		return nomPart;
	}
	public void setNomPart(String nomPart) {
		this.nomPart = nomPart;
	}
	public String getPrenomPart() {
		return prenomPart;
	}
	public void setPrenomPart(String prenomPart) {
		this.prenomPart = prenomPart;
	}
	public int getNumAdPart() {
		return numAdPart;
	}
	public void setNumAdPart(int numAdPart) {
		this.numAdPart = numAdPart;
	}
	public String getRueAdPart() {
		return rueAdPart;
	}
	public void setRueAdPart(String rueAdPart) {
		this.rueAdPart = rueAdPart;
	}
	public int getCpAdPart() {
		return cpAdPart;
	}
	public void setCpAdPart(int cpAdPart) {
		this.cpAdPart = cpAdPart;
	}
	public String getVilleAdPart() {
		return villeAdPart;
	}
	public void setVilleAdPart(String villeAdPart) {
		this.villeAdPart = villeAdPart;
	}
	public int getTelPart() {
		return telPart;
	}
	public void setTelPart(int telPart) {
		this.telPart = telPart;
	}
	@Override
	public String toString() {
		return super.toString()+"Particulier [nomPart=" + nomPart + ", prenomPart=" + prenomPart + ", numAdPart=" + numAdPart
				+ ", rueAdPart=" + rueAdPart + ", cpAdPart=" + cpAdPart + ", villeAdPart=" + villeAdPart + ", telPart="
				+ telPart + "]";
	}
	
	
}
