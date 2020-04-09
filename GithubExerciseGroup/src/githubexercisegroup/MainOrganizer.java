/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * MainOrganizer.java
 * Purpose: Takes in user input to determine program action, as well as organizes 
 * student class list depending on desired attribute
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercise;

// Imports
import java.util.Scanner;

// Organizer - Java Class
public class MainOrganizer {
    // Main Code
    /**
     * Executes the program
     * 
     * @param args The command line arguments
     */
    public static void main(String args[]) {
        // Variables
        Scanner scan = new Scanner(System.in);
        Class studentClass = new Class();
        int choice = 1;
        while (choice != 0) {
            // Get User Choice
            System.out.print("Would you like to add a student (1), remove a student " +
                            "(2), organize the class (3), display the class (4), or exit (0)?: ");
            choice = scan.nextInt();
            switch(choice) {
                case 1: {
                    // Create code to...
                    // Get user-entered info on new student and call add method 
                   
                    // studentClass.addStudent(newName, newYear, newGrade);
                    break;
                }
                case 2: {
                    // Create code to...
                    // Remove student using user-entered name
                    
                    // studentClass.removeStudent(findName);
                    break;
                }
                case 3: {
                    // Organize students
                    organizeClass(studentClass, scan);
                    System.out.println(); // Empty Line
                    break;
                }
                case 4: {
                    // Display students
                    System.out.println("Student List:");
                    for (Student student: studentClass.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                }
                case 0: {
                    // End program
                    System.out.println("Ending Program");
                    break;
                }
                default: {
                    // Invalid entry
                    System.out.println("Error, invalid entry. Please try again.");
                    break;
                }
            }
            System.out.println(); // Empty line
        }
    }
    
    // Functions
    /**
     * Takes a user input and organizes the class based on the desired attribute
     * 
     * @param originalClass The class of students
     * @param scan The scanner object
     */
    public static void organizeClass(Class originalClass, Scanner scan) {
        // Student lists
        Student[] origStuds = originalClass.getStudents();
        
        // Organize Students
        int choice2 = 1;
            
        // Get User Choice 2
        System.out.print("Would you like to organize by name (1), year (2), or grade (3)?: ");
        choice2 = scan.nextInt();
        switch(choice2) {
            case 1: {
                // Organize by Name
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        String name1 = origStuds[j-1].getName();
                        String name2 = origStuds[j].getName();
                        if ((name1.compareTo(name2)) > 0) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            case 2: {
                // Organize by Year
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        int year1 = origStuds[j-1].getYear();
                        int year2 = origStuds[j].getYear();
                        if (year1 > year2) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            case 3: {
                // Organize by Grade
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        int grade1 = origStuds[j-1].getGrade();
                        int grade2 = origStuds[j].getGrade();
                        if (grade1 > grade2) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            default: {
                // Invalid entry
                System.out.println("Error, invalid entry. Please try again.");
                break;
            }
        }
    }
}
// End of Class