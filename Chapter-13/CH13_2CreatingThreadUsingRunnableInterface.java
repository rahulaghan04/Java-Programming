package com.Rahulaghan;

//Second Way to create threads.
class MyTreadRunnableInterface1 implements Runnable{
    public void run(){
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
        System.out.println("My name is Thread1.");
    }
}
class MyTreadRunnableInterface2 implements Runnable{
    public void run(){
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
        System.out.println("My name is Thread2.");
    }
}
public class CH13_2CreatingThreadUsingRunnableInterface {
    public static void main(String[] args) {
        MyTreadRunnableInterface1 remote = new MyTreadRunnableInterface1();
        Thread cell1 = new Thread(remote);

        MyTreadRunnableInterface2 smartRemote = new MyTreadRunnableInterface2();
        Thread cell2 = new Thread(smartRemote);

        cell1.start();
        cell2.start();
    }
}
