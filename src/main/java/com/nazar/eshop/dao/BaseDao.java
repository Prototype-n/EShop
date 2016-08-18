package com.nazar.eshop.dao;

import java.util.List;

import com.nazar.eshop.domain.BaseEntity;

public interface BaseDao<T extends BaseEntity> {
	
	void create(T t);

	void remove(T t);
	
	void update(T t);

	List<T> getAll();
	
	T getById(Integer id);
}
