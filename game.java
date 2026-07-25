import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice;
        String playerChoice;
        String playAgain = "yes";

        System.out.println("Enter your move (rock, paper, or scissors): ");
        playerChoice = sc.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid move. Please try again.");
            sc.close();
            return;
        }

        computerChoice = choices[rand.nextInt(choices.length)];
        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        System.out.println("Do you want to play again? (yes/no): ");
        playAgain = sc.nextLine().toLowerCase();

        if(playAgain.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class HotelRoomBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableRooms = 20;
        String customerName = "";
        int bookedRooms = 0;
        boolean bookingDone = false;

        int choice;

        do {

            System.out.println("\n===== HOTEL ROOM BOOKING SYSTEM =====");
            System.out.println("1. Book Room");
            System.out.println("2. View Booking");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Check Available Rooms");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (!bookingDone) {

                        System.out.print("Enter Customer Name: ");
                        customerName = sc.nextLine();

                        System.out.print("Enter Number of Rooms: ");
                        int rooms = sc.nextInt();

                        if (rooms <= availableRooms) {

                            bookedRooms = rooms;
                            availableRooms -= rooms;
                            bookingDone = true;

                            System.out.println("Room Booked Successfully!");

                        } else {

                            System.out.println("Rooms Not Available!");
                        }

                    } else {

                        System.out.println("Booking Already Exists!");
                    }

                    break;

                case 2:

                    if (bookingDone) {

                        System.out.println("\nCustomer Name : " + customerName);
                        System.out.println("Booked Rooms  : " + bookedRooms);
                        System.out.println("Room Charge   : ₹" + (bookedRooms * 1500));

                    } else {

                        System.out.println("No Booking Found!");
                    }

                    break;

                case 3:

                    if (bookingDone) {

                        availableRooms += bookedRooms;
                        bookedRooms = 0;
                        bookingDone = false;

                        System.out.println("Booking Cancelled Successfully!");

                    } else {

                        System.out.println("No Booking Available!");
                    }

                    break;

                case 4:

                    System.out.println("Available Rooms : " + availableRooms);

                    break;

                case 5:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}
