package com.Rahulaghan;

/*class Base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base now and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}*/

//Quick Quiz : Create a class animal and derive another class Dog from it.
class Animal{
    public String activity;
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
}
class Dog extends Animal{
    public String dogActivity;
    public String getDogActivity() {
        return dogActivity;
    }
    public void setDogActivity(String dogActivity) {
        this.dogActivity = dogActivity;
    }
}
public class CH10_1Inheritance {
    public static void main(String[] args) {
       //Creating an object of Base class
        /*Base base = new Base();
        base.setX(6);
        System.out.println(base.getX());

       //Creating an object of Derived class
        Derived derived = new Derived();
        derived.setX(7);
        System.out.println(derived.getX());*/

        //Quick Quiz
        Animal animal = new Animal();
        animal.setActivity("Barking");
        System.out.println("Dog is "+animal.getActivity());

        Dog dog = new Dog();
        dog.setActivity("Jumping");
        dog.setDogActivity("Running");
        System.out.println("Dog is "+dog.getActivity());
        System.out.println("Dog is "+dog.getDogActivity());
    }
}
