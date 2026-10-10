import java.util.Scanner;
public class Super {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router? ",
                              "Who is the prime minister of india? ",
                              "What is the capital of india? ",
                              "What is the currency of india? ",
                              "What was the first programming language? "};

        String[][] options = {{"A. To connect multiple networks and direct data packets between them", "B. To store data and files for a network",
                            "C. To provide security for a network", "D. To manage user access to a network"},
                            {"A. priyank kharge", "B. Rahul Gandhi", "C. Manmohan Singh", "D. Atal Bihari Vajpayee"},
                            {"A. Bangaluru", "B. New Delhi", "C. Kolkata", "D. Chennai", "D. Chennai"},
                            {"A. Indian Rupee (INR)", "B. US Dollar (USD)", "C. Euro (EUR)", "D. British Pound (GBP)"},
                            {"A. Fortran", "B. COBOL", "C. Assembly Language", "D. C"}};

        int[] answers = {1, 2, 2, 1, 1};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("**********************");
        
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == answers[i]) {
                System.out.println("***********");
                System.out.println("Correct!");
                System.out.println("***********");
                score++;
            }
            else {
                System.out.println("***********");
                System.out.println("Wrong!");
                System.out.println("***********");
            }
        }

        System.out.println("**********************");
        System.out.println("Your score is: " + score + "/" + questions.length);


        sc.close();

    }
}


import java.util.Scanner;

public class StudentResultManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int rollNo = 0;
        int java, python, dbms;
        boolean added = false;

        int choice;

        do {

            System.out.println("\n===== STUDENT RESULT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Calculate Result");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();

                    System.out.print("Java Marks: ");
                    java = sc.nextInt();

                    System.out.print("Python Marks: ");
                    python = sc.nextInt();

                    System.out.print("DBMS Marks: ");
                    dbms = sc.nextInt();

                    int total = java + python + dbms;
                    double percentage = total / 3.0;

                    String grade;

                    if (percentage >= 90)
                        grade = "A+";
                    else if (percentage >= 80)
                        grade = "A";
                    else if (percentage >= 70)
                        grade = "B";
                    else if (percentage >= 60)
                        grade = "C";
                    else
                        grade = "Fail";

                    added = true;

                    System.out.println("Student Added Successfully!");

                    break;

                case 2:

                    if (added) {

                        System.out.println("\nStudent Name : " + name);
                        System.out.println("Roll Number  : " + rollNo);

                    } else {

                        System.out.println("No Student Found!");

                    }

                    break;

                case 3:

                    if (added) {

                        int totalMarks = java + python + dbms;
                        double percent = totalMarks / 3.0;

                        System.out.println("\nTotal Marks : " + totalMarks);
                        System.out.printf("Percentage : %.2f%%\n", percent);

                        if (percent >= 90)
                            System.out.println("Grade : A+");
                        else if (percent >= 80)
                            System.out.println("Grade : A");
                        else if (percent >= 70)
                            System.out.println("Grade : B");
                        else if (percent >= 60)
                            System.out.println("Grade : C");
                        else
                            System.out.println("Grade : Fail");

                    } else {

                        System.out.println("No Student Found!");

                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
                        }


import java.util.Scanner;

public class ExpenseTracker {

    static double total = 0;

    static void addExpense(double amount) {
        total += amount;
        System.out.println("Expense added successfully!");
    }

    static void showTotal() {
        System.out.println("Total Expenses: ₹" + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Expense Amount: ₹");
                    double amount = sc.nextDouble();

                    if (amount > 0) {
                        addExpense(amount);
                    } else {
                        System.out.println("Enter a valid amount!");
                    }
                    break;

                case 2:
                    showTotal();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}

import java.util.Scanner;

public class DigitalWallet {

    static double balance = 1000;

    static void checkBalance() {
        System.out.println("Wallet Balance: ₹" + balance);
    }

    static void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money added successfully! ✅");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    static void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Payment successful! ✅");
        } else {
            System.out.println("Payment failed! ❌");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== DIGITAL WALLET =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Make Payment");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ₹");
                    double add = sc.nextDouble();
                    addMoney(add);
                    break;

                case 3:
                    System.out.print("Enter payment amount: ₹");
                    double payment = sc.nextDouble();
                    pay(payment);
                    break;

                case 4:
                    System.out.println("Thank you! ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

import java.util.Scanner;

public class ContactManager {

    static String name = "";
    static String phone = "";

    static void addContact(String n, String p) {
        name = n;
        phone = p;
        System.out.println("Contact added successfully! ✅");
    }

    static void viewContact() {
        if (name.equals("")) {
            System.out.println("No contact found!");
        } else {
            System.out.println("\nName  : " + name);
            System.out.println("Phone : " + phone);
        }
    }

    static void deleteContact() {
        name = "";
        phone = "";
        System.out.println("Contact deleted! ✅");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGER =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String p = sc.nextLine();

                    addContact(n, p);
                    break;

                case 2:
                    viewContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    System.out.println("Thank you! ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
        }

import java.util.Scanner;

public class ExpenseTracker {

    static double totalExpense = 0;

    static void addExpense(double amount) {
        if (amount > 0) {
            totalExpense += amount;
            System.out.println("Expense added! ✅");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    static void showTotal() {
        System.out.println("Total Expense: ₹" + totalExpense);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Show Total Expense");
            System.out.println("3. Check Budget");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter expense amount: ₹");
                    double amount = sc.nextDouble();
                    addExpense(amount);
                    break;

                case 2:
                    showTotal();
                    break;

                case 3:
                    double budget = 5000;

                    if (totalExpense <= budget) {
                        System.out.println("You are within budget. ");
                        System.out.println("Remaining: ₹" + (budget - totalExpense));
                    } else {
                        System.out.println("Budget exceeded! ");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

import java.util.Scanner;

public class ExpenseTracker {

    static double totalExpense = 0;

    static void addExpense(double amount) {
        if (amount > 0) {
            totalExpense += amount;
            System.out.println("Expense added! ✅");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    static void showTotal() {
        System.out.println("Total Expense: ₹" + totalExpense);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Show Total Expense");
            System.out.println("3. Check Budget");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter expense amount: ₹");
                    double amount = sc.nextDouble();
                    addExpense(amount);
                    break;

                case 2:
                    showTotal();
                    break;

                case 3:
                    double budget = 5000;

                    if (totalExpense <= budget) {
                        System.out.println("You are within budget. ");
                        System.out.println("Remaining: ₹" + (budget - totalExpense));
                    } else {
                        System.out.println("Budget exceeded! ");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
                        }

import java.util.Scanner;

public class GradeCalculator {

    static void calculateGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 35) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter subject " + i + " marks (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks!");
                sc.close();
                return;
            }

            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        calculateGrade((int) percentage);

        sc.close();
    }
            }
