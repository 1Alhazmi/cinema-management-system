package cinemasystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a cinema hall with seats.
 * Demonstrates OOP concepts: 
 * - Composition (Seat objects inside CinemaHall)
 * - Inner class (VIPSection)
 */
public class CinemaHall {

    private final String name;           // Name of the hall
    private final List<Seat> seats;      // List of seats in the hall

    /**
     * Constructor to initialize a cinema hall with a given number of seats.
     * Seats are labeled as A1, A2, ..., depending on totalSeats.
     *
     * @param name       the name of the hall
     * @param totalSeats total number of seats
     */
    public CinemaHall(String name, int totalSeats) {
        this.name = name;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat("A" + i));
        }
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    /**
     * Displays all seats with their availability status.
     */
    public void displaySeats() {
        System.out.println("Seats in " + name + ":");
        for (Seat s : seats) {
            System.out.println(s.getSeatNumber() + " - " + (s.isAvailable() ? "Available" : "Booked"));
        }
    }

    /**
     * Inner class representing a VIP section in the cinema hall.
     * Can have special seats or features.
     */
    public static class VIPSection {
        private final String sectionId;

        public VIPSection() {
            this.sectionId = "VIP-01";
        }

        public String getSectionId() {
            return sectionId;
        }
    }
}
