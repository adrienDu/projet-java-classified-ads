package com.ecetech.bti4.itproject.classified.beans;

import java.util.Date;

/**
 * Represente une tilisateur premium
 * @author Maeva, Adrien, Moaz
 */

public class Premium {
	

	private int idPremium;
	private Date datePayPremium;
	private int dureePremium;
	private int montantPayPremium;
	private int id_User;
	
	


	public Premium(int idPremium, Date datePayPremium, int dureePremium, int montantPayPremium, int id_User) {
		super();
		this.idPremium = idPremium;
		this.datePayPremium = datePayPremium;
		this.dureePremium = dureePremium;
		this.montantPayPremium = montantPayPremium;
		this.id_User = id_User;
	}
	
	
	public Premium() {
		
	}
	



	public int getIdPremium() {
		return idPremium;
	}



	public void setIdPremium(int idPremium) {
		this.idPremium = idPremium;
	}



	public Date getDatePayPremium() {
		return datePayPremium;
	}



	public void setDatePayPremium(Date datePayPremium) {
		this.datePayPremium = datePayPremium;
	}



	public int getDureePremium() {
		return dureePremium;
	}



	public void setDureePremium(int dureePremium) {
		this.dureePremium = dureePremium;
	}



	public int getMontantPayPremium() {
		return montantPayPremium;
	}



	public void setMontantPayPremium(int montantPayPremium) {
		this.montantPayPremium = montantPayPremium;
	}



	public int getId_User() {
		return id_User;
	}



	public void setId_User(int id_User) {
		this.id_User = id_User;
	}

}
