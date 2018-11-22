package com.example.TunisiaGo.Service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TunisiaGo.DAO.SiteRepository;
import com.example.TunisiaGo.Entities.Site;
import com.example.TunisiaGo.IService.ISiteService;

@Service
public class SiteService implements ISiteService {
	
	
	@Autowired
	private SiteRepository repository;

	@Override
	public Object ajouter(Object entity) {
		// TODO Auto-generated method stub
		return repository.save((Site) entity);
	}

	@Override
	public Object update(Serializable id) {
		// TODO Auto-generated method stub
		Site site=repository.getOne((Integer) id);
		return repository.saveAndFlush(site);
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
		repository.delete((Site) entity);
	}

}
