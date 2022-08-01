package com.company;

public abstract class  employee {
    private String fName;
    private String ssn;

    public employee(String fName, String ssn) {
        this.fName = fName;
        this.ssn = ssn;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public abstract double earn();
    public String toString() {
        return ("name " + getfName()+ "Social security number:" + getSsn());
    }

}
