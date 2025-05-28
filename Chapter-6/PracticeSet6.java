import java.util.Formatter;
public class PracticeSet6 {
    public static void main(String[] args) {
        //Question 1: Create a array of 5 float and calculate their sum.
        /*float [] num = {10.2f,32.32f,50.2f,5.34f,2.01f};
        float sum = 0;
        for(float element: num){
            sum = sum + element;
        }
        System.out.println("sum of float array is: "+sum);*/

        //Question 2: WAP to find out whether a given integer is present in an array or not.
        /*int [] numarr = {11,22,33,44,55,66,77,88,99};
        int num = 55;
        boolean isInArray = false;
        for (int element: numarr){
            if(num ==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.printf("%d is present in an array",num);
        }
        else{
            System.out.printf("%d is not present in an array",num);
        }*/

        /*Question 3: Calculate the average marks from an array containing marks of all
                        students in Physics using for-each loop.*/
        /*int [] numarr = {56,67,45,92,69,88,72,55,78,55};
        float sum = 0;
        for(int element: numarr){
            sum = sum + element;
        }
        System.out.println("Students average of physics marks: "+(sum/numarr.length));*/

        //Question 4: Create a java program to add two matrices of size 2 X 3.
        /*int [][] mat1 = {{2, 3, 4},
                         {4, 5, 6}};
        int [][] mat2 = {{4, 2, 3},
                         {5, 6, 3}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for(int i=0;i<mat1.length;i++){ //row numbers of times
            for(int j=0;j<mat1[i].length;j++){ //column numbers of times
                System.out.printf("Setting value of i=%d and j=%d\n", i, j);
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){ //row numbers of times
            for(int j=0;j<mat1[i].length;j++){ //column numbers of times
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }*/

        //Question 5: WAP to reverse an array.
        /*int [] numarr = {56,67,45,92,69,88,72,55,78,55};
        int l = numarr.length;
        int num = Math.floorDiv(l,2);
        int temp;
        for(int i=0; i<num; i++){
            //swap a[i] and a[l-i-1]
            temp = numarr[i];
            numarr[i] = numarr[l-i-1];
            numarr[l-i-1] = temp;
        }
        for(int element: numarr){
            System.out.print(element + " ");
        }*/

        //Question 6: WAP to find the maximum element in an array.
        /*int [] arr = {56,67,45,92,69,88,72,55,78,55};
        int max = 0;
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("Maximum element of an array is: "+max);*/

        //Question 7: WAP to find the minimum element in an array.


        //Question 8: WAP to check an array is shorted or not.
        /*int [] arr = {56,67,45,92,69,88,72,55,78,55};
        boolean isSorted = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){
                isSorted =false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }*/
    }
}
