package cinemasystem;

/**
 * Represents a cinema ticket booked by a person for a specific movie and seat.
 * <p>
 * Implements Comparable for sorting tickets by movie title,
 * Cloneable for deep copying, and Refundable for processing refunds.
 * </p>
 */
public class Ticket implements Comparable<Ticket>, Cloneable, Refundable {

    private final Movie movie;      // Movie for the ticket
    private Seat seat;               // Seat assigned (mutable for deep clone)
    private final Person person;     // Person who booked the ticket
    private final Double price;      // Ticket price (Wrapper class for demonstration)

    /**
     * Default constructor.
     * Initializes a ticket with default movie, seat, and person.
     */
    public Ticket() {
        this.movie = new Movie();
        this.seat = new Seat();
        this.person = new Customer(); // Customer is a subclass of Person
        this.price = this.movie.getPrice();
    }

    /**
     * Constructs a Ticket for a given movie, seat, and person.
     *
     * @param movie  the movie for this ticket
     * @param seat   the seat assigned
     * @param person the person who booked the ticket
     */
    public Ticket(Movie movie, Seat seat, Person person) {
        this.movie = movie;
        this.seat = seat;
        this.person = person;
        this.price = movie.getPrice();
    }

    public Movie getMovie() { return movie; }
    public Seat getSeat() { return seat; }
    public Person getPerson() { return person; }
    public Double getPrice() { return price; }

    /**
     * Returns a string representation of the ticket.
     *
     * @return formatted ticket information
     */
    @Override
    public String toString() {
        return "Ticket for " + movie.getTitle() + " | " + seat.getSeatNumber() +
               " | " + person.getName() + " | Price: $" + price;
    }

    /**
     * Compares tickets based on the title of the movie (case-insensitive).
     *
     * @param other the other ticket to compare
     * @return comparison result
     */
    @Override
    public int compareTo(Ticket other) {
        return this.movie.getTitle().compareToIgnoreCase(other.movie.getTitle());
    }

    /**
     * Creates a deep clone of this ticket.
     * The mutable Seat object is also cloned to ensure data integrity.
     *
     * @return a deep-cloned Ticket object
     */
    @Override
    public Ticket clone() {
        try {
            Ticket clonedTicket = (Ticket) super.clone(); // shallow copy
            clonedTicket.seat = this.seat.clone();        // deep copy for mutable Seat
            return clonedTicket;
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone not supported on Ticket.");
        }
    }

    /**
     * Refunds the ticket by marking the seat as available.
     */
    @Override
    public void refund() {
        seat.setAvailable(true);
        System.out.println("Ticket refunded: " + this);
    }

    /**
     * Called by the Garbage Collector before object destruction.
     *
     * @throws Throwable if an error occurs during finalization
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ticket object for " + movie.getTitle() + " finalized by Garbage Collector.");
        super.finalize();
    }
}
