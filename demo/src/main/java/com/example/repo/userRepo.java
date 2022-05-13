package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface userRepo extends JpaRepository<User, Long>  {
	
}
