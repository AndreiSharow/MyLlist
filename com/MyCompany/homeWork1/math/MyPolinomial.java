package com.MyCompany.homeWork1.math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyPolinomial {
    private double[] coef;
    Map<Integer,String> downMap = new HashMap<>();
    Map<Integer,String> upMap2 =new HashMap<>();




       public  MyPolinomial(double... coef){
           //переворачиваем массив справа на лево по условию  "коэффициенту c0 соотвествует индекс 0"
           this.coef=reverse(coef);;

       }

       public int getDegree(){
        return coef.length-1;
       }



       public MyPolinomial add(MyPolinomial myPolinomial){
            MyPolinomial polinom;
            double[] massive=coef.clone();
            double[] massive2=myPolinomial.coef.clone();

           for(int i=0;i<massive.length;i++){
            massive[i]+=massive2[i];
           }

           polinom=new MyPolinomial(massive);
            return polinom;
       }


       public MyPolinomial multiplu(MyPolinomial polinomial){



           double[] thisPolinom=Arrays.copyOf(coef,coef.length);
           double[] otherPolinom=Arrays.copyOf(polinomial.coef,polinomial.coef.length);


           double []tempMassive=new double[(this.coef.length+polinomial.coef.length)-1];
           double[][]bufferMassive=new double[thisPolinom.length][otherPolinom.length];

           for(int i=0;i<thisPolinom.length;i++){
               for(int b=0;b<otherPolinom.length;b++){
                   bufferMassive[i][b]=thisPolinom[i]*otherPolinom[b];
               }
           }






           return recursionPolinom(tempMassive,0,bufferMassive.length,0,bufferMassive);
       }



       private MyPolinomial recursionPolinom(double[] mas1,int i,int lenghtMassive,int startSum,double[][] massive){
           int b=i;
           int positionMassive=startSum;


           if(lenghtMassive==0){
               MyPolinomial polinom=new MyPolinomial(mas1);
               return polinom;

           }
           for (int c = 0; c < massive[b].length; c++, positionMassive++) {
               mas1[positionMassive] += massive[b][c];
           }
           startSum++;
           b++;
           lenghtMassive--;

           return recursionPolinom(mas1, b, lenghtMassive, startSum, massive);





       }
        //reverse massive
       private double[] reverse(double[] massive){
           double[] reverseMassive=new double[massive.length];

           for(int i=massive.length-1,b=0; i>=0;i--,b++){
               reverseMassive[b]=massive[i];
           }
           return reverseMassive;
       }
@Override
    public int hashCode() {
        return Objects.hash(this.coef,this.downMap,this.upMap2);
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
        MyPolinomial myPolinomial=(MyPolinomial)obj;
        
        return this.coef.equals(myPolinomial.coef) && this.downMap.equals(myPolinomial.downMap) && this.upMap2.equals(myPolinomial.upMap2);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();


        Map<Integer,String> up=new CharUpAndDown().getUpMap();
        Map<Integer,String> down=new CharUpAndDown().getDownMap();


        for(int i=0,b=coef.length-1;i<coef.length;i++,b--){
            if(i==coef.length-1){
                builder.append(coef[i]+""+down.get(b)+"x"+up.get(b));
                break;
            }
            builder.append(coef[i]+""+down.get(b)+"x"+up.get(b)+"+");


        }


        return builder.toString();


    }
}
