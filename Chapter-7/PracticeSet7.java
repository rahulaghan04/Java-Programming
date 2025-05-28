public class PracticeSet7 {
    //Question 1:Write a method to print multiplication table of a number n.
    /*static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",i,n,i*n);
        }
    }
    public static void main(String[] args) {
        multiplication(2);
    }*/

    //Question 2:Write a program using functions to print following pattern.
    //*
    //* *
    //* * *
    //* * * *
    /*static void pattern(int n) {
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }*/

    //Question 3:Write a recursive function to calculate sum of first n natural numbers.
    /*static int sumOfNaturalNum(int n){
        //sum(n) = 1 + 2 + 3.....+n
        //sum(n) = 1 + 2 + 3.....+ n-1 + n
        //sum(n) = sum(n-1) + n
        int sum = 0;
        if(n==1){
            return 1;
        }
        return n + sumOfNaturalNum(n-1);
    }

    public static void main(String[] args) {
        int c = sumOfNaturalNum(15);
        System.out.println(c);
    }*/

    //Question 4: Write a program using functions to print following pattern.
    //* * * *
    //* * *
    //* *
    //*
    /*static void pattern2(int n) {
        for (int i=n; i>=1; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
         pattern2(4);
    }*/

    //Question 5: Write a function to print n^th term of fibonacci series using recursion.
    /*static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if (n==0) {
            return 0;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        /*if(n==0 || n==1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }*/
    /*}
    public static void main(String[] args) {
        int fib = fibonacci(9);
        System.out.println("the n^th term of fibonacci series is: "+fib);
    }*/

    //Question 6: Write a function to find average of a set of numbers passed as arguments.
    /*static float numbers(int ...arr){
        int sum = 0;
        float avg = 0f;
        for(int element: arr){
            sum += element;
            avg = ((float)sum/arr.length);
        }
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(numbers(2,3,5,6,7,8));
    }*/

    //Question 7: Repeat 4 using recursion.
    /*static void pattern1(int n) {
        if(n>0){
            for(int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern1(n-1);
        }
    }
    public static void main(String[] args) {
        pattern1(4);
    }*/

    //Question 8: Repeat 2 using recursion.
    /*static void pattern(int n) {
        if(n>0){
            pattern(n-1);
            for(int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }*/

    //Question 9: Write a function to convert Celsius temperature into Fahrenheit.
    /*static double celsiusToFahrenheit(double Celsius){
        return ((Celsius*9/5)+32);
    }
    public static void main(String[] args) {
        double value = celsiusToFahrenheit(56);
        System.out.println("The Temperature is Celsius to Fahrenheit: "+value);
    }*/

    //Question 10: Repeat 3 using iterative approach.
    static int sumOfNaturalNum(int n) {
        //sum(n) = 1 + 2 + 3.....+n
        //sum(n) = 1 + 2 + 3.....+ n-1 + n
        //sum(n) = sum(n-1) + n
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = sumOfNaturalNum(5);
        System.out.println(sum);
    }
}
