package cinemasystem;

/**
 * Interface representing refundable entities.
 * <p>
 * Any class implementing this interface should provide the logic
 * to refund an item, such as a ticket in the cinema system.
 * </p>
 */
public interface Refundable {

    /**
     * Performs the refund action for the implementing object.
     */
    void refund();
}
