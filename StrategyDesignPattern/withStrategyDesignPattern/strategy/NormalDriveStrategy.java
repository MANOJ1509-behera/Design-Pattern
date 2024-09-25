package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void Drive() {
        System.out.println("This is the Normal Drive Strategy");
    }
}
