package com.vodafone.car_factory.modal;

import com.vodafone.car_factory.interfaces.ICar;

public class Sedan implements ICar {
    private String name = "Sedan";

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return getName();
    }
}
