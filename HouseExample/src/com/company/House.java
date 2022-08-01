package com.company;

public class House {
    Room room = new Room();
    Kitchen kitchen= new Kitchen();
    Bathroom bathroom = new Bathroom();
    Lamp lamp = new Lamp();

    public void navigateRoom(String s){
        System.out.println("Entering room "+ s);
        lamp.turnOn(s);
    }

    public static void main(String[] args) {
	// write your code here
        House home = new House();
        home.navigateRoom("Kitchen");
        home.bathroom.takeShower();
        home.room.bed.read();
        home.room.bed.sleep();

    }
}
