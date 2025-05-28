package com.Rahulaghan;

public class CH5_3ForLoopExp {
    public static void main(String[] args) {
        //incrementing for loop
        /*for(int a = 1; a <= 10; a++){
            System.out.println(a);
        }*/

        //even numbers = 2n = 0,2,4,6,8
        int n = 10;
        for(int i=0; i<n; i++){
            System.out.println(2*i);
        }

        //odd numbers = 2n+1 = 1,3,5,7,9
        /*int n = 10;
        for(int i=0; i<n; i++){     //n ki jagah hum 10 bhi likh sakte hai
            System.out.println(2*i+1);
        }*/

        //decrementing for loop
        /*for(int i = 5; i >= 0; i-- ) {
            System.out.println(i);
        }*/

        //Quick quiz: print first n natural numbers in reverse order
        /*for(int c=10; c!=0; c--){
            System.out.println(c);
        }*/
    }
}
