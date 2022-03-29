package me.karunarathne.Activity;

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
        while (true) {
            if (! mainLoop ()) break ;
        }
    }
    
    private static boolean mainLoop() {
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

    private static double getNumber(String string) {
        print ("Enter the " + string + " number > ") ;
        return Double.valueOf(scanner.nextLine()) ;
    }

    private static boolean askRepeat() {
        print ("Would you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static void print(String output) {
        System.out.print (output) ;
    }
}
