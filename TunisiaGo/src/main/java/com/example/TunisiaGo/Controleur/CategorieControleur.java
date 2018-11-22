package com.example.TunisiaGo.Controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TunisiaGo.Entities.Categorie;
import com.example.TunisiaGo.IService.ICategorieService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/Categorie")
public class CategorieControleur {
	
	@Autowired
	private ICategorieService service;
	
	@RequestMapping("/ajouter")
	private Categorie ajouterCategorie(Categorie categorie) {
		return (Categorie) service.ajouter(categorie);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/findAll")
	private List<Categorie> listCategorie(){
		return (List<Categorie>) service.findAll();
	}


}
