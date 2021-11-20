package com.lanou;
public class Rectangle {
    private double x;
    private double y;
    private int lenth;
    private int height;

    public Rectangle(double x, double y, int lenth, int height) {
        this.x = x;
        this.y = y;
        this.lenth = lenth;
        this.height = height;
    }
    public void area(){
        System.out.println("面积为："+lenth*height);
    }
    public void perimeter(){
        System.out.println("周长为："+(lenth+height));
    }
    public void intesect(double x,double y){
        if(Math.abs(this.x-x)<lenth&&Math.abs(this.y-y)<height){
            System.out.println("两个矩形相交");
        }
        else {
            System.out.println("两个矩形不相交");
        }
    }
    public String center(){
        double centerSpot_x=x+(lenth/2);
        double centerSpot_y=y-(height/2);
        return "中心点为：("+centerSpot_x+","+centerSpot_y+")";
    }


}
