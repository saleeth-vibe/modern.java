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

import java.util.Scanner;

public class QuizGame {

    static int score = 0;

    static void checkAnswer(int answer, int correctAnswer) {
        if (answer == correctAnswer) {
            System.out.println("Correct! ✅");
            score++;
        } else {
            System.out.println("Wrong! ❌");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA QUIZ GAME =====");

        System.out.println("\n1. Which keyword is used to create a class?");
        System.out.println("1. class");
        System.out.println("2. object");
        System.out.println("3. new");
        System.out.println("4. create");

        System.out.print("Enter answer: ");
        int answer = sc.nextInt();
        checkAnswer(answer, 1);


        System.out.println("\n2. Which method is the starting point of Java?");
        System.out.println("1. start()");
        System.out.println("2. main()");
        System.out.println("3. run()");
        System.out.println("4. execute()");

        System.out.print("Enter answer: ");
        answer = sc.nextInt();
        checkAnswer(answer, 2);


        System.out.println("\n3. Which keyword creates an object?");
        System.out.println("1. class");
        System.out.println("2. object");
        System.out.println("3. new");
        System.out.println("4. create");

        System.out.print("Enter answer: ");
        answer = sc.nextInt();
        checkAnswer(answer, 3);


        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent! ");
        } else if (score >= 2) {
            System.out.println("Good Job! ");
        } else {
            System.out.println("Keep Practicing! ");
        }

        sc.close();
    }
}
