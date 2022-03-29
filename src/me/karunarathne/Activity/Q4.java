package me.karunarathne.Activity;

import java.util.Scanner;

/**
 * Write a Java program to reverse a string
 */
public class Q4 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        while (true) {
            if (! mainLoop ()) break ;
        }
    }
    
    private static boolean mainLoop () {
        reverseAndPrint (readString ()) ;
        return askRepeat() ;
    }

    private static void reverseAndPrint(String input) {
        print ("Reversed > ") ;
        for (int i=input.length()-1; i>=0; i--) {
            print (input.charAt(i)) ;
        }
    }

    private static String readString() {
        print ("Enter the string > ") ;
        return scanner.nextLine();
    }

    private static boolean askRepeat() {
        print ("\n\nWould you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static void print(String output) {
        System.out.print (output) ;
    }

    private static void print(char c) {
        System.out.print (c) ;
    }
}
