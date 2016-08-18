package com.nazar.eshop.dao;

import java.util.List;


import com.nazar.eshop.domain.NamedEntity;

public interface HasNameDao <T extends NamedEntity> extends BaseDao<T> {
	List<T> getListByName(String name);
}
