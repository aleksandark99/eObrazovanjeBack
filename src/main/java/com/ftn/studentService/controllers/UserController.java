package com.ftn.studentService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.studentService.controller.impl.UserControllerImpl;
import com.ftn.studentService.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserControllerImpl userControllerImpl;
	
	public User getUser() {
		
		User u = userControllerImpl.getUser();
		
		return u;
		
	}
	
}
