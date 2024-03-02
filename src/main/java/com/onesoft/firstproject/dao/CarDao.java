package com.onesoft.firstproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.firstproject.Repositary.CarRepositary;
import com.onesoft.firstproject.entity.Car;

@Repository
public class CarDao {
	@Autowired
	CarRepositary cr;

	public String setData(Car e) {
		cr.save(e); // inbuild methode name
		return "Save Successfully";
	}

	public String setList(List<Car> r) {
		cr.saveAll(r);
		return "List Saved";
	}
	public Car findbyid(int a) {
		return cr.findById(a).get();
		
	}
	public List<Car> getalldetails() {
		return cr.findAll();
	}
	public String updatedata(Car a) {
		cr.save(a);
		return "Updated";
	}
	public String delete(int a) {
		cr.deleteById(a);
		return "Succesfully deleted";
	}
	public List<Car> updateprice(List<Car> a){
		return cr.saveAll(a);
		
	}
}
