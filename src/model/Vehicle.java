package model;

public abstract class Vehicle{
    private String name;
    private final int id = 0;
    private static int vehicleCount;

    public void move() {

    }

    public Vehicle(){
       vehicleCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public static void setVehicleCount(int vehicleCount) {
        Vehicle.vehicleCount = vehicleCount;
    }
}
