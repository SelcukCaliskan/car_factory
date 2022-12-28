package com.vodafone.car_factory.modal;

import com.vodafone.car_factory.interfaces.ICar;

public class Cabrio implements ICar {
    private String name = "Cabrio";

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return getName();
    }
}
