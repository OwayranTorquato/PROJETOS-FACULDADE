public class Main {
    public static void main(String[] args) {
        // Create an instance of the EmployeeManagementSystem
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Create instances of Employee, Manager, and Developer
        Employee employee1 = new Employee("Owayran Silva", "Administrative Assistant", 2500);
        Manager manager1 = new Manager("Maria Costa", "Sales Manager", 5000, 1000);
        Developer developer1 = new Developer("João Fernandes", "Developer", 4000, "Java");

        // Add employees to the system
        system.addEmployee(employee1);
        system.addEmployee(manager1);
        system.addEmployee(developer1);

        // List all employees
        System.out.println("List of Employees:");
        system.listEmployees();

        // Update an employee's salary and list employees again
        System.out.println("\nUpdating salary of John:");
        employee1.setSalary(2800);
        system.updateEmployee(0, employee1);
        system.listEmployees();

        // Delete a manager and list employees again
        System.out.println("\nDeleting Manager:");
        system.deleteEmployee(1);
        system.listEmployees();
    }
}
