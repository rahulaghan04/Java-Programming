package com.Rahulaghan;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary() {
        return salary;
    }
}
public class CH8_1Creating_Our_Own_JavaClass {
    public static void main(String[] args) {
        System.out.println("This our custom class.");
        Employee rahul = new Employee(); //Instantiating a new employee object.
        Employee roshan = new Employee();

        //setting properties for rahul
        rahul.id = 7;
        rahul.name = "Rahul Aghan";
        rahul.salary = 40000;

        //setting properties for roshan
        roshan.id = 10;
        roshan.name = "Roshan Dore";
        roshan.salary = 30000;

        //printing properties
        //System.out.println(rahul.id);
        //System.out.println(rahul.name);

        rahul.printDetails();
        roshan.printDetails();
        int salary = rahul.getSalary();
        System.out.println(salary);
    }
}
