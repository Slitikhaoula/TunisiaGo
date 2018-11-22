package com.example.TunisiaGo.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TunisiaGo.Entities.Image;
import com.example.TunisiaGo.IService.IImageService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/Image")
public class ImageControleur {
	
	@Autowired
	private IImageService service;
	
	@RequestMapping("/ajouter")
	private Image ajouterImage(@RequestBody Image image) {
		return (Image) service.ajouter(image);
	}

}
