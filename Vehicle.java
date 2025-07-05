/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utms.systemtransport;

/**
 *
 * @author Tracy
 */
public class Vehicle {
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void assignPassenger(Passenger p) {
        available = false;
        System.out.println("Passenger assigned from " + p.getPickup() + " to " + p.getDestination());
    }
}
