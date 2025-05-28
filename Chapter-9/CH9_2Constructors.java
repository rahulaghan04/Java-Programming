package com.Rahulaghan;

class MyEmployee1{
    private int id;
    private int salary;
    private String name;

    public MyEmployee1(){
        id = 201;
        salary = 10000;
        name = "Rahul";
    }

    public MyEmployee1(String myName, int myId, int empSalary){
        id = myId;
        salary = empSalary;
        name = myName;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int n){
        this.salary = n;
    }
    public int getSalary(){
        return salary;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class CH9_2Constructors {
    public static void main(String[] args) {
        //MyEmployee1 myEmployee1 = new MyEmployee1("Rahul",205, 10000);
        MyEmployee1 myEmployee1 = new MyEmployee1();
        System.out.println(myEmployee1.getId());
        System.out.println(myEmployee1.getName());
        System.out.println(myEmployee1.getSalary());
    }
}
