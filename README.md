# Cinema Management System

A Java object-oriented programming course project that models movies, a cinema hall, seats, customers, staff and tickets. This is the multi-class Cinema System submission with a project report, not the earlier short Streams lab exercise.

## Repository status

This repository includes the original academic project files, documentation and available illustrations. Team credits and verification limits are preserved below.

## Project materials

- Java source under `src/cinemasystem/`
- [Project report](docs/project-report.md)

## Build and run the original project

A JDK supporting Java 8 language features or later is required. From the repository directory:

```sh
javac -d out src/cinemasystem/*.java
java -cp out cinemasystem.CinemaSystem
```

The entry point demonstrates a successful booking, missing-person handling, a caught null-pointer exception, polymorphic customer/staff output and a VIP inner class. This is a console demonstration, not an interactive booking menu.

## Structure and responsibilities

| Class or interface | Responsibility |
| --- | --- |
| CinemaSystem | Demonstration entry point |
| Movie, Genre | Movie information and genre values |
| CinemaHall, Seat | Hall and seating model |
| Person, Customer, Staff | Shared person abstraction and specialized roles |
| Ticket | Ticket representation and booking-related behavior |
| Bookable, Refundable | Contracts for booking and refund behavior |
| SeatNotAvailableException | A domain-specific booking error |

The 12-file Java submission separates domain objects rather than placing all behavior in one method. Inheritance shares common structure; polymorphism lets customer and staff objects be handled through a common person type. Interfaces define operations that classes must provide. A custom exception represents a booking failure specific to this domain.

## Demonstration flow

The program constructs cinema objects, performs a booking, demonstrates error handling, prints customer and staff behavior through polymorphism and demonstrates a VIP inner class. It is intended to show object-oriented programming concepts through a cinema example.

## Concepts

Inheritance, abstract classes, interfaces, generics, collections, sorting, custom exceptions, cloning and composition.

## Verification

Compiled and ran successfully with JDK 23.0.2 during preparation. Booking, missing-person handling, exception cleanup, polymorphic output and VIP-section demonstration ran as expected. The compiler emitted the documented finalize() warnings.

## Attribution and limitations

Team size: 4 members. The source is preserved unchanged. The report includes unfinished diagram/screenshot placeholders and some descriptions that differ from the implementation; they have not been silently rewritten. `Ticket.finalize()` uses a deprecated mechanism and may produce compiler warnings. State is held in memory, with no persistent storage or per-showtime seat model.

## Publication

Academic portfolio documentation. No license has been selected.
