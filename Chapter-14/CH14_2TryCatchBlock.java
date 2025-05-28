package com.Rahulaghan;

public class CH14_2TryCatchBlock {
    public static void main(String[] args) {
        int a = 60000;
        int b = 0;
        //int c = a/b;   //Arithmetic Exception
        //Exception Handled.
        try{
            int c = a/b;
            System.out.println("The result is: "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
    }
}
