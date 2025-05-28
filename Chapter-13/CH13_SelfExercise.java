package com.Rahulaghan;

//Q1.Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
/*class ThreadExp extends Thread{
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
}
public class CH13_SelfExercise {
    public static void main(String[] args) {
        ThreadExp threadExp = new ThreadExp();
        threadExp.start();
    }
}*/

//Q2. Write a Java program that creates two threads to find and print even and odd numbers from
    // 1 to 20.
class EvenNum extends Thread{
    @Override
    public void run() {
        System.out.println("Even Numbers: ");
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
class OddNum extends Thread{
    @Override
    public void run() {
        System.out.println("Odd Numbers: ");
        for (int i = 1; i <= 20; i++){
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
public class CH13_SelfExercise {
    public static void main(String[] args) {
        EvenNum evenNum = new EvenNum();
        evenNum.start();
        OddNum oddNum = new OddNum();
        oddNum.start();
    }
}