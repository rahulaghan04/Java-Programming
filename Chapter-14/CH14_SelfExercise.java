package com.Rahulaghan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

//Q6
/*class NegativeNumberException extends Exception{
    @Override
    public String getMessage() {
        return "This number is negative, Please enter the positive number.";
    }
}*/

public class CH14_SelfExercise {
    //Q1. Write a Java program to create a method that takes an integer as a parameter and
        // throws an exception if the number is odd.
    /*public static void oddNumberException(int num){
        try{
            oddNumber(num);
            System.out.println(num+" is even.");
        } catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void oddNumber(int num){
        if(num%2 != 0){
            throw new IllegalArgumentException(num+" is odd.");
        }
    }*/

    //Q2. Write a Java program that throws an exception and catch it using a try-catch block.
    /*public static void main(String[] args) {
        int num1 = 45;
        int num2 = 0;
        try {
            System.out.println(num1/num2);
        }catch (Exception e){
            System.out.println(e);
        }*/

        //Q2
        /*int num = 23;
        oddNumberException(num);
        num = 44;
        oddNumberException(num);

    }*/

    //Q3. Write a Java program that takes two integers as input and performs division. Handle
        // the ArithmeticException in case of division by zero.
    /*public static void main(String[] args) {
        int num1 = 11;
        int num2 = 0;
        try {
            System.out.println("Answer: "+num1/num2);
        } catch (Exception e){
            System.out.println(e+" Exception Occurred.");
        }
    }*/

    //Q4. Create an array of integers and try to access an index that is out of bounds.
        // Handle the ArrayIndexOutOfBoundsException.
    /*public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound Exception is occurred!");
        }
    }*/

    //Q5. Write a program that tries to read from a file. Handle the FileNotFoundException
        // if the specified file is not found.
    /*public static void main(String[] args) {
        File myFile = new File("Demo.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File has not found: "+e);
        }
    }*/

    //Q6. Create a custom exception class called NegativeNumberException. Write a program
        // that takes an integer as input and throws this exception if the number is negative.
    /*public static int negativeNum(int num) throws NegativeNumberException{
        if(num < 0){
            throw new NegativeNumberException();
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num1 = sc.nextInt();
        try {
            System.out.println(negativeNum(num1));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }*/

    //Q7. Write a program that performs some operations on user input. Handle both
        // InputMismatchException (for non-integer input) and ArithmeticException
        // (for division by zero).
    /*public static void divisionOperation(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();
        try {
            divisionOperation(num1,num2);
            System.out.print("Answer: ");
            System.out.println(num1/num2);
        } catch (InputMismatchException e){
            System.out.println(e+" Exception is Occurred.");
        } catch (ArithmeticException e1){
            System.out.println(e1+" Exception is Occurred.");
        } finally {
            sc.close();
        }
    }*/

    //Q8. Write a program that demonstrates the use of chained exceptions. Catch one
        // exception, and throw another exception with the caught exception as its cause.
    /*public static void performOperation(){
        try{
            int result = 34/0;
        } catch (ArithmeticException e){
            throw new RuntimeException("Arithmetic Exception will be Occurred.");
        }
    }
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (Exception e){
            throw new CustomChainedException("Zero Division error occur",e);
        }
    }
    static class CustomChainedException extends RuntimeException{
        public CustomChainedException(String message, Throwable cause){
            super(message,cause);
        }
    }*/

    //Q9. Create a program that uses a try-catch-finally block. Ensure that the finally
        // block is always executed, even if an exception occurs.
    /*public static int Division(int num1, int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        try {
            System.out.println(Division(70,7));
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception will be Occurred.");
        } finally {
            System.out.println("Finally Division is Done.");
        }
    }*/

    //Q10. Write a program that print a multiplication table of any user entered number and
        // also used finally block to print "Multiplication table of n is Printed".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print multiplication table of : ");
        int num = sc.nextInt();
        try{
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n",i,num,i*num);
            }
        } finally {
            System.out.println("Multiplication table of "+num+" is Printed.");
        }
    }

}
