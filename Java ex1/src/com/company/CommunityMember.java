package com.company;

public class CommunityMember extends Partipiciant {
private int ComCount=0;
private int LunchCount=0;
private int BookCount=0;

    public int getComCount() {
        return ComCount;
    }

    public void setComCount(int comCount) {
        ComCount = comCount;
    }

    public int getLunchCount() {
        return LunchCount;
    }

    public void setLunchCount(int lunchCount) {
        LunchCount = lunchCount;
    }

    public int getBookCount() {
        return BookCount;
    }

    public void setBookCount(int bookCount) {
        BookCount = bookCount;
    }

    public CommunityMember(String fullName, boolean wantlunch, boolean wantProceeding) {
        super(fullName, wantlunch, wantProceeding);
        ComCount++;
    }
    @Override
    public double fees() {
        if (isWantlunch()&&isWantProceeding()==false){
            LunchCount++;
            return super.fees()*0.5+20;
        }
        if (isWantlunch()&&isWantProceeding()){
            return super.fees()*0.5+20;
        }
        return super.fees()*0.5;
    }
    @Override
    public void printInfo() {

        System.out.println(getFullName());
        System.out.println(isWantProceeding());
        System.out.println(isWantlunch());
        System.out.println(fees());
    }
}
