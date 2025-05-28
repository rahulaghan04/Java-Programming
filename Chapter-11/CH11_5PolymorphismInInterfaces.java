package com.Rahulaghan;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning!");
    }
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}
interface WiFi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class SmartPhone2 extends CellPhone2 implements WiFi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking Snap.");
    }
    public void recordVideo(){
        System.out.println("Record the Video.");
    }
    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks.");
        String[] networkList = {"Haresh", "Rakesh", "Arun", "Raj", "Ketan"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }
}
public class CH11_5PolymorphismInInterfaces {
    public static void main(String[] args) {
        //Camera2 camera2 = new Camera(); //Interfaces ka object nhi banta.
        Camera2 camera2 = new SmartPhone2(); //this is a smartphone but use it as a camera.
        //camera2.getNetworks(); --->not allowed
        camera2.takeSnap();
        camera2.recordVideo();
        camera2.record4KVideo();

        SmartPhone2 smartPhone2 = new SmartPhone2();
        smartPhone2.connectToNetwork("Rahul");
        smartPhone2.recordVideo();
        smartPhone2.takeSnap();
        smartPhone2.callNumber(767090908);
        smartPhone2.pickCall();
    }
}
