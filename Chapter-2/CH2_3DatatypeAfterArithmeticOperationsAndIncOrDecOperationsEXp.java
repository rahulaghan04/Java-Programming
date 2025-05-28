package com.Rahulaghan;

public class CH2_3DatatypeAfterArithmeticOperationsAndIncOrDecOperationsEXp {
    public static void main(String[] args){
        //R = b + s ----> integer
        /*byte a = 5;
        short b = 7;*/ //12

        //R = s + i ----> integer
        /*short a = 6;
        int b = 7;*/ //13

        //R = l + f ----> float
        /*long a = 567L;
        float b = 34.5f;*/ //601.5

        //R = i + f ----> float
        /*int a = 12;
        float b = 23.9f;*/ //35.9

        //R = c + i ----> integer
        /*char a = 'R';
        int  b = 12;*/ //94

        //R = c + s ----> integer
        /*char a = 'R';
        short  b = 2;*/ //84

        //R = l + d ----> double
        /*long a = 5675;
        double b = 55.555;*/ //5730.555

        //R = f + d ----> double
        /*float a = 55.5f;
        double b = 55.555; //111.055
        System.out.println(a+b);*/


        //Increment or Decrement Operations
        /*int b = 30;
        int b = 20;
        int b = a++; //pahle b assign hoga a ko aur fir a increment hoga (30)
        int b = ++a; //pahle a increment hoga fir b assign hoga a ko (31)
        System.out.println(b++); //30
        System.out.println(b); //31
        System.out.println(++b); //32
        System.out.println(b);*/ //32

        /*int a = 30;
        int b = ++a*6;
        System.out.println(b); //186
        System.out.println(++b); //187
        System.out.println(b++); //187
        System.out.println(b);*/ //188

        //character increment
        char ch='a';
        System.out.println(++ch);
    }
}
