package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern;

import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.DriveStrategy;
import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.SportsStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsStrategy());
    }
}
