package com.Rahulaghan;
import java.util.Scanner;

public class CH1_3getting_user_input_exp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Number is: ");
        int a = sc.nextInt();
        System.out.println("The Second Number is: ");
        int b = sc.nextInt();
        int sum = a + b;
        //float sum = a + b
        System.out.println("The Sum of two number is: "+sum);

        //System.out.println("Enter the Input: ");
        /*boolean b1 = sc.hasNextInt();
        System.out.println(b1);*/ //-->Op: 2  True, a  False

        /*String str = sc.next();
        System.out.println(str);*/ //-->OP: 2    return OP: 2
                                   //-->OP: Hello, Bro    ret OP: Hello

        /*String str = sc.nextLine();
        System.out.println(str);*/  //-->OP: My name is Rahul.
                                    //Return OP: My name is Rahul.
    }
}
