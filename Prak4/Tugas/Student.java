/**
 * File     : Student.java    16/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Student yang mencakup properti dan metode untuk merepresentasikan siswa
 */

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {

    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    //Overriding
    public void getDetails() {
        System.out.println("Student Details:");
        super.getDetails();
        System.out.println("ID: " + studentID);
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
   
        System.out.println("Enrolled Courses:");
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }

    
}
