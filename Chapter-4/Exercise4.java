package com.Rahulaghan;

import java.util.Scanner;
import java.util.Random;
class Game{
    int number;
    int userInput;
    int noOfGuesses = 0;
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Guess The Number: ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(userInput == number){
            System.out.printf("Yes, You Guess Right!, the number is %d and You Guessed right number in %d attempt.",number,noOfGuesses);
            return true;
        }
        else if(userInput < number) {
            System.out.println("To Low!");
        }
        else if (userInput > number) {
            System.out.println("To High");
        }
        return false;
    }

}
public class Exercise4 {
    public static void main(String[] args) {
    /*
        Create a class Game, which allows a user to play "Guess the Number" game once.
        Game should have the following methods:
        1. Constructor to generate the random number.
        2. takeUserInput() to take a user input of number.
        3. isCorrectNumber() to detect whether the number entered by the user is true.
        4. getters and setters for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
     */
        Game game = new Game();
        boolean bool = false;
        while (!bool) {
            game.takeUserInput();
            bool = game.isCorrectNumber();
        }
    }
}
