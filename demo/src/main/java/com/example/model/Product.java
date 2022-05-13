package com.example.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="product")
@NoArgsConstructor
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int variant_id;
	private double price;
	private int inventory;
	@Lob
	private String descrption;
	private String img_url;

	

}
