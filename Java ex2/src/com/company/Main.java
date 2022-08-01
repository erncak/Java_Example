package com.company;

public class Main {
public static Hour_Employee hour_employee;
public static SalarEmployee salarEmployee;
public static CommisionEmp commisionEmp;
public static SalaryCom salaryCom;
    public static void main(String[] args) {
	// write your code here
    employee[] employees = new employee[4];
    employees[0]= new Hour_Employee("Erinc","12121212",45,60);
    employees[1]=new SalarEmployee("erdi","123123123123",3000);
    employees[2]= new CommisionEmp("bumm","323232323",30,0.45);
    employees[3]=new SalaryCom("yes","123123123123",50,0.45,5000);
        System.out.println(employees[2].);
        for (int i = 0; i < employees.length; i++) {
            employees[i].getfName();
            if(employees[i] instanceof SalaryCom){
                SalaryCom salaryCom1= (SalaryCom) employees[i];
salaryCom1.setBase_salary(1.10*salaryCom1.getBase_salary());
                System.out.println("new base salary:"+ salaryCom1.getBase_salary());
            }
            System.out.println("earnings:"+ employees[i].earn());

        }
    }
}
