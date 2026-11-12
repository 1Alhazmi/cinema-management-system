package cinemasystem;

/**
 * Exception thrown when attempting to book a seat that is already occupied.
 * <p>
 * Extends RuntimeException so it is an unchecked exception.
 * </p>
 */
public class SeatNotAvailableException extends RuntimeException {

    /**
     * Constructs the exception with a custom message.
     *
     * @param message the detail message explaining the exception
     */
    public SeatNotAvailableException(String message) {
        super(message);
    }
}
