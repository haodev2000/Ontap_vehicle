package main;

import model.Bike;
import model.Car;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.move();
        bike.move();

        System.out.println("Số lượng xe là : " + car.getVehicleCount());



    }
}
