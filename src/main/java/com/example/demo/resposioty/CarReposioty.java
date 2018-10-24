package com.example.demo.resposioty;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Car;
@Repository
public interface CarReposioty extends JpaRepository<Car,Long>{
	@Query(value="select * from car",nativeQuery = true)
	Collection<Car> getAllCar();
}
