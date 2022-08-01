package com.company;

public class Water implements Heatable {
double amount;
double temperature;

    public Water(double amount, double temperature) {
        this.amount = amount;
        this.temperature = temperature;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
this.amount=amount;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
this.temperature=temperature;
    }
}
