package com.Rahulaghan;

//we can create multiple Interfaces
interface Bicycle{
    int a = 50; //a's value is final value, it cannot be changed.
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornYPD();
}
class HeroCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee pee.");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake.....");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed Up......");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi Khushi kabhi Gam pee pee pee....");
    }
    public void blowHornYPD(){
        System.out.println("Yamla Pagla Deeewana po po po po....");
    }
}
public class CH11_2Interfaces {
    public static void main(String[] args) {
        HeroCycle myCycle = new HeroCycle();
        myCycle.applyBrake(1);
        //you can create properties in Interfaces.
        System.out.println(myCycle.a);
        //You cannot modify the properties in Interfaces as they are final.
        //myCycle.a = 455; //not allowed.
        myCycle.blowHorn();
        myCycle.blowHornK3g();
        myCycle.blowHornYPD();
    }
}
