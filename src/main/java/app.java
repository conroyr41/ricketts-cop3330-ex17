/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        double weight, alcoholConsumed, time, gender, BAC;
        double distributionRatio = 0.66;
        String output;
        String conditional = "is not";

        System.out.println("Enter your weight in pounds:");
        scan = new Scanner(System.in);
        weight = Double.parseDouble(scan.next());

        System.out.println("Enter the amount of alcohol consumed in ounces:");
        scan = new Scanner(System.in);
        alcoholConsumed = Double.parseDouble(scan.next());

        System.out.println("Enter the time in hours since your last drink:");
        scan = new Scanner(System.in);
        time = Double.parseDouble(scan.next());

        System.out.println("Enter your gender (\"1\" for male, \"2\" for female):");
        scan = new Scanner(System.in);
        gender = Double.parseDouble(scan.next());

        if(gender == 1)
            distributionRatio = 0.73;

        BAC = ( (alcoholConsumed * 5.14) / (weight * distributionRatio) ) - (.015 * time);

        if(BAC < 0.08)
            conditional = "is";

        output = String.format("Your BAC is %f.\nIt %s legal for you to drive!", BAC, conditional);

        System.out.println(output);
    }
}