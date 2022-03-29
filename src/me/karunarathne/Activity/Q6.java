package me.karunarathne.Activity;

import java.util.Scanner;

public class Q6 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        while (true) {
            if (! mainLoop ()) break ;
        }
    }

    private static boolean mainLoop() {
        printpatternFor (readNumber ()) ;
        return askRepeat() ;
    }

    private static void printpatternFor(int number) {
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=i; j++) {
                print (j + " ") ;
            }
            print ("\n") ;
        }
    }

    private static int readNumber() {
        print ("Enter a number > ") ;
        return Integer.valueOf (scanner.nextLine()) ;
    }

    private static boolean askRepeat() {
        print ("\n\nWould you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static void print(String output) {
        System.out.print (output) ;
    }
}
