package cinemasystem;

/**
 * Abstract class representing a person in the cinema system.
 * <p>
 * This class is the base for different types of people such as
 * {@link Customer} and {@link Staff}. Each person has a name and an email.
 * </p>
 */
public abstract class Person {

    /** Person's name */
    protected final String name;

    /** Person's email */
    protected final String email;

    /**
     * Default constructor initializing name and email with default values.
     */
    public Person() {
        this.name = "Default Name";
        this.email = "default@example.com";
    }

    /**
     * Constructor to initialize a person with name and email.
     *
     * @param name  the person's name
     * @param email the person's email
     */
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    /**
     * Abstract method to display information about the person.
     */
    public abstract void displayInfo();

    /**
     * Returns a string representation of the person.
     *
     * @return a string in the format "name (email)"
     */
    @Override
    public String toString() {
        return name + " (" + email + ")";
    }

    /**
     * Checks if this person is equal to another object.
     * Two persons are equal if both their names and emails match (case-insensitive).
     *
     * @param o the object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return name.equalsIgnoreCase(p.name) && email.equalsIgnoreCase(p.email);
    }

    /**
     * Returns the hash code for this person based on name and email (case-insensitive).
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return (name + email).toLowerCase().hashCode();
    }
}
