package com.company;
import java.util.*;
public class Main {
static Scanner getInput;
// ArrayList<String> input = new ArrayList<>;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        System.out.println("Input elements split by a comma and then a space");
        String x = getInput.nextLine();
        String[] y = x.split(", ");
        for (int i = 0; i<y.length; i++) {
            System.out.println(">>> " + y[i] + ", " + i);
        }
    }
}
