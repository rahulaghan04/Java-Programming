import java.util.Scanner;
class PracticeSet2 {
    public static void main(String[] args){
        //Question 1: result following expression = 7/4*9/2
        /*float a = 7/4*9/2; //(4) kyuki ye integer hai sub to iski value integer me ayegi
        System.out.println(a);*/

        //Question 2: encrypt a grade by adding 8 to it decrypt it to.
        //encrypt
        /*char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //decrypt
        grade = (char)(grade - 8);
        System.out.println(grade);*/

        //Question 3: find out whether a given number is greater than the user entered number or not
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println(num>66);*/

        //Question 4: write following expression: v*v-u*u/2*a*s
        /*int v = 4;
        int u = 2;
        int a = 5;
        int s = 3;
        int sum = (v*v-u*u/2*a*s);
        System.out.println(sum); //-14*/

        //Question 5: write following expression: int x=7, int a=7*49/7+35/7 value of a?
        int x = 7;
        int a = (7*49/7+35/7);
        System.out.println(a);
    }
}
