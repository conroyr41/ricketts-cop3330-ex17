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
        String output;

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

        //1 for male, 2 for female
        if(gender == 1)
        {
            BAC = ( (alcoholConsumed * 5.14 / weight * .73) - .015 * time);
        }
        else
        {
            BAC = ( (alcoholConsumed * 5.14 / weight * .66) - .015 * time);
        }

        if(BAC < 0.08)
        {
            output = String.format("Your BAC is %f.\nIt is legal for you to drive!", BAC);
        }
        else
        {
            output = String.format("Your BAC is %f.\nIt is not legal for you to drive!", BAC);
        }

        System.out.println(output);
    }
}