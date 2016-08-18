package com.nazar.eshop.dao;

import com.nazar.eshop.domain.User;

public interface UserDao extends HasNameDao<User> {
		
	User getUserByEmail(String email);
	
}
