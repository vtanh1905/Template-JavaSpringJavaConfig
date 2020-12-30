package com.vtanh1905.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vtanh1905.entity.Role;
import com.vtanh1905.repository.RoleRepository;

@Controller	
public class HomeController {
	
	private RoleRepository roleRepository;
	
	public HomeController(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() { 
//		roleRepository.saveOrUpdate(new Role("USER"));
		return "home";
	}
}
