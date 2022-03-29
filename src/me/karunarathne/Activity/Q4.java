package me.karunarathne.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program to reverse a string
 */
public class Q4 {
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
    
    private static boolean mainLoop () throws InputMismatchException {
        reverseAndPrint (readString ()) ;
        return askRepeat() ;
    }

    private static void reverseAndPrint(String input) {
        print ("Reversed > ") ;
        for (int i=input.length()-1; i>=0; i--) {
            print (input.charAt(i)) ;
        }
    }

    private static String readString() throws InputMismatchException {
        print ("Enter the string > ") ;
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            throw new InputMismatchException("unexpected format of input") ;
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

    private static void print(char c) {
        System.out.print (c) ;
    }
}
