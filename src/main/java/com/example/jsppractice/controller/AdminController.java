package com.example.jsppractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin/theatre",method=RequestMethod.GET)
	public String theatreDetails()
	{
		return "theatreAdmin";
	}
	
	@RequestMapping(value="/admin/movie",method=RequestMethod.GET)
	public String movieDetails()
	{
		return "movieAdmin";
	}
	
	@RequestMapping(value="/admin/show/lo",method=RequestMethod.GET)
	public String showDetails()
	{
		return "showAdmin";
	}

}
