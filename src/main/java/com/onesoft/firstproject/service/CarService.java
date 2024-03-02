package com.onesoft.firstproject.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.firstproject.dao.CarDao;
import com.onesoft.firstproject.entity.Car;
import com.onesoft.firstproject.exception.Brandnotfoundexception;


@Service
public class CarService {
@Autowired
CarDao cd;
public String setData(Car e) {
	return cd.setData(e);
}

public String setList(List<Car> r) {
return cd.setList(r);
}
public Car findbyid(int a) {
	return cd.findbyid(a);
}
public List<Car> getalldetails() {
	return cd.getalldetails();
}
public String updatedata(Car a ) {
	return cd.updatedata(a);

}
public String delete(int a) {
	return cd.delete(a);
}
public List<Car> getbrand(String brand)throws Brandnotfoundexception{
	List<Car> newcar=cd.getalldetails();
	List<Car> a=newcar.stream().filter(x->x.getBrand().equals(brand)).collect(Collectors.toList());
	if(a.isEmpty()) {
	throw new Brandnotfoundexception("no brand");	
	}
	else {
		
	return a;
}
}
public List<Car> getcolor(String color){
	List<Car> newcar=cd.getalldetails();
	List<Car> a=newcar.stream().filter(x->x.getColour().equals(color)).collect(Collectors.toList());
	return a;
			
}
public List<Car> getprice(int price) {
	List<Car> newcar=cd.getalldetails();
	List<Car> a=newcar.stream().filter(x->x.getPrice()>=price).collect(Collectors.toList());
	return a;
}
public List<Car> sortprice(){
	List<Car> newcar=cd.getalldetails();
	List<Car> a=newcar.stream().sorted(Comparator.comparing(Car::getPrice)).distinct().collect(Collectors.toList());
	return a;
}
public Car maxprice(){
	List<Car> newcar=cd.getalldetails();
	Car a=newcar.stream().max(Comparator.comparingInt(Car::getPrice)).get();
	return a;
}
public List<Car> updateprice(int price){
	List<Car> newcar=cd.getalldetails();
	List<Car> s=newcar.stream().filter(x->x.getPrice()>price).peek(x->x.setPrice(x.getPrice()+x.getPrice()*10/100)).collect(Collectors.toList());
	return cd.updateprice(s);
}
//public String changeprice(int a,Car b) {
//	List<Car> n=cd.getalldetails();
//	List<Car> m=n.stream().filter(x->x.getId()=a).peek(x->x.setPrice(25)).collect(Collectors.toList());
//	
//}
}


