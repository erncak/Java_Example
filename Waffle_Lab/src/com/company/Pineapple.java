package com.company;

public class Pineapple extends WaffleDecarator{
    private final Waffle waffle;

    public Pineapple(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" Pineapple(0.5$)";

    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+ 0.5;
    }
}
