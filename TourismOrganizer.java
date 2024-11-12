import java.util.*;

// Base class to handle user input and store tour details
class TourDetails {
    protected String destination;
    protected int duration;
    protected double price;

    @SuppressWarnings("resource")
    // Method to get details of the tour from user
    public void getTourDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination: ");
        destination = scanner.nextLine();
        System.out.print("Enter duration (in days): ");
        duration = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price: ");
        price = Double.parseDouble(scanner.nextLine());
    }

    // Method to display tour details
    public void displayTourDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Price: $" + price);
    }
}

// Derived class for Tour 1
class Tour1 extends TourDetails implements Runnable {
    // Override run method to define the task for this thread
    public void run() {
        System.out.println("Processing Tour 1...");
        displayTourDetails();
    }
}

// Derived class for Tour 2
class Tour2 extends TourDetails implements Runnable {
    // Override run method to define the task for this thread
    public void run() {
        System.out.println("Processing Tour 2...");
        displayTourDetails();
    }
}

// Derived class for Tour 3
class Tour3 extends TourDetails implements Runnable {
    // Override run method to define the task for this thread
    public void run() {
        System.out.println("Processing Tour 3...");
        displayTourDetails();
    }
}

// Derived class for Tour 4
class Tour4 extends TourDetails implements Runnable {
    // Override run method to define the task for this thread
    public void run() {
        System.out.println("Processing Tour 4...");
        displayTourDetails();
    }
}

// Derived class for Tour 5
class Tour5 extends TourDetails implements Runnable {
    // Override run method to define the task for this thread
    public void run() {
        System.out.println("Processing Tour 5...");
        displayTourDetails();
    }
}

// Main class to handle the user interface and run the program
public class TourismOrganizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        // Array to store tour objects
        TourDetails[] tours = new TourDetails[5];

        // Loop to get details for each tour from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tour " + (i + 1) + ":");
            tours[i] = new TourDetails();
            tours[i].getTourDetails();
        }

        // Loop to keep the program running until user decides to stop
        do {
            System.out.println("Select a tour to process:");
            System.out.println("1. Tour 1");
            System.out.println("2. Tour 2");
            System.out.println("3. Tour 3");
            System.out.println("4. Tour 4");
            System.out.println("5. Tour 5");
            int choice = Integer.parseInt(scanner.nextLine());

            // Switch case to process the selected tour using multithreading
            switch (choice) {
                case 1:
                    Tour1 tour1 = new Tour1();
                    // Copy details to specific tour
                    tour1.destination = tours[0].destination;
                    tour1.duration = tours[0].duration;
                    tour1.price = tours[0].price;
                    // Create a new thread to process this tour
                    Thread thread1 = new Thread(tour1);
                    thread1.start(); // Start the thread
                    try {
                        thread1.join(); // Wait for the thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Tour2 tour2 = new Tour2();
                    // Copy details to specific tour
                    tour2.destination = tours[1].destination;
                    tour2.duration = tours[1].duration;
                    tour2.price = tours[1].price;
                    // Create a new thread to process this tour
                    Thread thread2 = new Thread(tour2);
                    thread2.start(); // Start the thread
                    try {
                        thread2.join(); // Wait for the thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    Tour3 tour3 = new Tour3();
                    // Copy details to specific tour
                    tour3.destination = tours[2].destination;
                    tour3.duration = tours[2].duration;
                    tour3.price = tours[2].price;
                    // Create a new thread to process this tour
                    Thread thread3 = new Thread(tour3);
                    thread3.start(); // Start the thread
                    try {
                        thread3.join(); // Wait for the thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    Tour4 tour4 = new Tour4();
                    // Copy details to specific tour
                    tour4.destination = tours[3].destination;
                    tour4.duration = tours[3].duration;
                    tour4.price = tours[3].price;
                    // Create a new thread to process this tour
                    Thread thread4 = new Thread(tour4);
                    thread4.start(); // Start the thread
                    try {
                        thread4.join(); // Wait for the thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    Tour5 tour5 = new Tour5();
                    // Copy details to specific tour
                    tour5.destination = tours[4].destination;
                    tour5.duration = tours[4].duration;
                    tour5.price = tours[4].price;
                    // Create a new thread to process this tour
                    Thread thread5 = new Thread(tour5);
                    thread5.start(); // Start the thread
                    try {
                        thread5.join(); // Wait for the thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid tour number.");
            }

            // Ask the user if they want to process another tour
            System.out.print("Do you want to process another tour? (Yes/No): ");
            continueChoice = scanner.nextLine();
        } while (continueChoice.equalsIgnoreCase("Yes"));

        scanner.close();
        System.out.println("Thank you for using the Tourism Organizer!");
    }
}
