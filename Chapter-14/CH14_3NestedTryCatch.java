package com.Rahulaghan;
import java.util.Scanner;

public class CH14_3NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 78;
        marks[1] = 58;
        marks[2] = 45;
        marks[3] = 67;
        marks[4] = 41;
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the index value: ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to Intellij Idea.");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in Level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in Level 1");
        }*/

        //Quick quiz:WAP that allows you to keep accessing an array until a valid index is
                     // given by the user.
        boolean flag = true;
        while (flag){
            System.out.println("Enter the index value: ");
            int ind = sc.nextInt();
            try{
                System.out.println("Welcome to Intellij Idea.");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in Level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Program is ended!");
    }
}
