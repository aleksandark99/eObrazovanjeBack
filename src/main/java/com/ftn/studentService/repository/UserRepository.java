package com.ftn.studentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.studentService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	
}
