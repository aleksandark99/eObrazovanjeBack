package com.ftn.studentService.service;

import com.ftn.studentService.model.User;

public interface StudentService {
	
	User findById(int userId);
	void deleteById(int userId);
}
