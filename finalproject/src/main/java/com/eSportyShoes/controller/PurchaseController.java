package com.eSportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eSportyShoes.service.PurchaseService;
@Controller
public class PurchaseController {
	
	@Autowired
    private PurchaseService purchaseservice;
	
	@GetMapping("/viewPurchases")
    public String viewProduct(Model model) {
        model.addAttribute("listPurchases", purchaseservice.getAllPurchases());
        return "view_purchases";
	}

}
