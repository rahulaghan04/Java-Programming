/*Question: Write a program to calculate percentage of a given student in CBSE board exam
            His marks form 5 subjects must be taken as input from the keyword
            (Marks are out of 100)*/
package com.Rahulaghan;
import java.util.Scanner;

public class CH1_Exercise_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Sub1 marks are: ");
        float subject1 = sc.nextInt();

        System.out.println("The Second Sub2 marks are: ");
        float subject2 = sc.nextInt();

        System.out.println("The Third Sub3 marks are: ");
        float subject3 = sc.nextInt();

        System.out.println("The Four Sub4 marks are: ");
        float subject4 = sc.nextInt();

        System.out.println("The Five Sub5 marks are: ");
        float subject5 = sc.nextInt();

        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float average = (totalMarks/500) * 100;
        System.out.println("The percentage are: "+average);
    }
}
