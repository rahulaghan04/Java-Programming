package com.Rahulaghan;

class Base1{
    Base1(){
        System.out.println("I am a Constructor...");
    }
    Base1(int a){
        System.out.println("I am a Overloaded Constructor with the value of a is: "+a);
    }
}
class DerivedBase1 extends Base1{
    DerivedBase1(){
        //super(0);
        System.out.println("I am a Derived Class Constructor....");
    }
    DerivedBase1(int a, int b){
        super(a);
        System.out.println("I am a Overloaded Constructor with the value of b is: "+b);
    }
}
class ChildDerivedBase1 extends DerivedBase1{
    ChildDerivedBase1(){
        System.out.println("I am Child of derived constructor....");
    }
    ChildDerivedBase1(int a, int b, int c){
        super(a,b);
        System.out.println("I am Child of derived constructor with value of c is: "+c);
    }
}
public class CH10_2Constructors_In_Inheritance {
    public static void main(String[] args) {
        //Base1 base1 = new Base1();
        //Base1 base1 = new Base1(1);
        //DerivedBase1 derivedBase1 = new DerivedBase1();
        //DerivedBase1 derivedBase1 = new DerivedBase1(12,34);
        //ChildDerivedBase1 childDerivedBase1 = new ChildDerivedBase1();
        ChildDerivedBase1 childDerivedBase1 = new ChildDerivedBase1(3, 4, 5);
    }
}
