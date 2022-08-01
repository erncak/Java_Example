package com.company;

public class Student extends Partipiciant{
   public static int Scount=0;
    public static int LunchCount=0;
   public static int bookcount=0;

    public int getScount() {
        return Scount;
    }

    public void setScount(int scount) {
        Scount = scount;
    }

    public int getLunchCount() {
        return LunchCount;
    }

    public void setLunchCount(int lunchCount) {
        LunchCount = lunchCount;
    }

    public int getBookcount() {
        return bookcount;
    }

    public void setBookcount(int bookcount) {
        this.bookcount = bookcount;
    }

    public Student(String fullName, boolean wantlunch, boolean wantProceeding) {
        super(fullName, wantlunch, wantProceeding);

        Scount++;
    }

    @Override
    public double fees() {
        if (isWantlunch()&&isWantProceeding()==false){
LunchCount++;
            return super.fees()*0.6+20;

        }
        if (isWantlunch()&&isWantProceeding()){
            LunchCount++;
            bookcount++;
            return super.fees()*0.6+200;
        }
        return super.fees()*0.6;
    }

    @Override
    public void printInfo() {

        System.out.println(getFullName());
        System.out.println("Proceeding: "+isWantProceeding());
        System.out.println("Lunch: "+isWantlunch());
        System.out.println(fees());


    }
}
