import java.util.Scanner;

public class Solution {

    static int findmax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Maximum: " + findmax(a, b));
        scanner.close();
    }
}
import java.util.Scanner;

class BankAccount {

    private String accountHolder;
    private double balance;

    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void showDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class MiniBanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name, 1000);

        int choice;

        do {
            System.out.println("\n===== MINI BANKING =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Details");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.showDetails();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

import java.util.Scanner;

public class EmployeeAttendance {

    static String[] employees = new String[5];
    static boolean[] attendance = new boolean[5];
    static int count = 0;

    static void addEmployee(String name) {
        if (count < employees.length) {
            employees[count] = name;
            attendance[count] = false;
            count++;
            System.out.println("Employee added!");
        } else {
            System.out.println("Employee limit reached!");
        }
    }

    static void markAttendance(String name) {
        for (int i = 0; i < count; i++) {
            if (employees[i].equalsIgnoreCase(name)) {
                attendance[i] = true;
                System.out.println("Attendance marked!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    static void viewAttendance() {
        System.out.println("\n===== ATTENDANCE REPORT =====");

        for (int i = 0; i < count; i++) {
            String status = attendance[i] ? "Present" : "Absent";

            System.out.println(
                employees[i] + " : " + status
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE ATTENDANCE =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();
                    addEmployee(name);
                    break;

                case 2:
                    System.out.print("Enter employee name: ");
                    String empName = sc.nextLine();
                    markAttendance(empName);
                    break;

                case 3:
                    viewAttendance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
                        }

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
