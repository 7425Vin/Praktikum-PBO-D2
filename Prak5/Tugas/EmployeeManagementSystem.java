/**
 * EmployeeManagementSystem.java 23/03/24
 * Nama : Vincentius Setyawan Widyahadi
 * NIM : 24060122120006
 * Deskripsi : implementasi cara memanage employee
 */

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(101, "John Doe", 6000.0);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee(102, "Kobayashi", 5500.0);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee(103, "Takimoto Hifumi", 5000.0);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(201, "Jane Smith", 15.0, 45);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee(202, "Suzukaze Aoba", 13.0, 30);

        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + fullTimeEmployee1.getId());
        System.out.println("Name: " + fullTimeEmployee1.getName());
        System.out.println("Monthly Salary: $" + fullTimeEmployee1.calculateSalary());
        System.out.println("Salary: $" + fullTimeEmployee1.calculateSalary());
        fullTimeEmployee1.displaySchedule();
        System.out.println();

        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + fullTimeEmployee2.getId());
        System.out.println("Name: " + fullTimeEmployee2.getName());
        System.out.println("Monthly Salary: $" + fullTimeEmployee2.calculateSalary());
        System.out.println("Salary: $" + fullTimeEmployee2.calculateSalary());
        fullTimeEmployee2.displaySchedule();
        System.out.println();

        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + fullTimeEmployee3.getId());
        System.out.println("Name: " + fullTimeEmployee3.getName());
        System.out.println("Monthly Salary: $" + fullTimeEmployee3.calculateSalary());
        System.out.println("Salary: $" + fullTimeEmployee3.calculateSalary());
        fullTimeEmployee3.displaySchedule();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        System.out.println("ID: " + partTimeEmployee1.getId());
        System.out.println("Name: " + partTimeEmployee1.getName());
        System.out.println("Hourly Rate: $" + partTimeEmployee1.getHourlyRate()); 
        System.out.println("Hours Worked: " + partTimeEmployee1.getHoursWorked());
        System.out.println("Salary: $" + partTimeEmployee1.calculateSalary());
        partTimeEmployee1.displaySchedule();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        System.out.println("ID: " + partTimeEmployee2.getId());
        System.out.println("Name: " + partTimeEmployee2.getName());
        System.out.println("Hourly Rate: $" + partTimeEmployee2.getHourlyRate()); 
        System.out.println("Hours Worked: " + partTimeEmployee2.getHoursWorked());
        System.out.println("Salary: $" + partTimeEmployee2.calculateSalary());
        partTimeEmployee2.displaySchedule();
    }
}
