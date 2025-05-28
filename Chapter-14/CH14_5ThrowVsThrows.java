package com.Rahulaghan;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative.";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}
public class CH14_5ThrowVsThrows {
    public static float area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        float result = (float) Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
//        try {
//            int c = divide(6,0);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Exception ");
//        }
        try{
            double ar = area(-6);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
