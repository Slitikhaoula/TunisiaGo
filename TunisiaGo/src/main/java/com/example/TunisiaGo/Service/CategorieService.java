package com.example.TunisiaGo.Service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TunisiaGo.DAO.CategorieRepository;
import com.example.TunisiaGo.Entities.Categorie;
import com.example.TunisiaGo.IService.ICategorieService;

@Service
public class CategorieService implements ICategorieService {
	
	@Autowired
	private CategorieRepository repository;

	@Override
	public Object ajouter(Object entity) {
		// TODO Auto-generated method stub
		return repository.save((Categorie) entity);
	}

	@Override
	public Object update(Serializable id) {
		// TODO Auto-generated method stub
		Categorie categorie=repository.getOne((Integer) id);
		return repository.saveAndFlush(categorie);
	}

	@Override
	public int Count() {
		// TODO Auto-generated method stub
		return repository.findAll().size();
	}

	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Object findOne(Serializable id) {
		// TODO Auto-generated method stub
		return repository.getOne((Integer) id);
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
		repository.delete((Categorie) entity);
	}

}
