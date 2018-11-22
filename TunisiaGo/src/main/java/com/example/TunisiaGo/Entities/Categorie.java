package com.example.TunisiaGo.Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Categorie implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCategorie;
	
	@Column
	private String nom;
	
	@JsonIgnore
	@ManyToMany(mappedBy="categories")
	private Collection<Site> sites;

	public Categorie(long idCategorie, String nom, Collection<Site> sites) {
		super();
		this.idCategorie = idCategorie;
		this.nom = nom;
		this.sites = sites;
	}
	

	public Categorie() {
		super();
	}


	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
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
