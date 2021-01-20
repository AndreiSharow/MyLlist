package com.MyCompany.homeWork1;

import java.util.Objects;

public class MyPoint {
private int x=0;
private int y=0;
    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }



    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }

    public  double distance(MyPoint another){
        int x2=another.getX();
        int y2=another.getY();
        return distance(x2,y2);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        MyPoint myPoint=(MyPoint)obj;

        return this.x==myPoint.x && this.y==myPoint.y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
