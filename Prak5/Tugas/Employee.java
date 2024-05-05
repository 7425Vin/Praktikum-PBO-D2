/**
 * Employee.java 23/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : kelas abstrak, berisi abstraksi Employee
 */

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public int getId() {
        return id;
    }

    
    public String getName() {
        return name;
    }
}
