package me.karunarathne.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like
 * the right angle triangle with a number.
 *          1
 *          1 2
 *          1 2 3
 *          1 2 3 4
 *          1 2 3 4 5
 */
public class Q6 {
    private static Scanner scanner;

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
        printPatternFor (readNumber ()) ;
        return askRepeat() ;
    }

    private static void printPatternFor(int number) {
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=i; j++) {
                print (j + " ") ;
            }
            print ("\n") ;
        }
    }

    private static int readNumber() throws InputMismatchException {
        print ("Enter a number > ") ;
        try {
            return Integer.parseInt(scanner.nextLine()) ;
        } catch (Exception e) {
            throw new InputMismatchException("input does not seem numeric") ;
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
}
