package com.universityscreaning.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.universityscreaning.DaoImpl.UserDaoImpl;

@Controller
public class HomeController {

	@Autowired
	private UserDaoImpl usr;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String showHome(WebRequest request, Principal p)
	{
		

		
		
		
		
		System.out.println(p);
		return "home";
	}
	
	
	
	
	@RequestMapping(value="/admin" ,method=RequestMethod.GET)
	public String showAdmin()
	{
		return "admin";
	}
	
	@RequestMapping(value="/403" ,method=RequestMethod.GET)
	public String showError()
	{
		return "403";
	}
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String showlogin()
	{
		
	
		return "login";
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String showregister()
	{
		
	
		return "register2";
	}
	
}
