package com.Rahulaghan;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){ //private method nhi use kar sakte interfaces me.
        System.out.println("Good Morning!");
    }
    default void record4KVideo(){
        //greet(); //ager private ki koi property print karani ho to use dusre method me dal sakate ho.
        System.out.println("Recording in 4K...");
    }
}
interface WiFi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class SmartPhone1 extends CellPhone implements WiFi,Camera{
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
public class CH11_3DefaultMethods {
    public static void main(String[] args) {
        SmartPhone1 smartPhone1 = new SmartPhone1();
        String[] arr = smartPhone1.getNetworks();
        for(String item: arr){
            System.out.println(item);
        }
        System.out.println();
        smartPhone1.connectToNetwork("Ketan\n");
        smartPhone1.callNumber(898980456);
        smartPhone1.pickCall();
        System.out.println();
        smartPhone1.takeSnap();
        smartPhone1.recordVideo();
        smartPhone1.record4KVideo();
        //smartPhone1.greet(); //throws error because private is support.
    }
}
