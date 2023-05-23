package com.angel.bpitest;

public class Test {

    private BPI bpi;
    private Time time;

    public BPI getBpi() {
        return bpi;
    }

    public void setBpi(BPI bpi) {
        this.bpi = bpi;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Test{" +
                "bpi=" + bpi +
                ", time=" + time +
                '}';
    }
}
