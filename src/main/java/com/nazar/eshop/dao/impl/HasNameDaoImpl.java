package com.nazar.eshop.dao.impl;

import java.util.List;

import javax.persistence.Entity;

import com.nazar.eshop.dao.HasNameDao;
import com.nazar.eshop.domain.NamedEntity;

public abstract class HasNameDaoImpl<T extends NamedEntity> extends BaseDaoImpl<T> implements HasNameDao<T> {

	protected final String tableName;
	private final String getByNameQuery;

	public HasNameDaoImpl(Class<T> clazz) {
		super(clazz);

		Entity table = clazz.getAnnotation(Entity.class);
		tableName = table.name();
		getByNameQuery = "SELECT * FROM tableName t where t.name = :name".replace("tableName", tableName);
	}

	@Override
	public List<T> getListByName(String name) {
		List<T> results = em.createQuery(getByNameQuery, clazz).setParameter("name", name).getResultList();
		return results;
	}
	
}
