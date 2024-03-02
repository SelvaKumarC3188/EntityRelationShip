package com.onesoft.flipkart.ordercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.onesoft.flipkart.orderentity.OrderEntity;
import com.onesoft.flipkart.orderservice.OrderService;

@RestController
public class OrederController {
	@Autowired
	OrderService os;
	@PostMapping(value="/savedata")
	public String setData(@RequestBody OrderEntity e) {
		return os.setData(e);
	}
	@GetMapping(value="/getalldetails")
	public List<OrderEntity> getalldetails() {
		return os.getalldetails();
}
	@GetMapping(value="/get")
	public List<Object> gets(){
		return os.gets();
	}
}
