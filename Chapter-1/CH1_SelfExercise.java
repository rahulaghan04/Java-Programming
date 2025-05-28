package com.Rahulaghan;
import java.util.Scanner;
public class CH1_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Convert Temperature Fahrenheit to Celsius.
        System.out.println("Enter the temperature in Fahrenheit: ");
        float temperature = sc.nextFloat();
        float celsius = (temperature - 32)*5/9;
        System.out.println("Fahrenheit to Celsius: "+celsius);

        //2. Convert inches to meters.
        /*System.out.println("Enter the number of Inch: ");
        float inch = sc.nextFloat();
        float meters = inch * 0.0254f;
        System.out.println("Inches to Meters: "+meters);*/

        //3.Reads an integer between 0 and 1000 and adds all the digits in the integer.
        /*System.out.println("Enter the number between 0 to 1000: ");
        int num = sc.nextInt();
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sumOf = thirdDigit + secondDigit + firstDigit + fourthDigit;
        System.out.println("Sum of the integer: "+sumOf);*/

        //4. Convert minutes into years and days.
        /*System.out.println("Enter the Minutes: ");
        long minutes = sc.nextLong();
        long years = minutes / 525600L;
        long days = (minutes % 525600L) / 1440;
        System.out.println(minutes+" minutes is "+years+" Years and "+days+" Days");*/

        //5. Compute the body mass index (BMI).
        /*System.out.println("Enter the weight in pounds: ");
        float weight = sc.nextFloat();
        System.out.println("Enter the height in inches: ");
        float height = sc.nextFloat();
        double body_mask_index = (weight * 0.45359237) /(height * 0.0254 * height * 0.0254);
        System.out.println(body_mask_index);*/

        //6. Calculate speed.
        /*System.out.println("Enter the Distance in Meters: ");
        float distance = sc.nextInt();
        System.out.println("Enter the hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Enter the seconds: ");
        int seconds = sc.nextInt();
        float timeInSeconds = (hours * 3600)+(minutes * 60)+seconds;
        float speed1 = distance/ timeInSeconds;
        float speed2 = (distance / 1000.0f) / (timeInSeconds/3600.0f);
        float speed3 = speed2 / 1.609f;
        System.out.println(speed1);
        System.out.println(speed2);
        System.out.println(speed3);*/

        //7. Display square, cube, fourth power of a number n.
        /*System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        int square = num1 * num1;
        int cube = num1 * num1 * num1;
        double forthPower = Math.pow(num1, 4);
        System.out.println("Square of the "+num1+" is "+square);
        System.out.println("Cube of the "+num1+" is "+cube);
        System.out.println("Fourth Power of the "+num1+" is "+forthPower);*/

        //8.compute the floor division and floor modulus of the given dividend and divisor.
        /*System.out.println("Enter the dividend: ");
        int x = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int y = sc.nextInt();
        System.out.println("floor division: "+(x/y));
        System.out.println("floor division using floor div() method: "+Math.floorDiv(x,y));
        System.out.println("floor modulus: "+(x%y));
        System.out.println("floor division using floor mod() method: "+Math.floorMod(x,y));*/
    }
}
