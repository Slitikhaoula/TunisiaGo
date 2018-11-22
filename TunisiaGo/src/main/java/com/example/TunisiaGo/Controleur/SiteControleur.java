package com.example.TunisiaGo.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TunisiaGo.Entities.Categorie;
import com.example.TunisiaGo.Entities.Site;
import com.example.TunisiaGo.IService.ISiteService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/Site")
public class SiteControleur {
	
	@Autowired
	private ISiteService service;
	
	@RequestMapping("/ajouter")
	private Site ajouterSite(@RequestBody Site site) {
		return (Site) service.ajouter(site);
	}
	
	
	 @RequestMapping("/siteCategorie")
	 private void ajouterSiteCategorie(@RequestBody Site site, @RequestBody Categorie categorie) {
		 site.getCategories().add(categorie);
		 categorie.getSites().add(site);
	 }
	 

}
