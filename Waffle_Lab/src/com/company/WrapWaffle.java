package com.company;

public class WrapWaffle implements Waffle{
    @Override
    public String getDescription() {
        return "Wrap Waffle (13$)";
    }

    @Override
    public double getPrice() {
        return 13.0;
    }
}
