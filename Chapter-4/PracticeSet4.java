import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        //Question 1: what will be the output of this program:
        /*int a = 10;
        if(a = 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11"); //error on this code.
        }*/

        //Question 2: WAP to find out whether a student is pass or fail: if it requires total
                    // 40% and at least 33% in each subject to pass. Assume 3 subjects and take
                    //marks as an input from the user.
        /*byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Marathi: ");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Hindi: ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in English: ");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your Percentage is: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been Pass!");
        }
        else{
            System.out.println("Sorry, You have been fail!");
        }*/

        //Question 3: calculate income tax on following data
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        float tax = 0;
        float income = sc.nextFloat();
        if( income<=2.5){
            tax = tax +0;
        }
        else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5f && income <=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income > 10.0f) {
            tax = tax + 0.05f * (5.0f- 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax: "+tax);*/

        //Question 4: WAP to find out the day of the week given the number
                   // [1 for monday, 2 for tuesday....and so on!]
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no 1 to 7: ");
        int weekDay = sc.nextInt();
        System.out.println("Day of the Week: ");
        switch (weekDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Pta Nhi aaj kaunsa day hai");
        }*/

        //Question 5: WAP to find whether a year entered by the user is a leap year or not.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if((year%4 == 0 || year%400 ==0) && year%100 != 0){
            System.out.println("This year is leap year.");
        }
        else{
            System.out.println("This year is not a leap year.");
        }*/

        //Question 6: WAP to find out the type of website from the url.
        //.com--->Commercial, .org--->Organizational, .in--->Indian
        System.out.println("Enter the website: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
