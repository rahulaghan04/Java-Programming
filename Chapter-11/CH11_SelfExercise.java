package com.Rahulaghan;

//Q1.Write a Java program to create an abstract class Animal with an abstract method called
    // sound(). Create subclasses Lion and Tiger that extend the Animal class and implement
    // the sound() method to make a specific sound for each animal.
/*abstract class Animal1{
    abstract public void sound();
}
class Lion extends Animal1{
    @Override
    public void sound(){
        System.out.println("Lion roars!");
    }
}
class Tiger extends Animal1{
    @Override
    public void sound(){
        System.out.println("Tiger growls!");
    }
}*/

import javax.sql.rowset.spi.TransactionalWriter;
import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;
import java.util.Scanner;

//Q2. Write a Java program to create an abstract class Shape with abstract methods
    // calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that
    // extend the Shape class and implement the respective methods to calculate the area and
    // perimeter of each shape.
/*abstract class Shape{
    abstract public double calculateArea();
    abstract public double calculatePerimeter();
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    public Triangle(double side1,double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        double sum = (side1 + side2 + side3)/2;
        return Math.sqrt(sum * (sum - side1) * (sum - side2) * (sum - side3));
    }
    @Override
    public double calculatePerimeter() {
        return (side1 * side2 * side3);
    }
}*/

//Q3. Write a Java program to create an abstract class BankAccount with abstract methods
    // deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that
    // extend the BankAccount class and implement the respective methods to handle deposits
    // and withdrawals for each account type.
/*abstract class BankAccount{
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);
}
class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }
    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit "+amount+" is successfully, your bank balance: "+getBalance());
    }
    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdraw "+amount+"rs. is successfully, your bank balance: "+getBalance());
        }else {
            System.out.println("insufficient balance. withdrawal failed.");
        }
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit " + amount + "rs. is successful, your bank balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw " + amount + "rs. is successful, your bank balance: " + getBalance());
        } else {
            System.out.println("insufficient balance. withdrawal failed.");
        }
    }
}*/

//Q4.Write a Java program to create an abstract class Animal with abstract methods eat()
    // and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class
    // and implement the eat() and sleep() methods differently based on their specific
    // behavior.
/*abstract class Animal2{
    abstract public void eat();
    abstract public void sleep();
}
class Lion extends Animal2{
    @Override
    public void eat(){
        System.out.println("Lion eating Meat.");
    }
    @Override
    public void sleep(){
        System.out.println("Lion sleeping on grassland.");
    }
}
class Tiger extends Animal2{
    @Override
    public void eat(){
        System.out.println("Tiger eating Meat and drink a water.");
    }
    @Override
    public void sleep(){
        System.out.println("Tiger sleeping in the Cave.");
    }
}
class Deer extends Animal2{
    @Override
    public void eat(){
        System.out.println("Deer eating Grass and Leaves.");
    }
    @Override
    public void sleep(){
        System.out.println("Deer Sleeping in the open fields.");
    }
}*/

//Q5. Write a Java program to create an abstract class Employee with abstract methods
    // calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that
    // extend the Employee class and implement the respective methods to calculate salary
    // and display information for each role.
/*abstract class Employee3{
    protected String name;
    protected double salary;
    public Employee3(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    abstract public double calculateSalary();
    abstract public void displayInfo();
}
class Manager extends Employee3{
    double bonus;
    public Manager(String name, double salary, double  bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return salary+bonus;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary+"rs.");
        System.out.println("Bonus: "+bonus+"rs.");
        System.out.println("Total Salary: "+calculateSalary()+"rs.");
    }
}
class Programmer extends Employee3{
    double overtimeHours;
    double hourlyRate;
    public Programmer(String name, double salary, double overtimeHours, double hourlyRate){
        super(name, salary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return salary + (overtimeHours * hourlyRate);
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary+"rs.");
        System.out.println("Overtime Hours: "+overtimeHours+"Hr.");
        System.out.println("Hourly Rate: "+hourlyRate+"rs.");
        System.out.println("Total Salary: "+calculateSalary()+"rs.");
    }
}*/

//Q6.Write a Java program to create an abstract class Shape3D with abstract methods
    // calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that
    // extend the Shape3D class and implement the respective methods to calculate the volume
    // and surface area of each shape.
/*abstract class Shape3D{
    abstract public double calculateVolume();
    abstract public double calculateSurfaceArea();
}
class Sphere extends Shape3D{
    double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateVolume(){
        return (4/3f) * Math.PI * Math.pow(radius,3);
    }
    @Override
    public double calculateSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius,2);
    }
}
class Cube extends Shape3D{
    double sideLen;
    public Cube(double side){
        this.sideLen = side;
    }
    @Override
    public double calculateVolume() {
        return Math.pow(sideLen,3);
    }
    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLen,2);
    }
}*/

//Q7. Write a Java program to create an abstract class Vehicle with abstract methods
    // startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the
    // Vehicle class and implement the respective methods to start and stop the engines for
    // each vehicle type.
/*abstract class Vehicle{
    abstract public void startEngine();
    abstract public void stopEngine();
}
class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car Engine is Started.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Car Engine is Stopped.");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle Engine is Started.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle Engine is Stopped.");
    }
}*/

//Q8. Write a Java program to create an abstract class Person with abstract methods eat()
    // and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class
    // and implement the respective methods to describe how each person eats and exercises.
/*abstract class Person{
    abstract public void eat();
    abstract public void exercise();
}
class Athlete extends Person{
    @Override
    public void eat() {
        System.out.println("Eat Vegetables, Fruits, foods full of calcium, iron, potassium, and fiber, etc.");
    }
    @Override
    public void exercise() {
        System.out.println("Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat() {
        System.out.println("Eat Burger, Pizza, Donut, etc.");
    }
    @Override
    public void exercise() {
        System.out.println("No exercise or Rarely exercising.");
    }
}*/

//Q9.  Write a Java program to create an abstract class Instrument with abstract methods
    // play() and tune(). Create subclasses for Glockenspiel and Violin that extend the
    // Instrument class and implement the respective methods to play and tune each instrument.
/*abstract class Instrument{
    abstract public void play();
    abstract public void tune();
}
class Glockenspiel extends Instrument{
    @Override
    public void play() {
        System.out.println("Glockenspiel: Playing the notes on the metal bars.");
    }
    @Override
    public void tune() {
        System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
    }
}
class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Violin: Playing the strings with a bow or fingers.");
    }
    @Override
    public void tune() {
        System.out.println("Violin: Tuning the strings to the correct pitch.");
    }
}*/

//Q10. Write a Java program to create an abstract class Shape2D with abstract methods draw()
    // and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class
    // and implement the respective methods to draw and resize each shape.
/*abstract class Shape2D{
    abstract public void draw();
    abstract public void resize();
}
class Rectangle extends Shape2D{
    @Override
    public void draw() {
        System.out.println("Draw the Rectangle.");
    }
    @Override
    public void resize() {
        System.out.println("Resize the Rectangle.");
    }
}
class Circle extends Shape2D{
    @Override
    public void draw() {
        System.out.println("Draw a Circle.");
    }
    @Override
    public void resize() {
        System.out.println("Resize a Circle.");
    }
}*/

//Q11. Write a Java program to create an abstract class Bird with abstract methods fly() and
    // makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement
    // the respective methods to describe how each bird flies and makes a sound.
/*abstract class Bird{
    abstract public void fly();
    abstract public void makeSound();
}
class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }
    @Override
    public void makeSound() {
        System.out.println("Eagle is make sound Screech! Screech!.");
    }
}
class Hawk extends Bird{
    @Override
    public void fly() {
        System.out.println("Hawk is Soaring through the air.");
    }
    @Override
    public void makeSound() {
        System.out.println("Hawk is make sound Caw! Caw!.");
    }
}*/

//Q12. Write a Java program to create an abstract class GeometricShape with abstract methods
    // area() and perimeter(). Create subclasses Triangle and Square that extend the
    // GeometricShape class and implement the respective methods to calculate the area and
    // perimeter of each shape.
/*abstract class GeometricShape{
    abstract public double area();
    abstract public double perimeter();
}
class Triangle extends GeometricShape{
    double side1Length;
    double side2Length;
    double side3Length;
    public Triangle(double side1Length, double side2Length, double side3Length){
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
    }
    @Override
    public double area() {
        double s = (side1Length + side2Length + side3Length)/2;
        return Math.sqrt(s * (s - side1Length) * (s - side2Length) * (s - side3Length));
    }
    @Override
    public double perimeter() {
        return side1Length + side2Length + side3Length;
    }
}*/

//Q13. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
    // having a method with the same name 'message' that prints "This is first subclass" and
    // "This is second subclass" respectively. Call the methods 'message' by creating an
    // object for each subclass.
/*abstract class Parent{
    abstract public void message();
}
class Child01 extends Parent{
    @Override
    public void message(){
        System.out.println("This is first subclass.");
    }
}
class Child02 extends Parent{
    @Override
    public void message(){
        System.out.println("This is second subclass.");
    }
}*/

//Q14. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
    // $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
    // are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
    // method by creating an object of each of the three classes.
/*abstract class Bank{
    abstract public double getBalance();
}
class BankA extends Bank{
    double balance;
    public BankA(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
class BankB extends Bank{
    double balance;
    public BankB(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
class BankC extends Bank{
    double balance;
    public BankC(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}*/

//Q15. We have to calculate the percentage of marks obtained in three subjects (each out of
    // 100) by student A and in four subjects (each out of 100) by student B. Create an
    // abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by
    // two other classes 'A' and 'B' each having a method with the same name which returns
    // the percentage of the students. The constructor of student A takes the marks in three
    // subjects as its parameters and the marks in four subjects as its parameters for
    // student B. Create an object for eac of the two classes and print the percentage of
    // marks for both the students.
/*abstract class Marks{
    abstract double getPercentage();
}
class A2 extends Marks{
    int marathi, hindi, english;
    public A2(int marathi, int hindi, int english){
        this.marathi = marathi;
        this.hindi = hindi;
        this.english = english;
    }
    @Override
    double getPercentage(){
        return (marathi + hindi + english)/3.0;
    }
}
class B1 extends A2{
    int marathi, hindi, english, math;
    public B1(int marathi, int hindi, int english, int math){
        this.marathi = marathi;
        this.hindi = hindi;
        this.english = english;
        this.math = math;
    }
    @Override
    public double getPercentage(){
        return (marathi + hindi + english + math)/4.0;
    }
}*/

//Q16. An abstract class has a constructor which prints "This is constructor of abstract class",
    // an abstract method named 'a_method' and a non-abstract method which prints "This is a
    // normal method of abstract class". A class 'SubClass' inherits the abstract class and
    // has a method named 'a_method' which prints "This is abstract method". Now create an
    // object of 'SubClass' and call the abstract method and the non-abstract method.
    // (Analyse the result)
/*abstract class AbstractClass{
    public AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }
    abstract public void a_method();
    public void normal_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends AbstractClass{
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}*/

//Q17. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now
    // create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs'
    // with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
    // Now create an object for each of the subclasses and call their respective methods.
/*abstract class Animals{
    abstract public void cats();
    abstract public void dogs();
}
class Cats extends Animals{
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }
    @Override
    public void dogs() {

    }
}
class Dogs extends Animals{
    @Override
    public void cats() {

    }
    @Override
    public void dogs() {
        System.out.println("Dog barks");
    }
}*/

//Q18. We have to calculate the area of a rectangle, a square and a circle. Create an abstract
    // class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
    // 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of
    // 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that
    // of 'CircleArea' is its radius. Now create another class 'Area' containing all the three
    // methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of
    // rectangle, square and circle respectively. Create an object of class 'Area' and call
    // all the three methods.
/*abstract class Shape{
    abstract public void rectangleArea(double length, double breadth);
    abstract public void squareArea(double side);
    abstract public void circleArea(double radius);
}
class Area extends Shape{
    double area;
    @Override
    public void rectangleArea(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    @Override
    public void squareArea(double side) {
        area = side * side;
        System.out.println("Area of Square: "+area);
    }
    @Override
    public void circleArea(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: "+area);
    }
}*/

//Q19. Write a Java program to create an interface Shape with the getArea() method. Create
    // three classes Rectangle, Circle, and Triangle that implement the Shape interface.
    // Implement the getArea() method for each of the three classes.
/*interface Shape{
    double getArea();
}
class Rectangle implements Shape{
    double length;
    double breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea() {
        return length * breadth;
    }
}
class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Triangle implements Shape{
    double base;
    double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}*/

//Q20. Write a Java program to create an Animal interface with a method called bark() that takes
    // no arguments and returns void. Create a Dog class that implements Animal and overrides
    // speak() to print "Dog is barking".
/*interface Animal1{
    void bark();
}
class Dog1 implements Animal1{
    @Override
    public void bark() {
        System.out.println("Dog is Barking.");
    }
}*/

//Q21. Write a Java program to create an interface Flyable with a method called fly_obj().
    // Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable
    // interface. Implement the fly_obj() method for each of the three classes.
/*interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is fly in the galaxy.");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Airplane flies high in the sky.");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Helicopter flies medium in the sky.");
    }
}*/

//Q22. Write a Java programming to create a banking system with three classes - Bank, Account,
    // SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods
    // for adding them. Accounts should be an interface with methods to deposit, withdraw,
    // calculate interest, and view balances. SavingsAccount and CurrentAccount should
    // implement the Account interface and have their own unique methods.
/*interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    double viewBalance();
}
class CurrentAccount implements Account{
    double accBalance;
    double overBalLimit;
    public CurrentAccount(double initialDeposit, double overBalLimit){
        this.accBalance = initialDeposit;
        this.overBalLimit = overBalLimit;
    }
    @Override
    public void deposit(double amount) {
        accBalance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if(accBalance + overBalLimit >= amount){
            accBalance -= amount;
        }
    }
    @Override
    public double viewBalance() {
        return accBalance;
    }
    public void setOverBalLimit(double overBalLimit) {
        this.overBalLimit = overBalLimit;
    }
}
class SavingAccount implements Account{
    double accBalance;
    double interestRate;
    public SavingAccount(double initialDeposit, double interestRate){
        this.accBalance = initialDeposit;
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        accBalance += amount;
    }
    @Override
    public void withdraw(double amount) {
        accBalance -= amount;
    }
    @Override
    public double viewBalance() {
        return accBalance;
    }
    public double getInterestRate() {
        return accBalance += accBalance * interestRate / 100;
    }
}
class BankAccount implements Account{
    double accBalance;
    double interestRate;
    public BankAccount( double initialDeposit, double interestRate){
        this.accBalance = initialDeposit;
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        accBalance += amount;
    }
    @Override
    public void withdraw(double amount) {
        accBalance -= amount;
    }
    @Override
    public double viewBalance() {
        return accBalance;
    }
    public double getInterestRate() {
        return accBalance += accBalance * interestRate / 100;
    }
}*/

//Q23. Write a Java program to create an interface Resizable with methods resizeWidth
    // (int width) and resizeHeight(int height) that allow an object to be resized. Create
    // a class Rectangle that implements the Resizable interface and implements the resize
    // methods.
/*interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable{
    int width, height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printRectangleWidthHeight(){
        System.out.println("Width: "+width+", Height: "+height);
    }
}*/

//Q24. Write a Java program to create an interface Drawable with a method draw() that takes
    // no arguments and returns void. Create three classes Circle, Rectangle, and Triangle
    // that implement the Drawable interface and override the draw() method to draw their
    // respective shapes.
/*interface Drawable{
    void draw();
}
class Circle implements Drawable{
    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponents(g);
                g.setColor(Color.BLUE);
                g.fillOval(50,50,150,150);
            }
        };
        frame.add(panel);
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponents(g);
                g.setColor(Color.RED);
                g.fillRect(50,50,150,150);
            }
        };
        frame.add(panel);
    }
}
class Triangle implements Drawable{
    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponents(g);
                g.setColor(Color.BLACK);
                int[] xPoints = {200, 100, 300};
                int[] yPoints = {100, 300, 300};
                g.fillPolygon(xPoints,yPoints,3);
            }
        };
        frame.add(panel);
    }
}*/

//Q25. Write a Java program to create an interface Playable with a method play() that takes
    // no arguments and returns void. Create three classes Football, Volleyball, and
    // Basketball that implement the Playable interface and override the play() method to
    // play the respective sports.
/*interface Playable{
    void play();
}
class Football implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Football.");
    }
}
class Volleyball implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}
class Basketball implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Basketball.");
    }
}*/

//Q26.

public class CH11_SelfExercise {
    public static void main(String[] args) {
        //Q1
        /*//Animal1 animal = new Animal1(); //object nhi ban sakta abstract class ka.
        Animal1 lion = new Lion();
        lion.sound();
        Animal1 tiger = new Tiger();
        tiger.sound();*/

        //Q2
        /*Shape circle = new Circle(3.2);
        System.out.println("Area Of Circle: "+circle.calculateArea());
        System.out.println("Perimeter of Circle: "+circle.calculatePerimeter());
        System.out.println();

        Shape triangle = new Triangle(4,2,3);
        System.out.println("Area Of Triangle: "+triangle.calculateArea());
        System.out.println("Perimeter of Triangle: "+triangle.calculatePerimeter());*/

        //Q3
        /*double bkbalance = 1100.234;
        BankAccount account = new SavingAccount("SA12345",bkbalance);
        System.out.println("Acc. No: "+account.getAccountNumber());
        System.out.println("Bank Balance: "+account.getBalance());
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println();

        BankAccount account1 = new CurrentAccount("CA12345",bkbalance);
        System.out.println("Acc. No: "+account1.getAccountNumber());
        System.out.println("Bank Balance: "+account1.getBalance());
        account1.deposit(4560);
        account1.withdraw(5000);*/

        //Q4
        /*Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        System.out.println();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();*/

        //Q5
        /*Manager manager = new Manager("Rahul Aghan",45245.56,5456.45);
        manager.displayInfo();
        System.out.println();
        Programmer programmer = new Programmer("Raj Dhole",30045.34,3.5,1500);
        programmer.displayInfo();*/

        //Q6
        /*Sphere sphere = new Sphere(7.2);
        System.out.println("Radius of Sphere: "+sphere.radius);
        System.out.println("Volume of Sphere: "+sphere.calculateVolume());
        System.out.println("Surface Area of Sphere: "+sphere.calculateSurfaceArea());
        System.out.println();

        Cube cube = new Cube(6.2);
        System.out.println("Sides of Cube: "+cube.sideLen);
        System.out.println("Volume of Cube: "+cube.calculateVolume());
        System.out.println("Surface Area of Cube: "+cube.calculateSurfaceArea());*/

        //Q7
        /*Car car = new Car();
        car.startEngine();
        car.stopEngine();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();*/

        //Q8
        /*Athlete athlete = new Athlete();
        System.out.println("Athlete: ");
        athlete.eat();
        athlete.exercise();
        System.out.println();

        System.out.println("Lazy Person: ");
        LazyPerson person = new LazyPerson();
        person.eat();
        person.exercise();*/

        //Q9
        /*Glockenspiel glockenspiel = new Glockenspiel();
        glockenspiel.play();
        glockenspiel.tune();
        System.out.println();

        Violin violin = new Violin();
        violin.play();
        violin.tune();*/

        //Q10
        /*Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.draw();
        rectangle.resize();

        circle.draw();
        circle.resize();*/

        //Q11
        /*Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();*/

        //Q12
        /*Triangle triangle = new Triangle(6,4,6);
        System.out.println("Length of side1 is "+triangle.side1Length+" and side2 is "+triangle.side2Length+" and side3 is "+triangle.side3Length);
        System.out.println("Area of Triangle: "+triangle.area());
        System.out.println("Perimeter od Triangle: "+triangle.perimeter());*/

        //Q13
        /*Child01 child1 = new Child01();
        Child02 child2 = new Child02();

        child1.message();
        child2.message();*/

        //Q14
        /*BankA bankA = new BankA(100);
        System.out.println("BankA Balance: $"+bankA.getBalance());
        BankA bankB = new BankA(150);
        System.out.println("BankB Balance: $"+bankB.getBalance());
        BankA bankC = new BankA(200);
        System.out.println("BankC Balance: $"+bankC.getBalance());*/

        //Q15
        /*A2 a2 = new A2(89,75,77);
        System.out.println("Student A Marks: "+a2.getPercentage());
        B1 b1 = new B1(78,89,67,89);
        System.out.println("Student B Marks: "+b1.getPercentage());*/

        //Q16
        /*SubClass subClass = new SubClass();
        subClass.a_method();
        subClass.normal_method();*/

        //Q17
        /*Cats cat = new Cats();
        Dogs dog = new Dogs();
        cat.cats();
        dog.dogs();*/

        //Q18
        /*Area area = new Area();
        area.rectangleArea(4.5,6.7);
        area.squareArea(5.5);
        area.circleArea(4.5);*/

        //Q19
        /*Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2,9);

        System.out.println("Area of Rectangle: "+rectangle.getArea());
        System.out.println("Area of Circle: "+circle.getArea());
        System.out.println("Area of Triangle: "+triangle.getArea());*/

        //Q20
        /*Dog1 dog1 = new Dog1();
        dog1.bark();*/

        //Q21
        /*Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();*/

        //Q22
        /*CurrentAccount cAccount = new CurrentAccount(5055,2500);
        SavingAccount sAccount = new SavingAccount(4500,2.4);
        BankAccount account = new BankAccount(2550,3.7);

        Scanner sc = new Scanner(System.in);
        System.out.println("Current Account: ");
        System.out.println("Balance: "+cAccount.viewBalance()+"rs.");
        System.out.println("Enter your deposit Amount: ");
        double depositAmount = sc.nextDouble();
        cAccount.deposit(depositAmount);
        System.out.printf("After deposit %.2frs, Balance: %.2frs.\n",depositAmount,cAccount.viewBalance());
        System.out.println("Enter your withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();
        cAccount.withdraw(withdrawAmount);
        System.out.printf("After withdrawal %.2frs, Balance: %.2frs.",withdrawAmount,cAccount.viewBalance());
        System.out.println();

        System.out.println("Saving Account: ");
        System.out.println("Balance: "+sAccount.accBalance);
        System.out.println("Interest Rate: "+sAccount.getInterestRate());
        System.out.println("Enter your deposit Amount: ");
        double depositAmt = sc.nextDouble();
        sAccount.deposit(depositAmt);
        System.out.printf("After deposit %.2frs, Balance: %.2frs.\n",depositAmt,sAccount.accBalance);
        System.out.println("Enter your withdrawal Amount: ");
        double withdrawalAmt = sc.nextDouble();
        sAccount.withdraw(withdrawalAmt);
        System.out.printf("After withdrawal %.2frs, Balance: %.2frs.\n",withdrawalAmt,sAccount.accBalance);

        System.out.println("Bank Account: ");
        System.out.println("Balance: "+account.accBalance);
        System.out.printf("Interest Rate: %.1f, and interest amount balance: %.2frs.\n",account.interestRate,account.getInterestRate());
        System.out.println("Enter your deposit Amount: ");
        double depositAmt1 = sc.nextDouble();
        account.deposit(depositAmt1);
        System.out.printf("After deposit %.2frs, Balance: %.2frs.\n",depositAmt1,account.viewBalance());
        System.out.println("Enter your withdrawal Amount: ");
        double withdrawalAmt1 = sc.nextDouble();
        account.withdraw(withdrawalAmt1);
        System.out.printf("After withdrawal %.2frs, Balance: %.2frs.\n",withdrawalAmt1,account.viewBalance());*/

        //Q23
        /*Rectangle rectangle = new Rectangle(3,7);
        System.out.println("Original size: ");
        rectangle.printRectangleWidthHeight();
        rectangle.resizeWidth(6);
        rectangle.resizeHeight(5);
        System.out.println("After Resize: ");
        rectangle.printRectangleWidthHeight();*/

        //Q24
        /*Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();*/

        //Q25
        /*Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();*/

        //Q26

    }
}
