package com.MyCompany.homeWork1.Ball;

import java.util.Objects;

public class Container {
    private int x1,y1,x2,y2;


    public Container(int x,int y,int width,int height){
    this.x1=x;
    this.y1=y;
    this.x2=width;
    this.y2=height;



    }


        public int getX(){
         return 0;
        }

        public int getY(){
        return 0;
        }

        public int getWidth(){
        return x2;
        }

        public int getHeight(){
        return y2;
        }

        public boolean collides(Ball ball){

            return  false;
        }

    @Override
    public int hashCode() {
        return Objects.hash(this.x1,this.x2,this.y1,this.y2);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return  true;
        }
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Container container=(Container)obj;

        return this.x1==container.x1 && this.x2==container.x2 && this.y1==container.y1 && this.y2==container.y2;
    }

    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
