package cinemasystem;

/**
 * Represents an entity that can be booked in the cinema system.
 * <p>
 * Classes implementing this interface must provide their own logic
 * for booking (e.g., checking availability, updating status).
 * </p>
 */
public interface Bookable {

    /**
     * Books the entity.
     *
     * @throws SeatNotAvailableException if the item being booked is not available
     */
    void book() throws SeatNotAvailableException;
}
