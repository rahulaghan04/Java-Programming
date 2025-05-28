package com.Rahulaghan;

public class CH6_2ArrayForEachLoopExp {
    public static void main(String[] args) {
        /*String [] students = {"Rahul","Rohan","Arjun","Akash","Roshan"};
        System.out.println(students[0]);
        System.out.println(students.length);*/

        int [] marks = {100,90,80,70,60};
//        System.out.println(marks[1]);
//        System.out.println(marks.length); //array length

        /*for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]); //array traversal
        }*/

        //Quick quiz: in reverse order
        /*for(int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]); //array traversal
        }*/

        //For each loop
        for(int element: marks){
            System.out.println(element);
        }
    }
}
