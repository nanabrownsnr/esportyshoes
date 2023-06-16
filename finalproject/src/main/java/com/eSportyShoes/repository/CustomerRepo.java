package com.eSportyShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eSportyShoes.entity.Customer;


public interface CustomerRepo extends JpaRepository<Customer, String> {
	
}
