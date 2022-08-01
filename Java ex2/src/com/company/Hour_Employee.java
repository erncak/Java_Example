package com.company;

public  class Hour_Employee extends employee {
    private double hour;
    private double wage;

    public Hour_Employee(String fName, String ssn, double hour, double wage) {
        super(fName, ssn);
      setHour(hour);
        setWage(wage);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if(hour>0){
            this.hour = hour;

        }
        else {
            System.out.println("Hour must be greater than zero");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage>0){
            this.wage = wage;
        }else{
            System.out.println("wage must be greater than 0");
        }

    }

    @Override
    public double earn() {
        if(getHour()<=40){
            return getHour()*getWage();
        }else{
            return getWage()*getHour()+(getHour()-40)*getWage()*1.5;
        }

    }
}
