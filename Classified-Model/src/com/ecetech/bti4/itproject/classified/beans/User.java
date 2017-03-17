package com.ecetech.bti4.itproject.classified.beans;

import java.util.Date;

/**
 * Represente un User
 * @author Maeva, Adrien, Moaz
 */

public class User {
	
	/**
	 * Attributs 
	 */
	private String idUser;
	private String idSocialUser;
	private String mailUser;
	private String mdpUser;
	private String etatUser;
	private Date dateInUser;
	private String typeUser;
	private String Permission_idPermission;
	
		
	
	/**
	 * Constructeur
	 */
	
public User(String idUser, String idSocialUser, String mailUser, String mdpUser, String etatUser, Date dateInUser,
		String typeUser, String permission_idPermission) {
	super();
	this.idUser = idUser;
	this.idSocialUser = idSocialUser;
	this.mailUser = mailUser;
	this.mdpUser = mdpUser;
	this.etatUser = etatUser;
	this.dateInUser = dateInUser;
	this.typeUser = typeUser;
	this.Permission_idPermission = permission_idPermission;
}

	public User() {
		this("","","","","",null,"","");
	}

	/**
	 * Getters & Setters
	 */

public String getIdUser() {
	return idUser;
}



public void setIdUser(String idUser) {
	this.idUser = idUser;
}



public String getIdSocialUser() {
	return idSocialUser;
}



public void setIdSocialUser(String idSocialUser) {
	this.idSocialUser = idSocialUser;
}



public String getMailUser() {
	return mailUser;
}



public void setMailUser(String mailUser) {
	this.mailUser = mailUser;
}



public String getMdpUser() {
	return mdpUser;
}



public void setMdpUser(String mdpUser) {
	this.mdpUser = mdpUser;
}



public String getEtatUser() {
	return etatUser;
}



public void setEtatUser(String etatUser) {
	this.etatUser = etatUser;
}



public Date getDateInUser() {
	return dateInUser;
}



public void setDateInUser(Date dateInUser) {
	this.dateInUser = dateInUser;
}



public String getTypeUser() {
	return typeUser;
}



public void setTypeUser(String typeUser) {
	this.typeUser = typeUser;
}



public String getPermission_idPermission() {
	return Permission_idPermission;
}



public void setPermission_idPermission(String permission_idPermission) {
	Permission_idPermission = permission_idPermission;
}

@Override
public String toString() {
	return "User [idUser=" + idUser + ", idSocialUser=" + idSocialUser + ", mailUser=" + mailUser + ", mdpUser="
			+ mdpUser + ", etatUser=" + etatUser + ", dateInUser=" + dateInUser + ", typeUser=" + typeUser
			+ ", Permission_idPermission=" + Permission_idPermission + "]";
}


}
