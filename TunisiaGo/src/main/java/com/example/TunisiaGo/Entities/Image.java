package com.example.TunisiaGo.Entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Image implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idImage;
	
	@Column
	private String urlImage;
	
	@ManyToOne
	@JoinColumn(name="idSite")
	private Site site;

	public Image(int idImage, String urlImage, Site site) {
		super();
		this.idImage = idImage;
		this.urlImage = urlImage;
		this.site = site;
	}
	
	

	public Image() {
		super();
	}



	public int getIdImage() {
		return idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
	
	
}
