package com.eSportyShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eSportyShoes.entity.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, String> {

}
