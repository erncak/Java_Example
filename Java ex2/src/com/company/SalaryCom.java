package com.company;

public class SalaryCom extends  CommisionEmp{
    private double base_salary;

    public SalaryCom(String fName, String ssn, double sales, double commisionRate, double base_salary) {
        super(fName, ssn, sales, commisionRate);
        setBase_salary(base_salary);
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        if(base_salary>0){
            this.base_salary = base_salary;
        }
        else {
            //System.out.println("salary must be greater than 0");
        }

    }

    @Override
    public double earn() {
        return super.earn()+getBase_salary();
    }
}

