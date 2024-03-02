package com.onesoft.flipkart.orderdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.onesoft.flipkart.orderentity.OrderEntity;
import com.onesoft.flipkart.orderrepository.OrderRep;
@Repository
public class OrederDao {
@Autowired
OrderRep or;
public String setData(OrderEntity e) {
	or.save(e);
	return "Save Successfully";
}
public List<OrderEntity> getalldetails() {
	return or.findAll();
}
public List<Object> gets(){
	return or.gets();
}

}
