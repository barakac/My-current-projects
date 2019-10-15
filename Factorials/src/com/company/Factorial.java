package com.company;
import java.util.*;
public class Factorial {
    static Scanner getInput;
    static String yesNO;
    static long getNum;
    static String newNum;
    static long total;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        startProgram();
        if (yesNO.toLowerCase().equals("yes")||yesNO.toLowerCase().equals("y")) {

            System.out.println("Please input a number: ");
            getNum = getInput.nextLong();
            factorial(getNum);

        }
    }

    public static void startProgram() {
        System.out.println("+-----------------------------------+" +
                "\n|-----------------------------------|" +
                "\n|-----------Start Program?----------|" +
                "\n|-----------------------------------|" +
                "\n+-----------------------------------+ ");
        yesNO = getInput.nextLine();
        if (yesNO.toLowerCase().equals("yes") || yesNO.toLowerCase().equals("y")) {



        } else {

            System.out.println("Have a good day!");

        }
    }
    public static void factorial(long check){
        total = 1;
        total = getNum * total;
        for(long i = (check - 1); i > 1; i--){
            //System.out.println(total);
            total =  total * i;
            //System.out.println(total + " " + getNum + " " + i);
        }
        System.out.println("The factorial of " + getNum + " is " + total);
        System.out.println("New Number?");
        newNum = getInput.next() + getInput.nextLine();
        if (newNum.toLowerCase().equals("yes") || newNum.toLowerCase().equals("y"))
        {

            System.out.println("Please input a number: ");
            getNum = getInput.nextLong();
            factorial(getNum);

        }
        else
        {
            System.out.println("Have a good day");
        }
    }
}