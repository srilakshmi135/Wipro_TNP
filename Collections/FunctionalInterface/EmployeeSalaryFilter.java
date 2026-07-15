package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 9000));
        employees.add(new Employee(102, "Anu", 15000));
        employees.add(new Employee(103, "Kiran", 8000));
        employees.add(new Employee(104, "Divya", 25000));
        employees.add(new Employee(105, "Ravi", 7000));

        Predicate<Employee> salaryLessThan10000 = emp -> emp.salary < 10000;

        System.out.println("Employees with Salary less than 10000:");

        employees.stream()
                 .filter(salaryLessThan10000)
                 .forEach(System.out::println);
    }
}