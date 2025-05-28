package com.Rahulaghan;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 5;
        while (i <= 400) {
            System.out.println("Thank you!, " + this.getName());
        }
    }
}
public class CH13_4ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Devendra");
        MyThr1 t2 = new MyThr1("Omkar");
        MyThr1 t3 = new MyThr1("Pratik");
        MyThr1 t4 = new MyThr1("Bhushan");
        MyThr1 t5 = new MyThr1("Subodh (most priority)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
