/**
 * FullTimeEmployee.java 23/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada Employee
 */

public class FullTimeEmployee extends Employee implements WorkSchedule {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    
    public double calculateSalary() {
        return monthlySalary;
    }

    
    public void displaySchedule() {
        System.out.println("Full-Time Employee Schedule: Monday to Friday, 9:00 AM - 5:00 PM");
    }
}
