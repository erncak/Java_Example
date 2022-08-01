package com.company;

public class Partipiciant {

    private String fullName;
    private boolean Wantlunch;
    private boolean WantProceeding;
    private static int count=0;


    public Partipiciant( String fullName, boolean wantlunch, boolean wantProceeding) {

        this.fullName = fullName;
        Wantlunch = wantlunch;
        WantProceeding = wantProceeding;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isWantlunch() {
        return Wantlunch;
    }

    public void setWantlunch(boolean wantlunch) {
        Wantlunch = wantlunch;
    }

    public boolean isWantProceeding() {
        return WantProceeding;
    }

    public void setWantProceeding(boolean wantProceeding) {
        WantProceeding = wantProceeding;
    }
    public double fees(){
        return 500;
    }
    public void printInfo(){
        System.out.println("Number of partipiciants: " + count);
    }
}
