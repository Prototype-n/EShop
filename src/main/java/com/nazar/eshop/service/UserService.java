package com.nazar.eshop.service;
import java.util.List;

import com.nazar.eshop.domain.User;


public interface UserService {

	User getUserByEmail(String email);

	void create(User user);
	
	void remove(User user);
	
	List<User> getAll();
	
	User getById(Integer id);

	List<User> getListByName(String name);

}
