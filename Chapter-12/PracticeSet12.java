package com.Rahulaghan;
//Question 1, 3 and 4 is solved in visual studio.

//Question 2. Use a built-in package in java to write a class which displays a message
// (by using sout) after taking input from the user.
import java.util.Scanner;
class Message{
    String greet = "Hello";
}
public class PracticeSet12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Message message = new Message();
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println(message.greet+", "+name);

    }
}
