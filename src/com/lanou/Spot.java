package com.lanou;

public class Spot {
    private double x;
    private double y;


    public Spot() {
    }

    public Spot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "点坐标为：("+x+","+y+")";
    }

    public void distence(int x, int y){
        double distence=Math.sqrt(Math.pow(Math.abs(this.x-x),2)+Math.pow(Math.abs(this.y-y),2));
        System.out.println(distence);
    }
}
