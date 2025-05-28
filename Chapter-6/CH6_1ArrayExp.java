package com.Rahulaghan;

public class CH6_1ArrayExp {
    public static void main(String[] args) {
        //There are 3 ways to create arrays
        //1) first way: Declaration and memory allocation
        /*int [] marks = new int [5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 20;  //array ki value change bhi kar sakte hai
        marks[4] = 10;
        //marks[5] = 100; ----> throw an error
        System.out.println(marks[5]);*/

        //2) second way : Declaration and then memory allocation
        /*int [] marks1;
        marks1 = new int[5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 20;
        marks[4] = 10;
        System.out.println(marks[3]);*/

        //3) third way: Declaration, memory allocation and initialization together
        int [] marks3 = {100,90,80,70,60};
        System.out.println(marks3[4]);
    }
}
