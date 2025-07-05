/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utms.systemtransport;

/**
 *
 * @author Tracy
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Vehicle vehicle1 = new Vehicle();  // Add a vehicle to the fleet
        company.addVehicle(vehicle1);

        PassengerSource source = new PassengerSource(company);
        boolean success = source.requestPickup();

        if (success) {
            System.out.println("Pickup scheduled successfully.");
        } else {
            System.out.println("Pickup request failed. No vehicles available.");
        }
    }
}
