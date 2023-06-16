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
@Table(name = "purchase")
public class Purchase {
	
	@Id
	private Long purchase_id;
	
	private String product_id;
	
	private String email;
	
	private String date;

}
