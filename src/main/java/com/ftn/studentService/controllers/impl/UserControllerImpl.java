package com.ftn.studentService.controllers.impl;

import com.ftn.studentService.dto.user.RegisterRequest;
import com.ftn.studentService.dto.user.RegisterResponse;
import com.ftn.studentService.model.Student;
import com.ftn.studentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.studentService.model.User;

@Service
public class UserControllerImpl {
	
	@Autowired
	private StudentService studentService;

	public RegisterResponse register(RegisterRequest registerRequest){
		User user = new User();
		user.setUsername(registerRequest.getUsername());
		user.setPassword(registerRequest.getPassword());
		user.setEmail(registerRequest.getEmail());

		Student student = new Student();
		student.setFirstName(registerRequest.getFirstName());
		student.setLastName(registerRequest.getLastName());
		student.setUser(user);

		studentService.save(student);

//		RegisterResponse registerResponse=

		return null;

	}

}
