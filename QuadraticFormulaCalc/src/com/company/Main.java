package com.company;
import java.util.*;
public class Main {
static Scanner getInput;
    public static void main(String[] args) {
        getInput = new Scanner(System.in);
        System.out.println("Please Input A\n\nExample if a is 2:    |     Example if a is 1/4:\n2                     |     1\n1                     |     4");
        double na = getInput.nextDouble();
        double da = getInput.nextDouble();
        double a = na/da;
        System.out.println("Please Input B");
        double nb = getInput.nextDouble();
        double db = getInput.nextDouble();
        double b = nb/db;
        System.out.println("Please Input C ");
        double nc = getInput.nextDouble();
        double dc = getInput.nextDouble();
        double c = nc/dc;
        double sqrt = (b * b) - 4 * a * c;
        double x = (-1 * b + Math.sqrt(sqrt)) / (2 * a);
        double y = (-1 * b - Math.sqrt(sqrt)) / (2 * a);
        System.out.println("Your roots are: " + x + " & " + y);
    }
}
