package com.onesoft.firstproject.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.firstproject.entity.Car;

public interface CarRepositary extends JpaRepository<Car,Integer> {      //entity name,data type(unique id)

}
