package com.Rahulaghan;
import java.util.Scanner;
public class CH3_SelfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. WAP to print a string entered by user.
        /*System.out.println("Enter your String: ");
        String str = sc.next();
        System.out.println(str);*/

        //2. WAP to input and display the sentence "I Love Candies."
        /*String str1 = "I Love Candies.";
        System.out.println(str1);*/

        //3. WAP to find the length of the string "refrigerator".
        /*String str3 = "refrigerator";
        System.out.println(str3.length());*/

        //4. WAP to check if the letter 'e' is present in the word "Umbrella".
        /*String str4 = "Umbrella";
        boolean per = false;
        for(int i=0; i<str4.length(); i++){
            if(str4.charAt(i)=='e'){
                per = true;
                break;
            }
        }
        System.out.println(per);*/

        //5. WAP to check if the word 'orange' is present in the "This is orange juice".
        /*String str5 = "This is orange juice";
        String check = "orange";
        if(str5.contains(check)){
            System.out.println("String is present.");
        }
        else{
            System.out.println("String is not present.");
        }*/

        //6. WAP to find the first and last occurrence of the letter 'o' and Character ','
            // in "Hello, World".
        /*String str6 = "Hello, World";
        System.out.println(str6.indexOf('o'));
        System.out.println(str6.lastIndexOf('o'));
        System.out.println(str6.indexOf(','));
        System.out.println(str6.lastIndexOf(','));*/

        //7. WAP to find the numbers of vowels, consonants, digits and white space
             // characters in a string.
        /*System.out.println("Enter the String: ");
        String sentence = sc.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        sentence = sentence.toLowerCase();
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount++;
            }
            else if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                consonantsCount++;
            }
            else if (Character.isDigit(ch)) {
                digitsCount++;
            }
            else if (Character.isWhitespace(ch)) {
                spacesCount++;
            }
        }
        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consonantsCount);
        System.out.println("Number of Digits: "+digitsCount);
        System.out.println("Number of spaces: "+spacesCount);*/

        //8. WAP to delete all the consonants from the string "Hello, have a good day".
        /*String sentence = "Hello, have a good day";
        String resSentence = sentence.replaceAll("[^aeiouAEIOU^]"," ");
        System.out.println("Sentence after removing consonants: "+resSentence);*/

        //9. WAP to input a string of alphabets. Find out the number of occurrence of all
            // alphabets in that string. find out the alphabet with maximum occurrence.
        String str = "Hii, My name is Rahul, I am 19 Year older.";
        int[] alphaOccurrences = new int[26];
        for(char ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                char lowercaseCh = Character.toLowerCase(ch);
                alphaOccurrences[lowercaseCh - 'a']++;
            }
        }
        System.out.println("Original string: "+str);
        System.out.println("Occurrence of each alphabet: ");
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = alphaOccurrences[ch - 'a'];
            if(count > 0){
                System.out.println(ch+": "+count);
            }
        }
    }
}
