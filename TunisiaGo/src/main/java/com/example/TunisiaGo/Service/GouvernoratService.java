package com.example.TunisiaGo.Service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TunisiaGo.DAO.GouvernoratRepository;
import com.example.TunisiaGo.Entities.Gouvernorat;
import com.example.TunisiaGo.IService.IGouvernoratService;


@Service
public class GouvernoratService implements IGouvernoratService {
	
	@Autowired
	private GouvernoratRepository repository;

	@Override
	public Object ajouter(Object entity) {
		// TODO Auto-generated method stub
		return repository.save((Gouvernorat)entity);
	}

	@Override
	public Object update(Serializable id) {
		// TODO Auto-generated method stub
		Gouvernorat gouvernorat=repository.getOne((Integer) id);
		return repository.saveAndFlush(gouvernorat);
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
		repository.delete((Gouvernorat) entity);
	}

}
