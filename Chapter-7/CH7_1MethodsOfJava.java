package com.Rahulaghan;

public class CH7_1MethodsOfJava {
    //create method.
    /*static int logic(int a, int b){
        int c;
        if(a>b){
            c = a+b;
        }
        else {
            c = (a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z;
        z = logic(x,y);
        System.out.println(z);
    }*/

    //calling a method.
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = a+b;
        }
        else {
            c = (a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z;
        CH7_1MethodsOfJava obj = new CH7_1MethodsOfJava();
        z = obj.logic(x, y);
        System.out.println(z);
    }
}
