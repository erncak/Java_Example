package com.company;

public class WaterPump {
    final double pumpRate = 10;
    public Water pump(double time)
    {
        System.out.println("Pumping Water");
        return new Water(pumpRate*time,10);
    }
}
