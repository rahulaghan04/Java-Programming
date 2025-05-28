package com.Rahulaghan;

//Q1. Create a class with a parameterized constructor to initialize two integer variables.
/*class Exp{
    int a,b;
    public Exp(int num1, int num2){
        this.a = num1;
        this.b = num2;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}*/

//Q2. Implement a default constructor in a class and initialize an instance variable.
/*class Exp{
    int a,b;
    public Exp(){
        //Default constructor
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}*/

//Q3. Design a class with multiple constructors, demonstrating method overloading.
/*class Exp1{
    int a, b, c;
    public Exp1(){
        this.a = 11;
        this.b = 12;
        this.c = 13;
    }
    public Exp1(int num1){
        this.a = num1;
        this.b = 45;
        this.c = 46;
    }
    public Exp1(int num1, int num2){
        this.a = num1;
        this.b = num2;
        this.c = 30;
    }
    public void setA(int num1) {
        this.a = num1;
    }
    public void setB(int num2) {
        this.b = num2;
    }
    public void setC(int num3) {
        this.c = num3;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
}*/

//Q4. Create a class representing a book with a parameterized constructor to initialize title
    // and author.
/*class Books{
    String title;
    String author;
    public Books(String bookTitle, String authorName){
        this.title = bookTitle;
        this.author = authorName;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}*/

//Q5. Implement a class with a default constructor and a setter method for initializing a
    // string variable.
/*class Exp{
    String sentence;
    public Exp(){
        //default
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public String getSentence() {
        return sentence;
    }
}*/

//Q6. Write a program with a class having a constructor that accepts an array of integers and
    // finds the sum.
/*class SumOfInteger{
    int[] arr;
    int sum;
    public SumOfInteger(int[] arrSame){
        this.arr = arrSame;
        addArr();
    }
    public void addArr(){
        for (int e: arr){
            sum += e;
        }
    }
    public int getSum(){
        return sum;
    }
}*/

//Q7. Design a class with a constructor that takes user input for initializing instance
    // variables.
/*class Exp{
    String name;
    int age;
    public Exp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your age: ");
        this.age = sc.nextInt();
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}*/

//Q8. Develop a class with a constructor to initialize an array of strings.
/*class Exp{
    String[] arr;
    public Exp(String[] arr){
        this.arr = arr;
    }
    public String[] getArr() {
        return arr;
    }
}*/

//Q9. Create a class with a copy constructor to duplicate the contents of another object.
/*class CopyConstructor{
    String name;
    int age;
    public CopyConstructor(){

    }
    public CopyConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }
    public CopyConstructor(CopyConstructor original){
        this.name = original.name;
        this.age = original.age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}*/

//Q10. Implement a class with a constructor to set default values for instance variables.
/*class Exp{
    String name;
    int age;
    public Exp(){
        this.name = "Default";
        this.age = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}*/

//Q11. Design a class representing a bank account with a constructor to initialize balance and
    // account number.
/*class BankAccount{
    long accountNumber;
    int balance;
    public BankAccount(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}*/

//Q12. Write a program using a constructor to initialize a static variable.
/*public class CH9_SelfExercise {
    private static int number;

    public CH9_SelfExercise(int num) {
        number = num;
    }

    public static int getNumber() {
        return number;
    }*/

//Q13. Develop a class with a constructor that takes multiple parameters to initialize
    // different data types.
/*class Exp{
    byte num1;
    int num2;
    long num3;
    float num4;
    double num5;
    short num6;
    boolean bool;
    String str;
    char ch;
    public Exp(byte num1, int num2, long num3, float num4, double num5, short num6){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }
    public Exp(String str, char ch, boolean bool){
        this.str = str;
        this.ch = ch;
        this.bool = bool;
    }
    public byte getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public long getNum3() {
        return num3;
    }
    public float getNum4() {
        return num4;
    }
    public double getNum5() {
        return num5;
    }
    public short getNum6() {
        return num6;
    }
    public String getStr() {
        return str;
    }
    public char getCh() {
        return ch;
    }
    public boolean isBool() {
        return bool;
    }
}*/

//Q14. Create a class with a parameterized constructor to initialize an object using values
    // from another object.
/*class Exp{
    String name;
    int age;
    public Exp(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static Exp extraClass(Exp SecClass){
        String newName = SecClass.getName();
        int newAge = SecClass.getAge();
        return new Exp(newName, newAge);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}*/

//Q15. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    // units by creating a class named 'Triangle' without any parameter in its constructor.
/*class Triangle{
    int a,b,c;
    public Triangle(){
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }
    public double getAreaOfTriangle(){
        double s = a + b +c/2.0f;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public int getPerimeterOfTriangle(){
        return a + b + c;
    }
}*/

//Q16.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    // units by creating a class named 'Triangle' with constructor having the three sides as
    // its parameters.
/*class Triangle{
    int a,b,c;
    public Triangle(int side1, int side2, int side3){
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }
    public double getAreaOfTriangle(){
        double s = a + b +c/2.0f;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public int getPerimeterOfTriangle(){
        return a + b + c;
    }
}*/

//Q17. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
    // respectively by creating a class named 'Rectangle' with a method named 'Area' which
    // returns the area and length and breadth passed as parameters to its constructor.
/*class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int getAreaOfRectangle(){
        return length * breadth;
    }
    public int getPerimeterOfRectangle(){
        return 2 * (length + breadth);
    }
}*/

//Q18. Develop a class with a constructor that generates a random number to initialize an
    // instance variable.
/*import java.util.Random;
import java.util.Scanner;
class RandomClass{
    int marks;
    public RandomClass(){
        Random rand = new Random();
        this.marks = rand.nextInt(20,100);
    }
    public int getMarks() {
        return marks;
    }
}*/

//Q19. Write a program to print the area of a rectangle by creating a class named 'Area' taking
    // the values of its length and breadth as parameters of its constructor and having a method
    // named 'returnArea' which returns the area of the rectangle. Length and breadth of
    // rectangle are entered through keyboard.
/*class AreaOfTriangle{
    int length;
    int breadth;
    public AreaOfTriangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int returnArea(){
        return length * breadth;
    }
}*/

//Q20. Add two distances in inch-feet by creating a class named 'AddDistance'.
class AddDistance{
    double inch;
    double feet;
    public AddDistance(double inch, double feet){
        this.inch = inch;
        this.feet = feet;
    }
    public double getAddition(){
        return inch + feet;
    }
}
public class CH9_SelfExercise {
    public static void main(String[] args) {
        //Q1
        /*Exp exp = new Exp(11,12);
        System.out.println(exp.a);
        System.out.println(exp.b);*/

        //Q2
        /*Exp exp = new Exp();
        exp.setA(10);
        exp.setB(20);
        System.out.println("a = "+exp.getA());
        System.out.println("b = "+exp.getB());*/

        //Q3
        //Fixed parameters
        /*Exp1 exp1 = new Exp1();
        System.out.println(exp1.getA());
        System.out.println(exp1.getB());
        System.out.println(exp1.getC());

        //custom 1 number.
        Exp1 exp1 = new Exp1(44);
        System.out.println(exp1.getA());
        System.out.println(exp1.getB());
        System.out.println(exp1.getC());

        //custom 2 number.
        Exp1 exp1 = new Exp1(10,20);
        System.out.println(exp1.getA());
        System.out.println(exp1.getB());
        System.out.println(exp1.getC());*/

        //Q4
        /*Books bk = new Books("Jungle Stories","Arjun Deshpande");
        System.out.println("Book Title: "+bk.getTitle());
        System.out.println("Author: "+bk.getAuthor());*/

        //Q5
        /*Exp exp = new Exp();
        exp.setSentence("Hello, Programmers!");
        System.out.println(exp.getSentence());*/

        //Q6
        /*int[] arr1 = {1, 2, 3, 4, 5};
        SumOfInteger sumOfInteger = new SumOfInteger(arr1);
        System.out.println("Sum of Array: "+sumOfInteger.getSum());*/

        //Q7
        /*Exp exp = new Exp();
        System.out.println("Name: "+exp.getName());
        System.out.println("Age: "+exp.getAge());*/

        //Q8
        /*String[] arrExp = {"Anil", "Baban", "Karan", "Rahul", "Aniket"};
        Exp exp = new Exp(arrExp);
        String[] tempStr = exp.getArr();
        for(String e: tempStr){
            System.out.print(e+" ");
        }*/

        //Q9
        /*CopyConstructor original = new CopyConstructor("Rahul",19);
        CopyConstructor duplicate = new CopyConstructor(original);
        System.out.println("Original Name: "+original.name);
        System.out.println("Original Age: "+original.age);
        System.out.println("Duplicate Name: "+duplicate.name);
        System.out.println("Duplicate Age: "+duplicate.age);*/

        //Q10
        /*Exp exp = new Exp();
        System.out.println(exp.getName());
        System.out.println(exp.getAge());*/

        //Q11
        /*BankAccount account = new BankAccount(67879898988976L,450976);
        System.out.println("Acc. No: "+account.getAccountNumber());
        System.out.println("Balance: Rs."+account.getBalance());*/

        //Q12
        /* static void main(String[] args) {
            CH9_SelfExercise staticExp = new CH9_SelfExercise(10);
            CH9_SelfExercise staticExp1 = new CH9_SelfExercise(20);
            System.out.println(getNumber());
        }*/

        //Q13
        /*Exp exp = new Exp((byte)100,333,45766878L,45.67f,67.677777d,(short)4566);
        Exp exp1 = new Exp("Rahul",'R',true);
        System.out.println("Byte: "+exp.getNum1());
        System.out.println("Int: "+exp.getNum2());
        System.out.println("long: "+exp.getNum3());
        System.out.println("Float: "+exp.getNum4());
        System.out.println("Double: "+exp.getNum5());
        System.out.println("Short: "+exp.getNum6());
        System.out.println("String: "+exp1.getStr());
        System.out.println("Char: "+exp1.getCh());
        System.out.println("Boolean: "+exp1.isBool());*/

        //Q14
        /*Exp exp = new Exp("Rahul", 19);
        Exp exp1 = Exp.extraClass(exp);
        System.out.println("Object 1 name: "+exp.getName());
        System.out.println("Object 1 age: "+exp.getAge());
        System.out.println("Object 2 Name: "+exp1.getName());
        System.out.println("Object 2 Age: "+exp1.getAge());*/

        //Q15
        /*Triangle triangle = new Triangle();
        System.out.println("Area of Triangle: "+triangle.getAreaOfTriangle());
        System.out.println("Perimeter of Triangle: "+triangle.getPerimeterOfTriangle());*/

        //Q16
        /*Triangle triangle = new Triangle(3,4,5);
        System.out.println("Area of Triangle: "+triangle.getAreaOfTriangle());
        System.out.println("Perimeter of Triangle: "+triangle.getPerimeterOfTriangle());*/

        //Q17
        /*Rectangle rect1 = new Rectangle(4,5);
        Rectangle rect2 = new Rectangle(5,8);
        System.out.println("Area of Rectangle1 is: "+rect1.getAreaOfRectangle()+" and Perimeter: "+rect1.getPerimeterOfRectangle());
        System.out.println("Area of Rectangle2 is: "+rect2.getAreaOfRectangle()+" and Perimeter: "+rect2.getPerimeterOfRectangle());*/

        //Q18
        /*RandomClass randomClass = new RandomClass();
        System.out.println("Marks: "+randomClass.getMarks());*/

        //Q19
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle: ");
        int breadth = sc.nextInt();
        AreaOfTriangle area = new AreaOfTriangle(length,breadth);
        System.out.println("Area of Rectangle: "+area.returnArea());*/

        //Q20
        AddDistance addDistance = new AddDistance(4.56,5.44);
        System.out.println("Addition of inch and feet: "+addDistance.getAddition());
    }
}
