package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern;

import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.Drive();
    }
}
