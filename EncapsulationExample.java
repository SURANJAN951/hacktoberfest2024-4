// Class demonstrating Encapsulation
class Employee {
    // Private fields to restrict direct access
    private String name;
    private int age;
    private double salary;

    // Public getter and setter methods for accessing and modifying private fields

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) { // Validation logic
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee();

        // Setting values using setter methods
        emp.setName("John Doe");
        emp.setAge(28);
        emp.setSalary(50000.0);

        // Getting values using getter methods and displaying employee details
        emp.displayEmployeeDetails();
    }
}
