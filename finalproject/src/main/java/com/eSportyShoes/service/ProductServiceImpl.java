package com.eSportyShoes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eSportyShoes.entity.Product;
import com.eSportyShoes.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productrepo;
	
	@Override
	public List<Product> getAllProducts() {
		
		return productrepo.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		this.productrepo.save(product);
	}

	@Override
	public Product getProductbyId(String product_id) {
		Optional<Product> optional = productrepo.findById(product_id);
		Product product = null;
		if (optional.isPresent()) {
			product =optional.get();
		}else {
			throw new RuntimeException("Product with that Product ID not found");
		}
		return product;
	}


	@Override
	public void deleteProductbyId(String product_id) {
		this.productrepo.deleteById(product_id);
		
	}

}
