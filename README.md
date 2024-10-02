# Cinema managment system

Small project demonstrating the use of all 5 creational design patterns

### [CinemaManagmentApp](src/CinemaManagementApp.java) - main application, run it to see the test results for all components:

1. [CinemaConfig](src/CinemaConfig.java):

Uses Singleton pattern to manage global settings and ensure that there's only one instance of them

2. [MovieFactory](src/MovieFactory.java):

Uses Factory method pattern for the creation of different types of classes in [Movie](src/Movie.java) interface

3. [UIFactory](src/UIFactory.java):

Uses Abstract Factory pattern to create elements([Button](src/Button.java), [TextField](src/TextField.java)) for different UI themes

4. [TicketBooking](src/TicketBooking.java):

Uses Builder pattern to construct ticket bookings step-by-step

5. [MovieSchedule](src/MovieSchedule.java):

Uses Prototype pattern to allow easier cloning and modification of movie schedules
