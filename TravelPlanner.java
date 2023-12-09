import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Destination {
    String name;
    String date;

    public Destination(String name, String date) {
        this.name = name;
        this.date = date;
    }
}

class TravelItinerary {
    List<Destination> destinations;

    public TravelItinerary() {
        this.destinations = new ArrayList<>();
    }

    public void addDestination(String name, String date) {
        Destination destination = new Destination(name, date);
        destinations.add(destination);
    }

    public void displayItinerary() {
        System.out.println("Travel Itinerary:");
        for (Destination destination : destinations) {
            System.out.println(destination.name + " - " + destination.date);
        }
    }
}

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelItinerary travelItinerary = new TravelItinerary();

        while (true) {
            System.out.println("1. Add Destination");
            System.out.println("2. Display Itinerary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter destination name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date (e.g., DD/MM/YYYY): ");
                    String date = scanner.nextLine();
                    travelItinerary.addDestination(name, date);
                    System.out.println("Destination added successfully!");
                    break;

                case 2:
                    travelItinerary.displayItinerary();
                    break;

                case 3:
                    System.out.println("Exiting travel planner. Have a great trip!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
