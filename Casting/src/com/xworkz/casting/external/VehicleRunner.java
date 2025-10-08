package com.xworkz.casting.external;

import com.xworkz.casting.internal.Car;
import com.xworkz.casting.internal.Vehicle;

public class VehicleRunner {
    public static void main(String [] args) {
        Vehicle myVehicle = new Car();

        myVehicle.displayType();

        Car myCar = (Car) myVehicle;

        myCar.displayFeature();
    }
}