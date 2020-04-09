/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * Student.java
 * Purpose: Creates a new student object which holds information on a singular 
 * student such as name, year, grade, and more.
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercisegroup;

// Student - Java Class
public class Student {
    // Class Variables
    private String name; // Student Name
    private int year; // Student Year
    private int grade; // Student Grade (0-100)
    private int age; //Student Age
    
    
    // Constructors
    public Student() {
        // Assign default info
        name = "John Doe";
        year = 1;
        grade = 0;
        age = 0;
    }
    public Student(String studentName, int studentYear, int studentGrade, int studentAge) {
        // Assign give info (Parameters may change)
        name = studentName;
        year = studentYear;
        grade = studentGrade;
        age = studentAge;
    }
    
    // Accessors
    /**
     * This method returns the name of the student
     * 
     * @return Name of student
     */
    public String getName() {
        return name;
    }
    /**
     * This method returns the current year of the student
     * 
     * @return Year of student
     */
    public int getYear() {
        return year;
    }
    /**
     * This method returns the grade of the student
     * 
     * @return Grade of student
     */
    public int getGrade() {
        return grade;
    }
    /**
     * This method returns the age of the student
     * 
     * @return age of the student
     */
    public int getAge(){
        return age;
    }
       
    // Mutators
    /**
     * This method sets the name of the student
     * 
     * @param newName New name of the student
     */
    public void setName(String newName) {
        name = newName;
    }
    /**
     * This method sets the year of the student
     * 
     * @param newYear New year of the student
     */
    public void setYear(int newYear) {
        year = newYear;
    }
    /**
     * This method sets the grade of the student
     * 
     * @param newGrade New grade of the student
     */
    public void setGrade(int newGrade) {
        grade = newGrade;
    }
    /**
     * This method sets the age of the student
     * 
     * @param newAge new age of the student
     */
    public void setAge(int newAge){
        age = newAge;
    }
    
    // String Method
    /**
     * Overrides the string value returned when printed
     * 
     * @return String of student info
     */
    @Override
    public String toString() {
        // Create printed string
        // Create code to...
        // Add on new attribute to string
        String studentInfo = name + ", Year " + year + ", Grade " + grade + ", Age " + age;
        return studentInfo;
    }
}
// End of Class