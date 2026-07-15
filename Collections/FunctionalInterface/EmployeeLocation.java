package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class EmployeeLocation {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", "Hyderabad", 50000));
        list.add(new Employee(102, "Anu", "Pune", 60000));
        list.add(new Employee(103, "Kiran", "Chennai", 55000));
        list.add(new Employee(104, "Divya", "Bangalore", 70000));
        list.add(new Employee(105, "Ravi", "Pune", 65000));

        Function<Employee, String> location = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : list) {
            locations.add(location.apply(e));
        }

        System.out.println("Locations:");
        locations.forEach(System.out::println);
    }
}