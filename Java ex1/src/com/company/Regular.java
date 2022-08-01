package com.company;

public class Regular extends Partipiciant {
    public static int Rcount=0;
    public static int rLunch=0;
   public static int Rbook=0;

    public int getRcount() {
        return Rcount;
    }

    public void setRcount(int rcount) {
        Rcount = rcount;
    }

    public int getrLunch() {
        return rLunch;
    }

    public void setrLunch(int rLunch) {
        this.rLunch = rLunch;
    }

    public int getRbook() {
        return Rbook;
    }

    public void setRbook(int rbook) {
        Rbook = rbook;
    }

    public Regular(String fullName, boolean wantlunch, boolean wantProceeding) {
        super(fullName, wantlunch, wantProceeding);
        Rcount++;
    }
    @Override
    public double fees() {
        if (isWantlunch()&&isWantProceeding()==false){
            rLunch++;

            return super.fees()+20;
        }
        if (isWantlunch()&&isWantProceeding()){
rLunch++;
Rbook++;
            return super.fees()+200;
        }
        return super.fees();
    }
    @Override
    public void printInfo() {

        System.out.println(getFullName());
        System.out.println(isWantProceeding());
        System.out.println(isWantlunch());
        System.out.println(fees());
    }
}
