package com.Rahulaghan;

import java.util.Scanner;

public class CH14_1TypesOfErrors {
    public static void main(String[] args) {
        //1. Syntax error
        // Syntax error Demo
        //int a = 5 --->Missing semicolon, Syntax error occurred.
        //System.out.println(a);
        //d = 5;--->Variable not define, Syntax error occurred.

        //2. Logical error
        //Logical error matlab program me bug hona.
        //e.g. 1) Message delivered wrongly.
        //     2) Incorrect redirects!.
        //Logical error Demo
        //WAP to print all prime numbers between 1 to 10.
        /*System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1); //isme 9 bhi print hoga but 9 to prime number nhi to
                                       // ye program me logical error hai.
        }*/

        //3. Runtime error
        // Runtime error also called Exception.
        // Runtime error Demo
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 100 divided by k is "+100/k);
    }
}
