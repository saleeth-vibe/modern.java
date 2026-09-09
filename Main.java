public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Saleeth");
        Friend friend2 = new Friend("Sabith");
        Friend friend3 = new Friend("Suman");
        
        Friend.showFriends();
    }
}

import java.util.Scanner;

public class LibraryFineManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = "";
        String bookName = "";
        int daysLate = 0;
        boolean bookIssued = false;

        int choice;

        do {

            System.out.println("\n===== LIBRARY FINE MANAGEMENT =====");
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Calculate Fine");
            System.out.println("4. View Details");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (!bookIssued) {

                        System.out.print("Enter Student Name: ");
                        studentName = sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        bookName = sc.nextLine();

                        bookIssued = true;

                        System.out.println("Book Issued Successfully!");

                    } else {

                        System.out.println("Book Already Issued!");
                    }

                    break;

                case 2:

                    if (bookIssued) {

                        System.out.print("Enter Late Days: ");
                        daysLate = sc.nextInt();

                        System.out.println("Book Returned Successfully!");

                    } else {

                        System.out.println("No Book Issued!");
                    }

                    break;

                case 3:

                    if (bookIssued) {

                        double fine = daysLate * 10;

                        System.out.println("\n===== FINE DETAILS =====");
                        System.out.println("Late Days : " + daysLate);
                        System.out.println("Fine      : ₹" + fine);

                    } else {

                        System.out.println("No Record Found!");
                    }

                    break;

                case 4:

                    if (bookIssued) {

                        System.out.println("\nStudent Name : " + studentName);
                        System.out.println("Book Name    : " + bookName);
                        System.out.println("Late Days    : " + daysLate);

                    } else {

                        System.out.println("No Record Found!");
                    }

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
