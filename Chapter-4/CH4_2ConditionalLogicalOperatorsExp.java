package com.Rahulaghan;

public class CH4_2ConditionalLogicalOperatorsExp {
    public static void main(String[] args) {
        //ye operator multiple value ko print karane ke liye bhi use kar sakte hai. e.g. (A && B && C && D)

        /*System.out.println("Logical operator AND....");
        boolean A = true; //T && T ----> T
        boolean B = true;

        boolean A = true; //T && F ----> F
        boolean B = false;

        boolean A = false; //F && F ----> F
        boolean B = false;

        boolean A = false; //F && T ----> F
        boolean B = true;
        if(A && B){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }*/

        System.out.println("Logical operator OR.....");
        /*boolean A = true; //T || T ----> T
        boolean B = true;

        boolean A = true; //T || F ----> T
        boolean B = false;

        boolean A = false; //F || F ----> F
        boolean B = false;*/

        boolean A = false; //F || T ----> T
        boolean B = true;
        if(A || B){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("not (A) is :"+!A); //T ---> F
        System.out.println("not (B) is :"+!B); //F ---> T
    }
}
