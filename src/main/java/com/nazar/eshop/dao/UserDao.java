package com.nazar.eshop.dao;

import com.nazar.eshop.domain.User;

public interface UserDao extends BaseDao<User>, HasNameDao<User> {
		
	public User getUserByEmail(String email);
	
}
