package me.karunarathne.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program to swap two variables
 */
public class Q3 {
    private static Scanner scanner;
    private static double numberTwo;
    private static double numberOne;

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
    
    private static boolean mainLoop() throws InputMismatchException {
        numberOne = getNumber ("first");
        numberTwo = getNumber ("second") ;
        printCurrentState () ;
        swap () ;
        printCurrentState () ;

        return askRepeat() ;
    }

    private static void swap() {
        double temp = numberOne ;
        numberOne = numberTwo ;
        numberTwo = temp ;
    }

    private static void printCurrentState() {
        print (
            "The first number is = " + numberOne + 
            "\n The second number is = " + numberTwo + "\n") ;
    }

    private static double getNumber(String string) throws InputMismatchException {
        print ("Enter the " + string + " number > ") ;
        try {
            return Double.parseDouble(scanner.nextLine()) ;
        } catch (Exception e) {
            throw new InputMismatchException("input does not seem numeric") ;
        }
    }

    private static boolean askRepeat() throws InputMismatchException {
        print ("Would you like to do another? (Y/N) > ") ;
        try {
            return scanner.nextLine().equalsIgnoreCase("y");
        } catch (Exception e) {
            throw new InputMismatchException("unexpected format of input") ;
        }
    }

    private static void print(String output) {
        System.out.print (output) ;
    }
}
