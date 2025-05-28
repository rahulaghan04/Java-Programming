package com.Rahulaghan;

public class CH5_4BreakAndContinueExp {
    public static void main(String[] args) {
        /*for(int i=0; i<7; i++){
            System.out.println(i);
            System.out.println("Hello, Java");
            if(i==4) {
                System.out.println("Ending this loop!");
                break;
            }
        }*/

        //break statement for while loop
        /*int i=0;
        while (i<=5){
            System.out.println(i);
            System.out.println("Hello, Java");
            if(i==3) {
                System.out.println("Ending this loop!");
                break;
            }
            i++;
        }*/

        //break statement for do-while loop
        /*int i=0;
        do{
            System.out.println(i);
            System.out.println("Hello, Java");
            if(i==3) {
                System.out.println("Ending this loop!");
                break;
            }
            i++;
        }while (i<=6);*/

        //continue statement for, for loop
        /*for(int i=0; i<7; i++){
            if(i==4) {
                System.out.println("Ending this loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello, Java");
        }*/

        //continue statement for while loop
        int i=0;
        while (i<5){
            i++;
            if(i==3) {
                System.out.println("Ending this loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello, Java");
        }

        //continue statement for do-while loop
        /*int i=0;
        do{
            i++;
            if(i==3) {
                System.out.println("Ending this loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello, Java");
        }while (i<6);*/
    }
}
