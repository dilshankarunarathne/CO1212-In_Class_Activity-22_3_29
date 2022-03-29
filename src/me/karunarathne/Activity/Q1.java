package me.karunarathne.Activity ;

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
            if (! mainLoop ()) break ;
        }
    }

    private static boolean mainLoop() {
        printMultiTable (readNumber ()) ;
        return askRepeat () ;
    }

    private static boolean askRepeat() {
        print ("Would you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static void printMultiTable(int number) {
        for (int i=1; i<=10; i++) {
            print (
                number + " x " + i + "\t= " + number*i + "\n"
            ) ;
        }
    }

    private static int readNumber() {
        print ("Enter a number > ") ;
        return Integer.valueOf( scanner.nextLine()) ;
    }

    private static void print (String output) {
        System.out.print (output) ;
    }
}
