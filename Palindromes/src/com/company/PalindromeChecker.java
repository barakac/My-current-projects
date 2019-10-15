package com.company;
import java.util.*;
public class PalindromeChecker {

static Scanner getInput;
static String yesNO;
static String word;
static String reversedWord;
static String newWord;

    public static void main(String[] args) {

    getInput =  new Scanner(System.in);
    startProgram();
    getWord();

    }
    public static void startProgram(){
        System.out.println("+-----------------------------------+" +
                "\n|-----------------------------------|" +
                "\n|-----------Start Program?----------|" +
                "\n|-----------------------------------|" +
                "\n+-----------------------------------+ ");
        yesNO = getInput.nextLine();
        if (yesNO.toLowerCase().equals("yes")||yesNO.toLowerCase().equals("y")){



        } else{

            System.out.println("Have a good day!");

        }
    }
    public static void getWord(){
        if (yesNO.toLowerCase().equals("yes")||yesNO.toLowerCase().equals("y")) {
            System.out.println("Input a word to checked: ");
            word = getInput.nextLine().toLowerCase();
            word = word.replaceAll(" ","");
            reversedWord = new StringBuilder(word).reverse().toString();
            if (reversedWord.toLowerCase().equals(word)) {

                System.out.println("Your word '" + word + "' is a palindrome!" + "\nNew word?");
                newWord = getInput.nextLine();
                if (newWord.toLowerCase().equals("yes") || newWord.toLowerCase().equals("y")) {

                    getWord();

                } else {

                    System.out.println("Have a good day!");

                }
            } else {

                System.out.println("Original: " + word + "\nReversed: " + reversedWord + "\nYour word " + word + " is not a palindrome" + "\nNew word?");
                newWord = getInput.nextLine();
                if (newWord.toLowerCase().equals("yes") || newWord.toLowerCase().equals("y")) {

                    getWord();

                } else {

                    System.out.println("Have a good day!");

                }
            }
        }
    }
}
