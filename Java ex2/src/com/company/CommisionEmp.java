package com.company;

public class CommisionEmp extends employee{
    private double Sales;
    private double CommisionRate;

    public CommisionEmp(String fName, String ssn, double sales, double commisionRate) {
        super(fName, ssn);
        this.setSales(sales);
        this.setCommisionRate(commisionRate);
    }

    public double getSales() {
        return Sales;
    }

    public void setSales(double sales) {
        if(getSales()>0){
            Sales = sales;

        }else{
            //System.out.println("Sales must be greater than 0");
        }
    }

    public double getCommisionRate() {
        return CommisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if(getCommisionRate()>0.0 && getCommisionRate()<1.0){
            CommisionRate = commisionRate;
        }
else {
            //System.out.println("Rate must between 0 and 1");
        }
    }

    @Override
    public double earn() {
        return getSales()*getCommisionRate();
    }

    @Override
    public String toString() {
        return "CommisionEmp{" +
                "Sales=" + Sales +
                ", CommisionRate=" + CommisionRate +
                '}';
    }
}
