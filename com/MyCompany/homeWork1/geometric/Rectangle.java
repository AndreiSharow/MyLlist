package com.MyCompany.homeWork1.geometric;

import java.util.Objects;

public class Rectangle {

    private float lenght=1.0f;
    private float width=1.0f;

       public  Rectangle(){

       }

       public Rectangle(float lenght, float width){
           this.lenght=lenght;
           this.width=width;
       }

            public float getLenght(){
                   return  lenght;
            }

            public float getWidth() {
                return width;
            }

            public void setLenght(float lenght) {
                this.lenght = lenght;
            }

            public void setWidth(float width) {
                this.width = width;
            }
            public double getArea(){
            return width*lenght;
            }
            public double getPerimetr(){
           return 2*(width+lenght);
            }
    @Override
    public int hashCode() {
        return Objects.hash(this.lenght,this.width);
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
           Rectangle rectangle=(Rectangle)obj;


        return this.lenght==rectangle.lenght && this.width==rectangle.width;
    }

            @Override
            public String toString() {
                return "Rectangle{" +
                        "lenght=" + lenght +
                        ", width=" + width +
                        '}';
            }
}
