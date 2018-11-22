package com.example.TunisiaGo.Service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TunisiaGo.DAO.ImageRepository;
import com.example.TunisiaGo.Entities.Image;
import com.example.TunisiaGo.IService.IImageService;

@Service
public class ImageService implements IImageService{

	@Autowired
	private ImageRepository repository;
	
	
	@Override
	public Object ajouter(Object entity) {
		// TODO Auto-generated method stub
		return repository.save((Image) entity);
	}

	@Override
	public Object update(Serializable id) {
		// TODO Auto-generated method stub
		Image image=repository.getOne((Integer) id);
		return repository.saveAndFlush(image);
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
		repository.delete((Image) entity);
	}

}
