package com.Rahulaghan;

class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run(){
        int i = 5;
        while (i <= 400) {
            System.out.println("Thank you!: "+this.getName());
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyThr3 extends Thread {
    public MyThr3(String name) {
        super(name);
    }

    public void run() {
        int i = 5;
        while (i <= 400) {
            System.out.println("Thank you!: " + this.getName());
            i++;
        }
    }
}
public class CH13_5ThreadMethods {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2("RAHUL");
        MyThr3 t2 = new MyThr3("ROSHAN");
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
