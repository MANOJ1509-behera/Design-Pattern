package com.java.designPattern.strategyDesignPattern.withStrategyDesignPattern.strategy;

public class SportsStrategy implements DriveStrategy{

    @Override
    public void Drive() {
        System.out.println("I am inside the Sports category Drive");
    }
}
