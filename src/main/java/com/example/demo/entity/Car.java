package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int carId;
   @Column(name="marker")
   private String marker;
   @Column(name="model")
   private String model;
   @Column(name="year")
   private String year;
   @Column(name="color")
   private String color;
   @Column(name="note")
   private String note;
}
