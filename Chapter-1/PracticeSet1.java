import java.util.Scanner;
class PracticeSet1 {
    public static void main(String[] args){
       // Question 1 : Sum of three numbers
        /*int a = 5;
        int b = 7;
        int c = 8;
        int sum = a + b + c;
        System.out.printf("Sum of three Numbers: "+sum);*/

        //using Scanner class
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third Number: ");
        double num3 = sc.nextDouble();
        double sum = num1 + num2 + num3;
        System.out.println("sum of three numbers is: "+sum);*/

        // Question 2: Calculate CGPA using a marks of three subjects
        /*int subMarks1 = 45;
        int subMarks2 = 95;
        int subMarks3 = 48;
        float total = subMarks1 + subMarks2 + subMarks3;
        float cgpa = (total/300) * 10 ;
        System.out.println("CGPA is : "+cgpa);*/

        //Using Scanner class
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Subject marks: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter second Subject marks: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter third Subject marks: ");
        int sub3 = sc.nextInt();
        float totalMarks = sub1 + sub2 + sub3;
        float cgpa = totalMarks / 300 *10;
        System.out.println("CGPA is: "+cgpa);*/

        //Question 3:print users name with  hello message.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a Good day!");*/

        //Question 4:convert kilometers to miles
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers: ");
        float kilometers = sc.nextFloat();
        double miles = kilometers * 0.62137119;
        System.out.println("Kilometers to miles: "+miles);*/

        //Question 5: Detect whether a number entered by user is integer or not
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number: ");
        System.out.println(sc.hasNextInt());
    }
}
