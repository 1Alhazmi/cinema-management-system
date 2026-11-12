package cinemasystem;

/**
 * Represents a customer in the cinema system.
 * <p>
 * This class extends the abstract {@link Person} class and provides
 * an implementation for displaying customer information.
 * </p>
 */
public class Customer extends Person {

    /**
     * Default constructor.
     * Initializes a customer with default name and email.
     */
    public Customer() {
        super();
    }

    /**
     * Constructor with parameters.
     *
     * @param name  the name of the customer
     * @param email the email of the customer
     */
    public Customer(String name, String email) {
        super(name, email);
    }

    /**
     * Displays customer information to the console.
     * Demonstrates polymorphism by overriding the abstract method in {@link Person}.
     */
    @Override
    public void displayInfo() {
        System.out.println("Customer: " + name + ", Email: " + email);
    }
}
