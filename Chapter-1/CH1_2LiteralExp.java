package com.Rahulaghan;
public class CH1_2LiteralExp {
    public static void main(String[] args){
        //ye sub integers value print karne ke liye use karte hai
        byte age = 20;
        short Age = 28;
        int Age1 = 30;
        long lng = 45878669989L; // ye L hume isliye dena padta hai kyu ki compiler ko pta chalna chahiye ki ye long value hai

        float Num1 = 18.6f; //f isliye lagana padta hai kyu ki compiler ko pta chale ki ye float value hai
        double Num2 = 27.56; //isme bhi d lagaya to chalta hai

        char name = 'R'; //isme sirf one single letter hi dal sakte hai
        boolean name1 = true; //isme value true or false dal sakte hai

        //byte, short, int, long
        System.out.println(age);
        System.out.println(Age);
        System.out.println(Age1);
        System.out.println(lng);

        //float, double
        System.out.println(Num1);
        System.out.println(Num2);

        //char, boolean
        System.out.println(name);
        System.out.println(name1);

        System.out.println("Byte Maximum store value: "+Byte.MAX_VALUE);
        System.out.println("Byte Minimum store value: "+Byte.MIN_VALUE);

        System.out.println("Short Maximum store value: "+Short.MAX_VALUE);
        System.out.println("Short Minimum store value: "+Short.MIN_VALUE);

        System.out.println("Integer Maximum store value: "+Integer.MAX_VALUE);
        System.out.println("Integer Minimum store value: "+Integer.MIN_VALUE);

        System.out.println("Long Maximum store value: "+Long.MAX_VALUE);
        System.out.println("Long Minimum store value: "+Long.MIN_VALUE);

        System.out.println("Float Maximum store value: "+Float.MAX_VALUE);
        System.out.println("Float Minimum store value: "+Float.MIN_VALUE);

        System.out.println("Double Maximum store value: "+Double.MAX_VALUE);
        System.out.println("Double Minimum store value: "+Double.MIN_VALUE);

        System.out.println("Char Maximum store value: 65535");
        System.out.println("Char Minimum store value: 0");

        System.out.println("Boolean value: True or False");
    }
}
