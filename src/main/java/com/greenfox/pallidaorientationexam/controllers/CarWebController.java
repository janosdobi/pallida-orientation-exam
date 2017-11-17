package com.greenfox.pallidaorientationexam.controllers;

import com.greenfox.pallidaorientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarWebController {

    @Autowired
    CarService carService;

    @GetMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("cars", carService.listAll());
        return "licencePlates";
    }
}
