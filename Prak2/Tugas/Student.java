<<<<<<< HEAD
/**
 * File     : Student.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Student yang mencakup properti dan metode untuk merepresentasikan siswa
 */

import java.util.List;
import java.util.ArrayList;

public class Student {


    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void getDetails() {
  
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
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
=======
/**
 * File     : Student.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Student yang mencakup properti dan metode untuk merepresentasikan siswa
 */

import java.util.List;
import java.util.ArrayList;

public class Student {


    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void getDetails() {
  
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
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
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
