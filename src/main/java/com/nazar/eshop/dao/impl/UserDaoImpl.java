package com.nazar.eshop.dao.impl;

import org.springframework.stereotype.Repository;

import com.nazar.eshop.dao.UserDao;
import com.nazar.eshop.domain.User;

@Repository
public class UserDaoImpl extends HasNameDaoImpl<User> implements UserDao {

	public UserDaoImpl(Class<User> clazz) {
		super(clazz);
	}

	public UserDaoImpl() {
		this(User.class);
	}
	
	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
