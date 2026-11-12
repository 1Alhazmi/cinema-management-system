package cinemasystem;

import java.util.Objects;

/**
 * Represents a movie in the cinema.
 * <p>
 * Implements Comparable to allow sorting by movie title (case-insensitive).
 * Uses Double wrapper class for price as required.
 * </p>
 */
public class Movie implements Comparable<Movie> {

    private final String title;   // Movie title
    private final Genre genre;    // Movie genre
    private final int duration;   // Duration in minutes
    private final Double price;   // Ticket price (Wrapper class)

    /**
     * Default constructor.
     * Initializes a movie with default values.
     */
    public Movie() {
        this("Untitled", Genre.DRAMA, 90, 5.0);
    }

    /**
     * Parameterized constructor.
     *
     * @param title    the movie title
     * @param genre    the movie genre
     * @param duration the movie duration in minutes
     * @param price    the ticket price
     */
    public Movie(String title, Genre genre, int duration, Double price) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
    }

    public String getTitle() { return title; }
    public Genre getGenre() { return genre; }
    public int getDuration() { return duration; }
    public Double getPrice() { return price; }

    @Override
    public int compareTo(Movie other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return title.equalsIgnoreCase(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase());
    }

    @Override
    public String toString() {
        return title + " (" + genre + ", " + duration + " mins, Price: $" + price + ")";
    }
}
