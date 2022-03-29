package me.karunarathne.Activity;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a circle
 */
public class Q2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        while (true) {
            if (! mainLoop ()) break ;
        }
    }

    private static boolean mainLoop() {
        Circle circle = new Circle ( readInput ()) ;
        print (circle.toString()) ;

        return askRepeat() ;
    }

    private static boolean askRepeat() {
        print ("Would you like to do another? (Y/N) > ") ;
        return (scanner.nextLine().equalsIgnoreCase("y")) ? true : false ;
    }

    private static double readInput() {
        print ("Enter the radius > ") ;
        return Double.valueOf(scanner.nextLine());
    }

    private static void print(String output) {
        System.out.print (output) ;
    }
}

class Circle {
    private double radius ;
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

    // private String formatToTwo (double number) {
    //     return String.format("%.2f", String.valueOf(number)) ;
    // }

    public String toString () {
        return "Area = " + this.getArea() + " and Perimeter = " + this.getPerimeter() + "\n" ;
    }
}
