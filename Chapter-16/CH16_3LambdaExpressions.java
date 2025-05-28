package com.Rahulaghan;

@FunctionalInterface
interface DemoAno{
    void meth1();
//    void meth2();
}
class MyFunction implements DemoAno{

    @Override
    public void meth1() {
        System.out.println("This is Method.");
    }
}
//class AnonymousDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("This is Meth1.");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("This is Meth2.");
//    }
//}
public class CH16_3LambdaExpressions {
    public static void main(String[] args) {
//        AnonymousDemo obj = new AnonymousDemo();
//        obj.meth1();
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("This is Meth1.");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is Meth2.");
//            }
//        };
//        obj.meth1();

        //Lambda Expressions
//        DemoAno obj = new MyFunction();
//        obj.meth1();

        DemoAno obj = ()->{System.out.println("This is Method from the lambda.");};
        obj.meth1();
    }
}
