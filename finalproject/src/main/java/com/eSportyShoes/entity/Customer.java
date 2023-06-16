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
@Table(name = "customers")
public class Customer {
	
	@Id
	private String email;
	
	private String username;
	
	private String phone;

}
