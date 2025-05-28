package com.Rahulaghan;

import java.util.Scanner;

//Q1. Write a program to print the area of a rectangle by creating a class named 'Area' having
    // two methods. First method named as 'setDim' takes length and breadth of rectangle as
    // parameters and the second method named as 'getArea' returns the area of the rectangle.
    // Length and breadth of rectangle are entered through keyboard.
/* RectangleArea{
    double length;
    double breadth;
    public void setDim(double length1, double breadth1){
        length = length1;
        breadth = breadth1;
    }
    public double getArea(){
        return length * breadth;
    }
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleArea rect = new RectangleArea();
        System.out.print("Enter the length of rectangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double b = sc.nextDouble();
        rect.setDim(a,b);
        System.out.println("Area of Rectangle: "+rect.getArea());
    }
}*/

//Q2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
    // Assign the value of roll_no as '2' and that of name as "John" by creating an object of
    // the class Student.
/*class Student{
    String name;
    int roll_no;
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "John";
        std.roll_no = 2;
        System.out.println("Name is "+std.name+" and Roll No. is "+std.roll_no);
    }
}*/

//Q3. Assign and print the roll number, phone number and address of two students having names
    // "Sam" and "John" respectively by creating two objects of class 'Student'.
/*class Student{
    int roll_no;
    long phoneNumber;
    String address;
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Student john = new Student();
        Student sam = new Student();
        john.roll_no = 2;
        john.phoneNumber = 8667878767L;
        john.address = "House No. 202, Robert road, London";
        System.out.println("Name is John.");
        System.out.println("Roll No.: "+john.roll_no);
        System.out.println("Phone No.: "+john.phoneNumber);
        System.out.println("Address: "+john.address);
        sam.roll_no = 6;
        sam.phoneNumber = 8945570021L;
        sam.address = "House No. 320, Albert road, New York";
        System.out.println();
        System.out.println("Name is Sam.");
        System.out.println("Roll No.: "+sam.roll_no);
        System.out.println("Phone No.: "+sam.phoneNumber);
        System.out.println("Address: "+sam.address);
    }
}*/

//Q4.Print the average of three numbers entered by user by creating a class named 'Average'
    // having a method to calculate and print the average.
/*class AverageOfThreeNumber{
    int a, b, c;
    public double average(){
        return (double) (a + b + c) /3;
    }
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AverageOfThreeNumber avg = new AverageOfThreeNumber();
        System.out.print("Enter the First No.: ");
        avg.a = sc.nextInt();
        System.out.print("Enter the Second No.: ");
        avg.b = sc.nextInt();
        System.out.print("Enter the Third No.: ");
        avg.c = sc.nextInt();
        System.out.println("Average: "+avg.average());
    }
}*/

//Q5.Write a program that would print the information (name, year of joining, salary, address)
    // of three employees by creating a class named 'Employee'. The output should be as follows:
    //Name        Year of joining        Address
    //Robert           1994           64C- WallsStreat
    //Sam              2000           68D- WallsStreat
    //John             1999           26B- WallsStreat
/*class Employee1{
    String name;
    int yearOfJoining;
    String address;
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1();
        Employee1 employee2 = new Employee1();
        Employee1 employee3 = new Employee1();
        employee1.name = "Robert";
        employee1.yearOfJoining = 1994;
        employee1.address = "64C- WallsStreat";
        System.out.println("Name: "+employee1.name);
        System.out.println("Year Of Joining: "+employee1.yearOfJoining);
        System.out.println("Address: "+employee1.address);
        System.out.println();

        employee2.name = "Sam";
        employee2.yearOfJoining = 2000;
        employee2.address = "68D- WallsStreat";
        System.out.println("Name: "+employee2.name);
        System.out.println("Year Of Joining: "+employee2.yearOfJoining);
        System.out.println("Address: "+employee2.address);
        System.out.println();

        employee3.name = "John";
        employee3.yearOfJoining = 1999;
        employee3.address = "26B- WallsStreat";
        System.out.println("Name: "+employee3.name);
        System.out.println("Year Of Joining: "+employee3.yearOfJoining);
        System.out.println("Address: "+employee3.address);
    }
}*/

//Q6. Write a program by creating an 'Employee' class having the following methods and print
    // the final salary.
    //1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
        // parameter.
    //2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
    //3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per
        // day is more than 6 hours.
class Employee2{
    int salary;
    int numberOfHoursOfWorkPerDay;
    public void getInfo(int sal, int numOfHoursOfWorkPerDay){
        salary = sal;
        numberOfHoursOfWorkPerDay = numOfHoursOfWorkPerDay;
    }
    public int addSal(){
        return salary + 10;
    }
    public int addWork(){
        return salary + 5;
    }
}
public class CH8_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee2 employee = new Employee2();
        System.out.print("Enter your Salary: $");
        int salary = sc.nextInt();
        System.out.print("Enter the number Of Hours Of Work Per Day: ");
        int numberOfHoursOfWorkPerDay = sc.nextInt();
        employee.getInfo(salary, numberOfHoursOfWorkPerDay);
        if(salary < 500){
            System.out.println("Final Salary: $"+employee.addSal());
        }
        else if(numberOfHoursOfWorkPerDay > 6){
            System.out.println("Final Salary: $"+employee.addWork());
        }
    }
}