package com.inti.entities;

import java.util.Date;

public class Ferme {
	private long idFerme;
	private String nom;
	private Date dateAchat;

	public Ferme() {
		super();
	}

	public Ferme(String nom, Date dateAchat) {
		super();
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}

}
