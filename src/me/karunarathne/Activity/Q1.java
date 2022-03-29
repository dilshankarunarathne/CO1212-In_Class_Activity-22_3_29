package me.karunarathne.Activity ;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table
 */
public class Q1 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        while (true) {
            try {
                if (!mainLoop()) break;
            } finally {
                scanner.close () ;
            }
        }
    }

    private static boolean mainLoop() throws InputMismatchException {
        printMultiTable (readNumber ()) ;
        return askRepeat () ;
    }

    private static boolean askRepeat() throws InputMismatchException {
        print ("Would you like to do another? (Y/N) > ") ;
        try {
            return scanner.nextLine().equalsIgnoreCase("y");
        } catch (Exception e) {
            throw new InputMismatchException ("unexpected form of input") ;
        }
    }

    private static void printMultiTable(int number) {
        for (int i=1; i<=10; i++) {
            print (
                number + " x " + i + "\t= " + number*i + "\n"
            ) ;
        }
    }

    private static int readNumber() throws InputMismatchException {
        print ("Enter a number > ") ;
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            throw new InputMismatchException ("incorrect format of input") ;
        }
    }

    private static void print (String output) {
        System.out.print (output) ;
    }
}
