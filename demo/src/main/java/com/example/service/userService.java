package com.example.service;

import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.model.User;
import com.example.model.registerModel.registerRequest;
import com.example.repo.userRepo;
@Service
public class userService {
	 @Autowired
	 userRepo userRepo;
	  public  User registerUser(registerRequest req){
		  System.out.println(req);
		  Random rand = new Random();
		  String token = String.format("%06d", rand.nextInt(1000000));
	      User newUser = new User(req.getUser_name(),req.getPassword(),req.getEmail(),"",token ,0); 
	      return this.userRepo.save(newUser); 	 
	 }
}
