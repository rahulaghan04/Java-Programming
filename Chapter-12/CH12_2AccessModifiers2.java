package com.Rahulaghan;

//Same class ke andar hum charo modifiers use kar sakte hai.
class A1{
    public int a = 6;
    protected int b = 8;
    int c = 9;
    private int d = 5;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class CH12_2AccessModifiers2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        //Class ke liye
        //a1.meth1(); --->Same class ke andar hum charo modifiers use kar sakte hai.

        //Package ke liye
        /*System.out.println(a1.a); //-->Same package ke andar hum 3 (public, protected, default)
        System.out.println(a1.b);//hi modifiers use kar sakte hai but private nhi use kar sakte.
        System.out.println(a1.c);
        //System.out.println(a1.d);*/

        //Subclass ke liye
        //Same Subclass ke andar hum 2(public, protected) hi modifiers use kar sakte hai
        //but default or private nhi use kar sakte.

        //World ke liye.
        //world matlab same class, package or sbclass ke alava aur kisi file me ho to sirf
        //public modifier hi use kar sakte hai.
    }
}
