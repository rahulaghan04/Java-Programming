package com.Rahulaghan;
import java.util.Scanner;
public class CH3_1StringExample {
    public static void main(String[] args){
        /*String name = new String("Rahul"); //hum ye dono way se string bana sakte hai.
        String name = "Rahul";*/

        //Different ways to print strings
        /*System.out.print("Name is: ");
        System.out.println(name);*/


        /*int a = 23;
        double b = 43.567;
        System.out.printf("The value of a is %d and The value of b is %f%n",a,b);
        System.out.format("The value of a is %d and The value of b is %f",a,b);*/
        //%2.f matlab only 2 decimal point print honge

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
