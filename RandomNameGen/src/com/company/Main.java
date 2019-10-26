package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
static Scanner getInput;
static String answer;
static Random rnd;
static ArrayList<String> firstNames = new ArrayList<>();
static ArrayList<String> lastNames = new ArrayList<>();
static String addF;
static String addL;
static String contin;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        rnd = new Random();
        firstNames.add("Baraka");
        firstNames.add("Jon");
        firstNames.add("Thomas");
        lastNames.add("Consuegra");
        lastNames.add("Cili");
        lastNames.add("Buckley");
        getAnswer();
    }
    public static void getAnswer(){
        System.out.println("CHOOSE BY INPUTTING NUMBER" +
                "\n(1) Add to list of first names" +
                "\n(2) Add to list of last names" +
                "\n(3) Remove from list of first names" +
                "\n(4) Remove from list of last names" +
                "\n(5) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();
        } else if (answer.equals("2")){
            addListLast();
        } else if (answer.equals("3")){
            removeFromListFirst();
        } else if (answer.equals("4")){
            removeFromListLast();
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
                "\n(3) Remove from list of first names" +
                "\n(4) Remove from list of last names" +
                "\n(5) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();
        } else if (answer.equals("2")) {
            addListLast();
        } else if (answer.equals("3")){
            removeFromListFirst();
        }else if (answer.equals("4")){
            removeFromListLast();
        } else if (answer.equals("5")){
            printRndGenName();
        }
    }
    public static void cont(){
        System.out.println("ERROR ERROR ERROR");
        System.out.println("Continue?\n(YES||NO)");
        contin = getInput.next() + getInput.nextLine();
        if (contin.toLowerCase().equals("yes")||contin.toLowerCase().equals("y")){
            getAnswer();
        } else if (contin.toLowerCase().equals("no")||contin.toLowerCase().equals("n")){
            System.out.println("Are you sure all names will be erased?\n(YES||NO)");
            String sure = getInput.next() + getInput.nextLine();
            if (sure.toLowerCase().equals("no")||sure.toLowerCase().equals("n")){
                continSure();
            } else if (sure.toLowerCase().equals("yes")||sure.toLowerCase().equals("y")){
                System.out.println("Have a good day!");
            } else {
                cont();
            }
        } else {
            cont();
        }
    }
    public static void continSure(){
        System.out.println("Continue?\n(YES||NO)");
        contin = getInput.next() + getInput.nextLine();
        if (contin.toLowerCase().equals("yes")||contin.toLowerCase().equals("y")){
            getAnswer();
        } else if (contin.toLowerCase().equals("no")||contin.toLowerCase().equals("n")){
            System.out.println("Are you sure all names will be erased?\n(YES||NO)");
            String sure = getInput.next() + getInput.nextLine();
            if (sure.toLowerCase().equals("no")||sure.toLowerCase().equals("n")){
                continSure();
            } else if (sure.toLowerCase().equals("yes")||sure.toLowerCase().equals("y")){
                System.out.println("Have a good day!");
            } else {
                cont();
            }
        } else {
            cont();
        }
    }
    public static void addListFirst(){

        System.out.println("Please input desired names split by spaces and commas\nExample: \nBaraka, Jon, Thomas\n");
        addF = getInput.next() + getInput.nextLine();
        String[] addFirstsSplit = addF.split(" ");
        firstNames.addAll(Arrays.asList(addF));
        System.out.println("\nThese are the saved first names:\n" + firstNames);
        System.out.println("Continue?\n(YES||NO)");
        contin = getInput.next() + getInput.nextLine();
        if (contin.toLowerCase().equals("yes")||contin.toLowerCase().equals("y")){
            getAnswer();
        } else if (contin.toLowerCase().equals("no")||contin.toLowerCase().equals("n")){
            System.out.println("Are you sure all names will be erased?\n(YES||NO)");
            String sure = getInput.next() + getInput.nextLine();
            if (sure.toLowerCase().equals("no")||sure.toLowerCase().equals("n")){
                continSure();
            } else if (sure.toLowerCase().equals("yes")||sure.toLowerCase().equals("y")){
                System.out.println("Have a good day!");
            } else {
                cont();
            }
        } else {
            cont();
        }
    }
    public static void addListLast(){
        System.out.println("Please input desired names split by spaces and commas\nExample: \nConsuegra, Cili, Buckley\n");
        addL = getInput.next() + getInput.nextLine();
        String[] addLastsSplit = addL.split(" ");
        lastNames.addAll(Arrays.asList(addL));
        System.out.println("\nThese are the saved last names:\n" + lastNames);
        System.out.println("\nContinue?\n(YES||NO)");
        contin = getInput.next() + getInput.nextLine();
        if (contin.toLowerCase().equals("yes")||contin.toLowerCase().equals("y")){
            getAnswer();
        } else if (contin.toLowerCase().equals("no")||contin.toLowerCase().equals("n")){
            System.out.println("Are you sure all names will be erased?\n(YES||NO)");
            String sure = getInput.next() + getInput.nextLine();
            if (sure.toLowerCase().equals("no")||sure.toLowerCase().equals("n")){
                continSure();
            } else if (sure.toLowerCase().equals("yes")||sure.toLowerCase().equals("y")){
                System.out.println("Have a good day!");
            } else {
                cont();
            }
        } else {
            cont();
        }
    }
    public static void removeFromListFirst(){
        System.out.println("Enter in a name you want removed\n\nExample:\nBaraka\n\nOr type 'clear' to removed everything from the first names list");
        String removeFLF = getInput.next() + getInput.nextLine();
    }
    public static void removeFromListLast(){
        System.out.println("aaaa");
    }
    public static void printRndGenName(){
        String rndFromListFirst = firstNames.get(rnd.nextInt(firstNames.size()));
        String rndFromListLast = lastNames.get(rnd.nextInt(lastNames.size()));
        System.out.println("\nYour random name is\n\nFirst: " + rndFromListFirst + "\nLast: " + rndFromListLast);
        continSure();
    }
}
