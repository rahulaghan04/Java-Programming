package com.Rahulaghan;

//First way to create thread.
class MyTread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("My thread1 is Eating.");
            System.out.println("namm....namm.....namm......");
            i++;
        }
    }
}
class MyTread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("My thread2 is Sleeping.");
            System.out.println("urr....urrr....urrrrrr....");
            i++;
        }
    }
}
public class CH13_1CreatingThreadByExtendingThreadClass {
    public static void main(String[] args) {
        MyTread1 myTread1 = new MyTread1();
        MyTread2 myTread2 = new MyTread2();
        myTread1.start();
        myTread2.start();
    }
}
