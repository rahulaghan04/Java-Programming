import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String getMessage(){
        return "Error...";
    }
}
public class PracticeSet14 {
    public int indValue() throws MaxRetriesException{
            throw new MaxRetriesException();
    }
    public static void main(String[] args) {
        //Question 1: WAP to demonstrate Syntax, logical, runtime errors.
        //Syntax error.
        /*int a = 10 --->Semicolon missing.
         b = 45; ---> variable type is not defined.
        System.out.println(a+b);

        //Logical error.
        int age = 67;
        int year = 2000-67;
        System.out.println(year);

        //Runtime Error
        System.out.println(5/0);*/

        //Question 2: WAP that prints "HaHa" during ArithmeticException and "HeHe" during an
                    // IllegalArgumentException.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("HaHa....."+e);
        }
        catch (IllegalArgumentException e1){
            System.out.println("HeHe.....");
        }
        System.out.println("Program is ended.");*/

        //Question 3: WAP that allows you to keep accessing an array until a valid index is
                    // given. if max retries exceed 5 print "Error".
        /*int [] arr = new int[4];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Index value: ");
        int i = 0;
        while (i<5) {
            try {
                int indValue = sc.nextInt();
                System.out.println("The value in index: " + arr[indValue]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
            if(i>=5){
                System.out.println("Error");
            }
        }*/

        //Question 4: Modify program in Q3 to throw a custom Exception if max retries are
                    // reached.
        //Question 5: Wrap the program in Q3 inside a method which throws your custom Exception.
        int [] arr = new int[4];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Index value: ");
        int indValue = sc.nextInt();
        int ind = 0;
        while(ind<5){
            try {
                System.out.println("The value in index: " + arr[indValue]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Syntax");
                System.out.println(e.getMessage());
                ind++;
            }
        }
    }
}
