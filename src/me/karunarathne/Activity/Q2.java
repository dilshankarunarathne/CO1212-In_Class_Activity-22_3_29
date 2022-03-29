package me.karunarathne.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a circle
 */
public class Q2 {
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
        Circle circle = new Circle ( readInput ()) ;
        print (circle.toString()) ;

        return askRepeat() ;
    }

    private static boolean askRepeat() throws InputMismatchException {
        print ("Would you like to do another? (Y/N) > ") ;
        try {
            return scanner.nextLine().equalsIgnoreCase("y");
        } catch (Exception e) {
            throw new InputMismatchException("unexpected format of input") ;
        }
    }

    private static double readInput() throws InputMismatchException {
        print ("Enter the radius > ") ;
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            throw new InputMismatchException("input does not seem numeric") ;
        }
    }

    private static void print(String output) {
        System.out.print (output) ;
    }
}

class Circle {
    private final double radius ;
    private static final double PI = Math.PI ;

    public Circle (double radius) {
        this.radius = radius ;
    }

    private double getArea () {
        return PI * (radius*radius) ;
    }

    private double getPerimeter () {
        return 2 * PI * radius ;
    }

    public String toString () {
        return "Area = " + String.format("%.2f", this.getArea()) +
                " and Perimeter = " + String.format("%.2f", this.getPerimeter()) + "\n" ;
    }
}
