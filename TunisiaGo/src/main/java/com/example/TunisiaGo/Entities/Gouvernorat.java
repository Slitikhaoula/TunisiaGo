package com.example.TunisiaGo.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Gouvernorat implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGov;
	
	@Column
	private String nom;
	
	@JsonIgnore
	@OneToMany(mappedBy="gouvernorat")
	private Collection<Site> sites;

	public Gouvernorat(int idGov, String nom, Collection<Site> sites) {
		super();
		this.idGov = idGov;
		this.nom = nom;
		this.sites = sites;
	}
	
	

	public Gouvernorat() {
		super();
	}



	public int getIdGov() {
		return idGov;
	}

	public void setIdGov(int idGov) {
		this.idGov = idGov;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Site> getSites() {
		return sites;
	}

	public void setSites(Collection<Site> sites) {
		this.sites = sites;
	}
	
	
	

}
