import java.io.*;

public class Employee {
    
    // this instance variable is visible for any child class.
    public String name;

    // salary variable is visible in Employee class only.
    // private double salary;

    // The name variable is assigned in the constructor.
    public Employee (String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    // int age;
    // String designation;

    // This is the constructor of the class Employee
    // public Employee(String name) {
    //     this.name = name;
    // }

    // Assign the age of the Employee to the variable age.
    // public void empAge(int empAge) {
    //     age = empAge;
    // }

    // // Assign the designation to the variable designation
    // public void empDesignation(String empDesig) {
    //     designation = empDesig;
    // }

    // Assign the salary to the variable salary
    // public void empSalary(double empSalary) {
    //     salary = empSalary;
    // }

    // Print the employee details
    // public void printEmployee() {
    //     System.out.println("Name:" + name);
    //     System.out.println("Age:" + age);
    //     System.out.println("Designation:" + designation);
    //     System.out.println("Salary:" + salary);
    // }

    // public void printEmp() {
    //     System.out.println("name : " + name );
    //     System.out.println("salary : " + salary);
    // }

    // public static void main(String args[]) {
    //     Employee empOne = new Employee("Ransika");
    //     empOne.setSalary(1000);
    //     empOne.printEmp();
    // }

    // salary variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average slary:" + salary);
    }
}
