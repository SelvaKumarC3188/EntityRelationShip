package com.onesoft.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.firstproject.entity.Car;
import com.onesoft.firstproject.exception.Brandnotfoundexception;
import com.onesoft.firstproject.service.CarService;
@RestController
public class CarController {
@Autowired    //for bean class inject 
CarService cs;
@PostMapping(value="/savedata")
public String setData(@RequestBody Car e) {
	return cs.setData(e);
}
@PostMapping(value="/savelist")
public String setList(@RequestBody List<Car> r) {
	return cs.setList(r);
}
@GetMapping(value="/findbyid/{a}")
public Car findbyid(@PathVariable int a) {
	return cs.findbyid(a);
}
@GetMapping(value="/getalldetails")
public List<Car> getalldetails() {
	return cs.getalldetails();
}
@PatchMapping(value="/update")
public String updatedata(@RequestBody Car a) {
	return cs.updatedata(a);
}
@DeleteMapping(value="/delete/{a}")
public String delete(@PathVariable int a) {
	return cs.delete(a);
}
@GetMapping("/getbrand/{brand}")
public List<Car> getbrand(@PathVariable String brand)throws Brandnotfoundexception{
	return cs.getbrand(brand);	
}
@GetMapping("/getcolour/{color}")
public List<Car> getcolor(@PathVariable String color){
	return cs.getcolor(color);
}
@GetMapping("/getprice/{price}")
public List<Car> getprice(@PathVariable int price){
	return cs.getprice(price);
}
@GetMapping("/sortprice")
public List<Car> sortprice(){
	return cs.sortprice();
}
@GetMapping("/maxprice")
public Car maxprice(){
	return cs.maxprice();
}
@PutMapping(value="/updateprice/{price}")
public List<Car> updateprice(@PathVariable int price){
	return cs.updateprice(price);
}
//@PatchMapping(value="/changeprice/{a}")
//public String changeprice(@PathVariable int a,@RequestBody Car b) {
//	return cs.changeprice(a,b);
//}
}
