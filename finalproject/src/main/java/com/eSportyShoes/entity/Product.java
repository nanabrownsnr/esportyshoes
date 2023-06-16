package com.eSportyShoes.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	private Long product_id;
	
	private String productname;
	
	private String price;
	
	private String category;

}
