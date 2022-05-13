package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repo.productRepo;
@Service
public class productService {
    
     @Autowired
     productRepo productRepo;
     public  Page<Product> getProducts(int pageNum, int pageSize){
    	Pageable page = PageRequest.of(pageNum, pageSize);
    	
    	return productRepo.findAll(page);
    	
    	 
     }
	
	
	
	
}
