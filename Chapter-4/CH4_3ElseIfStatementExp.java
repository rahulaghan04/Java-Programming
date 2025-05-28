package com.Rahulaghan;
import java.util.Scanner;
public class CH4_3ElseIfStatementExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage: ");
        int Marks = sc.nextInt();
        if (Marks > 100) {
            System.out.println("Enter valid marks!");
        }
        else if (Marks >= 90) {
            System.out.println("Pass, Grade A");
        }
        else if (Marks>=75) {
            System.out.println("Pass, Grade B");
        }
        else if (Marks>=65) {
            System.out.println("Pass, Grade C");
        }
        else if (Marks>=55) {
            System.out.println("Pass, Grade D");
        }
        else if (Marks>=35) {
            System.out.println("Pass, Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
