package com.Rahulaghan;

//Access Specifiers & Constructor : 1) private
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n; //this.name = n ----> aise bhi likh sakte hai.
    }
    public void setId(int i){
        id = i; //this.id = i
    }
    public int getId(){
        return id;
    }
}
class Square{
    private int side;
    public int getArea(){
        return side * side;
    }
    public void setArea(int a){
        this.side = a;
    }
    public int getPerimeter(){
        return 4 * side;
    }
    public void setPerimeter(int p){
        this.side = p;
    }
}
public class CH9_1AccessModifiers {
    public static void main(String[] args) {
        MyEmployee raj = new MyEmployee();
        raj.setName("Raj Unadkat");
        raj.setId(213);
        System.out.println(raj.getName());
        System.out.println(raj.getId());

        Square square = new Square();
        square.setArea(5);
        square.setPerimeter(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
