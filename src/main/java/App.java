/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int length = Integer.parseInt(s.nextLine());
        System.out.println("What is the width of the room in feet? ");
        int width = Integer.parseInt(s.nextLine());

        int squareFeet = length * width;
        final double squareFeetConversionFactor = 0.09290304;
        double squareMeters = squareFeet * squareFeetConversionFactor;

        System.out.println(String.format("You entered dimension of %d feet by %d feet.", length, width));
        System.out.println(String.format("The area is\n%d square feet\n%.3f square meters", squareFeet, squareMeters));

    }
}