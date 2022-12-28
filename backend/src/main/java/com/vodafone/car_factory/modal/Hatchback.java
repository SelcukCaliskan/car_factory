package com.vodafone.car_factory.modal;

import com.vodafone.car_factory.interfaces.ICar;

public class Hatchback implements ICar {
    private String name = "Hatchback";

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return getName();
    }
}
