package com.ftn.studentService.service.impl;

import com.ftn.studentService.model.Student;
import com.ftn.studentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.studentService.model.User;
import com.ftn.studentService.repository.UserRepository;
import com.ftn.studentService.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private UserRepository repository;

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public User findById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

}
