package com.eSportyShoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eSportyShoes.service.ProductService;
import com.eSportyShoes.entity.Product;

@Controller
public class ProductController {
	
	
	@Autowired
    private ProductService productservice;
	
	
	@GetMapping("/viewProducts")
    public String viewProduct(Model model) {
        model.addAttribute("listProducts", productservice.getAllProducts());
        return "view_product";
    }
	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
	    model.addAttribute("product", product);
	    return "add_product";
		
	}
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productservice.saveProduct(product);
		return "redirect:/viewProducts";
		
	}
	
	@GetMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable ( value = "id") String product_id, Model model) {
		Product product = productservice.getProductbyId(product_id);
		model.addAttribute("product", product);
		return "update_product";
	}
	
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable ( value = "id") String product_id) {
		this.productservice.deleteProductbyId(product_id);
	   return "redirect:/viewProducts";
	    
	    
	}

}

