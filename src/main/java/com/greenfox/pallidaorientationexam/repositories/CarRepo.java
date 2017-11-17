package com.greenfox.pallidaorientationexam.repositories;

import com.greenfox.pallidaorientationexam.models.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {


    List<Car> findAllByPlate(String search);
}
