/**
 * File     : Lecture.java    16/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Kelas Lecture yang mencakup properti dan metode untuk merepresentasikan Lecture
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    /* implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        // buatlah fungsi konstruktor
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    //Overriding
    public void getDetails() {
        /* buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
        System.out.println("Lecture Details:");
        super.getDetails();
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
}
