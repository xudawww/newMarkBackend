package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.productService;
@RestController
@Component
@RequestMapping("/api")
public class productController{
	@Autowired productService productService;
	@GetMapping("/products")
	public Page<Product> getProducts(@RequestParam int pageSize, @RequestParam int pageNumber) {
	    Product pre = new Product();
		return productService.getProducts(pageNumber, pageSize);
	}
	
	
}