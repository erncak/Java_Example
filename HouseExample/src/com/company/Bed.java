package com.company;

public class Bed {


String s;
    Lamp lamp= new Lamp();
    public void changeLocation(){
        System.out.println("Changing beds location");
    }
    public void sleep(){
        lamp.turnoff(s);
        System.out.println("Sleeping");
    }
    public void read(){
        lamp.turnOn(s);
        System.out.println("Reading book");

    }
}
