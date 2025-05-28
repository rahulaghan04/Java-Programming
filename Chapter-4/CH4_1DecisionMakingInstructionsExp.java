package com.Rahulaghan;
import java.util.Scanner;
public class CH4_1DecisionMakingInstructionsExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
//        if(age>18){ //greater than
//        if(age!=18){ //not equals to
//        if(18<age){ //less than
//        if(age==18){ //equals to
        if(age>=18){ //greater than or equals to
            System.out.println("Yes, you can drive.");
        }
        else {
            System.out.println("No, you cannot drive yet.");
        }
    }
}