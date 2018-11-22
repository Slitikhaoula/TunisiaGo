package com.example.TunisiaGo.Controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TunisiaGo.Entities.Gouvernorat;
import com.example.TunisiaGo.IService.IGouvernoratService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/Gouvernorat")
public class GouvernoratControleur {
	
	@Autowired
	private IGouvernoratService service;
	
	@RequestMapping("/ajouter")
	private Gouvernorat ajouterGouvernorat(Gouvernorat gouvernorat) {
		return (Gouvernorat) service.ajouter(gouvernorat);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/findAll")
	private List<Gouvernorat> listGouvernorat(){
		return (List<Gouvernorat>) service.findAll();
	}

}
