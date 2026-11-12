> Text extracted from the submitted PDF. Student IDs removed. Tables and visual page layout may differ; no claim is made that this reproduces the original PDF layout.

## Original page 1

Cinema System Project Report 
 
1. Introduction 
The Cinema System project simulates the operations of a cinema, including 
managing movies, people (customers and staff), tickets, and cinema halls. The 
project demonstrates key Object-Oriented Programming (OOP) concepts in Java, 
such as: 
• Classes, Objects, and Encapsulation 
• Inheritance and Abstract Classes 
• Polymorphism and Dynamic Binding 
• Interfaces and Implementation 
• Collections, Generics, and Sorting 
• Exception Handling 
The system models real-world entities and processes through Java classes, 
providing a practical application of OOP principles. 
 
 
2. Project Overview 
The system provides the following functionality: 
• Adding Movies: Users can add movies with title, genre, duration, and 
price. 
• Registering People: Customers and staff can be added to the system. 
• Booking Tickets: Tickets can be booked for specific movies and seats. 
• Refunding Tickets: Booked tickets can be refunded, freeing up the seat. 
• Displaying Seats and Tickets: Shows available seats and booked tickets 
in sorted order. 
Example of adding a movie: 

## Original page 2

 
 
 
3. Design and Implementation 
3.1 Classes and Objects 
• CinemaHall: Contains seats and provides a method to display them. 
 
• Seat: Implements Bookable, Comparable, and Cloneable. 
 
• Movie: Represents a movie and implements Comparable for sorting. 


## Original page 3

 
• Person (abstract): Base class for Customer and Staff. 
 
• Ticket: Implements Comparable, Cloneable, and Refundable. 
 
• CinemaSystem: Main class managing the system with collections. 
 
 
3.2 Inheritance and Polymorphism 
• Person is abstract; Customer and Staff extend it. 
• Polymorphism allows storing Person objects in a single list and calling 
displayInfo() dynamically. 


## Original page 4

 
 
3.3 Interfaces and Exception Handling 
• Bookable implemented by Seat. 
• Refundable implemented by Ticket. 
• SeatNotAvailableException is a custom exception. 
• try-catch-finally demonstrates cleanup. 
 
 
3.4 Collections and Generics 
• Vector<Seat> for seat collection. 
• TreeSet<Movie> maintains sorted movies. 
• ArrayList<Person> and ArrayList<Ticket> for dynamic lists. 
• Generic method displayList() to display any type of list. 
 
 
4. UML Class Diagram 
(Include a diagram showing classes, attributes, methods, inheritance, and 
interfaces.) 
 
 
 


## Original page 5

 
5. Team Contribution 
• Member 1: CinemaSystem main class, ticket booking logic, generic 
display methods. 
• Member 2: CinemaHall and Seat classes, inner class VIPSection. 
• Member 3: Movie, Person, Customer, Staff classes. 
• Member 4: Ticket, exception handling, refund functionality. 
 
6. Screenshots 
• Cinema hall seats display. 
• Successful ticket bookings. 
• Refunded tickets. 
• Polymorphism demonstration with Person list. 
 
7. Conclusion 
The Cinema System project successfully implements all major OOP concepts in 
Java, models real-world cinema operations, ensures exception safety, utilizes 
collections and generics, and demonstrates clean, maintainable code with 
proper documentation. 
 
