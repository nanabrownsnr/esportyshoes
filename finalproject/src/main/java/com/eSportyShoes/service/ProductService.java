package com.eSportyShoes.service;

import java.util.List;

import com.eSportyShoes.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	
	void saveProduct(Product product);
	
	Product getProductbyId(String product_id);
	
	void deleteProductbyId(String product_id);
}
