package com.company;

public class FreeGlutenWaffle implements Waffle{
    @Override
    public String getDescription() {
        return "Free Gluten Waffle (17$)";
    }

    @Override
    public double getPrice() {
        return 17.0;
    }
}
