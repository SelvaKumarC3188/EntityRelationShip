package com.onesoft.flipkart.orderrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.onesoft.flipkart.orderentity.OrderEntity;


public interface OrderRep extends JpaRepository <OrderEntity,Integer>{
	@Query(value = "select city,price from order_table join prod_table on order_table.id=prod_table.order_fkey;",nativeQuery=true)
	public List<Object> gets();

}
