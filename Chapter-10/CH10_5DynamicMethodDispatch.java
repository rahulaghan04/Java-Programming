package com.Rahulaghan;

class Phone{
    public void showTime(){
        System.out.println("Time is 9am.");
    }
    public void on(){
        System.out.println("Turning on the phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music!");
    }
    public void on(){
        System.out.println("Turning on the Smartphone...");
    }
}
public class CH10_5DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone vivo = new Phone();
//        SmartPhone lava = new SmartPhone();
//        vivo.name();
//        lava.name();

        Phone phone = new SmartPhone(); //yes it is allowed
        //SmartPhone phone1 = new Phone(); //not allowe5d
        phone.showTime(); //reference hai phone or object hai smartphone
        phone.on(); //smartphone ka on() object called hoga.
        //phone.music(); //not allowed
    }
}
