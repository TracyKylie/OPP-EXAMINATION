/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utms.airqoanalyzer;

/**
 *
 * @author Tracy
 */
import java.util.*;

public class AirQOAnalyzer {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] readings = new int[30];
        int hazardousDays = 0;

        // Step 1: Generate 30 AQI readings between 1 and 300
        for (int i = 0; i < 30; i++) {
            readings[i] = rand.nextInt(300) + 1;
            if (readings[i] > 200) {
                hazardousDays++;
            }
        }

        // Step 2: Sort readings to calculate median
        Arrays.sort(readings);
        double median;
        if (readings.length % 2 == 0) {
            median = (readings[14] + readings[15]) / 2.0;
        } else {
            median = readings[readings.length / 2];
        }

        // Step 3: Display results
        System.out.println("AirQO 30-Day AQI Report:");
        System.out.println("Median AQI: " + median);
        System.out.println("Hazardous Days (AQI > 200): " + hazardousDays);

        // Optional: Show all readings
        System.out.println("All Readings:");
        System.out.println(Arrays.toString(readings));
    }
}

