<<<<<<< HEAD
/**
 * File     : Main.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Program driver untuk Student, Lecture dan Course
 */

public class Main {
    public static void main(String[] args) {
      Lecture agus = new Lecture("Agus", 44, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 56, "Banyumanik", 412873);
      
      Student cahyo = new Student("Cahyo", 18, "456 Elm St", 723751);
      Student dani = new Student("Dani", 19, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);
      
      Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
      Course cs102 = new Course("CS102", "Data Structures", bambang);
      Course cs103 = new Course("CS103", "Algorithms", bambang);
      
      agus.teachCourse(cs101);
      agus.teachCourse(cs102);
      bambang.teachCourse(cs103);
  
      cs101.addStudent(cahyo);
      cs101.addStudent(dani);
      cs101.addStudent(edi);
  
      cs102.addStudent(cahyo);
      cs102.addStudent(dani);
  
      cs103.addStudent(cahyo);

      dani.getDetails();

      bambang.getDetails();
  
      cahyo.viewEnrolledCourses();
      agus.viewTaughtCourses();
      cs101.viewEnrolledStudents();
    }
  }
=======
/**
 * File     : Main.java    01/03/24
 * Penulis  : Vincentius Setyawan Widyahadi
 * NIM      : 24060122120006
 * Deskripsi: Program driver untuk Student, Lecture dan Course
 */

public class Main {
    public static void main(String[] args) {
      Lecture agus = new Lecture("Agus", 44, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 56, "Banyumanik", 412873);
      
      Student cahyo = new Student("Cahyo", 18, "456 Elm St", 723751);
      Student dani = new Student("Dani", 19, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);
      
      Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
      Course cs102 = new Course("CS102", "Data Structures", bambang);
      Course cs103 = new Course("CS103", "Algorithms", bambang);
      
      agus.teachCourse(cs101);
      agus.teachCourse(cs102);
      bambang.teachCourse(cs103);
  
      cs101.addStudent(cahyo);
      cs101.addStudent(dani);
      cs101.addStudent(edi);
  
      cs102.addStudent(cahyo);
      cs102.addStudent(dani);
  
      cs103.addStudent(cahyo);

      dani.getDetails();

      bambang.getDetails();
  
      cahyo.viewEnrolledCourses();
      agus.viewTaughtCourses();
      cs101.viewEnrolledStudents();
    }
  }
>>>>>>> 8f51523a38d96525ec660664193895967e0be060
  