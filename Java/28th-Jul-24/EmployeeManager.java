class Employee {
    String n;
    int id;
    double s;
    
    Employee(String name, int employeeId, double salary) {
        n = name;
        id = employeeId;
        s = salary;
    }

    double getSalary1() {
        return s;
    }

    String getName() {
        return n;
    }

    int getEmployeeId() {
        return id;
    }
}

class Manager extends Employee {
    double x;
    double y;

    Manager(String name, int employeeId, double salary, double travelingAllowance, double houseRentAllowance) {
        super(name, employeeId, salary);
        x = travelingAllowance;
        y = houseRentAllowance;
    }

    double getSalary2() {
        return getSalary1() + x + y;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Jeno", 12345, 50000);
        Manager manager = new Manager("Sathya", 67890, 75000, 10000, 15000);
        System.out.println("Employee :" + employee.getName() + "\nSalary: " + employee.getSalary1());
        System.out.println("Manager :" + manager.getName() + "\nSalary: " + manager.getSalary2());
    }
}