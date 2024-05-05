/**
 * PartTimeEmployee.java 23/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada Employee
 */

public class PartTimeEmployee extends Employee implements WorkSchedule {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    
    public void displaySchedule() {
        System.out.println("Part-Time Employee Schedule: Flexible hours");
    }

     // Getter untuk hourlyRate
     public double getHourlyRate() {
        return hourlyRate;
    }

    // Getter untuk hoursWorked
    public int getHoursWorked() {
        return hoursWorked;
    }
}
