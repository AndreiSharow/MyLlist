package com.MyCompany.homeWork1.math;

import java.util.Objects;

public class MyComplex {
    private  double real=0.0;
    private double imag=1;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }


    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
    this.real=real;
    this.imag=imag;
    }

    public boolean isReal(){
        if(real>0 || real<0){
            return true;
        }else {
            return false;
        }
    }

    public  boolean   isImaginary(){
        if(imag>0 || imag<0){
            return true;
        }else {
            return false;
        }
    }

    public double magnitude(){
        return  Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public double argument(){
        return  Math.atan(imag/real);
    }

    public MyComplex conjugate(){

        return  new MyComplex(real,(imag*(-1)));
    }



    public boolean equals(MyComplex obj) {
        if(obj==null){
            return false;
        }

        if(this.real==obj.real && this.imag==obj.imag){
            return true;
        }else {
            return false;
        }
    }

    public boolean equals(double real,double imag){

        if(this.real==real && this.imag==imag){
            return true;
        }else {
            return false;
        }
    }

    public MyComplex add(MyComplex right){

        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex complex=new MyComplex(this.real,this.imag);
        complex.add(right);
        return complex;
    }
    public MyComplex substract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }
    public MyComplex substractNew(MyComplex right){
        MyComplex complex=new MyComplex(this.real,this.imag);
        complex.substract(right);
        return complex;
    }

    public MyComplex multiply(MyComplex right){
        double a=this.real*right.real+((this.imag*right.imag)*(-1));
        double d=this.real*right.imag+this.imag*right.real;
        this.real=a;
        this.imag=d;

        return this;
    }
    public MyComplex devide(MyComplex right){
        double real1=this.real*right.real+((this.imag*(right.imag*(-1)))*(-1));
        double image1=this.real*(right.imag*(-1))+this.imag*right.real;
        double delim=Math.pow(right.real,2)+Math.pow(right.imag,2);

        return new MyComplex(real1/delim,image1/delim);
    }
@Override
    public int hashCode() {
        return Objects.hash(this.imag,this.real);
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
        MyComplex complex=(MyComplex)obj;
        
        
        return this.real==complex.real && this.imag==complex.imag;
    }


    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +'i'+
                '}';
    }
}
