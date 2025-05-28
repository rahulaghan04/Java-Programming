package com.Rahulaghan;

abstract class Base2{
    public Base2(){
        System.out.println("I am constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello brother");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child1 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Night!");
    }
    @Override
    public void greet2() {
        System.out.println("Good Morning!");
    }
}
abstract class Child2 extends Base2{
    public void th() {
        System.out.println("I am Good");
    }
}
public class CH11_1AbstractClassAndMethods {
    public static void main(String[] args) {
        //Base2 b = new Base2(); //ye ek abstract class hai aur abstract class ka object nhi bana sakte.
        Base2 b = new Child1();
        Child1 child1 = new Child1();
    }
}
