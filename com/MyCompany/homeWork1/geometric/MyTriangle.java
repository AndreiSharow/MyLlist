package com.MyCompany.homeWork1.geometric;

import java.util.Objects;

public class MyTriangle {
    private MyPoint v1,v2,v3;

        public MyTriangle(int x1,int y1,int x2, int y2,int x3,int y3){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
        }

        public MyTriangle(MyPoint v1,MyPoint v2, MyPoint v3){
            this.v1=v1;
            this.v2=v2;
            this.v3=v3;
        }

        private double getDistance(){
            double lengthV1andV2=v1.distance(v2);
            double lenghtV2andV3=v2.distance(v3);
            double lenghtV3andV1=v3.distance(v1);
            return lengthV1andV2+lenghtV2andV3+lenghtV3andV1;
        }

        public double getPerimeter(){
            return getDistance();
        }
        public String getType(){


            if(v1.distance(v2)==v2.distance(v3) || v1.distance(v2)==v3.distance(v1) || v2.distance(v3)==v3.distance(v1))
            {
            return "Isosceles";   
            }else {
                return "Scalene";
            }
        }
     @Override
    public int hashCode() {
        return Objects.hash(this.v1,this.v2,this.v3);
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
            MyTriangle myTriangle=(MyTriangle)obj;
            
            
            
        return  this.v1==myTriangle.v1 && this.v2==myTriangle.v2 && this.v3==myTriangle.v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}
