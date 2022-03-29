package me.karunarathne.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements
 */
public class Q5 {
    private static Scanner scanner;
    private static String [] numbers ;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        try {
            while (true) {
                if (! mainLoop ()) break ;
            }
        } finally {
            scanner.close() ;
        }
    }

    private static boolean mainLoop() throws InputMismatchException, ArithmeticException {
        populateArray() ;
        try {
            printAvg(calculateSum() / numbers.length);
        } catch (Exception e) {
            throw new ArithmeticException("unexpected input for division") ;
        }
        return askRepeat ();
    }

    private static double calculateSum () throws InputMismatchException {
        double total = 0.0 ;
        for (String element: numbers) {
            try {
                total += Double.parseDouble(element);
            } catch (Exception e) {
                throw new InputMismatchException("expected numeric input") ;
            }
        }
        return total ;
    }

    private static void populateArray() throws InputMismatchException {
        print ("Input numbers seperated by spaces > ") ;
        try {
            numbers = scanner.nextLine().split(" ") ;
        } catch (Exception e) {
            throw new InputMismatchException("unexpected input") ;
        }
    }

    private static boolean askRepeat() throws InputMismatchException {
        print ("\n\nWould you like to do another? (Y/N) > ") ;
        try {
            return scanner.nextLine().equalsIgnoreCase("y");
        } catch (Exception e) {
            throw new InputMismatchException("unexpected format of input") ;
        }
    }

    private static void print(String output) {
        System.out.print (output) ;
    }

    private static void printAvg (double avg) {
        System.out.print ("\nThe average is = " + avg) ;
    }
}
