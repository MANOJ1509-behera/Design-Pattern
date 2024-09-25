package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        Vehicle vehicle2= new OffrodeVehicle();
        vehicle2.drive();
    }
}
