package com.greenfox.pallidaorientationexam.controllers;

import com.greenfox.pallidaorientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarWebController {

    @Autowired
    CarService carService;

    @GetMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("cars", carService.listAll());
        return "licencePlates";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("cars", carService.findAllByPlate(search));
        return "licencePlates";
    }
}
