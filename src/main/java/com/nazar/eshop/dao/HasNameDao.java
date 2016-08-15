package com.nazar.eshop.dao;

import java.util.List;


import com.nazar.eshop.domain.BaseEntity;

public interface HasNameDao <T extends BaseEntity> {
	public List<T> getListByName(String name);
}
