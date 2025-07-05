/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utms.bookproject;

/**
 *
 * @author Tracy
 */
import java.util.Scanner;

public class UgandaWordCounter {

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the librarian for a book descriptions
        System.out.println("Please enter the book description:");
        String description = scanner.nextLine();

        // Split the text into individual words
        String[] words = description.split("\\s+"); // split by space(s)

        int count = 0;

        // Loop through each word and count occurrences of "Uganda" (case-insensitive)
        for (String word : words) {
            if (word.equalsIgnoreCase("Uganda")) {
                count++;
            }
        }

        // Display the result
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");

        // Close the scanner
        scanner.close();
    }
}