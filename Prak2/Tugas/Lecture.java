<<<<<<< HEAD
/**
 * File     : Lecture.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Lecture yang mencakup properti dan metode untuk merepresentasikan Lecture
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    /* implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        // buatlah fungsi konstruktor
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        /* buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
        System.out.println("Lecture Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("ID: " + employeeID);
    }    

    public void teachCourse(Course course) {
        // buatlah fungsi untuk menambah sebuah course 
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        /* buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
        System.out.println("Taught Courses:");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }

    // Other methods...
}
=======
/**
 * File     : Lecture.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Lecture yang mencakup properti dan metode untuk merepresentasikan Lecture
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    /* implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        // buatlah fungsi konstruktor
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        /* buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
        System.out.println("Lecture Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("ID: " + employeeID);
    }    

    public void teachCourse(Course course) {
        // buatlah fungsi untuk menambah sebuah course 
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        /* buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
        System.out.println("Taught Courses:");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }

    // Other methods...
}
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
