package com.greenfox.pallidaorientationexam.controllers;

import com.greenfox.pallidaorientationexam.models.CarList;
import com.greenfox.pallidaorientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {

    @Autowired
    CarService carService;

    @GetMapping("/api/search/{brand}")
    public CarList listCarsByBrand(@PathVariable String brand) {
        CarList carList = new CarList();
        carList.setData(carService.findAllByBrand(brand));
        carList.setResult("ok");
        return carList;
    }
}
