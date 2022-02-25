package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Gerant implements Serializable
{
	private Long idGerant;
	private String nom;
	private String prenom;
	
	private Set<Ferme> fermes = new HashSet<>();

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Ferme> getFermes() {
		return fermes;
	}

	public void setFermes(Set<Ferme> fermes) {
		this.fermes = fermes;
	}

	

	
}
