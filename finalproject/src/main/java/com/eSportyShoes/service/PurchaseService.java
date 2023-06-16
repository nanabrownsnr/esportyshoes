package com.eSportyShoes.service;

import java.util.List;

import com.eSportyShoes.entity.Purchase;

public interface PurchaseService {
	List<Purchase> getAllPurchases();
	
	List<Purchase> getbyDateandCategory(String date,String category);

}
