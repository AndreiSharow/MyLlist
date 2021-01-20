package com.MyCompany.homeWork1.Ball;

import java.sql.SQLOutput;

public class Test {


    public static void main(String[] arg){

        Ball ball=new Ball(1,2,3,4,5);
        Ball ball2=new Ball(1,2,3,4,5);
        System.out.println(ball.equals(ball2));
        System.out.println(ball.hashCode());
        System.out.println(ball2.hashCode());

    }

}
