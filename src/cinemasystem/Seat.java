package cinemasystem;

/**
 * Represents a seat in the cinema hall.
 * <p>
 * Implements Bookable for booking, Comparable for sorting, and Cloneable for deep copying.
 * </p>
 */
public class Seat implements Bookable, Comparable<Seat>, Cloneable {

    private final String seatNumber; // Seat identifier (e.g., A1, B5)
    private boolean available;        // Availability status

    /**
     * Default constructor.
     * Initializes the seat with a default seat number "A0".
     */
    public Seat() {
        this("A0");
    }

    /**
     * Parameterized constructor.
     *
     * @param seatNumber the seat number
     */
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.available = true;
    }

    public String getSeatNumber() { return seatNumber; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    /**
     * Books the seat if available. Throws SeatNotAvailableException otherwise.
     */
    @Override
    public void book() {
        if (!available) {
            throw new SeatNotAvailableException("Seat " + seatNumber + " is not available!");
        }
        available = false;
    }

    /**
     * Compares seats based on their seat number.
     *
     * @param other the other seat to compare
     * @return comparison result
     */
    @Override
    public int compareTo(Seat other) {
        return this.seatNumber.compareTo(other.seatNumber);
    }

    /**
     * Creates a clone of this seat.
     * <p>
     * Since seatNumber is final and boolean is primitive, this shallow copy
     * works effectively as a deep copy.
     * </p>
     *
     * @return a cloned Seat object
     */
    @Override
    public Seat clone() {
        try {
            return (Seat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e); // Should not happen
        }
    }
}
