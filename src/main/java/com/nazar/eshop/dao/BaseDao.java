package com.nazar.eshop.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public void create(T t);

	public void remove(T t);

	public List<T> getAll();
	
	public T getById(Integer id);
}
