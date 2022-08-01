package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student= new Student("dadad",true,true);
        Regular regular=new Regular("asdasd",true,true);
        Student student1= new Student("as",false,true);
        Student student2= new Student("Erisanc",false,true);
        CommunityMember communityMember = new CommunityMember("blbabla",true,true);
student.printInfo();
regular.printInfo();
         student2.fees();
         regular.fees();
         communityMember.fees();
        System.out.println("Number of partipiciants: "+(student.getScount()+regular.getRcount()+communityMember.getComCount()));
        System.out.println("Total services: " + (student.getLunchCount()+communityMember.getLunchCount()+regular.getrLunch()));
        
    }
}
