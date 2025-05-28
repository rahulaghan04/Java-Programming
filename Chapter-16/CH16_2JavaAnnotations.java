package com.Rahulaghan;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
}
class NewPhoneClass extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 10PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class CH16_2JavaAnnotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhoneClass phone = new NewPhoneClass();
        phone.showTime();
        phone.sum(5,6);
    }
}
