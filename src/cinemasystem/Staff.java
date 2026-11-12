package cinemasystem;

/**
 * Represents a staff member in the cinema.
 * <p>
 * Extends the abstract Person class and adds a role field.
 * </p>
 */
public class Staff extends Person {
    private final String role; // Staff role (e.g., Manager, Cashier)

    /**
     * Default constructor.
     * Initializes a staff member with default name, email, and role.
     */
    public Staff() {
        super("Default Staff", "staff@cinema.com");
        this.role = "Unknown";
    }

    /**
     * Parameterized constructor.
     *
     * @param name  the staff member's name
     * @param email the staff member's email
     * @param role  the staff member's role
     */
    public Staff(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    /**
     * Returns the role of the staff member.
     *
     * @return staff role
     */
    public String getRole() {
        return role;
    }

    /**
     * Displays staff member information.
     */
    @Override
    public void displayInfo() {
        System.out.println("Staff: " + name + ", Email: " + email + ", Role: " + role);
    }
}
