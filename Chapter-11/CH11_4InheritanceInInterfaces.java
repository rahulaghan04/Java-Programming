package com.Rahulaghan;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    @Override
    public void meth2() {
        System.out.println("meth2");
    }
    @Override
    public void meth3() {
        System.out.println("meth3");
    }
    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class CH11_4InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.meth1();
        mySampleClass.meth2();
        mySampleClass.meth3();
        mySampleClass.meth4();
    }
}
