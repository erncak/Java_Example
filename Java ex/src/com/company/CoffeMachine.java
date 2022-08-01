package com.company;

public class CoffeMachine {
    WaterPump waterPump;
    WaterHeater waterHeater;
    Water water;


    public CoffeMachine() {
        water = new Water(100,10);
     waterPump = new WaterPump();
        waterHeater= new WaterHeater(water);
    }

    public WaterPump getWaterPump() {
        return waterPump;
    }

    public void setWaterPump(WaterPump waterPump) {
        this.waterPump = waterPump;
    }

    public WaterHeater getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(WaterHeater waterHeater) {
        this.waterHeater = waterHeater;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Coffe makeCoffee(){
        water =waterPump.pump(10);
waterHeater.fill(water);
waterHeater.heat(100);



return new Coffe(water.temperature, water.amount);
    }
}
