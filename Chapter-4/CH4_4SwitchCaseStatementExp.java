package com.Rahulaghan;
import java.util.Scanner;
public class CH4_4SwitchCaseStatementExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Favourite Movie is: ");
        int Movies = sc.nextInt();
        switch (Movies) {
            case 1:
                System.out.println("Pathan");
                break;
            case 2:
                System.out.println("Jawan");
                break;
            case 3:
                System.out.println("Animal");
                break;
            case 4:
                System.out.println("Pushpa");
                break;
            case 5:
                System.out.println("KGF Chapter 1 & 2");
                break;
            default:
                System.out.println("None of these");
                break;
        }
        System.out.println("Thanks for your Feedback.");
    }
}
