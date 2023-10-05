import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many Students? ");
        int numofs = input.nextInt();
        while (numofs < 0) { // Ensures input is valid
            System.out.printf("Input must be 0 or more. Try again: ");
            numofs = input.nextInt(); // numofs stores the number of iterations the following loop must occur for
        }
        Student[] students = new Student[numofs];
        for (int i = 1; i < numofs + 1; i++) {
            System.out.printf("Enter the Student's First Name: ");
            String inputname = input.next(); // Records student name
            System.out.printf("Enter the Student's Surname: ");
            String inputsurname = input.next(); // Records student surname
            Student student = new Student(); // Creates a new student object
            student.setName(inputname); // Stores all student details
            student.setSurname(inputsurname);
            student.setID(i-1); 
            students[i-1] = student;
            CWOnly cw001 = new CWOnly("CW001"); // Initialises new CWOnly module named CW001
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter Homework " + (j + 1) + " score for " + cw001.getMName() + ": " ); // Utilises inherited Module method getMName to display module name
                int hw = input.nextInt();
                while (hw > 100 || hw < 0) { // Ensures homework values are valid
                    System.out.printf("Input must be between 0 and 100. Try again: ");
                    hw = input.nextInt();
                }
                cw001.setHW(j, hw); // Stores homework value to specific index in hws array as denoted by the value of j
            }
            System.out.printf("Enter the Student's Final Project score for " + cw001.getMName() + ": " );
            int finalproject = input.nextInt();
            while (finalproject > 100 || finalproject < 0) {
                System.out.printf("Input must be between 0 and 100. Try again: ");
                finalproject = input.nextInt();
            }
            cw001.setFP(finalproject); // Adds final project mark to cw001 object and calculates coursework and final mark
            cw001.setCWM();
            cw001.setFinal();
            student.setCWOnly(cw001); // Stores cw001 as an obect within the student class
            System.out.println(cw001.getMName() + " DATA ENTERED\n"); // Tells user that all details have been entered for this module
            EXOnly ex002 = new EXOnly("EX002"); // Creates a new EXOnly module object named EX002
            System.out.printf("Enter the Student's "  + ex002.getMName() + " Exam score: ");
            int exam = input.nextInt();
            while (exam > 100 || exam < 0) {
                System.out.printf("Input must be between 0 and 100. Try again: ");
                exam = input.nextInt();
            }
            ex002.setFM(exam);
            student.setEXOnly(ex002);
            System.out.println(ex002.getMName() + " DATA ENTERED\n"); 
            CWEX ce003 = new CWEX("CE003");
            for (int z = 0; z < 4; z++) {
                System.out.printf("Enter Homework " + (z + 1) + " score for " + ce003.getMName() + ": " );
                int hw = input.nextInt();
                while (hw > 100 || hw < 0) {
                    System.out.printf("Input must be between 0 and 100. Try again: ");
                    hw = input.nextInt();
                }
                ce003.setHW(z, hw);
            }
            System.out.printf("Enter the Student's "  + ce003.getMName() + " Exam score: ");
            int exam2 = input.nextInt();
            while (exam2 > 100 || exam2 < 0) {
                System.out.printf("Input must be between 0 and 100. Try again: ");
                exam2 = input.nextInt();
            }
            ce003.setExam(exam2);
            ce003.setCWM();
            ce003.setFinal();
            student.setCWEX(ce003);
            System.out.println(ce003.getMName() + " DATA ENTERED\n");
        }
        System.out.println("0 - CW001"); // Prints a menu of options and prompts a user to enter a number corresponding to which results they want to see
        System.out.println("1 - EX002"); 
        System.out.println("2 - CE003");
        System.out.println("3 - All Modules");
        System.out.println("4 - End Program");
        int statusinput = 0;
        while (statusinput != 4) { // Allows user to repeatedly enter inputs to view different tables until they are finished with the program
            System.out.printf("Which Table of Results would you like to view? Choose a number: ");
            statusinput = input.nextInt();
            while (statusinput > 4 || statusinput < 0) {
                System.out.printf("Input must be between 0 and 4. Try again: ");
                statusinput = input.nextInt();
            } // Prints out a formatted table depending on which number the user inputs and asks the user to re-enter if their input was not between 0 and 4
            if (statusinput == 0) {
                System.out.println("Marks for CW001: ");
                System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", "Name", "Surname", "HWs", "Project", "Final Mark");
                for (int x = 0; x < students.length; x++) {
                    Student student = students[x]; // Loops through the array of students in order to print the results for each of them in one table
                    student = students[x];
                    student.displayCW001();
                }
            } else if (statusinput == 1) {
                System.out.println("Marks for EX002:" );
                System.out.printf("%-20s %-20s %-15s %n", "Name", "Surname","Final Mark");
                for (int x = 0; x < students.length; x++) {
                    Student student = students[x];
                    student.displayEX002();
                }
            } else if (statusinput == 2) {
                System.out.println("Marks for CE003: ");
                System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", "Name", "Surname", "CW", "Exam", "Final Mark");
                for (int x = 0; x < students.length; x++) {
                    Student student = students[x];
                    student.displayCE003();
                }
            } else if (statusinput == 3) {
                System.out.println("Number of Students: " + numofs);
                System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", "Name", "Surname", "CW001", "EX002", "CE003");
                for (int x = 0; x < students.length; x++) {
                    Student student = students[x];
                    student.displayAll();
                }
            } else {
                System.out.println("END OF PROGRAM");
                break;
            }
        }
        input.close();
    }
}