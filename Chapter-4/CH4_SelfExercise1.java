package com.Rahulaghan;

import java.util.Scanner;

public class CH4_SelfExercise1 {
    public static void main(String[] args) {
        //Q1. Write a program to find maximum between two numbers.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("First Number is greater.");
        }
        else {
            System.out.println("Second Number is greater.");
        }*/

        //Q2. Write a program to find maximum between three numbers.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the first Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the first Number: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("First number is greater.");
        } else if (num2 > num3) {
            System.out.println("Second number is greater.");
        } else {
            System.out.println("Third number is greater.");
        }*/

        //Q3. Write a program to check whether a number is negative, positive or zero.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num >= 1){
            System.out.println("Number is Positive.");
        } else if (num < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }*/

        //Q4. Write a program to check whether a number is divisible by 5 and 11 or not,
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%5 == 0 && num%11 == 0){
            System.out.println("Number is divisible by 5 and 11.");
        } else {
            System.out.println("Number is not divisible by 5 and 11.");
        }*/

        //Q5. Write a program to check whether a number is even or odd.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }*/

        //Q6. Write a program to check whether a year is leap year or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if((year%4 == 0 || year%400 == 0) && year%100 != 0){
            System.out.println(year+" is Leap Year.");
        } else {
            System.out.println(year+" is not Leap Year.");
        }*/

        //Q7. Write a program to check whether a character is alphabet or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is alphabet.");
        } else {
            System.out.println("character is not alphabet.");
        }*/

        //Q8. Write a program to input any alphabet and check whether it is vowel or consonant.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Alphabet is Vowel.");
        } else {
            System.out.println("Alphabet is Consonant.");
        }*/

        //Q9. Write a program to input any character and check whether it is alphabet, digit or
        // special character.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122){
            System.out.println("Character is Alphabet.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Character is Digit.");
        } else {
            System.out.println("Character is Special Symbol.");
        }*/

        //Q10. Write a program to check whether a character is uppercase or lowercase alphabet.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 90){
            System.out.println("Character in uppercase.");
        } else if (ch >= 90 && ch <= 122) {
            System.out.println("Character in lowercase.");
        }*/

        //Q11. Write a program to input week number and print week day.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7: ");
        int days = sc.nextInt();
        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid Number or input.");
        }*/

        //Q12. Write a program to input month number and print month Name.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number 1 to 12: ");
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid number or input.");
        }*/

        //Q13. Write a program to count total number of notes in given amount.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int amt = sc.nextInt();
        int n500,n200,n100,n50,n20,n10,n5,n2,n1;
        n500 = n200 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
        if(amt >= n500){
            n500 = amt/500;
            amt -= n500 * 500;
        }
        if(amt >= 200){
            n200 = amt/200;
            amt -= n200 * 200;
        }
        if(amt >= 100){
            n100 = amt/100;
            amt -= n100 * 100;
        }
        if(amt >= 50){
            n50 = amt/50;
            amt -= n50 * 50;
        }
        if(amt >= 20){
            n20 = amt/20;
            amt -= n20 * 20;
        }
        if(amt >= 10){
            n10 = amt/10;
            amt -= n10 * 10;
        }
        if(amt >= 5){
            n5 = amt/5;
            amt -= n5 * 5;
        }
        if(amt >= 1){
            n1 = amt;
        }
        System.out.println("Total No. of Notes: ");
        System.out.println("500 Note: "+n500);
        System.out.println("200 Note: "+n200);
        System.out.println("100 Note: "+n100);
        System.out.println("50 Note: "+n50);
        System.out.println("20 Note: "+n20);
        System.out.println("10 Note/Coin: "+n10);
        System.out.println("5 Note/Coin: "+n5);
        System.out.println("2 Note/Coin: "+n2);
        System.out.println("1 Note/Coin: "+n1);*/

        //Q14. Write a program to input angles of a triangle and check whether triangle is
        // valid or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 Angles: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        int sum = angle1 + angle2 + angle3;
        if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0){
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }*/

        //Q15. Write a program to input all sides of a triangle and check whether triangle is
        // valid or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if ((side2 + side3) > side1){
            if ((side1 + side3) > side2){
                if ((side1 + side2) > side3){
                    System.out.println("Triangle is valid.");
                } else {
                    System.out.println("Triangle is not valid.");
                }
            } else {
                System.out.println("Triangle is not valid.");
            }
        } else {
            System.out.println("Triangle is not valid.");
        }*/

        //Q16. Write a program to check whether the triangle is equilateral, isosceles or
        // scalene triangle.
        //equilateral = all side same length or angle.
        //isosceles = two sides are same length but third is diff.
        //scalene = all side different length
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 sides: ");
        int length1 = sc.nextInt();
        int length2 = sc.nextInt();
        int length3 = sc.nextInt();
        if(length1 == length2 && length2 == length3){
            System.out.println("Triangle is equilateral.");
        }
        else if (length1 == length2 || length1 == length3 || length3 == length2) {
            System.out.println("Triangle is isosceles.");
        }
        else {
            System.out.println("Triangle is scalene.");
        }*/

        //Q17. Write a program to find all roots of a quadratic equation.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c: ");
        double root1, root2;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double determinant = b * b - 4 * a * c;
        if(determinant > 0){
            root1 = -b + Math.sqrt(determinant)/ 2 * a;
            root2 = -b - Math.sqrt(determinant)/ 2 * a;
            System.out.printf("Root1: %.2f and Root2: %.2f",root1,root2);
        } else if (determinant == 0) {
            root1 = root2 = - b /(2 * a);
            System.out.printf("Root1 = Root2 = %.2f",root1);
        } else {
            double real = - b /(2 * a);
            double img = Math.sqrt(-determinant)/ (2 * a);
            System.out.printf("Root1: %.2f+%.2fi",real,img);
            System.out.printf("\nRoot1: %.2f-%.2fi",real,img);
        }*/

        //Q18. Write a program to calculate profit or loss.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling Price: ");
        int sellingPrice = sc.nextInt();
        System.out.println("Enter the Cost Price: ");
        int costPrice = sc.nextInt();
        int profit,loss;
        if(sellingPrice > costPrice ){
            profit = sellingPrice - costPrice;
            System.out.println("Profit = "+profit);
        } else if (sellingPrice < costPrice) {
            loss = costPrice - sellingPrice;
            System.out.println("Loss = "+loss);
        } else {
            System.out.println("No Profit, No Loss!");
        }*/

        //Q19. Write a program to input marks of five subjects Physics, Chemistry, Biology,
        // Mathematics and Computer. Calculate percentage and grade according to following:
        //Percentage >= 90% : Grade A
        //Percentage >= 80% : Grade B
        //Percentage >= 70% : Grade C
        //Percentage >= 60% : Grade D
        //Percentage >= 40% : Grade E
        //Percentage < 40% : Grade F
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks(out of 100 for each subject): ");
        System.out.print("Physics: ");
        int physics = sc.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Biology: ");
        int biology = sc.nextInt();
        System.out.print("Mathematics: ");
        int mathematics = sc.nextInt();
        System.out.print("Computer: ");
        int computer = sc.nextInt();
        float totalMarks = (float)(physics + chemistry + biology + mathematics + computer)/500;
        float avg = totalMarks * 100;
        if(avg >= 90){
            System.out.println("Percentage: "+avg+", Grade A!");
        } else if (avg >= 80) {
            System.out.println("Percentage: "+avg+", Grade B!");
        } else if (avg >= 70) {
            System.out.println("Percentage: "+avg+", Grade C!");
        } else if (avg >= 60) {
            System.out.println("Percentage: "+avg+", Grade D!");
        } else if (avg >= 40) {
            System.out.println("Percentage: "+avg+", Grade E!");
        } else if (avg < 40) {
            System.out.println("Percentage: "+avg+", Fail!");
        }*/

        //Q20. Write a program to input basic salary of an employee and calculate its Gross
        // salary according to following:
        //Basic Salary <= 10000 : HRA = 20%, DA = 80%
        //Basic Salary <= 20000 : HRA = 25%, DA = 90%
        //Basic Salary > 20000 : HRA = 30%, DA = 95%
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        float salary = sc.nextFloat();
        float hra, da;
        if(salary <= 10000){
            hra = salary * 0.2f;
            da = salary * 0.8f;
        } else if (salary <= 20000) {
            hra = salary * 0.25f;
            da = salary * 0.9f;
        } else{
            hra = salary * 0.3f;
            da = salary * 0.95f;
        }
        System.out.println("Gross salary: "+(salary+hra+da));*/

        //Q21.Write a program to input electricity unit charges and calculate total electricity
        // bill according to the given condition:
        //For first 50 units Rs. 0.50/unit
        //For next 150 units Rs. 0.75/unit
        //For next 250 units Rs. 1.20/unit
        //For unit above 250 Rs. 1.50/unit
        //An additional surcharge of 20% is added to the bill
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Electricity unit : ");
        float unit = sc.nextFloat();
        float chargeAmt;
        float surcharge, total;
        if(unit <= 50){
            chargeAmt = unit * 0.50f;
        } else if (unit <= 150) {
            chargeAmt = unit * 0.75f;
        } else if (unit <= 250) {
            chargeAmt = unit * 1.20f;
        } else {
            chargeAmt = unit * 1.50f;
        }
        surcharge = chargeAmt * 0.2f;
        total = chargeAmt + surcharge;
        System.out.println("Total Electricity Bill: "+total);*/

        //Q22. while purchasing certain items, a discount of 10% is offered if the quantity
        // purchased is more than 100. If quantity and price per item are input through
        // the keyboard, write a program to calculate the total expenses.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of one item: ");
        float sellingPrice = sc.nextFloat();
        float totalPrice;
        if(quantity >= 100){
            float price = sellingPrice * quantity;
            float discount = 10/100f * price;
            totalPrice = price - discount;
            System.out.println("Total Expenses: "+totalPrice+"Rs.");
        } else{
            totalPrice  = sellingPrice * quantity;
            System.out.println("Total Expenses: "+totalPrice+"Rs.");
        }*/

        //Q23.The current year and the year in which the employee joined the organization are
        // entered through the keyboard. If the number of years for which the employee
        // has served the organization is greater than 3 then a bonus of Rs. 2500/- is
        // given to the employee. If the years of service are not greater than 3, then
        // the program should do nothing
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the joining year: ");
        int joiningYear = sc.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();
        int totalServeYear = currentYear - joiningYear;
        if(totalServeYear >= 3){
            System.out.println("Total year of service in organization: "+totalServeYear+" Years.");
            System.out.println("Congratulations, You got bonus 2500rs!");
        } else {
            System.out.println("Total year of service in organization: "+totalServeYear+" Years.");
        }*/

        //Q24.If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and
        // DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500,
        // then HRA = Rs. 500 and DA = 98% of basic salary. If the employee's salary is
        // input through the keyboard write a program to find his gross salary.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary = sc.nextInt();
        float hra, da;
        if(salary < 1500){
            hra = 10/100f * salary;
            da = salary * 0.9f;
        }else{
            hra = 500;
            da = salary * 0.98f;
        }
        System.out.println("Gross salary of Employee: "+(salary+hra+da));*/

        //Q25.The marks obtained by a student in 5 different subjects are input through the
        // keyboard. The student gets a division as per the following rules:
        // Write a program to calculate the division obtained by the student.
        //Percentage above or equal to 60 - First division
        //Percentage between 50 and 59 - Second division
        //Percentage between 40 and 49 - Third division
        //Percentage less than 40 – Fail
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in 5 subject: ");
        System.out.print("Marathi: ");
        int marathi = sc.nextInt();
        System.out.print("Hindi: ");
        int hindi = sc.nextInt();
        System.out.print("English: ");
        int english = sc.nextInt();
        System.out.print("Maths: ");
        int maths = sc.nextInt();
        System.out.print("Physics: ");
        int physics = sc.nextInt();
        float percentage = (marathi + hindi + english + maths + physics)/500f*100;
        if(percentage>=60){
            System.out.println("First Division");
        } else if (percentage>50 && percentage<59) {
            System.out.println("Second Division");
        } else if (percentage>40 && percentage<49) {
            System.out.println("Third Division");
        } else if (percentage < 40) {
            System.out.println("Fail");
        }*/

        //Q26.A company insures its drivers in the following cases:
        //If the driver is married
        //If the driver is unmarried, male & above 30 years of age
        //If the driver is unmarried, female & above 25 years of age
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Gender(M/F):");
        char gender = sc.next().toLowerCase().charAt(0);
        System.out.println("Married or Unmarried(M/U): ");
        char status = sc.next().toLowerCase().charAt(0);
        if(status == 'M'){
            System.out.println("driver should be ensured.");
        } else if (status == 'U' && gender == 'M' && age >= 30) {
            System.out.println("driver should be ensured.");
        } else if (status == 'U' && gender == 'F' && age >= 25) {
            System.out.println("driver should be ensured.");
        } else {
            System.out.println("driver should not be ensured.");
        }*/

        //Q27. Write a program to calculate the salary as per the following table
        //Gender	Year of Service	   Qualifications	    Salary
        //Male	        >= 10	       Post - Graduate	    15000
        //              >= 10	       Graduate	            10000
        //              < 10	       Post - Graduate	    10000
        //              < 10	       Graduate	            7000
        //Female	    >= 10	       Post - Graduate	    12000
        //              >= 10	       Graduate	            9000
        //              < 10	       Post - Graduate	    10000
        //              < 10	       Graduate	            6000
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender(M/F): ");
        String gender = sc.next().toUpperCase();
        System.out.println("Enter the Year of Service: ");
        int yearOfService = sc.nextInt();
        System.out.println("Enter your Qualifications(PG/G): ");
        String qualifications = sc.next().toUpperCase();
        if (gender.equals("M") && yearOfService >= 10 && qualifications.equals("PG")) {
            System.out.println("Salary: 15000");
        } else if (gender.equals("M") && yearOfService >= 10 && qualifications.equals("G")) {
            System.out.println("Salary: 10000");
        } else if (gender.equals("M") && yearOfService < 10 && qualifications.equals("PG")) {
            System.out.println("Salary: 10000");
        } else if (gender.equals("M") && yearOfService < 10 && qualifications.equals("G")) {
            System.out.println("Salary: 7000");
        }
        if (gender.equals("F") && yearOfService >= 10 && qualifications.equals("PG")) {
            System.out.println("Salary: 12000");
        } else if (gender.equals("F") && yearOfService >= 10 && qualifications.equals("G")) {
            System.out.println("Salary: 9000");
        } else if (gender.equals("F") && yearOfService < 10 && qualifications.equals("PG")) {
            System.out.println("Salary: 10000");
        } else if (gender.equals("F") && yearOfService < 10 && qualifications.equals("G")) {
            System.out.println("Salary: 6000");
        }*/

        //Q28. A five-digit number is entered through the keyboard. Write a program to obtain the
            // reversed number and to determine whether the original and reversed numbers are
            // equal or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 digit number: ");
        int no = sc.nextInt();
        int rem, rev=0, originalNo = no;
        while (no>0){
            rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        if(rev == originalNo){
            System.out.println("Original: "+originalNo+" ,Reversed: "+rev);
            System.out.println("Original number is equal to reversed number.");
        } else {
            System.out.println("Original: "+originalNo+" ,Reversed: "+rev);
            System.out.println("Original number is not equal to reversed number.");
        }*/

        //Q29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program
            // to determine the youngest of the three.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Ram's Age: ");
        int ram = sc.nextInt();
        System.out.print("Enter the Shyam's Age: ");
        int shyam = sc.nextInt();
        System.out.print("Enter the Ajay's Age: ");
        int ajay = sc.nextInt();
        if(ram > shyam && ram > ajay){
            System.out.println("Ram is Youngest.");
        } else if (shyam > ram && shyam > ajay) {
            System.out.println("Shyam is Youngest.");
        } else if (ajay > ram && ajay > shyam){
            System.out.println("Ajay is Youngest.");
        } else {
            System.out.println("All's age are same.");
        }*/

        //Q30.Write a program to check whether a triangle is valid or not, when the three angles
            // of the triangle are entered through the keyboard. A triangle is valid if the sum
            // of all the three angles is equal to 180 degrees.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Angle 1 size: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter the Angle 2 size: ");
        int angle2 = sc.nextInt();
        System.out.println("Enter the Angle 3 size: ");
        int angle3 = sc.nextInt();
        if(angle1 + angle2 + angle3 == 180){
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }*/

        //Q31.Find the absolute value of a number entered through the keyboard.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        double num = sc.nextDouble();
        System.out.println("Absolute Value of "+num+" is "+Math.abs(num)+".");*/

        //Q32.Given the length and breadth of a rectangle, write a program to find whether the
            // area of the rectangle is greater than its perimeter. For example, the area of
            // the rectangle with length = 5 and breadth = 4 is greater than its perimeter.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Rectangle---------------");
        System.out.print("Enter the Length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the Breadth: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        if(area > perimeter){
            System.out.println("Area of rectangle is greater than perimeter of rectangle.");
        }*/

        //Q33. A certain grade of steel is graded according to the following conditions:
            //Hardness must be greater than 50.
            //Carbon content must be less than 0.7.
            //Tensile strength must be greater than 5600.
            //The grades are as follows:
                //Grade is 10 if all three conditions are met.
                //Grade is 9 if conditions (i) and (ii) are met.
                //Grade is 8 if conditions (ii) and (iii) are met.
                //Grade is 7 if conditions (i) and (iii) are met.
                //Grade is 6 if only one condition is met.
                //Grade is 5 if none of the conditions are met.
        //Write a program, which will require the user to give values of hardness, carbon content
            // and tensile strength of the steel under consideration and output the grade of the
            // steel.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of steel hardness(e.g. 50,60,70): ");
        int hardness = sc.nextInt();
        System.out.print("Enter the carbon content on steel(e.g. 0.5,0.6,0.7): ");
        double carbonContent = sc.nextFloat();
        System.out.print("Enter the tensile strength of steel(e.g. 4500,5600,7600): ");
        int tensileStrength = sc.nextInt();
        if(hardness >= 50 && carbonContent >= 0.7 && tensileStrength >= 5600){
            System.out.println("Steel is Grade 10.");
        } else if (hardness >= 50 && carbonContent >= 0.7) {
            System.out.println("Steel is Grade 9.");
        } else if (carbonContent >= 0.7 && tensileStrength >= 5600) {
            System.out.println("Steel is Grade 8.");
        } else if (hardness >= 50 && tensileStrength >= 5600) {
            System.out.println("Steel is Grade 7.");
        } else if (hardness >= 50 || carbonContent >= 0.7 || tensileStrength >= 5600) {
            System.out.println("Steel is Grade 6.");
        } else{
            System.out.println("Steel is Grade 5.");
        }*/

        //Q34.A library charges a fine for every book returned late. For first 5 days the fine is
            // 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees.
            // If you return the book after 30 days your membership will be cancelled. Write a
            // program to accept the number of days the member is late to return the book and
            // display the fine or the appropriate message.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of days late: ");
        int noOfDays = sc.nextInt();
        if (noOfDays >= 1 && noOfDays <= 5){
            System.out.println("Fine: 0.50 Rs.");
        } else if (noOfDays >= 6 && noOfDays <= 10) {
            System.out.println("Fine: 1 Rs.");
        } else if (noOfDays > 10 && noOfDays < 30) {
            System.out.println("Fine: 5 Rs.");
        } else if (noOfDays >= 30) {
            System.out.println("Your membership will be cancelled.");
        }*/

        //Q35.In a company, worker efficiency is determined on the basis of the time required for
            // a worker to complete a particular job. If the time taken by the worker is between
            // 2 – 3 hours, then the worker is said to be highly efficient. If the time required
            // by the worker is between 3 – 4 hours, then the worker is ordered to improve speed.
            // If the time taken is between 4 – 5 hours, the worker is given training to improve
            // his speed, and if the time taken by the worker is more than 5 hours, then the
            // worker has to leave the company. If the time taken by the worker is input through
            // the keyboard, find the efficiency of the worker.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Speed of work(in Hour): ");
        int time = sc.nextInt();
        if(time < 3){
            System.out.println("Worker is highly efficient.");
        } else if (time < 4) {
            System.out.println("worker is need to improved speed.");
        } else if (time < 5) {
            System.out.println("worker is given training to improve speed.");
        } else if (time > 5) {
            System.out.println("Worker has to leave the company.");
        }*/

        //Q36.Write a Java program that accepts three numbers and check All numbers are equal or
            // not.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal.");
        } else if (num1 == num2 || num2 == num3 || num3 == num1) {
            System.out.println("Two numbers are same or one is different.");
        } else {
            System.out.println("All numbers are different.");
        }*/

        //Q37.Write a Java program that reads a positive integer and count the number of digits.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0, rem;
        if(num > 0){
            while (num>0){
                rem = num%10;
                num = num/10;
                count++;
            }
            System.out.println(count);
        } else {
            System.out.println("Please enter positive number.");
        }*/

        //Q38.Write a java program that accepts three numbers from the user and check if numbers
            // are in "increasing" or "decreasing" order.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if (num1 < num2 && num2 < num3){
            System.out.println("Numbers are increasing order.");
        } else if (num1 > num2 && num2 > num3){
            System.out.println("Numbers are decreasing order.");
        } else {
            System.out.println("Neither Increasing or Decreasing Order.");
        }*/

        //Q39.Write a Java program to create a simple calculator.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("1. Addition.");
        System.out.println("2. Subtraction.");
        System.out.println("3. Multiplication.");
        System.out.println("4. Division.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition: "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case 4:
                System.out.println("Division: "+(num1/num2));
                break;
            default:
                System.out.println("Enter valid choice.");
        }*/

        //Q40.Write a Java program to check whether the given integer is a multiple of 5.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num%5 == 0){
            System.out.println(num+" is multiple of 5.");
        } else {
            System.out.println(num+" is not multiple of 5.");
        }
    }
}
