package com.eSportyShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eSportyShoes.entity.Purchase;
import com.eSportyShoes.repository.PurchaseRepo;

@Service
public class PurchaseServiceImpl implements PurchaseService{
	
	@Autowired
	private PurchaseRepo purchaserepo;
	@Override
	public List<Purchase> getAllPurchases() {

		return purchaserepo.findAll();
	}

	@Override
	public List<Purchase> getbyDateandCategory(String date, String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
