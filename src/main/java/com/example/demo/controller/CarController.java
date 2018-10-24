package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Car;
import com.example.demo.service.CarServiceImpl;

@Controller
public class CarController {
	private CarServiceImpl carService;
	@Autowired
    public CarController(CarServiceImpl carService) {
		this.carService = carService;
	}
	@RequestMapping("/")
    public String index() {
	    System.out.println(carService.getAllCar().get(0).getColor());
    	return "index";
    }
	
    
}
