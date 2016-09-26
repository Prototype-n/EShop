package com.nazar.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nazar.eshop.dao.UserDao;
import com.nazar.eshop.domain.User;
import com.nazar.eshop.service.UserService;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class UserServiceImpl  implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	@Override
	public void create(User user) {
		userDao.create(user); 
		
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User getById(Integer id) {
		return userDao.getById(id);
	}

	@Override
	public List<User> getListByName(String name) {
		return userDao.getListByName(name);
	}

}
