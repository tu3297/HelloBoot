package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.resposioty.CarReposioty;

@Service
public class CarService implements CarServiceImpl { 
	private CarReposioty carReposioty;
     @Autowired
     public CarService(CarReposioty carReposioty) {
    	 this.carReposioty=carReposioty;
     }
	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return (List<Car>) carReposioty.getAllCar();
	}
}
