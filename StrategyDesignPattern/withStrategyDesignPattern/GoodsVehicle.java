package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern;

import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.DriveStrategy;
import com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
