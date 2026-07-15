package Collections.Mini_Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {

    String firstName;
    String lastName;
    String mobile;
    String email;
    String address;

    Employee(String firstName, String lastName, String mobile,
             String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }
}

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            list.add(new Employee(first, last, mobile, email, address));
        }

        Collections.sort(list,
                Comparator.comparing(e -> e.firstName));

        System.out.println("\nEmployee List:");

        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "Firstname", "Lastname", "Mobile",
                "Email", "Address");

        for (Employee e : list) {

            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                    e.firstName,
                    e.lastName,
                    e.mobile,
                    e.email,
                    e.address);
        }

        sc.close();
    }
}