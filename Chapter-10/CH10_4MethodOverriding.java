package com.Rahulaghan;

class A{
    public int a;
    public int Rahul(){
        return 7;
    }
    public void math2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void math2(){
        System.out.println("I am a method 2 of class B");
    }
    public void math3(){
        System.out.println("I am a method 3 of class B");
    }
}
public class CH10_4MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.math2();

        B b = new B();
        b.math2();
    }
}
