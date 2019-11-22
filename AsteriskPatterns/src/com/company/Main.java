package com.company;
//mporting java utilities library
import java.util.*;
public class Main {
    //creating scanner variable getInput as a global variable
static Scanner getInput;
    public static void main(String[] args) {

        getInput = new Scanner(System.in);           //
        System.out.println("Pattern One or Two" +
                "\nPattern One:" +
                "\n*" +
                "\n**" +
                "\n***" +
                "\n****" +
                "\n***" +
                "\n**" +
                "\n*" +
                "\nPattern Two: " +
                "\n   *" +
                "\n  ***" +
                "\n *****" +
                "\n*******" +
                "\n *****" +
                "\n  ***" +
                "\n   *");
        String patternChoice = getInput.next() + getInput.nextLine();
        if (patternChoice.toLowerCase().equals("One")||patternChoice.equals("1")) {
            patternOne();
        } else if (patternChoice.toLowerCase().equals("Two")||patternChoice.equals("2")) {
            patternTwo();
        }
    }
    public static void patternOne() {
        System.out.println("How big do you want it to be?");
        int sizeOne = getInput.nextInt();
        System.out.println("Printing...");
        for (int i = 0; i < sizeOne; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = sizeOne-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Done");
    }
    public static void patternTwo() {
        System.out.println("How many rows do you want it to have?");
        int sizeTwo = getInput.nextInt();
        int k, i, space = 1;
        space = sizeTwo - 1;
        System.out.println("Printing...");
        for (i = 1; i <= sizeTwo; i++) {
            for (k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            space -= 1;
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (i = 1; i <= sizeTwo; i++) {
            for(k = 1; k <= space; k ++) {
                System.out.print(" ");
            }
            space ++;
            for(k =1; k <= 2 * (sizeTwo - i) - 1; k ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Done");
    }
}
