package com.phsarphnompenh.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home(){
		System.out.println("Home Page start");
		return "index";
	}

}