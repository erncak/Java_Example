package com.company;

public class RasperrySauce extends WaffleDecarator{
    private final Waffle waffle;

    public RasperrySauce(Waffle waffle) {
        this.waffle = waffle;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription()+" Rasperry Sauce (1$)";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+1.0;
    }

}
