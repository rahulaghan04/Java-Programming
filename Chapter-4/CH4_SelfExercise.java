package com.Rahulaghan;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class CH4_SelfExercise {
    public static void main(String[] args) {
        //If-Else Exp
        Scanner sc = new Scanner(System.in);

        //Q1. Take values of length and breadth of a rectangle from the user and check
        // if it is square or not.
        /*System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("This is Square.");
        }
        else {
            System.out.println("This is Rectangle.");
        }*/

        //Q2. A company decided to give bonus of 5% to employee if his/her year of service is
        // more than 5 years. Ask user for their salary and year of service and print the
        // net bonus amount.
        /*.out.println("Enter your Salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter your year of service: ");
        int yearOfService = sc.nextInt();
        if(yearOfService >= 5){
            System.out.println("Congratulations you get 5% bonus!");
            float totalSalary = (5 / 100f) * salary + salary;
            System.out.println("Your Salary is: "+totalSalary);
        }
        else{
            System.out.println("You have not eligible for this criteria.");
        }*/

        //Q3. write a program to print absolute value of a number entered by user.
        /*System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Absolute value is: "+(-1*num));
        }
        else{
            System.out.println("Absolute value is: "+num);
        }*/

        //Q4. A student will not be allowed to sit in exam if his/her attendance is less than
        // 75%. Take following input from the user Number of classes held, Number of classes
        // attended and print percentage of class attended is student is allowed to sit in
        // exam or not. Modify the above question to allow student to sit if he/she has
        // medical cause. Ask user if he/she has or not('Y' or 'N') and print accordingly.
        /*System.out.println("Numbered of classes Attended out of 50: ");
        int classesAttendedByStudent = sc.nextInt();
        System.out.println("Do you have Medical clause?('Y' or 'N'): ");
        int medicalClause = sc.next().charAt(0);
        float studentTotalAttendance = classesAttendedByStudent/50f * 100;
        if(studentTotalAttendance >= 75 || medicalClause == 'Y' || medicalClause == 'y'){
            //System.out.println("Your Attendance is "+studentTotalAttendance+"%, You are allowed for exam.");
            System.out.println("You are allowed for exam because of medical clause.");
        }
        else {
            System.out.println("Your Attendance "+studentTotalAttendance+"%, You are not allowed for exam.");
        }*/

        //Q4.WAP to check whether a entered character is lowercase(a-z) or uppercase(A-Z).
        /*int exp = 'x'; //a=97 to z=122, A=65 to Z=90 ----> ASCII values
        System.out.println(exp);
        if(exp >= 97){
            System.out.println("Character is in Lowercase");
        }
        else{
            System.out.println("Character is in Uppercase");
        }*/

        //Q5. WAP to get a number from the user and print whether it is positive or negative.
        /*System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is Negative.");
        }*/

        //Q6. WAP that takes three numbers from the user and prints the greatest number.
        /*System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = sc.nextInt();
        if(num1>num2)
            if (num1 > num3){
            System.out.println(num1+" is the Greatest Number.");
        }
        if (num2>num1)
            if( num2>num3){
            System.out.println(num2+" is the Greatest Number.");
        }
        if (num3>num1)
            if(num3 > num2){
            System.out.println(num3+" is the Greatest Number.");
        }*/

        //Q7. WAP that reads a floating-point number and prints "zero" if the number is zero.
            // Otherwise, print "positive" or "negative". Add "small" if the absolute value of
            // the number is less than 1, or "large" if it exceeds 1,000,000.
        /*System.out.println("Enter a Number: ");
        float num = sc.nextFloat();
        if(num > 0) {
            if (num < 1) {
                System.out.println("Positive Small Number.");
            } else if (num > 1000000) {
                System.out.println("Positive Large Number.");
            } else {
                System.out.println("Positive Number");
            }
        }
        else if (num < 0) {
            if (Math.abs(num)< 1) {
                System.out.println("Negative Small Number.");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Negative Large Number.");
            } else {
                System.out.println("Negative Number");
            }
        }
        else {
            System.out.println("Zero.");
        }*/

        //Q8. WAP that takes a number from the user and generates an integer between 1 and 7.
            // It displays the weekday name.
        /*System.out.println("Enter a Number between 1 to 7: ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter number only between 1 to 7.");
        }*/

        //Q9. WAP that reads two floating-point numbers and tests whether they are the same up
            // to three decimal places.
        /*System.out.println("Enter the First Number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the Second Number: ");
        float num2 = sc.nextFloat();

        num1 = Math.round(num1 * 1000);
        num1 = num1/1000;
        num2 = Math.round(num2 * 1000);
        num2 = num2/1000;
        if(num1 == num2){
            System.out.println("They are same up to three decimal points.");
        }
        else {
            System.out.println("They are Different.");
        }*/

        //Q10. Write a Java program to find the number of days in a month.
        /*System.out.println("Enter Month 1 to 12: ");
        int day_In_The_Month = sc.nextInt();
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        String Month_Of_year = "nhi pta";
        switch (day_In_The_Month){
            case 1:
                Month_Of_year = "January";
                day_In_The_Month = 31;
                break;
            case 2:
                Month_Of_year = "February";
                if(year%400 == 0 || year% 4 == 0 && year%100 != 0){
                    day_In_The_Month = 29;
                }
                else {
                    day_In_The_Month = 28;
                }
                break;
            case 3:
                Month_Of_year = "March";
                day_In_The_Month = 31;
                break;
            case 4:
                Month_Of_year = "April";
                day_In_The_Month = 30;
                break;
            case 5:
                Month_Of_year = "May";
                day_In_The_Month = 31;
                break;
            case 6:
                Month_Of_year = "June";
                day_In_The_Month = 30;
                break;
            case 7:
                Month_Of_year = "July";
                day_In_The_Month = 31;
                break;
            case 8:
                Month_Of_year = "August";
                day_In_The_Month = 30;
                break;
            case 9:
                Month_Of_year = "September";
                day_In_The_Month = 31;
                break;
            case 10:
                Month_Of_year = "October";
                day_In_The_Month = 30;
                break;
            case 11:
                Month_Of_year = "November";
                day_In_The_Month = 31;
                break;
            case 12:
                Month_Of_year = "December";
                day_In_The_Month = 30;
                break;
        }
        System.out.println(Month_Of_year+" "+year+" has "+day_In_The_Month+" Days.");*/

        //Q11. WAP that requires the user to enter a single character from the alphabet.
            // Print Vowel or Consonant, depending on user input. If the user input is not a
            // letter (between a and z or A and Z), or is a string of length > 1, print an
            // error message.
        /*System.out.println("Enter the character: ");
        String chr = sc.nextLine();
        char ch = chr.charAt(0);
        if (chr.length() > 1){
            System.out.println("Invalid String!");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(chr+" is a vowel");
        }
        else if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')&& !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
            System.out.println(ch+" is a consonant.");
        }*/

        //Q12. WAP that takes a year from the user and prints whether it is a leap year or not.
        /*System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if((year%400 == 0 || year%4 == 0) && year%100 != 0){
            System.out.println(year+" is a leap Year.");
        }
        else {
            System.out.println(year+" is not a leap Year.");
        }*/

        //Q13. WAP to check whether a given number is divisible by 3 or not using if-else.
            //WAP to check whether a given number is divisible by 5 or not using if-else.
            //WAP to check whether a given number is divisible by 11 or not using if-else.
        /*System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        //if(num%3 == 0){
        //if(num%5 == 0){
        if(num%11 == 0){
            //System.out.println(num+" is completely divisible by 3.");
            //System.out.println(num+" is completely divisible by 5.");
            System.out.println(num+" is completely divisible by 11.");
        }
        else {
            //System.out.println(num+" is not divisible by 3.");
            //System.out.println(num+" is not divisible by 5.");
            System.out.println(num+" is not divisible by 11.");
        }*/

        //Q14. WAP to check whether a given number is even or odd using if-else.
        /*System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println(num+" is Even Number.");
        }
        else {
            System.out.println(num+" is Odd number.");
        }*/

        //Q15. WAP to check whether a given input is digit or not using if-else.
        /*System.out.println("Enter the input: ");
        boolean input = sc.hasNextInt();
        if(input){
            System.out.println("Input is a Digit.");
        }
        else{
            System.out.println("Input is a not digit.");
        }*/

        //Q16. WAP to check whether a given input is alphabet or not using if-else.
        /*System.out.println("Enter the Input: ");
        char input = sc.next().charAt(0);
        if(Character.isLetter(input)){
        //if(input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z'){
            System.out.println("Input is a alphabet.");
        }
        else {
            System.out.println("Input is a not alphabet.");
        }*/

        //Q17. WAP to check if a given input is a Digit or Alphabets or Special Character using if-else.
        /*System.out.println("Enter the input: ");
        char input = sc.next().charAt(0);
        if(Character.isLetter(input)){
            System.out.println("It is Alphabet.");
        }
        else if (Character.isDigit(input)) {
            System.out.println("It is Digit.");
        }
        else {
            System.out.println("It is Special Character.");
        }*/

        //Q18. WAP to check whether a character is a vowel or consonant using if-else.
        /*System.out.println("Enter the Input: ");
        char input = sc.next().charAt(0);
        if((input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') && (input == 'a' || input == 'A' || input == 'e' || input == 'E' || input == 'i' || input == 'I' || input == 'o' || input == 'O'|| input == 'u' || input == 'U')){
            System.out.println(input+" is a Vowel.");
        }
        else{
            System.out.println(input+" is a Consonant.");
        }*/

        //Q19. WAP to check whether a given character is uppercase or lowercase using if-else.
        /*System.out.println("Enter the Character: ");
        char chr = sc.next().charAt(0);
        if(Character.isLowerCase(chr)){
            System.out.println("Character is in Lowercase.");
        }
        else {
            System.out.println("Character is in Uppercase.");
        }*/

        //Q20. WAP to check whether a triangle is an equilateral, isosceles, or scalene
            // triangle using if-else.
        /*System.out.println("Enter the first side of triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side of triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the third side of triangle: ");
        int side3 = sc.nextInt();
        if(side1 == side2 && side2 == side3){
            System.out.println("Triangle is equilateral."); //all side size is same.
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Triangle is isosceles."); //two side size are same.
        }
        else {
            System.out.println("Triangle is scalene."); //all side size is different.
        }*/

        //Q21. WAP to check whether a person is valid for vote or not using if-else?
        /*System.out.println("Enter the Your Age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are valid for voting.");
        }
        else {
            System.out.println("You are not valid for voting.");
        }*/

        //Q22. WAP to check Division on the basis of marks obtained by students.
            // Percentage >= 60% : Division 1, Percentage >= 45% : Division 2,
            // Percentage >= 30% : Division 3, Percentage < 30% : Fail.
        /*System.out.println("Enter Your Marks out of 500: ");
        double studMarks = sc.nextInt();
        double percentage = (studMarks / 500) * 100;
        System.out.println("Percentage: "+percentage);
        if(percentage >= 60){
            System.out.println("Division 1");
        } else if (percentage >= 45) {
            System.out.println("Division 2");
        } else if (percentage >= 30) {
            System.out.println("Division 3");
        }else if (percentage < 30){
            System.out.println("Fail");
        }*/

        //Q23. WAP to Calculate percentage and grade of students on the basis of marks
            // obtained in 5 subjects Maths, Physics, Chemistry, English and Hindi. Marks of
            // subject is taken as an input: Percentage >= 90% : Grade A, Percentage >= 80%
            // : Grade B, Percentage >= 70% : Grade C, Percentage >= 60% : Grade D,
            // Percentage >= 40% : Grade E, Percentage < 40% : Grade F.
        System.out.println("Enter Your Maths Marks: ");
        int maths = sc.nextInt();
        System.out.println("Enter Your Physics Marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter Your Chemistry Marks: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter Your English Marks: ");
        int english = sc.nextInt();
        System.out.println("Enter Your Hindi Marks: ");
        int hindi = sc.nextInt();

        double totalMarks = maths + physics + chemistry + english + hindi;
        double percentage = (totalMarks / 500) * 100;
        System.out.println("Percentage: "+percentage);
        if(percentage >= 90){
            System.out.println("Grade A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade D");
        }
        else if (percentage >= 40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }
    }
}
