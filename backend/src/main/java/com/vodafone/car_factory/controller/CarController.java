package com.vodafone.car_factory.controller;

import com.vodafone.car_factory.services.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping()
@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/api/car-factory")
    @ResponseBody
    public String produceCar(@RequestParam String name){
     return this.carService.getType(name);
    }

}

