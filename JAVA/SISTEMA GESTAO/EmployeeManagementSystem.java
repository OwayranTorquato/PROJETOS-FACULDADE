import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(int index, Employee employee) {
        if (index >= 0 && index < employees.size()) {
            employees.set(index, employee);
        }
    }

    public void listEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        }
    }
}
