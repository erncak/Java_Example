package com.company;

public class Coffe implements  Heatable{
double amount;
double temperature;
    Water w;


    public Coffe(double amount, double temperature) {
        setAmount(amount);
        setTemperature(temperature);
       w=new Water(amount,temperature);
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

    @Override
    public String toString() {
        return "Coffe{" +
                "amount=" + amount +
                ", temperature=" + temperature +
                ", w=" + w +
                '}';
    }
}
