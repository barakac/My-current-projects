package com.company;
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
static String removeStringFromListFirst;
static String removeStringFromListLast;
static int instancesOf;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        rnd = new Random();
        firstNames.add("Baraka");
        firstNames.add("Jon");
        firstNames.add("Thomas");
        firstNames.add("Daniel");
        lastNames.add("Consuegra");
        lastNames.add("Cili");
        lastNames.add("Buckley");
        lastNames.add("Cardone");
        int occurrences = Collections.frequency(firstNames, "Baraka");
        getAnswer();
    }
    public static void getAnswer(){
        System.out.println("CHOOSE BY INPUTTING NUMBER" +
                "\n(1) Add to list of first names" +
                "\n(2) Print list of First Names" +
                "\n(3) Add to list of last names" +
                "\n(4) Print list of Last Names" +
                "\n(5) Remove from list of first names" +
                "\n(6) Remove from list of last names" +
                "\n(7) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();
        } else if (answer.equals("2")) {
            printFirstName();
        } else if (answer.equals("3")) {
            addListLast();
        } else if (answer.equals("4")) {
            printLastName();
        } else if (answer.equals("5")) {
            removeFromListFirst();
        } else if (answer.equals("6")) {
            removeFromListLast();
        } else if (answer.equals("7")) {
            printRndGenName();
        } else {
            getAnswer2();
        }
    }
    public static void printFirstName(){
        System.out.println(">>>Element, Index: ");
        Object[] y = firstNames.toArray();
        for (int i = 0; i<y.length; i++) {
            System.out.println(">>>" + y[i] + ", " + i);
        }
        getAnswer();
    }
    public static void printLastName(){
        System.out.println(">>>Element, Index: ");
        Object[] y = lastNames.toArray();
        for (int i = 0; i<y.length; i++) {
            System.out.println(">>>" + y[i] + ", " + i);
        }
        getAnswer();
    }
    public static void getAnswer2(){
        System.out.println("NOT AN OPTION INPUT 1, 2, 3, 4, 5, 6, or 7");
        System.out.println("CHOOSE BY INPUTTING NUMBER" +
                "\n(1) Add to list of first names" +
                "\n(2) Print list of First Names" +
                "\n(3) Add to list of last names" +
                "\n(4) Print list of Last Names" +
                "\n(5) Remove from list of first names" +
                "\n(6) Remove from list of last names" +
                "\n(7) Receive random name");
        answer = getInput.nextLine();
        if (answer.equals("1")){
            addListFirst();
        } else if (answer.equals("2")) {
            printFirstName();
        } else if (answer.equals("3")) {
            addListLast();
        } else if (answer.equals("4")) {
            printLastName();
        } else if (answer.equals("5")) {
            removeFromListFirst();
        } else if (answer.equals("6")) {
            removeFromListLast();
        } else if (answer.equals("7")) {
            printRndGenName();
        } else {
            getAnswer2();
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

        System.out.println("Please input desired names split by spaces and commas\nExample:\nBaraka, Jon, Thomas");
        addF = getInput.next() + getInput.nextLine();
        String[] addFirstsSplit = addF.split(", ");
        firstNames.addAll(Arrays.asList(addFirstsSplit));
        System.out.println("These are the saved first names:\n" + firstNames);
        System.out.println("Continue? (YES||NO)");
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
        System.out.println("Please input desired names split by spaces and commas\nExample: \nConsuegra, Cili, Buckley");
        addL = getInput.next() + getInput.nextLine();
        String[] addLastsSplit = addL.split(", ");
        lastNames.addAll(Arrays.asList(addLastsSplit));
        System.out.println("These are the saved last names:\n" + lastNames);
        System.out.println("Continue? (YES||NO)");
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
        removeStringFromListFirst = getInput.next() + getInput.nextLine();
        if (removeStringFromListFirst.toLowerCase().equals("clear")|| removeStringFromListFirst.toLowerCase().equals("c")){
            System.out.println("Clearing list...");
            int originalSizeOfFirstNames = firstNames.size();
            firstNames.clear();
            int newSizeOfFirstNames = firstNames.size();
            System.out.println("Original Size: " + originalSizeOfFirstNames + " New Size: " + newSizeOfFirstNames);
        } else {
            System.out.println("Remove all or amount? (All||Amount)");
            String allOrAmount = getInput.next() + getInput.nextLine();
            if (allOrAmount.toLowerCase().equals("all")){
                removeAllInstancesFirstNames();
            } else if (allOrAmount.toLowerCase().equals("amount")){
                removeAmountFirstName();
            } else {
                allOrAmountF();
            }
        }
        continSure();
    }
    public static void removeFromListLast(){
        System.out.println("Enter in a name you want removed\nExample:\nConsuegra\nOr type 'clear' to removed everything from the last names list");
        removeStringFromListLast = getInput.next() + getInput.nextLine();

        if (removeStringFromListLast.toLowerCase().equals("clear")|| removeStringFromListLast.toLowerCase().equals("c")) {
            System.out.println("Clearing list...");
            int originalSizeOfLastNames = lastNames.size();
            lastNames.clear();
            int newSizeOfLastNames = lastNames.size();
            System.out.println("Original Size: " + originalSizeOfLastNames + " New Size: " + newSizeOfLastNames);
            continSure();
        } else {
            System.out.println("Remove all or amount? (All||Amount)");
            String allOrAmount = getInput.next() + getInput.nextLine();

            if (allOrAmount.toLowerCase().equals("all")) {
                removeAllInstancesLastNames();

            } else if (allOrAmount.toLowerCase().equals("amount")) {
                removeAmountLastName();

            } else {
                allOrAmountL();
            }
            continSure();
        }
    }
    public static void printRndGenName(){
        String rndFromListFirst = firstNames.get(rnd.nextInt(firstNames.size()));
        String rndFromListLast = lastNames.get(rnd.nextInt(lastNames.size()));
        System.out.println("Your random name is: \n" + rndFromListFirst + " " + rndFromListLast);
        continSure();
    }
    public static void removeAllInstancesFirstNames() {
        System.out.println("Clearing first names of " + removeStringFromListFirst + "...");
        while (firstNames.contains(removeStringFromListFirst)){
            int index = firstNames.indexOf(removeStringFromListFirst);
            firstNames.remove(index);
        }
        System.out.println(firstNames);
    }
    public static void removeAllInstancesLastNames() {
        System.out.println("Clearing first names of " + removeStringFromListLast + "...");
        while (lastNames.contains(removeStringFromListLast)){
            int index = lastNames.indexOf(removeStringFromListLast);
            lastNames.remove(index);
        }
        System.out.println(lastNames);
    }
    public static void removeAmountFirstName(){
        System.out.println("How many instances do you want removed of " + removeStringFromListFirst + "?");
        instancesOf = getInput.nextInt();
        int occurrences = Collections.frequency(firstNames, removeStringFromListFirst.toLowerCase());
        if (instancesOf <= occurrences) {

            for (int i = 0; i < instancesOf; i++) {
                int index = firstNames.indexOf(removeStringFromListFirst);
                firstNames.remove(index);
            }
            System.out.println("New list: ");
            System.out.println(firstNames);
            getAnswer();
        } else if (occurrences == 0) {
            System.out.println("There are zero occurrences of: " + removeStringFromListLast + "in the firstNames list" +
                    "\nplease change the item you cant remove");
            removeFromListFirst();
        } else {
            int max = instancesOf-occurrences;
            System.out.println("Too many instances given there are: " + occurrences + " of: " + removeStringFromListFirst +
                    "\nplease input a smaller number, the max is: " + max);
            removeAmountFirstName();
        }
    }
    public static void removeAmountLastName(){
        System.out.println("How many instances do you want removed of " + removeStringFromListLast + "?");
        instancesOf = getInput.nextInt();
        int occurrences = Collections.frequency(lastNames, removeStringFromListLast.toLowerCase());
        if (instancesOf <= occurrences) {

            for (int i = 0; i < instancesOf; i++) {
                int index = lastNames.indexOf(removeStringFromListLast);
                lastNames.remove(index);
            }
            System.out.println("New list: ");
            System.out.println(lastNames);
            getAnswer();
        } else if (occurrences == 0) {
            System.out.println("There are zero occurrences of: " + removeStringFromListLast + "in the lastNames list" +
                    "\nplease change the item you cant remove");
            removeFromListLast();
        } else {
            int max = instancesOf-occurrences;
            System.out.println("Too many instances given there are: " + occurrences + " of: " + removeStringFromListLast +
                    "\nplease input a smaller number, the max is: " + max);
            removeAmountLastName();
        }
    }
    public static void allOrAmountF() {
        System.out.println("ERROR ERROR CHOOSE 'all' OR 'amount'");
        System.out.println("Remove all or amount? (All||Amount)");
        String allOrAmount = getInput.next() + getInput.nextLine();
        if (allOrAmount.toLowerCase().equals("all")) {
            removeAllInstancesFirstNames();
        } else if (allOrAmount.toLowerCase().equals("amount")) {
            removeAmountFirstName();
        } else {
            allOrAmountF();
        }
    }
    public static void allOrAmountL() {
        System.out.println("ERROR ERROR CHOOSE 'all' OR 'amount'");
        System.out.println("Remove all or amount? (All||Amount)");
        String allOrAmount = getInput.next() + getInput.nextLine();
        if (allOrAmount.toLowerCase().equals("all")) {
            removeAllInstancesLastNames();
        } else if (allOrAmount.toLowerCase().equals("amount")) {
            removeAmountLastName();
        } else {
            allOrAmountF();
        }
    }
}
