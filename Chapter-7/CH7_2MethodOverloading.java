package com.Rahulaghan;

public class CH7_2MethodOverloading {
    static void tellJoke(){
        System.out.println("I invented new word!\n" + "Plagiarism!");
    }
    static void change(int a){
        a = 67;
    }
    static void fresh(){
        System.out.println("Good Morning Bhai!");
    }
    static void fresh(String a){
        System.out.println("Good Morning " +a+ " Bhai!");
    }
    static void fresh(int a, int b){
        System.out.println("Good Morning " +a+ " Bhai!");
        System.out.println("Good Morning " +b+ " Bhai!");
    }
    public static void main(String[] args) {
        //tellJoke();
        //int [] arr = {1,2,3,4,5,6};
        //changing the integer.
        /*int x = 7;
        change(x);
        System.out.println("The changed value of the x: "+x);*/

        //changing the array.
        /*int [] arr = {1,2,3,4,5,6};
        change1(arr);
        System.out.println("The changed value of the x: "+arr[0]);*/

        //Method overloading
        fresh();
        fresh("Rahul");
        fresh(20,40); //arguments are actual!. arguments = 20, 40
    }
}
