package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    public Boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    @java.lang.Override
    public String getVehicleName() {
        return this.name;
    }

    @java.lang.Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
