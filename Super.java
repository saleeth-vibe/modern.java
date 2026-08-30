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
