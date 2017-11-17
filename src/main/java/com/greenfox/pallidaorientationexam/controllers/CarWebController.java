package com.greenfox.pallidaorientationexam.controllers;

import com.greenfox.pallidaorientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarWebController {

    @Autowired
    CarService carService;

    @GetMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("cars", carService.listAll());
        return "licencePlates";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "q", required = false, defaultValue = "") String search,
                         Model model,
                         @RequestParam(value = "police", required = false, defaultValue = "0") String police,
                         @RequestParam(value = "diplomat", required = false, defaultValue = "0") String diplomat) {
        if (!search.equals("")) {
            model.addAttribute("cars", carService.findAllByPlate(search));
        } else if (!police.equals("0")) {
            model.addAttribute("cars", carService.findAllPolice());
        } else if (!diplomat.equals("0")) {
            model.addAttribute("cars", carService.findAllDiplomat());
        } else {
            model.addAttribute("cars", carService.listAll());
        }
        return "licencePlates";
    }

    @GetMapping("/search/{brand}")
    public String searchByBrand(@PathVariable String brand, Model model) {
        model.addAttribute("cars", carService.findAllByBrand(brand));
        return "licencePlates";
    }
}
