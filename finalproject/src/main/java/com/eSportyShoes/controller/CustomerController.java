package com.eSportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eSportyShoes.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
    private CustomerService customerservice;
	
	
	@GetMapping("/viewCustomers")
    public String viewCustomers(Model model) {
        model.addAttribute("listCustomers", customerservice.getAllCustomers());
        return "view_users";
        
	}

}
