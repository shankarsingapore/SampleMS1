package com.tekarch.demodb1.demo.repository;

import com.tekarch.demodb1.demo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long> {
  // Optional <Car> findByName(String name);
    Car findByName(String name);
}
