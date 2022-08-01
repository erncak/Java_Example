package com.company;

public class Bathroom {
    Lamp lamp= new Lamp();
    String bath;
    String sink;
    String washingmachine;
    String basket;
    String mirror;
public Bathroom(){

}
    public Bathroom(Lamp lamp, String bath, String sink, String washingmachine, String basket, String mirror) {
        this.lamp = lamp;
        this.bath = bath;
        this.sink = sink;
        this.washingmachine = washingmachine;
        this.basket = basket;
        this.mirror = mirror;
    }

    public void WashHand(){
        System.out.println("Washing hands");

    }
    public void takeShower(){
        System.out.println("Taking shower");
    }
    public void washClothes(){
        System.out.println("Washing clothes");
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getWashingmachine() {
        return washingmachine;
    }

    public void setWashingmachine(String washingmachine) {
        this.washingmachine = washingmachine;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }
}
