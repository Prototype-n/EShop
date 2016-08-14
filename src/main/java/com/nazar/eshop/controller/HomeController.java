package com.nazar.eshop.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView getHomepage(HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView("home");
		
		return mav;
	}
}