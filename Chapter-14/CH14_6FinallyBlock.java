package com.Rahulaghan;

public class CH14_6FinallyBlock {
    public static int greet(){
        try{
            int a = 5;
            int b = 3;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of the Function.");
        }
        return -1;
    }
    public static void main(String[] args) {
        //greet();
        int g = greet();
        System.out.println(g);
        int a = 20;
        int b = 4;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I an finally for value of b is "+b);
            }
            b--;
        }
        /* {
            System.out.println(5/0); //try finally ke sath bhi execute ho jata hai.
        }
        finally {
            System.out.println("This is Finally.");
        }*/
    }
}
