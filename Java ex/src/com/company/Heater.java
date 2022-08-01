package com.company;

public interface Heater {
    public double heat(int temperature);
    public void fill(Heatable fluid);
    public Heatable discharge();
}
