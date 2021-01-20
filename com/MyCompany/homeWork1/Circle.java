package com.MyCompany.homeWork1;

import java.util.Objects;

public class Circle {
    private  double radius=1.0;
    private String color="red";


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public double getArea(){
        return  Math.PI*Math.pow(radius,2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color,this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        Circle circle=(Circle)obj;

        return this.radius==circle.radius && this.color==circle.color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
