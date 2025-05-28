//Question 1: Create a class and add a method with deprecated annotation. What is
             // its effect on program execution.
/*class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("This is Method 1.");
    }
}*/

//Question 2: Create an interface and generate an instance from it.
/*interface MyInt{
    void display();
}*/

//Question 3: WAP to generate multiplication table of a given number and write it to a file.
import java.io.FileWriter;

//Question 4: Repeat 5 with numbers from 2 to 9 and save all these multiplication tables to
// a file.

public class PracticeSet16 {
    public static void main(String[] args) {
        //Q1:
        /*MyDeprecated deprecated = new MyDeprecated();
        deprecated.meth1();*/

        //Q2:
        /*MyInt myInt = ()-> System.out.println("I am display.");*/

        //Q3:
        /*int num = 19;
        String table = "";
        for (int i = 1; i <= 10 ; i++) {
            table += i+ " X " +num+ " = " +(num * i)+"\n";
        }
        System.out.println(table);
        try{
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Unable to write in the file: "+e);
        }*/

        //Q4:
        /*int num = 9; //-->2 to 9
        String table = "";
        for (int i = 1; i <= 10 ; i++) {
            table += i+ " X " +num+ " = " +(num * i)+"\n";
        }
        System.out.println(table);
        try{
            FileWriter fileWriter = new FileWriter("MultiplicationTableOf9.txt"); //-->2 to 9
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Unable to write in the file: "+e);
        }*/
    }
}
