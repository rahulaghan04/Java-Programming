package com.Rahulaghan;

public class CH7_3VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    static int sum(int x, int ...arr){ //x is compulsory to add
    //static int sum(int ...arr){
       //Available as int [] arr;
        int result = x;
        //int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("The sum of 3 and 5 is: "+sum(3, 5));
        System.out.println("The sum of 3, 5 and 6 is: "+sum(3, 5,6));
        System.out.println("The sum of 3, 5, 6 and 7 is: "+sum(3, 5,6,7));
    }
}
