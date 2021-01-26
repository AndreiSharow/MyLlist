package com.MyCompany.homeWork1.Ball;

import java.util.Objects;

public class Ball {
    private  float x;
    private float y;
    private int radius;
    private  float xDelta;
    private float yDelta;


    public Ball(float x, float y, int radius,int speed , int  direction ) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =(float)(speed* Math.cos(direction));
        this.yDelta =(float)((speed*(-1))*Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }


    //x=x+Δx, y = y+Δy
    public void move(){
    this.x+=xDelta;
    this.y+=yDelta;
    }

    public void  reflectHorizontal(){
        this.xDelta=-this.xDelta;
    }

    public void reflectVertical(){
        this.yDelta=-yDelta;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y,this.radius,this.xDelta,this.yDelta);
    }
    
     @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Ball ball=(Ball)obj;

        return this.y==ball.y && this.x==ball.x && this.yDelta==ball.yDelta && this.xDelta==ball.xDelta
                && this.radius==ball.radius;

    }

    @Override
    public String toString() {
        return "Ball[" + "("+x+""+y+"),"+"speed=("+ xDelta +","+ yDelta +")]";
                
    }
}
