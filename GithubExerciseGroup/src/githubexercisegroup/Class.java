/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * Class.java
 * Purpose: Contains an array of student objects, and can add or remove students 
 * to the class list
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercise;

// Class - Java Class
public class Class {
    // Class Variables
    private Student[] students;
    private int studentCount;
    
    // Constructors
    /**
     * The default constructor
     */
    public Class() {
        // Create Empty Class
        students = new Student[0];
        studentCount = students.length;
    }
    /**
     * Constructor used if a list of students is given
     * 
     * @param newStudents List of students
     */
    public Class(Student[] newStudents) {
        // Assign Given Students to Class
        students = newStudents;
        studentCount = students.length;
    }
    
    // Methods
    /**
     * This method will add a new student to the student list
     * 
     * @param name Name of student
     * @param year Year of student
     * @param grade Grade of student
     */
    public void addStudent(String name, int year, int grade) {
        // Create code to...
        // Add student to list using given info (Parameters may change)
        
        // Change count
        studentCount = students.length;
    }
    /**
     * This method will remove a student from the student list
     * 
     * @param studentName User-entered name of removed student
     * @return Returns success if found and failure otherwise
     */
    public String removeStudent(String studentName) {
        // Remove student from list using name
        boolean check1 = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(studentName)) {
                // Remove student
                for (int j = i; j <students.length-1; j++) {
                    students[j] = students[j+1];
                }
                check1 = false;
            }
        }
        if (check1) {
            // If student wasn't in list
            return "A student with the name " + studentName + " was not found.";
        }
        
        // Assign new list
        Student[] newStudents = new Student[students.length-1];
        for (int i2=0; i2<students.length-1; i2++) {
            newStudents[i2] = students[i2];
        }
        students = new Student[newStudents.length];
        for (int i3=0; i3<newStudents.length; i3++) {
            students[i3] = newStudents[i3];
        }
        
        // Change count
        studentCount = students.length;
        // Display removal
        return "Removed Student";
    }
    
    // Accessors
    /**
     * This method will return the list of students in the class
     * 
     * @return The student list
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * This method will return the number of students in the class
     * 
     * @return 
     */
    public int getStudentCount() {
        return studentCount;
    }
}
// End of Class