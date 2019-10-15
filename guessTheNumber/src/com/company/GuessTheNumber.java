package com.company;
import java.util.*;
public class GuessTheNumber {
    static Scanner getInput;
    static Random rnd;
    static int randomNum;
    static int guess;
    public static void main(String[] args) {

        getInput = new Scanner(System.in);
        rnd = new Random();
        randomNum = rnd.nextInt(99);
        System.out.println("+------+\n|--" + randomNum + "--|\n+------+");
        /*
        +-------------------------------------------------------+
        |Creates Random Number and saves it as integer randomNum|
        +-------------------------------------------------------+
         */
        startRound();
        /*
        +-------------------------------------+
        |Asks user if they want to start round|
        +-------------------------------------+
         */
        getGuess();
    }
    public static void startRound() {
        System.out.println("+-----------------------------------+" +
                "\n|-----------------------------------|" +
                "\n|-----------START ROUND??-----------|" +
                "\n|-----------------------------------|" +
                "\n+-----------------------------------+");
        String choice = getInput.nextLine();
        if (choice.toLowerCase().equals("yes")||choice.toLowerCase().equals("y")) {

            System.out.println(" \n \n \nPLEASE GUESS ANY NUMBER LESS THAN 100: ");

        }
        else {

            System.out.println("+-----------------------------------+" +
                    "\n|-----------------------------------|" +
                    "\n|-----------IF YOU DIDN'T-----------|" +
                    "\n|-----------WANT TO PLAY------------|" +
                    "\n|-----------WHY DID YOU-------------|" +
                    "\n|-----------START THE---------------|" +
                    "\n|-----------PROGRAM!!!!-------------|" +
                    "\n|-------------cunt------------------|" +
                    "\n+-----------------------------------+");

        }

    }
    public static void getGuess() {
        guess = getInput.nextInt();
        if (guess >= 100){


            System.out.println("YOU GUESSED OVER 100\n AND DIDN'T FOLLOW INSTRUCTIONS\n(RE-RUN PROGRAM");


        }
        else if (guess < randomNum && guess < 100 && Math.abs(randomNum - guess) >= 10) {


            System.out.println("YOU GUESSED: " + guess);
            System.out.println("HIGHER, KEEP GUESSING!!");


        }
        else if (guess > randomNum && guess < 100 && Math.abs(randomNum - guess) >= 10) {


            System.out.println("YOU GUESSED: " + guess);
            System.out.println("LOWER, KEEP GUESSING!!");


        }
        else if (randomNum - guess < 0 && Math.abs(randomNum - guess) <= 10){


            System.out.println("YOU GUESSED: " + guess);
            System.out.println("VERY CLOSE");
            System.out.println("LOWER, KEEP GUESSING!!");


        }
        else if (randomNum - guess > 0 && Math.abs(randomNum - guess) <= 10) {


            System.out.println("YOU GUESSED: " + guess);
            System.out.println("VERY CLOSE");
            System.out.println("HIGHER, KEEP GUESSING!!");


        }
        if (guess == randomNum){

            System.out.println("YOU GUESS IT THE NUMBER WAS: " + guess);

        } else {
            getGuess();
        }
    }
}