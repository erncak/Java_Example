package com.company;

public class Strawberry extends WaffleDecarator{
    private final Waffle waffle;

    public Strawberry(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" Strawberry (0.5$)";

    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+0.5;
    }
}
