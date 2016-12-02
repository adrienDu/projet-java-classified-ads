package com.ecetech.bti4.itproject.classifield.beans;

public class Entreprise {
	
	

	private String idUser;
	private String nom_Ent;
	private int num_Ad_Ent;
	private String rue_Ad_Ent;
	private int cp_Ad_Ent;
	private String ville_Ad_Ent;
	private int tel_Ent;
	
	public Entreprise() {
		this("","",0,"",0,"",0);
	}
	
	public Entreprise(String idUser, String nom_Ent, int num_Ad_Ent, String rue_Ad_Ent, int cp_Ad_Ent,
				String ville_Ad_Ent, int tel_Ent) {
			super();
			this.idUser = idUser;
			this.nom_Ent = nom_Ent;
			this.num_Ad_Ent = num_Ad_Ent;
			this.rue_Ad_Ent = rue_Ad_Ent;
			this.cp_Ad_Ent = cp_Ad_Ent;
			this.ville_Ad_Ent = ville_Ad_Ent;
			this.tel_Ent = tel_Ent;
		}
	
	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getNom_Ent() {
		return nom_Ent;
	}

	public void setNom_Ent(String nom_Ent) {
		this.nom_Ent = nom_Ent;
	}

	public int getNum_Ad_Ent() {
		return num_Ad_Ent;
	}

	public void setNum_Ad_Ent(int num_Ad_Ent) {
		this.num_Ad_Ent = num_Ad_Ent;
	}

	public String getRue_Ad_Ent() {
		return rue_Ad_Ent;
	}

	public void setRue_Ad_Ent(String rue_Ad_Ent) {
		this.rue_Ad_Ent = rue_Ad_Ent;
	}

	public int getCp_Ad_Ent() {
		return cp_Ad_Ent;
	}

	public void setCp_Ad_Ent(int cp_Ad_Ent) {
		this.cp_Ad_Ent = cp_Ad_Ent;
	}

	public String getVille_Ad_Ent() {
		return ville_Ad_Ent;
	}

	public void setVille_Ad_Ent(String ville_Ad_Ent) {
		this.ville_Ad_Ent = ville_Ad_Ent;
	}

	public int getTel_Ent() {
		return tel_Ent;
	}

	public void setTel_Ent(int tel_Ent) {
		this.tel_Ent = tel_Ent;
	}

}
