package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter a noun: ");
        String noun = in.nextLine();

        System.out.printf("Enter a verb: ");
        String verb = in.nextLine();

        System.out.printf("Enter an adjective: ");
        String adj = in.nextLine();

        System.out.printf("Enter an adverb: ");
        String adv = in.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);

    }
}
