package com.Rahulaghan;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CH7_SelfExercise {
    //Q1. Write a Java method to find the smallest number among three numbers.
    /*public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter Third Number: ");
        double num3 = sc.nextDouble();
        System.out.println("Smallest number among this three is: " + smallest(num1, num2, num3));
        sc.close();
    }*/

    //Q2. Write a Java method to compute the average of three numbers.
    /*public static double average(double x, double y, double z){
        return (x + y + z)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter Third Number: ");
        double num3 = sc.nextDouble();
        System.out.println("The Average of this Three Numbers: "+average(num1,num2,num3));
        sc.close();
    }*/

    //Q3. Write a Java method to display the middle character of a string.
    /*public static String middle(String str){
        int position;
        int length;
        if(str.length()%2 == 0){
            position = str.length()/2-1;
            length = 2;
        }
        else {
            position = str.length()/2;
            length = 1;
        }
        return str.substring(position, position+length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The middle Character of a this string is: "+middle(str));
        sc.close();
    }*/

    //Q4. Write a Java method to count all vowels in a string.
    /*public static int vowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The vowels in the given String: "+vowels(str));
        sc.close();
    }*/

    //Q5. Write a Java method to count all the words in a string.
    /*public static int countWord(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return 1+count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Number of words in the string: "+countWord(str));
        sc.close();
    }*/

    //Q6. Write a Java method to compute the sum of digits in an integer.
    /*public static int sumOfNum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("The sum of this Num: "+sumOfNum(num));
        sc.close();
    }*/

    //Q7. Write a Java method to compute the future investment value at a given interest
        // rate for a specified number of years.
    /*public static double futureInvest(double investAmt, double interestRate, int totalYears){
        return investAmt * Math.pow(1 + interestRate, totalYears * 12);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Future investment value: "+futureInvest(1000, 0.01f, 5));
        sc.close();
    }*/

    //Q8. Write a Java method to print characters between two characters (i.e. A to P).
    /*public static char chr(char start, char end){
        int count = 0;
        int charPerLine = 20;
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch+" ");
            count++;
            if(count == charPerLine){
                System.out.println();
                count = 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(chr('(','z'));
    }*/

    //Q9. Write a Java method to check whether a year (integer) entered by the user is a
        // leap year or not.
    /*public static int is_Leap_Year(int year){
        if((year%400 == 0 || year%4 == 0) && year%100 != 0){
            System.out.println(year+" is Leap Year.");
        }
        else {
            System.out.println(year+" is not leap year");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        System.out.println(is_Leap_Year(year));
        sc.close();
    }*/

    //Q10. Write a Java method to check whether a string is a valid password.
        //Password rules:
        //A password must have at least ten characters.
        //A password consists of only letters and digits.
        //A password must contain at least two digits.
    /*public static boolean password(String pass){
        int passLengthMax = 8;
        int totalChar = 0;
        int totalDigit = 0;
        if(pass.length() <= passLengthMax){
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);
                if(is_Digit(ch)){
                    totalDigit++;
                }
                else if (is_Letter(ch)){
                    totalChar++;
                }
                else {
                    return false;
                }
            }
            return (totalChar >= 2 && totalDigit >= 2);
        }
        return false;
    }
    public static boolean is_Letter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_Digit(char ch){
        return (ch >= '0' && ch <= '9');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String pass = sc.nextLine();
        if (password(pass)) {
            System.out.println("Password is valid: " + pass);
        } else {
            System.out.println("Not a valid password: " + pass);
        }
        sc.close();
    }*/

    //Q11. Write a Java method (takes n as input) to display an n-by-n matrix.
    /*public static void nbynMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        nbynMatrix(n);
        sc.close();
    }*/

    //Q13. Write Java methods to calculate triangle area.
    /*public static double areaOfTriangle(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side3: ");
        double side3 = sc.nextDouble();
        System.out.println("Area of Triangle: "+areaOfTriangle(side1,side2,side3));
        sc.close();
    }*/

    //Q14. Write a Java method to create a pentagon's area.
    //area = (5/4) · s2 · tan(3π/10)
    /*public static double pentagonArea(double side){
        return (5/4f) * (side * side) * Math.tan(3*Math.PI/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side1 = sc.nextDouble();
        System.out.println("Area of Pentagon: "+pentagonArea(side1));
        sc.close();
    }*/

    //Q15. Write a Java method to display the current date and time.
    /*public static void currentDateAndTime(){
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
    }
    public static void main(String[] args) {
        System.out.println("The current Date & Time is: ");
        currentDateAndTime();
    }*/

    //Q16. Write a Java method to find all twin prime numbers less than 100.
    /*public static boolean is_Prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(is_Prime(i) && is_Prime(i+2)){
                System.out.printf("(%d, %d)\n",i,(i+2));
            }
        }
    }*/

    //Q17. Write a Java method to count the number of digits in an integer with the value 2.
        // The integer may be assumed to be non-negative.
    /*public static int sameLastAndFirstDigit(long num){
        int count = 0;
        long n = num;
        do {
            if(n % 10 == 2){
                count++;
            }
            n /= 10;
        }while (n>0);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long num = sc.nextLong();
        System.out.println("Number of time occurred: ");
        System.out.println(sameLastAndFirstDigit(num));
        sc.close();
    }*/

    //Q18. Write a Java method that accepts three integers and checks whether they are
        // consecutive or not. Returns true or false.
    /*public static boolean consecutiveOrNot(int num1, int num2, int num3){
        if(num2 == num1 + 1 && num3 == num2 + 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3 = sc.nextInt();
        System.out.print("this three numbers are consecutive or not?: ");
        System.out.println(consecutiveOrNot(num1, num2, num3));
        sc.close();
    }*/

    //Q19. Write a Java method that accepts three integers and returns true if one is the
        // middle point between the other two integers, otherwise false.
    /*public static boolean midpointOfThreeInteger(int num1, int num2, int num3){
        int sum = (num1 + num2 + num3) / 3;
        if(sum == num1 || sum == num2 || sum == num3){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3 = sc.nextInt();
        System.out.print("Check whether the three said numbers has a midpoint!: ");
        System.out.println(midpointOfThreeInteger(num1, num2, num3));
        sc.close();
    }*/

    //Q20. Write a Java method for extracting the first digit from a positive or negative integer.
    /*public static int firstDigitOfNum(int num){
        int nums = 10;
        while(num /  nums != 0){
            nums *= 10;
        }
        return Math.abs(num/(nums/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num1 = sc.nextInt();
        System.out.print("First digit of the positive or negative number: ");
        System.out.println(firstDigitOfNum(num1));
        sc.close();
    }*/

    //Q21. Write a Java method to display the factors of 3 in a given integer.
    /*public static void factorsOf3(int num){
        System.out.print(num+" = ");
        int res = num;
        while (res % 3 == 0){
            System.out.print("3 * ");
            res = res / 3;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Factors of 3 of the said integer: ");
        factorsOf3(num);
        sc.close();
    }*/

    //Q22. Write a Java method to check whether every digit of a given integer is even.
        // Return true if every digit is odd otherwise false.
    /*public static boolean allDigitOfNumIsEvenOrOdd(int num){
        if(num == 0){
            return false;
        }
        while (num != 0){
            if((num % 10) % 2 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Check whether every digit of the said integer is even or not!: 200");
        System.out.println(allDigitOfNumIsEvenOrOdd(num));
        sc.close();
    }*/

    //Q23. Write a Java method that checks whether all the characters in a given string are
        // vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel,
        // otherwise return false.
    /*public static boolean vowels(String str){
        String vowel = "aeiou";
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if(vowel.indexOf(str1.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Check all the characters of the said string are vowels or not!: ");
        System.out.println(vowels(str));
        sc.close();
    }*/

    //Q24. Define two methods to print the maximum and the minimum number respectively among
        // three numbers entered by user.
    /*public static int minNum(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }
    public static int maxNum(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a Third Number: ");
        int num3 = sc.nextInt();
        System.out.print("Minimum Number from the this three numbers is: ");
        System.out.println(minNum(num1, num2, num3));
        System.out.print("Maximum Number from the this three numbers is: ");
        System.out.println(maxNum(num1, num2, num3));
        sc.close();
    }*/

    //Q25. Define a program to find out whether a given number is even or odd.
    /*public static void EverOrOdd(int num){
        if(num%2 == 0){
            System.out.println("Number is Even.");
        }
        else {
            System.out.println("Number is Odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        EverOrOdd(num);
        sc.close();
    }*/

    //Q26. A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
    /*public static void EligibleToVote(int Age){
        if(Age >= 18){
            System.out.println("You're eligible to vote.");
        }
        else {
            System.out.println("You're not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        EligibleToVote(age);
        sc.close();
    }*/

    //Q27. Write a program to print the sum of two numbers entered by user by defining
        // your own method.
    /*public static int Sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of integer: "+Sum(num1,num2));
        sc.close();
    }*/

    //Q28. Define a method that returns the product of two numbers entered by user.
    /*public static int Product(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("Product of integer: "+Product(num1,num2));
        sc.close();
    }*/

    //Q29. Write a program to print the circumference and area of a circle of radius entered
        // by user by defining your own method.
    //area = Pi*r*r, circumference/perimeter = 2*Pi*r
    /*public static double Area(double radius){
        return Math.PI * radius * radius;
    }
    public static double Circumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: "+Area(r));
        System.out.println("Circumference of Circle: "+Circumference(r));
        sc.close();
    }*/

    //Q30. Define a method to find out if number is prime or not.
    /*public static boolean isPrimeNumber(int x){
        boolean flag = true;
        if(x > 1){
            for (int i = 2; i < x; i++) {
                if(x%i == 0){
                    flag = false;
                }
            }
        }
        else {
            flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPrimeNumber(num));
        sc.close();
    }*/

    //Q31. Write a program which will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:

        //Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail
    /*public static void Result(int marks){
       if(marks > 100) {
           System.out.println("invalid marks!.");
       } else if (marks >= 91) {
           System.out.println("AA");
       }else if (marks >= 81) {
           System.out.println("AB");
       }else if (marks >= 71) {
           System.out.println("BB");
       }else if (marks >= 61) {
           System.out.println("BC");
       }else if (marks >= 51) {
           System.out.println("CC");
       }else if (marks >= 41) {
           System.out.println("CD");
       }else {
           System.out.println("Fail");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        System.out.print("Your Grade is: ");
        Result(marks);
        sc.close();
    }*/

    //Q32. Write a program to print the factorial of a number by defining a method named 'Factorial'.
        //Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
    /*public static int Factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }else {
            return Factorial(num-1)*num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int fact = sc.nextInt();
        System.out.println("Factorial is : "+Factorial(fact));
        sc.close();
    }*/

    //Q33. Print the multiplication table of 15 using recursion.
    /*public static void table(int x, int y){
        if(y != 1){
            table(x,y-1);
        }
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        table(15,10);
    }*/

    //Q34. Define a method to print the prime factors of a number.
    /*public static void primeFactors(int n){
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i+" ");
                n = n /i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.printf("prime factors of %d is: ",num);
        primeFactors(num);
        sc.close();
    }*/

    //Q35. Using recursion, define a method to know nth term of a Fibonacci series.
        // Nth term of Fibonacci series is F(n) = F(n-1)+(n-2).
    /*public static int fib(int x){
        if(x == 0){
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else {
            return fib(x-1) + fib(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(9));
    }*/

    //Q36. Define a method named 'perfect' that determines if parameter number is a perfect
        // number. Use this function in a program that determines and prints all the perfect
        // numbers between 1 and 1000.
    /*public static boolean isPerfectNumber(int n){
        if(n <= 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                sum += i;
                if(i != n / i){
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        //System.out.println(isPerfectNumber(6));
        for (int i = 1; i < 1000; i++) {
            if(isPerfectNumber(i)){
                System.out.print(i+" ");
            }
        }
    }*/

    //Q37. Define a method to calculate power of a number raised to other i.e. ab using
        // recursion where the numbers 'a' and 'b' are to be entered by the user.
    /*public static int power(int a, int b){
        if(b == 1){
            return a;
        }else {
            return (a * power(a,b-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }*/

    //Q38. Write a program that takes as input your gross salary and your total saving and uses
        // another function named taxCalculator() to calculate your tax. The taxCalculator()
        // function takes as parameters the gross salary as well as the total savings amount.
        // The tax is calculated as follows:
        //(a) The savings is deducted from the gross income to calculate the taxable income.
        // Maximum deduction of savings can be Rs. 100,000, even though the amount can be more
        // than this.
        //(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to
        // 200,000 tax is 10% of the difference above 100,000 (Slab 1); beyond 200,000 up to
        // 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of
        // the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the
        // tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.
    /*public static double taxCalculator(double grossSalary, double totalSavings){
        double taxableIncome = grossSalary - Math.min(totalSavings, 100000);
        double tax = 0;
        if(taxableIncome > 500000){
            tax += 0.3 * (taxableIncome - 500000);
            taxableIncome = 500000;
        }
        if (taxableIncome > 200000){
            tax += 0.2 * (taxableIncome - 200000);
            taxableIncome = 200000;
        }
        if (taxableIncome > 100000){
            tax += 0.1 * (taxableIncome - 100000);
        }
        return tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gross Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter your Savings Amount: ");
        double savings = sc.nextDouble();
        System.out.println("Your tax Amount is: ");
        System.out.println(taxCalculator(salary,savings));
        sc.close();
    }*/

    //Q39. Write a function to swap the two numbers without using third variable.
    /*public static void swapNumber(int x, int y){
        x = x+y;
        y = x - y; //y = (x+y)-y , y = x
        x = x - y; //x = (x+y)-x , x = y
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        System.out.println("After Swapping:");
        swapNumber(x,y);
        sc.close();
    }*/

    //Q40. Write a Java program to check if a vowel is present in a string.
    /*public static boolean isVowelPresent(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        System.out.println(isVowelPresent("hello"));
    }*/

    //Q41. Write a Java program to print a Fibonacci sequence using recursion.
    /*public static int fibb(int n){
        if(n <= 1){
            return n;
        }
        else {
            return fibb(n-1) + fibb(n-2);
        }
    }
    public static void main(String[] args) {
        int length = 10;
        for (int i = 0; i < length; i++) {
            System.out.print(fibb(i)+" ");
        }
    }*/

    //Q42. How do you check whether a string is a palindrome in Java?
    /*public static boolean isPalindrome(String str){
        boolean res = true;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                res = false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("123321"));
    }*/

    //Q43. Write a program to reverse String in Java using Recursion?
    /*public static String reverseString(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Java Programming"));
    }*/

    //Q44. Write a countDown(int number) method in Java using Recursion which prints countdown
        // till zero to console, like count(3) should print 3 2 1 0
    /*public static void countDown(int number){
        if(number == 0){
            System.out.println(number);
        }else {
            System.out.println(number);
            countDown(number-1);
        }
    }
    public static void main(String[] args) {
        countDown(5);
    }*/

    //Q45. Program to reverse a number using Recursion in Java?
    /*public static void reverseNumber(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10);
            reverseNumber(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Reversed number: ");
        reverseNumber(num);
        sc.close();
    }*/

    //Q46. Write a Java program to print digitsToWords(int number) for example digitToWords(321)
        // should print three two ones?
    /*public static void digitsToWords(int num, String[] arr){
        if(num == 0){
            return;
        }
        int digit = num % 10;
        num = num / 10;
        digitsToWords(num, arr);
        System.out.print(arr[digit]+" ");
    }
    public static void main(String[] args) {
        String[] digToWord = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int num = 1234;
        digitsToWords(num, digToWord);
    }*/

    //Q47. Write a program to calculate the sum of arithmetic series from 1 to N?
    /*public static void arithmeticSeries(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        arithmeticSeries(10);
    }*/

    //Q48. Write a program to calculate Greatest Common Divisor GCD using Euclid's algorithm.
    /*public static int greatestCommonDivisor(int x, int y){
        if(y == 0){
            return x;
        }
        return greatestCommonDivisor(y, x%y);
    }
    public static void main(String[] args) {
        System.out.print("GCD: ");
        System.out.println(greatestCommonDivisor(54,24));
    }*/

    //Q49. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    /*public static int sumOfNumber(int n){
        if(n == 0){
            return n;
        }
        return n + sumOfNumber(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumber(3));
    }*/

    //Q50. Write a Java recursive method to find the sum of all odd numbers in an array.
    /*public static int sumOfOddNum(int[] arr){
       return oddNum(arr, 0);
    }
    public static int oddNum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
        int sum = oddNum(arr, index+1);
        if(arr[index]%2 != 0){
            sum += arr[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfOddNum(arr));
    }*/
}
