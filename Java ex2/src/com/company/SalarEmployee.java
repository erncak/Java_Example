package com.company;

public class SalarEmployee extends employee {
    private double weekSalary;

    public SalarEmployee(String fName, String ssn, double weekSalary) {
        super(fName, ssn);
       setWeekSalary(weekSalary);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary>0){
            this.weekSalary = weekSalary;
        }
        else{
           // System.out.println("Salary must be greater than o");
        }
    }

    @Override
    public double earn() {
        return getWeekSalary();
    }
}
