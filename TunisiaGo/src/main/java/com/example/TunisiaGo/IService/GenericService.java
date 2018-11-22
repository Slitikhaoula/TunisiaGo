package com.example.TunisiaGo.IService;

import java.io.Serializable;
import java.util.List;

public interface GenericService {
	
	public Object ajouter(Object entity);
	public Object update(Serializable id);
	public int Count();
	public List<?> findAll();
	public Object findOne(Serializable id);
	public void delete(Object entity);
	
	

}
