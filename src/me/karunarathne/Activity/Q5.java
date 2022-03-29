package me.karunarathne.Activity;

import java.util.Scanner;

/**
 * Write a Java program to calculate the avarage value of array elements
 */
public class Q5 {
    private static Scanner scanner;
    private static String [] numbers ;
    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        while (true) {
            if (! mainLoop ()) break ;
        }
    }

    private static boolean mainLoop() {
        readArray () ;
        printAvg (calculateSum () / numbers.length ) ;

        return askRepeat ();
    }

    private static double calculateSum () {
        double total = 0.0 ;
        for (String element: numbers) {
            total += Double.valueOf (element) ;
        }
        return total ;
    }

    private static void readArray() {
        print ("Input numbers seperated by spaces > ") ;
        numbers = scanner.nextLine().split(" ") ;
    }

    private static boolean askRepeat() {
        print ("\n\nWould you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static void print(String output) {
        System.out.print (output) ;
    }

    private static void printAvg (double avg) {
        System.out.print ("\nThe average is = " + avg) ;
    }
}
