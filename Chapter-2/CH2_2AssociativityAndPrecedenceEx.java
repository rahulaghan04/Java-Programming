package com.Rahulaghan;

public class CH2_2AssociativityAndPrecedenceEx {
    public static void main(String[] args){
        int a = 6*5+30/2-5; //Precedence ------> *,/,-,+
        int b = 60/5-30*2; //Associativity -------> jo pahle rahega wo implement hoga.
        System.out.println(a);
        System.out.println(b);

        //Quiz
        /*int x = 8;
        int y = 4;
        int z = 2;
        int k = x-y/2;  //6
        int k = x*x-4*x*z/2*x; //-192
        int k = x*x-y*y; //48
        int k = x*y-z; //30
        System.out.println(k);*/
    }
}
