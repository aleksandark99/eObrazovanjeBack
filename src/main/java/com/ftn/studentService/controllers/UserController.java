package com.ftn.studentService.controllers;

import com.ftn.studentService.dto.user.RegisterRequest;
import com.ftn.studentService.dto.user.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ftn.studentService.controllers.impl.UserControllerImpl;
import com.ftn.studentService.model.User;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserControllerImpl userControllerImpl;

	@PostMapping(value = "/register")
	public RegisterResponse register(@RequestBody  RegisterRequest registerRequest){
		return  null;
	}

	
}
