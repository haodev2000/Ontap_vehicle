package model;

public class Bike extends Vehicle{
    private boolean hasGear;

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
