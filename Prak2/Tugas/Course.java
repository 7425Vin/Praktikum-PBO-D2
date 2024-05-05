<<<<<<< HEAD
/**
 * File     : Course.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Course yang mencakup properti dan metode untuk merepresentasikan Course
 */

import java.util.List;
import java.util.ArrayList;

public class Course {
    /* implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        // buatlah fungsi konstruktor
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void addStudent(Student student) {
        // buatlah fungsi untuk menambah seorang mahasiswa
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        // buatlah fungsi untuk menghapus seorang mahasiswa
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        /* buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
        System.out.println("Enrolled Students:");
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }

    public void getDetails() {
        /* buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }      

    // Other methods...
}
=======
/**
 * File     : Course.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Course yang mencakup properti dan metode untuk merepresentasikan Course
 */

import java.util.List;
import java.util.ArrayList;

public class Course {
    /* implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        // buatlah fungsi konstruktor
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void addStudent(Student student) {
        // buatlah fungsi untuk menambah seorang mahasiswa
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        // buatlah fungsi untuk menghapus seorang mahasiswa
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        /* buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
        System.out.println("Enrolled Students:");
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }

    public void getDetails() {
        /* buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }      

    // Other methods...
}
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
