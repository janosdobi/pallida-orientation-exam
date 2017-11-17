package com.greenfox.pallidaorientationexam.controllers;

import com.greenfox.pallidaorientationexam.models.CarList;
import com.greenfox.pallidaorientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CarRestController {

    @Autowired
    CarService carService;

    @ExceptionHandler(Exception.class)
    public CarList displayStatusError() {
        return new CarList("Error. Something went wrong. Sorry :(", Arrays.asList());
    }

    @GetMapping("/api/search/{brand}")
    public CarList listCarsByBrand(@PathVariable String brand) {
        CarList carList = new CarList();
        carList.setData(carService.findAllByBrand(brand));
        carList.setResult("ok");
        return carList;
    }
}