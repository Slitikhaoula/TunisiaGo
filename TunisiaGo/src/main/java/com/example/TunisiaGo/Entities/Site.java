package com.example.TunisiaGo.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Site implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSite;
	
	@Column
	private String nom;
	@Column
	private String description;
	@Column
	private String urlVideo;
	@Column
	private double latitude;
	@Column
	private double longitude;
	
	@ManyToOne
	@JoinColumn(name="idGouvernorat")
	private Gouvernorat gouvernorat;

	@JsonIgnore
	@OneToMany(mappedBy="site", cascade=CascadeType.REMOVE)
	private Collection<Image>images;
	
	@ManyToMany
	@JoinTable(name="SiteCategorie",joinColumns=@JoinColumn(name="idSite" ) ,inverseJoinColumns=@JoinColumn(name="idCategorie"))
	private Collection<Categorie> categories;


	public Site(int idSite, String nom, String description, String urlVideo, double latitude, double longitude,
			Gouvernorat gouvernorat, Collection<Image> images, Collection<Categorie> categories) {
		super();
		this.idSite = idSite;
		this.nom = nom;
		this.description = description;
		this.urlVideo = urlVideo;
		this.latitude = latitude;
		this.longitude = longitude;
		this.gouvernorat = gouvernorat;
		this.images = images;
		this.categories = categories;
	}
	
	


	public Site() {
		super();
	}




	public int getIdSite() {
		return idSite;
	}


	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUrlVideo() {
		return urlVideo;
	}


	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}


	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
	}


	public Collection<Image> getImages() {
		return images;
	}


	public void setImages(Collection<Image> images) {
		this.images = images;
	}


	public Collection<Categorie> getCategories() {
		return categories;
	}


	public void setCategories(Collection<Categorie> categories) {
		this.categories = categories;
	}
	
	
	
	
	
	

}
