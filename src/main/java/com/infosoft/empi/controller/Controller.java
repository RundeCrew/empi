package com.infosoft.empi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Controller {

	// shows login page
	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	// new jsp for index
	@RequestMapping("/home")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("/home");
		return mav;
	}

}
