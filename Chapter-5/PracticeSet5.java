public class PracticeSet5 {
    public static void main(String[] args) {
       //Question 1: WAP to print the following pattern.
        //* * * *
        //* * *
        //* *
        //*
        /*int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //Question 2: WAP to sum of first n even numbers using while loop.
        /*int i = 0;
        int sum = 0;
        while (i<5){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("sum of even numbers: "+sum);*/

        //Question 3: WAP to print multiplication table of given number n.
        /*int n = 5;
        System.out.printf("Multiplication Table of %d:\n",n);
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",i,n,i*n);
        }*/

        //Question 4: WAP to print multiplication table of given number n in reverse order.
        /*int n = 6;
        System.out.printf("Multiplication Table of %d in reverse order:\n",n);
        for(int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n",i,n,i*n);
        }*/

        //Question 5: WAP to find factorial of a given number using for loop.
        /*int n = 5;
        int i = 1;
        int fact = 1;
        for(i=1; i<=n; i++){
            fact *= i;
        }
        System.out.printf("Factorial of %d is: %d",n,fact);*/

        //Question 6: WAP to find factorial of a given number using while loop.
        /*int i = 1;
        int n = 5;
        int fact = 1;
        while (i<=n){
            fact *= i;
            i++;
        }
        System.out.printf("Factorial of %d is: %d",n,fact);*/

        //Question 7: WAP to question 1 using for / while loop
        /*int n = 4;
        for(int i=n; i>0; i--){
            int j = 0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
        }*/

        //Question 8: WAP to calculate the sum of the numbers occurring in the multiplication
                      // table of 8.
        /*int n = 8;
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = sum + (i*n);
        }
        System.out.println(sum);*/

        //Question 9: Repeat question 2 using for loop
        int n = 5;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println("sum of even numbers: "+sum);
    }
}
