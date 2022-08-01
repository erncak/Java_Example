package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CoffeMachine coffeMachine = new CoffeMachine();
       Coffe coffe =  coffeMachine.makeCoffee();
        System.out.println(coffe);
    }
}
