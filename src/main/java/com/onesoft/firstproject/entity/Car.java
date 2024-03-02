package com.onesoft.firstproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cardetails")
public class Car {
	@Id                                                //uniqe value
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment Id
	private int id;
	private String brand;
	private int price;
	private String colour;
	private boolean isPetrol;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}	
}
