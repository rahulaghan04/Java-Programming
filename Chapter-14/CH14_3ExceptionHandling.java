package com.Rahulaghan;
import java.util.Scanner;

public class CH14_3ExceptionHandling {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 78;
        marks[1] = 58;
        marks[2] = 45;
        marks[3] = 67;
        marks[4] = 41;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the Number you want to divide the value with: ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The divided value of array-value/number is: "+(float)marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred!");
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Array Index Out Of Bounds Exception Occurred!");
        }
        catch (Exception e2){
            System.out.println("Some Other Exception Occurred!");
            System.out.println(e2);
        }
    }
}
