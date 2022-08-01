package com.company;

public class Kitchen {

    Lamp lamp= new Lamp();
    String stove;
    String refrigerator;
    String table;
    String oven;
    String sink;
    String dishwasher;
    public Kitchen(){

    }

    public Kitchen(Lamp lamp, String stove, String refrigerator, String table, String oven, String sink, String dishwasher) {
        this.lamp = lamp;
        this.stove = stove;
        this.refrigerator = refrigerator;
        this.table = table;
        this.oven = oven;
        this.sink = sink;
        this.dishwasher = dishwasher;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public String getStove() {
        return stove;
    }

    public void setStove(String stove) {
        this.stove = stove;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(String oven) {
        this.oven = oven;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(String dishwasher) {
        this.dishwasher = dishwasher;
    }
}
