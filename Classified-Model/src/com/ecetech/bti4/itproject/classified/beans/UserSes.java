package com.ecetech.bti4.itproject.classified.beans;

public class UserSes {
	private String idUser;
	private String permission_idPermission;
	
	public UserSes(String idUser, String permission_idPermission) {
		super();
		this.idUser = idUser;
		this.permission_idPermission = permission_idPermission;
	}
	public UserSes() {

	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getPermission_idPermission() {
		return permission_idPermission;
	}
	public void setPermission_idPermission(String permission_idPermission) {
		this.permission_idPermission = permission_idPermission;
	}
	@Override
	public String toString() {
		return "UserSes [idUser=" + idUser + ", permission_idPermission=" + permission_idPermission + "]";
	}
	
	
	
}
