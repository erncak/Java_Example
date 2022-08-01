package com.company;

public class Voltran {
    RightArm rightArm=new RightArm();
    LeftLeg leftLeg= new LeftLeg();
    Head head = new Head();
    RightLeg rightLeg= new RightLeg();
    LeftArm leftArm=new LeftArm();
    Torso torso= new Torso();



    public static void main(String[] args) {
	// write your code here
Voltran voltran= new Voltran();
voltran.rightArm.fireRarm();
voltran.head.sendWarning();
voltran.rightArm.fireRarm();



     }
}
