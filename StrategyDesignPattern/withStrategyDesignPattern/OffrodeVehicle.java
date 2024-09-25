package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern;

import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.DriveStrategy;
import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.SportsStrategy;

public class OffrodeVehicle extends Vehicle{

    OffrodeVehicle() {
        super(new SportsStrategy());
    }
}
