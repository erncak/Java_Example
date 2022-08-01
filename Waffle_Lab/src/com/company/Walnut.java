package com.company;

public class Walnut extends WaffleDecarator{
    private final Waffle waffle;

    public Walnut(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" Walnut (1$)";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+1.0;
    }
}
