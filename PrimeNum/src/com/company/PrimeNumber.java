package com.company;
import java.util.*;
public class PrimeNumber{
    static Scanner getInput;

    public static void main(String[] args) {
        getInput = new Scanner(System.in);

        System.out.println("Please input a number to be checked.");
        long getCheck = getInput.nextLong();
        checkPrime(getCheck);


    }
    public static void checkPrime(long check){

        for (long i = 2; i <= check / 2 + 1; i++){
            //System.out.println(i);
            if (check % i == 0){

                System.out.println("Not Prime, divisible by " + i);
                break;

            }
            else if (i == check/2){

                System.out.println("Prime " + i);
                break;
            }
        }
        System.out.println("New number?");
        String getAnswer = getInput.next() + getInput.nextLine();
        if (getAnswer.toLowerCase().equals("yes") || getAnswer.toLowerCase().equals("y"))
        {

            System.out.println("Please input a number to be checked.");
            long getCheck = getInput.nextLong();
            checkPrime(getCheck);
        }
        else
        {
            System.out.println("Have a good day");
        }
    }
}
