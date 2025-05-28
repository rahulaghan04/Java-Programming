package com.Rahulaghan;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am toString()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age is cannot be greater than 110.";
    }
    @Override
    public String getMessage(){
        return "Make sure the value value of age entered is correct.";
    }
}
public class CH14_4ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        int age = sc.nextByte();
        if(age < 110){
        //if(a < 9){
            try {
                //throw new MyException(); --->Custom Exception
                //throw new ArithmeticException("This is an exception.");
                throw new MaxAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("All finished.");
        }
    }
}
