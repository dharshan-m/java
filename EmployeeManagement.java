import java.util.Scanner;

// Abstract class
abstract class Employee {
    String name;
    int empID;

    Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    abstract double calculateSalary(); // Abstract method

    void displayInfo() {
        System.out.println("Employee ID: " + empID + ", Name: " + name);
    }
}

// Subclass: Full-time Employee
class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int empID, double salary) {
        super(name, empID);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

// Subclass: Part-time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int empID, int hoursWorked, double hourlyRate) {
        super(name, empID);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 40, 20);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}

