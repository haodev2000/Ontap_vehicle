package model;

public class Car extends Vehicle{
    private int numberOfDoors;

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
