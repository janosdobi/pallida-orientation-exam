package com.greenfox.pallidaorientationexam.repositories;

import com.greenfox.pallidaorientationexam.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Long> {
}
