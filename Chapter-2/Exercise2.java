package com.Rahulaghan;

import java.util.Scanner;
import java.util.Random;
public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor.");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int computerInput = rand.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw the match!");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Win!");
        }
        //System.out.println("Computer Choice: "+computerInput);
        if(userInput >= 3){
            System.out.println("Invalid choice");
        }
        else if (computerInput == 0) {
            System.out.println("Computer Choice: Rock");
        }
        else if (computerInput == 1) {
            System.out.println("Computer Choice: Paper");
        }
        else {
            System.out.println("Computer Choice: Scissor");
        }
    }
}

