package com.onesoft.flipkart.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.flipkart.orderentity.ProductEntity;

public interface ProductRep extends JpaRepository<ProductEntity,Integer>{

}
