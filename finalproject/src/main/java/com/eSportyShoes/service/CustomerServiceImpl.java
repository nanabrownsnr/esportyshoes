package com.eSportyShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eSportyShoes.entity.Customer;

import com.eSportyShoes.repository.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerrepo;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return customerrepo.findAll();
	}



}
