package com.greenfox.pallidaorientationexam.services;

import com.greenfox.pallidaorientationexam.models.Car;
import com.greenfox.pallidaorientationexam.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    public Iterable<Car> listAll() {
        return carRepo.findAll();
    }

    public List<Car> findAllByPlate(String search) {
        return carRepo.findAllByPlate(search);
    }

    public List<Car> findAllPolice() {
        return carRepo.findAllPolice();
    }

    public List<Car> findAllDiplomat() {
        return carRepo.findAllDiplomat();
    }

    public List<Car> findAllByBrand(String brand) {
        return carRepo.findAllByBrand(brand);
    }

    public List<Car> listAllByTen(long pageId) {
        return carRepo.findAllByTen(pageId * 10);
    }
}