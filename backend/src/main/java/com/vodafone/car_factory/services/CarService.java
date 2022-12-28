package com.vodafone.car_factory.services;

import com.vodafone.car_factory.modal.Cabrio;
import com.vodafone.car_factory.modal.Hatchback;
import com.vodafone.car_factory.modal.Sedan;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public String getType(String name) {
        Cabrio cabrio = new Cabrio();
        Sedan sedan = new Sedan();
        Hatchback hatchback = new Hatchback();
        if (name.equals(cabrio.getType()) ) {
            return produceCar(name);
        } else if (name.equals(sedan.getType())) {
            return produceCar(name);
        } else if (name.equals(hatchback.getType())) {
            return produceCar(name);
        }
        return name + " " + "Car has not produced";
    }

    public String produceCar(String name) {
        return name + " " + "Car has produced";
    }
}
