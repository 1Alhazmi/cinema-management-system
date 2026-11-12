package cinemasystem;

import java.util.*;

/**
 * Represents the main cinema system that manages movies, people, tickets, and the cinema hall.
 * 
 */
public class CinemaSystem {

    /** The cinema hall where movies are shown */
    private final CinemaHall hall;

    /** Set of movies (TreeSet for automatic sorting) */
    private final Set<Movie> movies;

    /** List of people (customers and staff) */
    private final List<Person> people;

    /** List of booked tickets */
    private final List<Ticket> tickets;

    /** Total number of tickets booked across all instances (Static Member) */
    private static int totalTicketsBooked = 0;

    /** Default constructor initializes all collections and cinema hall */
    public CinemaSystem() {
        hall = new CinemaHall("Main Hall", 10);
        movies = new TreeSet<>();       // TreeSet demonstrates Comparable usage
        people = new ArrayList<>();     // ArrayList to store Person objects
        tickets = new ArrayList<>();    // ArrayList to store Ticket objects
    }

    /** Adds a movie to the system */
    public void addMovie(Movie m) { movies.add(m); }

    /** Adds a person (customer or staff) to the system */
    public void addPerson(Person p) { people.add(p); }

    /**
     * Generic method to display any list of objects.
     * Demonstrates use of Generics in a simple reusable way.
     */
    public <T> void displayList(List<T> list) {
        list.forEach(System.out::println);
    }

    /**
     * Books a ticket for a given person, movie, and seat.
     * Demonstrates:
     * - Exception handling using try-catch
     * - Optional.orElseThrow
     * - Static member increment (totalTicketsBooked)
     * 
     * @param personName Name of the person booking
     * @param movieTitle Title of the movie
     * @param seatNumber Seat number to book
     */
    public void bookTicket(String personName, String movieTitle, String seatNumber) {
        try {
            Person p = people.stream()
                    .filter(per -> per.getName().equalsIgnoreCase(personName))
                    .findFirst()
                    .orElseThrow(() -> new NullPointerException("Person not found")); // NullPointerException scenario

            Movie m = movies.stream()
                    .filter(movie -> movie.getTitle().equalsIgnoreCase(movieTitle))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Movie not found"));

            Seat s = hall.getSeats().stream()
                    .filter(seat -> seat.getSeatNumber().equalsIgnoreCase(seatNumber))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Seat not found"));

            s.book(); // Book the seat

            Ticket t = new Ticket(m, s, p);
            tickets.add(t);
            totalTicketsBooked++;

            System.out.println("Ticket booked successfully: " + t);
        } catch (RuntimeException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }

    /**
     * Main method to demonstrate the cinema system functionality.
     * Covers:
     * - Adding objects
     * - Booking tickets
     * - Exception handling (try-catch-finally)
     * - Polymorphism (dynamic binding, instanceof)
     * - Inner class usage
     */
    public static void main(String[] args) {
        CinemaSystem system = new CinemaSystem();

        // 1. Add movies and people
        system.addMovie(new Movie("Avengers", Genre.ACTION, 150, 12.5));
        system.addMovie(new Movie("Titanic", Genre.ROMANCE, 195, 10.0));
        system.addPerson(new Customer("Alice", "alice@example.com"));
        system.addPerson(new Staff("John", "john@example.com", "Manager"));

        // 2. Book tickets and demo exception scenario
        system.bookTicket("Alice", "Avengers", "A1");
        System.out.println("\n--- Demo Missing Person (NullPointerException Scenario) ---");
        system.bookTicket("Ghost", "Titanic", "A2"); // Throws RuntimeException if person not found

        // 3. Demo try-catch-finally (cleanup)
        System.out.println("\n--- Demo Try-Catch-Finally (Cleanup) ---");
        try {
            String test = null;
            System.out.println("Attempting to access null object: " + test.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Cleanup successful (e.g., closing resources).");
        }
        
        // 4. Polymorphism demo
        System.out.println("\nAll people info (Polymorphism Demo):");
        for (Person p : system.people) {
            p.displayInfo(); // Dynamic binding
            if (p instanceof Staff) {
                System.out.println("-> Verified staff access level.");
            }
        }
        
        // 5. Inner Class Demo
        CinemaHall.VIPSection vip = new CinemaHall.VIPSection();
        System.out.println("\nInner Class Demo: " + vip.getSectionId());
    }
}
