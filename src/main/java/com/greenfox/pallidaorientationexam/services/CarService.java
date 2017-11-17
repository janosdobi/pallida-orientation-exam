package com.greenfox.pallidaorientationexam.services;

import com.greenfox.pallidaorientationexam.models.Car;
import com.greenfox.pallidaorientationexam.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    public Iterable<Car> listAll() {
        return carRepo.findAll();
    }
}