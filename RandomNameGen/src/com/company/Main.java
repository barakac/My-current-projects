package com.company;
import java.util.*;
public class Main {
static Scanner getInput;
static String answer;
static Random Rnd;
static String myList;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        Random Rnd = new Random();
        ArrayList<String> myList = new ArrayList<>();

        getAnswer();



    }
    public static void getAnswer(){
        System.out.println("CHOOSE BY INPUTTING NUMBER" +
                "\n(1) Add to list of first names" +
                "\n(2) Add to list of last names" +
                "\n(3) Print list of first names" +
                "\n(4) Print list of last names" +
                "\n(5) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();

        } else if (answer.equals("2")){
           addListLast();

        } else if (answer.equals("3")){
           printListFirst();

        } else if (answer.equals("4")){
            printListLast();

        } else if (answer.equals("5")){
            printRndGenName();

        } else {
            getAnswer2();
        }
    }
    public static void getAnswer2(){
        System.out.println("NOT AN OPTION INPUT 1, 2, 3, 4, or 5");
        System.out.println("CHOOSE BY INPUTTING NUMBER" +
                "\n(1) Add to list of first names" +
                "\n(2) Add to list of last names" +
                "\n(3) Print list of first names" +
                "\n(4) Print list of last names" +
                "\n(5) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();

        } else if (answer.equals("2")){
            addListLast();

        } else if (answer.equals("3")){
            printListFirst();

        } else if (answer.equals("4")){
            printListLast();

        } else if (answer.equals("5")){
            printRndGenName();

        } else {
            System.out.println("Have a good day!");
        }
    }
    public static void addListFirst(){

        System.out.println("Please input desired names split by spaces");

    }
}
