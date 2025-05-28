package com.Rahulaghan;

//Thread(String name)
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 22;
        System.out.println("Thank you");
        while (true){
          //  System.out.println("I am a thread.");
        }
    }
}

/*class Thready implements Runnable{
    public Thready(Runnable r, String name){
        System.out.println(r);
    }
    public void run(){
        int i = 10;
        System.out.println("hello Bro.");
    }
}*/
public class CH13_3ThreadConstructors {
    public static void main(String[] args) {
        //1
        MyThread myThread = new MyThread("Rahul");
        MyThread myThread1 = new MyThread("Rakesh");
        myThread.start();
        myThread1.start();
        /*System.out.println("The id of the thread myThread is "+myThread.getId());
        System.out.println("The name of the thread myThread is "+myThread.getName());
        System.out.println("The id of the thread myThread1 is "+myThread1.getId());
        System.out.println("The name of the thread myThread1 is "+myThread1.getName());*/

        //2
//        Thready t1 = new Thready(20,"Rahul");
//        Thread t11 = new Thread(t1);
//        Thready t2 = new Thready();
//        Thread t22 = new Thread(t2);
    }
}
