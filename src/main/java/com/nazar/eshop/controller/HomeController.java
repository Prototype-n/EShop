package com.nazar.eshop.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nazar.eshop.domain.User;
import com.nazar.eshop.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView getHomePage(HttpServletRequest request) {
		
		User user = new User();
		user.setName("nazar");
		user.setRole("admin");
		user.setEmail("nazar@mail");
		user.setBirth(LocalDate.now().withYear(1986));
		
		System.out.println(user.getEmail());
		userService.create(user);
		
		
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}
