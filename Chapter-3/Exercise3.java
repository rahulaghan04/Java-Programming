package com.Rahulaghan;

public class Exercise3 {
    static int fibonacci(int n){
        //Fibonacci = Fn = Fn-1 +Fn-2
        if(n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacci(n));
    }
}
