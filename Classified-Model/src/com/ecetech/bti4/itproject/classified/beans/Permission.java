package com.ecetech.bti4.itproject.classified.beans;

public class Permission {

	
	private String idPermission;
	
	public Permission(String idPermission) {
		super();
		this.idPermission = idPermission;
	}

	public Permission() {
		// TODO Auto-generated constructor stub
		this("");
	}

	public String getIdPermission() {
		return idPermission;
	}

	public void setIdPermission(String idPermission) {
		this.idPermission = idPermission;
	}

}
