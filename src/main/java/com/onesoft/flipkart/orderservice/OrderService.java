package com.onesoft.flipkart.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onesoft.flipkart.orderdao.OrederDao;
import com.onesoft.flipkart.orderentity.OrderEntity;

@Service
public class OrderService {
@Autowired
OrederDao od;
public String setData(OrderEntity e) {
	return od.setData(e);
}
public List<OrderEntity> getalldetails() {
	return od.getalldetails();
}
public List<Object> gets(){
	return od.gets();
}
}
