package com.Rahulaghan;

import java.util.Scanner;
public class CH5_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1. WAP to print all natural numbers from 1 to n using while loop.
        /*int i = 1;
        System.out.println("All natural numbers from 1 to 10: ");
        while (i<=10){
            System.out.println(i);
            i++;
        }*/

        //Q2. WAP to print all even numbers between 1 to 100 using while loop.
        /*int start = 1;
        int end = 100;
        System.out.println("All odd number between "+start+" to "+end);
        while(start <= end){
            if(start%2 == 0){
                System.out.println(start);
            }
            start++;
        }*/

        //Q3. WAP to print all odd number between 1 to 100 using while loop.
        /*int start = 1;
        int end = 100;
        System.out.println("All odd number between "+start+" to "+end);
        while(start <= end){
            if(start%2 != 0){
                System.out.println(start);
            }
            start++;
        }*/

        //Q4. WAP to print sum of all even numbers between 1 to n using while loop.
        /*int start = 1;
        int end = 30;
        int sum = 0;
        System.out.println("sum of all even numbers between "+start+" to "+end+" are: ");
        while(start <= end){
            if(start%2 == 0){
                sum = sum + start;
            }
            start++;
        }
        System.out.println(sum);*/

        //Q4. WAP to print sum of all odd numbers between 1 to n using while loop.
        /*int start = 1;
        int end = 30;
        int sum = 0;
        System.out.println("sum of all odd numbers between "+start+" to "+end+" are: ");
        while(start <= end){
            if(start%2 != 0){
                sum = sum + start;
            }
            start++;
        }
        System.out.println(sum);*/

        //Q5. WAP to print multiplication of any number using while loop.
        /*int i = 1;
        System.out.println("Enter the Number for Multiplication: ");
        int n = sc.nextInt();
        while (i <= 10){
            System.out.printf("%d X %d = %d\n",i,n,i*n);
            i++;
        }*/

        //Q6. WAP to count the digits of a given number using while loop.
        /*System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("Count of Number: "+count);*/

        //Q7. WAP to print the sum of digits of a given number using while loop.
        /*System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits is: "+sum);*/

        //Q8. WAP to print all natural numbers in reverse order using while loop.
        /*int i = 10;
        while (i >= 1){
            System.out.println(i);
            i--;
        }*/

        //Q9. WAP to check whether a given number is Prime or not using while loop.
        /*System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean bool = false;
        int i = 2;
        while (i <= num/2){
            if(num%i == 0){
                bool = true;
                break;
            }
            ++i;
        }
        if(!bool){
            System.out.println(num+" is Prime Number.");
        }
        else {
            System.out.println(num+" is not Prime Number.");
        }*/

        //Q10. WAP to Print all armstrong number between 1 to n.
        /*System.out.println("Enter the number to print armstrong number between 1 to ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num){
            int digit1, digit2, digit3;
            int temp = i;

            digit1 = temp % 10;
            temp = temp / 10;

            digit2 = temp % 10;
            temp = temp / 10;

            digit3 = temp % 10;
            if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == i){
                System.out.println(i);
            }
            i++;
        }*/

        //Q11. WAP to print following pattern using while loop.
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        /*int n = 5;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i++;
        }*/

        //Q12. WAP to print following pattern using while loop.
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        /*int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }*/

        //Q13. WAP to print following pattern using while loop.
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *
        /*int n = 5;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n-i){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i++;
        }*/

        //Q14. WAP to print following pattern using while loop.
        //    *
        //   ***
        //  *****
        // *******
        //*********
        // *******
        //  *****
        //   ***
        //    *
        /*int n = 9;
        int i = 1;
        while (i <= n/2+1){
            int j = 1;
            while (j <= n/2+1-i){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k <= 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i++;
        }
        i = n/2;
        while(i >= 1){
            int j = 1;
            while (j <= n/2+1-i){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }*/

        //Q15. WAP to print following pattern using while loop.
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        /*int n = 1;
        int i = 5;
        while (i >= n){
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }*/

        //Q16. WAP to print following pattern using while loop.
        //     *
        //    **
        //   ***
        //  ****
        // *****
        //******
        /*int n = 6;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=i){
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
            i++;
        }*/

        //Q17. WAP to print following pattern using while loop.
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        /* n = 5;
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 1+n-i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }*/

        //Q18. WAP to print following pattern using while loop.
        //*****
        // ****
        //  ***
        //   **
        //    *
        /*int n = 5;
        int i = n;
        while (i >= 1){
            int j = 1;
            while (j <= n-i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }*/

        //Q19. WAP to print following pattern using while loop.
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        /*int n = 5;
        int i = 1;
        while (i <= 5){
            int j = 1;
            while (j < i){
                System.out.print("");
                j++;
            }
            int k = 1;
            while (k < i+1){
                System.out.print(" *");
                k++;
            }
            System.out.println();
            i++;
        }
        while (n >= 1){
            int k = 1;
            while (k <= n-1){
                System.out.print(" *");
                k++;
            }
            System.out.println();
            n--;
        }*/

        //Q20. WAP to print following pattern using while loop.
        //    *
        //   **
        //  ***
        // ****
        //*****
        // ****
        //  ***
        //   **
        //    *
        /*int n = 5;
        int i = 1;
        int p = n;
        while (i <= n){
            int j = 1;
            while (j <= n-i){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        while (p >= 1){
            int j = 1;
            while (j <= n-p+1){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= p-1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            p--;
        }*/

        //Q21. WAP to print following pattern using while loop.
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        /*int n = 5;
        int i = n;
        int p = 1;
        while (i >= 1){
            int j = 1;
            while (j <= n-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }
        while (p <= n){
            int j = 1;
            while (j <= n-p){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= p){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            p++;
        }*/

        //Q22. WAP to print following pattern using while loop.
        //    *
        //   * *
        //  *   *
        // *     *
        //*********
        /*int i = 1;
        int n = 5;
        while (i <= n){
            int j = i;
            while (j <= n){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= (2*i-1)){
                if(k == 1|| i == n || k == (2*i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
            i++;
        }*/

        //Q23. WAP to print following pattern using while loop.
        //*********
        // *     *
        //  *   *
        //   * *
        //    *
        /*int n = 5;
        int i = n;
        while (i >= 1){
            int j = i;
            while (j < n){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= (2*i-1)){
                if(k == 1 || i == n || k == (2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
            i--;
        }*/

        //Q24. WAP to print following pattern using do-while loop.
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        /*int n = 5;
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j+" ");
                j++;
            }
            while (j<=i);
            System.out.println();
            i++;
        }while (i<=n);*/

        //Q25. WAP to print following pattern using do-while loop.
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        /*int n = 5;
        int i = 1;
        int k = 1;
        do {
            int j = 1;
            do {
                System.out.print(k +" ");
                k++;
                j++;
            }
            while (j<=i);
            System.out.println();
            i++;
        }while (i<=n);*/

        //Q26. WAP to print following pattern using do-while loop.
        //        1
        //      1   1
        //    1   2   1
        //  1   3   3   1
        //1   4   6   4   1
        /*int n = 5;
        int i = 0;
        do {
            int j = 0;
            int num = 1;
            System.out.printf("%"+(n-i)*2+"s", "");
            do {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
                j++;
            }while (j<=i);
            System.out.println();
            i++;
        }while (i<n);*/

        //Q27. WAP to print following pattern using do-while loop.
        //   1
        //  212
        // 32123
        //4321234
        // 32123
        //  212
        //   1
        /*int i = 1;
        int n;
        do {
            n = 4;
            int j = 1;
            do {
                System.out.print(" ");
                j++;
            } while (j <= n - i);

            int k = i;
            do {
                System.out.print(k);
                k--;
            } while (k >= 1);

            int l = 2;
            do {
                System.out.print(l);
                l++;
            } while (l <= i);
            System.out.println();
            i++;
        } while (i <= 4);

        i = 3;
        do {
            n = 3;
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j <= n - i);

            int k = i;
            do {
                System.out.print(k);
                k--;
            } while (k >= 1);

            int l = 2;
            do {
                System.out.print(l);
                l++;
            } while (l <= i);

            System.out.println();
            i--;
        } while (i >= 1);*/

        //Q28. WAP to print following pattern using do-while loop.
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5
        /*int i = 1;
        int n = 5;
        do {
            int j = 1;
            do {
                System.out.print(i+ " ");
                j++;
            }while (j<=i);
            System.out.println();
            i++;
        }while (i <= n);*/

        //Q29. WAP to print following pattern using do-while loop.
        //5
        //5 4
        //5 4 3
        //5 4 3 2
        //5 4 3 2 1
        /*int n = 5;
        int i = n;
        int k = 1;
        do {
            int j = n;
            do {
                System.out.print(j+ " ");
                j--;
            }while (j >= i);
            System.out.println();
            i--;
        }while (i >= 1);*/

        //Q30. WAP to print following pattern using do-while loop.
        //1
        //2 1
        //3 2 1
        //4 3 2 1
        //5 4 3 2 1
        /*int i = 1;
        int n = 5;
        do {
            int j = i;
            do {
                System.out.print(j+" ");
                j--;
            }while (j >= 1);
            System.out.println();
            i++;
        }while (i <= n);*/

        //Q31. WAP to print following pattern using do-while loop.
        //10101
        //01010
        //10101
        //01010
        //10101
        /*int i = 1;
        int n = 5;
        do {
            int num;
            if(i%2 == 0){
                num = 0;
                int j = 1;
                do {
                    System.out.print(num);
                    num = (num == 0)? 1:0;
                    j++;
                }while (j <= n);
            }
            else {
                num = 1;
                int j = 1;
                do {
                    System.out.print(num);
                    num = (num == 0)? 1:0;
                    j++;
                }while (j <= n);
            }
            System.out.println();
            i++;
        }while (i <= n);*/

        //Q32. WAP to print following pattern using do-while loop.
        //1
        //10
        //101
        //1010
        //10101
        /*int i = 1;
        int n = 5;
        do {
            int j = 1;
            do{
                if(j%2 == 0){
                    System.out.print(0);
                    j++;
                }
                else {
                    System.out.print(1);
                    j++;
                }
            }while (j <= i);
            System.out.println();
            i++;
        }while (i <= n);*/

        //Q33. WAP to print following pattern using do-while loop.
        //1 2 3 4 5
        // 2 3 4 5
        //  3 4 5
        //   4 5
        //    5
        //   4 5
        //  3 4 5
        // 2 3 4 5
        //1 2 3 4 5
        /*int i = 1;
        int n = 5;
        do {
            int j = 1;
            do {
                System.out.print(" ");
                j++;
            }while (j <= i);

            int k = i;
            do {
                System.out.print(k+" ");
                k++;
            }while (k <= n);
            System.out.println();
            i++;
        }while (i <= n);
        i = n - 1;
        do {
            int j = 1;
            do {
                System.out.print(" ");
                j++;
            }while (j<=i);
            int k = i;
            do {
                System.out.print(k+ " ");
                k++;
            }while (k <= n);
            System.out.println();
            i--;
        }while (i >= 1);*/

        //Q34. WAP to print following pattern using for loop.
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E
        //A B C D E F
        /*char n = 'F';
        for(char i ='A'; i<=n; i++){
            for (char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Q35. WAP to print following pattern using for loop.
        //A
        //B B
        //C C C
        //D D D D
        //E E E E E
        //F F F F F F
        /*char n = 'F';
        for(char i='A'; i<=n; i++){
            for (char j='A'; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }*/

        //Q36. WAP to print following pattern using for loop.
        //A B C D E F
        //A B C D E
        //A B C D
        //A B C
        //A B
        //A
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E
        //A B C D E F
        /*char n = 'F';
        for (char i=n; i>='A'; i--){
            for (char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (char i='A'; i<=n; i++){
            for (char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Q37. WAP to print following pattern using for loop.
        //     A
        //    A B
        //   A B C
        //  A B C D
        // A B C D E
        //A B C D E F
        /*char n = 'F';
        for(char i='A'; i<=n; i++){
            for (char j=n; j>i; j--){
                System.out.print(" ");
            }
            for (char k='A'; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }*/

        //Q38. WAP to print following pattern using for loop.
        /*int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i));

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            if (i > 0) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + n - i - 1));

            for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
                System.out.print(" ");
            }

            if (i < n - 1) {
                System.out.print((char) ('A' + n - i - 1));
            }
            System.out.println();
        }*/

        //Q39. WAP that will print a box of #’s taking from user the height and width values.
        /*System.out.println("Enter the Height: ");
        int height = sc.nextInt();
        System.out.println("Enter the Width: ");
        int width = sc.nextInt();
        for(int i=1; i<=height; i++){
            for (int j=1; j<=width; j++){
                System.out.print("#");
            }
            System.out.println();
        }*/

        //Q40. Determine and print the number of times the character ‘a’ appears in the input
        // entered by the user.
        /*System.out.println("Enter the String: ");
        String userInput = sc.nextLine();
        int count = 0;
        for(int i=0; i<userInput.length(); i++){
            if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'A'){
                count++;
            }
        }
        System.out.println("Number of times a's occurred in a string: "+count);*/

        //Q41. Write a program to find the sum of 5 integers.
        /*System.out.println("Enter the numbers that integers are sum: ");
        int numOfInteger = sc.nextInt();
        int sumOfInteger = 0;
        for (int i=0; i<numOfInteger; i++){
            System.out.print("Enter the Integer #"+(i+1)+": ");
            int num = sc.nextInt();
            sumOfInteger += num;
        }
        System.out.println("Sum of "+numOfInteger+" integers is: "+sumOfInteger);*/

        //Q42.WAP to calculate the factorial value of given number.
        /*System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);*/

        //Q43. Suppose we have a database composed of two fields or columns (arrays), the first
        // field is for the username (user[]) and the other one is for the password(pass[]) .
        //This is how it looks like:
        //user[0] = “Hassan” ;
        //user[1] =”Idris”;
        //user[2]=”Trevor” ;

        //And their passwords correspond with their indexes.
        //pass[0] = “homecomingking”;
        //pass[1] = “turnupcharlie”;
        //pass[2] = “afraidofthedark”;

        //Then if one of them had successfully login, the output should be:
        //Enter username: Hassan
        //Enter password: homecomingking
        //Hello Hassan!

        //But if not, “Incorrect Login!”
        //You can ignore case for the username but not for the password.
        /*String[] users = {"Ramesh", "Rahul", "Arjun", "Ketan", "Roshan"};
        String[] passwords = {"rakesh321", "rahul123", "ar2334", "ket3n", "r0shan"};

        System.out.println("Enter the Username: ");
        String userName = sc.nextLine();
        userName = userName.toLowerCase();

        int userIndex = -1;
        for(int i=0; i< users.length; i++){
            if(users[i].toLowerCase().equals(userName)){
                userIndex =i;
                break;
            }
        }
        if(userIndex != -1){
            System.out.println("Enter the Password: ");
            String userPass = sc.nextLine();
            if(userPass.equals(passwords[userIndex])){
                System.out.print("Hello, "+users[userIndex]+"!.");
            }
            else {
                System.out.print("Wrong Password.");
            }
        }
        else {
            System.out.println("Incorrect Login.");
        }*/

        //Q44. WAP that prints all the odd numbers from 1 to 100, except those that are
        // divisible by 7, using a for loop and a continue statement.
        /*int n = 100;
        int i = 1;
        for (i=1; i<=n; i++){
            if(i%2 == 1){
                if(i%7 == 0){
                    continue;
                }
                System.out.println(i);
            }
        }*/

        //Q45. WAP Print all odd numbers from 1 to 20, but skip the ones that are multiples
        // of 3.
        /*int n = 20;
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                if(i%3 == 0){
                    continue;
                }
                System.out.println(i);
            }
        }*/

        //Q46. WAP to Calculate and print the sum of all even numbers from 1 to 50,
            // excluding multiples of 5.
        /*int n = 50;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0) {
                if(i%5 == 0) {
                    continue;
                }
                sum += i;
            }
        }
        System.out.println(sum);*/

        //Q47. Print Prime Numbers from 1 to 100, Skipping 2 and 5.
        /*int n = 100;
        for(int i=2; i<n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    if(i == 2){
                        continue;
                    }
                    if(i == 5){
                        continue;
                    }
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i+" ");
            }
        }*/

        //Q48. WAP to Print numbers from 1 to 50 that are divisible by either 4 or 6, but
            // skip those divisible by both.
        /*int n = 50;
        for (int i = 1; i <= n; i++) {
            if(i%4 == 0 || i%6 == 0){
                if(i%4 == 0 && i%6 == 0){
                    continue;
                }
                System.out.println(i);
            }
        }*/

        //Q49. WAP to Print numbers from 1 to 30, but skip those that are multiples of both 4
            // and 7.
        /*int n = 30;
        for (int i = 1; i <= n ; i++) {
            if(i%4 == 0 && i%7 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        //Q50. WAP to Calculate and print the sum of squares of numbers from 1 to 15,
            // excluding the squares of even numbers.
        /*int n = 15, sum = 0;
        for (int i = 1; i <= n ; i++) {
            if(i%2 == 0){
                continue;
            }
            sum += i*i;
        }
        System.out.println(sum);*/

        //Q51. WAP to Given a string, print each character of the string, skipping vowels.
        /*System.out.println("Enter the String: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                continue;
            }
            System.out.print(ch);
        }*/

        //Q52. WAP to Print numbers from 1 to 50, excluding palindromic numbers.
        /*int n = 50;
        for (int i = 1; i <= n; i++) {
            if(i%11 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        //Q53. WAP to Print the multiplication table for 8 up to 10 times, skipping multiples
            // of 3 in each row.
        /*int n = 8;
        int mulTab = 0;
        for (int i = 1; i <= 10 ; i++) {
            if(i%3 == 0){
                continue;
            }
            mulTab = i*n;
            System.out.printf("%d X %d = %d\n",i , n, mulTab);
        }*/

        //Q54. WAP that uses a for loop to iterate over numbers from 1 to 10. Use the break
            // statement to exit the loop when the loop variable reaches 5.
        /*int n = 10;
        for (int i = 1; i <= n; i++) {
            if(i > 5){
                break;
            }
            System.out.println(i);
        }*/

        //Q55. Create a program with nested loops. Use the break statement to exit both loops
            // when a certain condition is met.
        /*int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
                if (i == 3 && j == 2) {
                    System.out.println("Inner loop is ended..");
                    break;
                }
            }
            if(i == 3){
                System.out.println("Outer loop is ended..");
                break;
            }
        }*/

        //Q56. WAP that searches for a specific character in a given string using a loop.
            // Use the break statement to exit the loop when the character is found.
        /*String str = "GulabJamun";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'J'){
                break;
            }
            System.out.print(ch);
        }*/

        //Q57. Create a program that uses a while loop to print numbers from 1 to 5. Use
            // the break statement to terminate the loop when a specific condition is met.
        /*int n = 5;
        int i = 1;
        while (i <= n){
            if(i == 3){
                break;
            }
            System.out.println(i);
            i++;
        }*/

        //Q58. Develop a program that prints a pattern using nested loops. Use the break
            // statement to terminate the pattern generation under a certain condition.
        /*int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Q59. Create a program that takes user input in a loop. Use the break statement
            // to exit the loop when the user enters a specific value.
        /*int i = 1;
        int n = 50;
        System.out.println("Enter the value for ending the loop: ");
        int val = sc.nextInt();
        while (i <= n){
            if(i > val){
                break;
            }
            System.out.println(i);
            i++;
        }*/

        //Q60. WAP to print reverse number of given number.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int revNum = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            if (remainder == 0) {
                System.out.println("Skipping 0 digit");
                num /= 10;
                continue;
            }
            revNum = revNum * 10 + remainder;
            num/= 10;
        }
        System.out.println("Reversed Number: " + revNum);
    }
}
