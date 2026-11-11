import java.util.Scanner;

public class RailwayBooking {

    static String[] passengers = new String[5];
    static int count = 0;
    static int availableSeats = 5;

    static void bookTicket(String name) {
        if (availableSeats > 0) {
            passengers[count] = name;
            count++;
            availableSeats--;

            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("No seats available!");
        }
    }

    static void viewBookings() {
        if (count == 0) {
            System.out.println("No bookings found!");
            return;
        }

        System.out.println("\n===== PASSENGER LIST =====");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + passengers[i]);
        }
    }

    static void cancelTicket(String name) {
        for (int i = 0; i < count; i++) {

            if (passengers[i].equalsIgnoreCase(name)) {

                for (int j = i; j < count - 1; j++) {
                    passengers[j] = passengers[j + 1];
                }

                count--;
                availableSeats++;

                System.out.println("Ticket cancelled!");
                return;
            }
        }

        System.out.println("Passenger not found!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== RAILWAY BOOKING =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Bookings");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Available Seats");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Passenger name: ");
                    String name = sc.nextLine();
                    bookTicket(name);
                    break;

                case 2:
                    viewBookings();
                    break;

                case 3:
                    System.out.print("Enter passenger name: ");
                    String cancelName = sc.nextLine();
                    cancelTicket(cancelName);
                    break;

                case 4:
                    System.out.println("Available seats: " + availableSeats);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
