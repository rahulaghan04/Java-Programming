package com.Rahulaghan;

import java.util.Scanner;
public class CH6_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1. WAP to take input and print elements of array.
        /*System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the "+n+" elements in an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }*/

        //Q2. WAP to count total number of elements in array.
        /*int [] arr = {12, 32, 56, 35, 59, 78};
        System.out.println(arr.length+" elements in an array.");*/

        //Q3. WAP to count total number of even and odd elements in an array.
        /*int[] arr = {13, 42, 73, 44, 35, 66, 97, 38, 19, 20};
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                evenNum++;
            }
            else {
                oddNum++;
            }
        }
        System.out.println("Even Numbers in an array: "+evenNum);
        System.out.println("Odd Numbers in an array: "+oddNum);*/

        //Q4. WAP to count total number of negative elements in an array.
        /*int[] arr = {-12, 34, -45, 67, 56, 34, 45, -2, -7, 300, -220};
        int negNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                negNum++;
            }
        }
        System.out.println("Negative Numbers in an array: "+negNum);*/

        //Q5. WAP to print all negative elements in an array.
        /*int[] arr = {-12, 34, -45, 67, 56, 34, 45, -2, -7, 300, -220};
        System.out.println("Negative Numbers in an array: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                System.out.print(arr[i]+", ");
            }
        }*/

        //Q6. WAP to find reverse of an array.
        /*int[] arr = {12, 32, 56, 35, 59, 78};
        int[] tempArr = new int[arr.length];
        int tempVar = arr.length;
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            tempArr[tempVar - 1] = arr[i];
            tempVar = tempVar - 1;
            System.out.print(arr[i]+", ");
        }
        System.out.println("\nReversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(tempArr[i]+", ");
        }*/

        //Q7. WAP to find reverse of an array without using temp variable.
        /*int[] arr = {12, 32, 56, 35, 59, 78};
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        while (start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        System.out.println("\nReversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }*/

        //Q8. WAP to find sum of all array elements.
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            sum += arr[i];
        }
        System.out.print("\nSum of array: "+sum);*/

        //Q9. WAP to print minimum and maximum element in an array.
        /*int[] arr = {23, 65, 78, 456, 453, 324, 56, 2, 67, 32};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element in an Array: "+max);
        System.out.println("Minimum element in an Array: "+min);*/

        //Q10. WAP to print second-largest element in an array.
        /*int[] arr = {23, 65, 78, 456, 453, 324, 56, 2, 67, 32};
        int max = arr[0];
        int secMax = -1;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println("Second Largest Number in an array is: "+secMax);*/

        //Q11. WAP to print second-Smallest element in an array.
        /*int[] arr = {23, 65, 78, 2, 67, 32};
        int min = arr[0];
        int secMin = -1;
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                secMin = min;
                min = arr[i];
            } else if (secMin > arr[i] && arr[i] != min) {
                secMin = arr[i];
            }
        }
        System.out.println("Second Largest Number in an array is: "+secMin);*/

        //Q12. WAP to reads 10 numbers and displays the count of negative numbers, the count
            // of positive numbers and the count of zero from the array.
        /*int[] arr = {12, -2, 75, 0, -56, 23, 0, 34, -78, 89};
        int totalNegNum = 0;
        int totalPosNum = 0;
        int totalZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                totalNegNum++;
            }
            else if (arr[i] > 0){
                totalPosNum++;
            }
            else {
                totalZeros++;
            }
        }
        System.out.println("Count of Negative Numbers in the array: "+totalNegNum);
        System.out.println("Count of Positive Numbers in the array: "+totalPosNum);
        System.out.println("Count of Zeros in the array: "+totalZeros);*/

        //Q13. WAP to copy one array to another array.
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        System.out.println("Original Array: ");
        for (int element: arr1){
            System.out.print(element+" ");
        }
        System.out.print("\n");
        System.out.println("Copy of Original Array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i]+" ");
        }*/

        //Q14. WAP to insert an element at end of an array.
        /*int[] arr = {1, 2, 3, 4, 5};
        int arrLen = arr.length+1;
        int[] arr1 = new int[arrLen];
        System.out.print("Original Array: ");
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.print("\n");
        System.out.println("Enter the element to insert the end of an array: ");
        int insertElement = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arrLen-1] = insertElement;
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }*/

        //Q15. WAP to insert an element at the beginning of an array.
        /*int[] arr = {2, 3, 4, 5, 6};
        int arrLen = arr.length+1;
        int[] arr2 = new int[arrLen];
        System.out.print("Original Array: ");
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.print("Enter the element to insert the beginning of an Array: ");
        int newElement = sc.nextInt();
        for (int i = 1; i < arrLen; i++) {
            arr2[i] = arr[i-1];
        }
        arr2[0] = newElement;
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        //Q16. WAP to insert an element at a given location in an array.
        /*int[] arr = {1, 2, 4, 5, 6};
        int arrLen = arr.length + 1;
        int[] newArray = new int[arrLen];
        System.out.println("Original Array: ");
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.print("\n");
        System.out.print("Enter the new Element to insert: \n");
        int elementToInsert = sc.nextInt();
        System.out.println("Enter the location to insert new Element: ");
        int insertLocation = sc.nextInt();
        for (int i = 0; i < insertLocation - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[insertLocation - 1] = elementToInsert;
        for (int i = insertLocation; i < arrLen; i++) {
            newArray[i] = arr[i - 1];
        }
        System.out.print("Updated Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }*/

        //Q17. WAP to insert an element at a given index in an array.
        /*int[] arr = {1, 2, 4, 5, 6};
        int arrLen = arr.length + 1;
        int[] newArray = new int[arrLen];
        System.out.println("Original Array: ");
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.print("\n");
        System.out.print("Enter the new Element to insert: \n");
        int elementToInsert = sc.nextInt();
        System.out.println("Enter the index to insert new Element: ");
        int index = sc.nextInt();
        System.out.println(elementToInsert+" is inserted in index at: "+index);
        for (int i = 0; i < index - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[index - 1] = elementToInsert;
        for (int i = index; i < arrLen; i++) {
            newArray[i] = arr[i - 1];
        }
        System.out.print("Updated Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }*/

        //Q18. WAP to delete an element at the end of an array.
        /*int[] arr = {11, 22, 33, 44, 56};
        int arrLen = arr.length-1;
        int[] arr2 = new int[arrLen];
        System.out.println("Original Array: ");
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        //Q19. WAP to delete an element at first in an array.
        /*int[] arr = {11, 22, 33, 44, 56};
        int arrLen = arr.length-1;
        int[] arr2 = new int[arrLen];
        System.out.println("Original Array: ");
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i+1];
        }
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        //Q20. WAP to delete an element from an array at the given index.
        /*int[] arr = {11, 22, 33, 44, 55};
        int arrLen = arr.length-1;
        int[] arr2 = new int[arrLen];
        System.out.println("Original Array: ");
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Enter the index of an element to delete: ");
        int deleteIndex = sc.nextInt();
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i != deleteIndex){
                arr2[newIndex] = arr[i];
                newIndex++;
            }
        }
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        //Q21. WAP to count and print the frequency of each element in an array.
        /*int[] arr = {1, 2, 3, 4, 1, 3, 2, 2, 2, 5, 6, 3, 4, 5, 1, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] frequency = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0){
                System.out.println("Element "+i+" :"+frequency[i]+" times.");
            }
        }*/

        //Q22. WAP to print all unique elements in the array.
        /*int[] arr = {12, 23, 3, 4, 12, 34, 78, 89, 4, 5, 3, 6};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.print(arr[i]+" ");
            }
        }*/

        //Q23. WAP to count the total number of duplicate elements in an array.
        /*int[] arr = {12, 23, 3, 4, 12, 34, 78, 89, 4, 5, 3, 6, 23};
        int duplicateElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    duplicateElement++;
                }
            }
        }
        System.out.println("Total No. of Duplicate Element: "+duplicateElement);*/

        //Q24. WAP to delete all duplicate elements from an array.
        /*int[] arr = {12, 23, 3, 4, 12, 34, 78, 89, 4, 5, 3, 6, 23};
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            for (int j = i+1; j < arrLen; j++) {
                if(arr[i] == arr[j]){
                    for (int k = j; k < arrLen-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    arrLen--;
                    j--;
                }
            }
        }
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < arrLen; i++) {
            System.out.print(arr[i]+" ");
        }*/

        //Q25. WAP to merge two arrays into a third array.
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int arr3Len = arr1.length+ arr2.length;
        int[] arr3 = new int[arr3Len];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println("After Merging two arrays: ");
        for (int e: arr3){
            System.out.print(e+" ");
        }*/

        //Q26. WAP to separate even and an odd numbers of an array in two separate arrays.
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int j = 0, k = 0;
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                 evenArr[j] = arr[i];
                 j++;
            }
            else {
                oddArr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even Numbers from the Array: ");
        for (int i = 0; i < j; i++) {
            System.out.print(evenArr[i]+" ");
        }
        System.out.println();
        System.out.println("Odd Numbers from the Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(oddArr[i]+" ");
        }*/

        //Q27. WAP to search an element in an array.
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number to find in Array: ");
        int findNum = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findNum){
                System.out.println(findNum+" is present in the Array.");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(findNum+" is not present in the Array.");
        }*/

        //Q28. WAP to sort array elements in ascending order.
        /*int[] arr = {12, 56, 78, 134, 90, 45, 67, 78, 3, 5, 23, 48};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array in Ascending Order: ");
        for (int e: arr){
            System.out.print(e+" ");
        }*/

        //Q29. WAP to sort array elements in descending order.
        /*int[] arr = {12, 56, 78, 134, 90, 45, 67, 78, 3, 5, 23, 48};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array in Ascending Order: ");
        for (int e: arr){
            System.out.print(e+" ");
        }*/

        //Q30. WAP to check whether two arrays are equal in size or not.
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        if(arr1.length == arr2.length){
            System.out.println("Arrays are equals.");
        }
        else {
            System.out.println("Arrays are not equals.");
        }*/

        //Q31. WAP to find the largest and smallest number in an array.
        /*int[] arr = {66, 345, 34, 78, 89, 90, 567, 34, 12, 78, 90};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i] ;
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The Largest Number in an Array is: "+largest);
        System.out.println("The Smallest Number in an Array is: "+smallest);*/

        //Q32. WAP to find the second-highest number in an array.
        /*int[] arr = {11, 23, 45, 6, 89, 78, 89, 90, 34, 56};
        int max = arr[0];
        int secLarge = -1;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                secLarge = max;
                max = arr[i];
            } else if (secLarge < arr[i] && arr[i] != max) {
                secLarge = arr[i];
            }
        }
        System.out.println("The Second Largest Number is: "+secLarge);*/

        //Q33. WAP to find the top two maximum numbers in an array.
        /*int[] arr = {11, 23, 45, 6, 89, 78, 89, 90, 34, 56};
        int max = arr[0];
        int secLarge = -1;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                secLarge = max;
                max = arr[i];
            } else if (secLarge < arr[i] && arr[i] != max) {
                secLarge = arr[i];
            }
        }
        System.out.println("The First Largest Number is: "+max);
        System.out.println("The Second Largest Number is: "+secLarge);*/

        //Q34. WAP to perform one left rotation on an array.
        /*int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 1; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("Array after one left Rotation: ");
        for (int e : arr) {
            System.out.print(e+" ");
        }*/

        //Q35. WAP to perform one right rotation on an array.
        /*int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 1; i++) {
            int temp = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println("Array after one left Rotation: ");
        for (int e : arr) {
            System.out.print(e+" ");
        }*/

        //Q36. WAP to perform two left rotation on an array.
        /*int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 2; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("Array after one left Rotation: ");
        for (int e : arr) {
            System.out.print(e+" ");
        }*/

        //Q37. WAP to perform two right rotation on an array.
        /*int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 2; i++) {
            int temp = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println("Array after one left Rotation: ");
        for (int e : arr) {
            System.out.print(e+" ");
        }*/

        //Q38. WAP to Calculate and print the sum of the diagonal elements of a square matrix.
        /*int[][] mat = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 15, 16, 17}};
        System.out.println(mat[0][0]+mat[1][1]+mat[2][2]+mat[3][3]);*/

        //Q39. WAP to transpose the given matrix.
        /*int[][] matrix = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        System.out.println("Original Matrix: ");
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int[] row: matrix){
            for (int num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] row: matrix){
            for (int num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();*/

        //Q40. WAP to find the maximum element in a 2D array.
        /*int[][] matrix = {{1, 2, 3},
                            {4, 9, 6},
                            {7, 8, 5}};
        int max = 0;
        for (int[] row: matrix){
            for (int num: row){
                max = Math.max(max, num);
            }
        }
        System.out.println(max);*/

        //

        //Q41. WAP to find the sum of both diagonals in a matrix.
        /*int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);*/
    }
}
