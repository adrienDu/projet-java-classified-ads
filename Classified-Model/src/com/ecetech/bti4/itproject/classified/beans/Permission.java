package com.ecetech.bti4.itproject.classified.beans;


/**
 * Represente une permission
 * @author Maeva, Adrien, Moaz
 */

public class Permission {

	
	private String idPermission;
	
	public Permission(String idPermission) {

		this.idPermission = idPermission;
	}

	public Permission() {
		this("");
	}

	public String getIdPermission() {
		return idPermission;
	}

	public void setIdPermission(String idPermission) {
		this.idPermission = idPermission;
	}

	@Override
	public String toString() {
		return " PERMISSION : " + idPermission;
	}
	
	

}
