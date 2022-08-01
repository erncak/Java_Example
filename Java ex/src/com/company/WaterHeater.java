package com.company;

public class WaterHeater implements Heater{
    Water water;
    final double capacityInML = 2000;

    public WaterHeater(Water water) {
        this.water = water;
    }

    public double getCapacityInML() {
        return capacityInML;
    }

    @Override
    public double heat(int temperature) {
water.setTemperature(temperature);
        return water.getTemperature();
    }

    @Override
    public void fill(Heatable fluid) {
if(fluid.getAmount()<10){
    System.out.println("Not enough");
}
else {
    water.setAmount(fluid.getAmount());
}
    }

    @Override
    public Heatable discharge() {
        return null;
    }
}
