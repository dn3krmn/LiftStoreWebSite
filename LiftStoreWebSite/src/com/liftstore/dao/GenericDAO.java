package com.liftstore.dao;

import java.util.List;

//T for type
public interface GenericDAO<T> {
	
	public T create(T t);
	
	public T update(T t);
	
	public T get(Object id);
	
	public void delete(Object id);
	
	public List<T> listAll();
	
	//total number of row and columns (entities)
	public long count();

}