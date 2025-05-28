package com.Rahulaghan;

//Q1. Write a Java program to create a class called Animal with a method called makeSound().
    // Create a subclass called Cat that overrides the makeSound() method to bark.
/*class Animal1{
    public void makeSound(){
        System.out.println("Animals makes a sound.");
    }
}
class Cat extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}*/

//Q2. Write a Java program to create a class called Vehicle with a method called drive().
    // Create a subclass called Car that overrides the drive() method to print "Repairing a car".
/*class Vehicle{
    public void drive(){
        System.out.println("Repairing a vehicle.");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing a car.");
    }
}*/

//Q3. Write a Java program to create a class called Shape with a method called getArea().
    // Create a subclass called Rectangle that overrides the getArea() method to calculate the
    // area of a rectangle.
/*class Shape{
    int width;
    int height;
    int area;
    public int getArea(){
        return area = 0;
    }
}
class Rectangle extends Shape{
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return area = width * height;
    }
}*/

//Q4. Write a Java program to create a class called Employee with methods called work() and
    // getSalary(). Create a subclass called HRManager that overrides the work() method and
    // adds a new method called addEmployee().
/*class Employee1{
    private final int salary;
    public Employee1(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Working as employee in the office.");
    }
    public int getSalary(){
        return salary;
    }
}
class HRManager extends Employee1{
    public HRManager(int salary){
        super(salary);
    }
    public void work(){
        System.out.println("Managing employees.");
    }
    public void addEmployee(){
        System.out.println("Adding New Employee.");
    }
}*/

import java.util.Scanner;

//Q5. Write a Java program to create a class known as "BankAccount" with methods called
    // deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
    // withdraw() method to prevent withdrawals if the account balance falls below one hundred.
/*class BankAccount{
    double accountBalance = 20000.23;
    double deposit;
    double withdraw;
    public void setDeposit(double depositAmt){
        this.deposit = depositAmt;
        System.out.println("Bank balance after deposit: "+(accountBalance+deposit));
    }
    public double getWithdraw(double withdraw){
        return withdraw = accountBalance - withdraw;
    }
    public double getDeposit() {
        return deposit;
    }
}
class SavingAccount extends BankAccount{
    double savingBalance = 100;
    public double getSavingBalance(double withdraw){
        return accountBalance;
    }
    public double withdrawSavings(double withdraw){
        if(savingBalance > 100){
            withdraw = savingBalance - withdraw;
        }
        else {
            System.out.println("Your Account saving balance is very low.");
        }
        return withdraw;
    }
}*/

//Q6. Write a Java program to create a class called Animal with a method named move().
    // Create a subclass called Cheetah that overrides the move() method to run.
/*class Animal5{
    public void move(){
        System.out.println("Animal is moving.");
    }
}
class Cheetah extends Animal5{
    @Override
    public void move(){
        System.out.println("Cheetah is running.");
    }
}*/

//Q7.Write a Java program to create a class known as Person with methods called getFirstName()
    // and getLastName(). Create a subclass called Employee that adds a new method named
    // getEmployeeId() and overrides the getLastName() method to include the employee's job
    // title.
/*class Person{
    String firstName;
    String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
class Employee1 extends Person{
    int employeeId;
    String jobTitle;
    public Employee1(String firstName, String lastName, int employeeId, String jobTitle){
        super(firstName,lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getLastName(){
        return super.getLastName()+", "+jobTitle;
    }
}*/

//Q8. Write a Java program to create a class called Shape with methods called getPerimeter()
    // and getArea(). Create a subclass called Circle that overrides the getPerimeter() and
    // getArea() methods to calculate the area and perimeter of a circle.
/*class Shape{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}*/

//Q9. Write a Java program to create a vehicle class hierarchy. The base class should be
    // Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    // properties such as make, model, year, and fuel type. Implement methods for
    // calculating fuel efficiency, distance traveled, and maximum speed.
/*class Vehicle{
    String make;
    String model;
    int year;
    String fuelType;
    double fuelEfficiency;
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getFuelType() {
        return fuelType;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}
class Truck extends Vehicle{
    double loadingCapacity;
    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double loadingCapacity){
        super(make,model,year,fuelType,fuelEfficiency);
        this.loadingCapacity = loadingCapacity;
    }
    public double getLoadingCapacity(){
        return loadingCapacity;
    }
    public double calculateFuelEfficiency(){
        return getFuelEfficiency()*(1.0/(1.0+(getLoadingCapacity()/1000.0)));
    }
    public double distanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double maxSpeed(){
        return 100.0;
    }
}
class Car extends Vehicle{
    int numOfSeats;
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numOfSeats){
        super(make,model,year,fuelType,fuelEfficiency);
        this.numOfSeats = numOfSeats;
    }
    public int getNumOfSeats(){
        return numOfSeats;
    }
    public double calculateFuelEfficiency(){
        return getFuelEfficiency()*(1.0/(1.0+(getNumOfSeats()/5.0)));
    }
    public double distanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double maxSpeed(){
        return 120.0;
    }
}
class Motorcycle extends Vehicle{
    int enginePower;
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, int enginePower){
        super(make,model,year,fuelType,fuelEfficiency);
        this.enginePower = enginePower;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public double calculateFuelEfficiency(){
        return getFuelEfficiency()*(1.0/(1.0+(getEnginePower()/1000.0)));
    }
    public double distanceTraveled(){
        return calculateFuelEfficiency()*getFuelEfficiency();
    }
    public double maxSpeed(){
        return 150.0;
    }
}*/

//Q10.Write a Java program that creates a class hierarchy for employees of a company. The
    // base class should be Employee, with subclasses Manager, Developer, and Programmer.
    // Each subclass should have properties such as name, address, salary, and job title.
    // Implement methods for calculating bonuses, generating performance reports, and
    // managing projects.
/*class Employee1{
    String name;
    String address;
    double salary;
    String jobTitle;
    public Employee1(String name, String address, double salary, String jobTitle){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double calculateBonus(){
        return 0.0;
    }
    public String generatePerformanceReport(){
        return "No report available";
    }
    public String manageProject(){
        return "No data available";
    }
}
class Manager extends Employee1{
    int performancePoint;
    public Manager(String name, String address, double salary, String jobTitle, int performancePoint){
        super(name, address, salary, jobTitle);
        this.performancePoint = performancePoint;
    }
    public int getPerformancePoint(){
        return performancePoint;
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.15;
    }
    @Override
    public String generatePerformanceReport(){
        return "Performance Report for Manager "+getName()+" is : Excellent";
    }
    @Override
    public String manageProject(){
        return "Manager "+getName()+" is managing the project.";
    }
}
class Developer extends Employee1{
    String programmingLanguage;
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage){
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.11;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance Report for Developer "+getName()+" is : Very Good";
    }
    public String manageProject(){
        return "Developer "+getName()+" is Writing code in "+(programmingLanguage);
    }
}
class Programmer extends Developer{
    public Programmer(String name, String address, double salary, String ProgramingLanguage){
        super(name, address, salary,"Programmer", ProgramingLanguage);
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.13;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance Report for Programmer "+getName()+" is : Good";
    }
    @Override
    public String manageProject() {
        return "Programmer "+getName()+" is Writing code in "+(programmingLanguage);
    }
}*/
public class CH10_SelfExercise {
    public static void main(String[] args) {
        //Q1
        /*Animal1 animal = new Animal1();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();*/

        //Q2
        /*Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();*/

        //Q3
        /*Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area of Rectangle: "+rectangle.getArea());*/

        //Q4
        /*Employee1 employee1 = new Employee1(20000);
        employee1.work();
        System.out.println("Employee Salary: "+employee1.getSalary());
        System.out.println();

        HRManager hrManager = new HRManager(70000);
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("Manager Salary: "+hrManager.getSalary());*/

        //Q5
        /*BankAccount bankAccount = new BankAccount();
        System.out.println("Bank Balance: Rs."+bankAccount.accountBalance);
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit Amount: Rs.");
        double deposit = sc.nextDouble();
        bankAccount.setDeposit(deposit);
        System.out.println("Bank balance after withdrawal:"+bankAccount.getWithdraw(250));

        SavingAccount savingAccount = new SavingAccount();
        System.out.println("Saving Acc. Balance: "+savingAccount.savingBalance);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your withdrawal amount: ");
        double withdraw = sc.nextDouble();
        System.out.println("Saving Acc. balance after withdrawal: "+savingAccount.withdrawSavings(withdraw));*/

        //Q6
        /*Animal5 animal = new Animal5();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move();
        Animal5 cheetah2 = new Cheetah();
        cheetah2.move();*/

        //Q7
        /*Employee1 employee1 = new Employee1("Arjun","Sharma",201,"HR Manager");
        System.out.println(employee1.getFirstName()+" "+employee1.getLastName()+"("+employee1.employeeId+")");
        Employee1 employee2 = new Employee1("Ravindra","Rajkumar",202,"Junior Developer");
        System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+"("+employee2.employeeId+")");*/

        //Q8
        /*double radius = 4.7;
        Circle circle = new Circle(radius);
        System.out.println("Radius Of Circle is: "+radius);
        System.out.println("Perimeter of Circle: "+circle.getPerimeter());
        System.out.println("Area of Circle: "+circle.getArea());*/

        //Q9
        /*Truck truck = new Truck("Tata","Tata Signa 1923.K",2015,"Diesel",9.234,6.2);
        Car car = new Car("Mahindra","Thar 4X4",2019,"Diesel",5.567,8);
        Motorcycle motorcycle = new Motorcycle("Royal Enfield","Bullet 350",2016,"Petrol",2.5,350);

        //Truck
        System.out.println("Truck Make By: "+truck.getMake());
        System.out.println("Truck Model: "+truck.getModel());
        System.out.println("Year: "+truck.getYear());
        System.out.println("Fuel Type: "+truck.getFuelType());
        System.out.printf("Loading Capacity: %.2f Ton\n",truck.getLoadingCapacity());
        System.out.printf("Fuel Efficiency: %.2f mpg\n",truck.calculateFuelEfficiency());
        System.out.printf("Total Distance Traveled: %.2f Miles\n",truck.distanceTraveled());
        System.out.printf("Max Speed: %.2f mph\n",truck.maxSpeed());
        System.out.println();

        //Car
        System.out.println("Car Make By: "+car.getMake());
        System.out.println("Car Model: "+car.getModel());
        System.out.println("Year: "+car.getYear());
        System.out.println("Fuel Type: "+car.getFuelType());
        System.out.printf("Capacity: %d \n",car.getNumOfSeats());
        System.out.printf("Fuel Efficiency: %.2f mpg\n",car.calculateFuelEfficiency());
        System.out.printf("Total Distance Traveled: %.2f Miles\n",car.distanceTraveled());
        System.out.printf("Max Speed: %.2f mph\n",car.maxSpeed());
        System.out.println();

        //Motorcycle
        System.out.println("Motorcycle Make By: "+motorcycle.getMake());
        System.out.println("Motorcycle Model: "+motorcycle.getModel());
        System.out.println("Year: "+motorcycle.getYear());
        System.out.println("Fuel Type: "+motorcycle.getFuelType());
        System.out.printf("Engine: %dCC.\n",motorcycle.getEnginePower());
        System.out.printf("Fuel Efficiency: %.2f mpg\n",motorcycle.calculateFuelEfficiency());
        System.out.printf("Total Distance Traveled: %.2f Miles\n",motorcycle.distanceTraveled());
        System.out.printf("Max Speed: %.2f mph\n",motorcycle.maxSpeed());*/

        //Q10
        /*Manager manager = new Manager("Aakash Sharma","Ashokanagar, Delhi",57020.45,"Manager",8);
        Developer developer = new Developer("Guru Deshpande","Virar East, Mumbai",45056.89,"Developer","Java/JavaScript/Python/SQL");
        Programmer programmer = new Programmer("Jagan Garade","Kharghar, Navi-Mumbai",38570.78,"Java/Javascript/Python");

        //Manager
        System.out.println("Name: "+manager.getName());
        System.out.println("Address: "+manager.getAddress());
        System.out.println("Job Title: "+manager.getJobTitle());
        System.out.println("Salary: "+manager.getSalary()+"rs.");
        System.out.println("Bonus: "+manager.calculateBonus()+"rs.");
        System.out.println("Performance Report: "+manager.generatePerformanceReport());
        System.out.println("Manage Project: "+manager.manageProject());
        System.out.println();

        //Developer
        System.out.println("Name: "+developer.getName());
        System.out.println("Address: "+developer.getAddress());
        System.out.println("Job Title: "+developer.getJobTitle());
        System.out.println("Salary: "+developer.getSalary()+"rs.");
        System.out.println("Bonus: "+developer.calculateBonus()+"rs.");
        System.out.println("Performance Report: "+developer.generatePerformanceReport());
        System.out.println("Manage Project: "+developer.manageProject()+" Languages.");
        System.out.println();

        //Programmer
        System.out.println("Name: "+programmer.getName());
        System.out.println("Address: "+programmer.getAddress());
        System.out.println("Job Title: "+programmer.getJobTitle());
        System.out.println("Salary: "+programmer.getSalary()+"rs.");
        System.out.println("Bonus: "+programmer.calculateBonus()+"rs.");
        System.out.println("Performance Report: "+programmer.generatePerformanceReport());
        System.out.println("Manage Project: "+programmer.manageProject()+" Languages.");*/
    }
}
