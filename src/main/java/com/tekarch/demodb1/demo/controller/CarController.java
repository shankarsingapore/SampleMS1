package com.tekarch.demodb1.demo.controller;

import com.tekarch.demodb1.demo.entity.Car;
import com.tekarch.demodb1.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;



    @GetMapping(value = "/car")
    public List<Car> getCars(){
       //Car c1=new Car();
       // c1.setColor("white");
       // c1.setName("Shankar's VW Passat");
       // return c1;

        return carRepository.findAll();
    }

    @PostMapping(value = "/car")
    public Car addNewCar(@RequestBody Car c1){
        return carRepository.save(c1);
   //     return "NewCar Added with name=" +c1.getName();
    }
 @GetMapping(value="/car/{carName}")
    public String getCarByName(@PathVariable String carName){
     //Optional<Car> optional=carRepository.findByName(carName);
     Car car=carRepository.findByName(carName);
     return car.getBrandName();


 }
}
