/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utms.systemtransport;

/**
 *
 * @author Tracy
 */
import java.util.Random;

public class PassengerSource {
    private Company company;

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Random rand = new Random();
        Location pickup = new Location(rand.nextInt(101), rand.nextInt(101));
        Location destination = new Location(rand.nextInt(101), rand.nextInt(101));
        Passenger passenger = new Passenger(pickup, destination);
        return company.scheduleVehicle(passenger);
    }
}
