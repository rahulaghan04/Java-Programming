package com.Rahulaghan;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int x){
        this.a = x;
    }
    public int returnOne(){
        return 1;
    }
}
class Doclass extends EkClass{
    Doclass(int b){
        super(b);
        System.out.println("mai ek constructor hoo");
    }
}
public class CH10_3ThisAndSuperKeyword {
    public static void main(String[] args) {
        EkClass ekClass = new EkClass(5);
        Doclass doclass = new Doclass(56);
        System.out.println(ekClass.getA());
    }
}
