package IO_Streams.Mini_Projects;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static final String fileName = "employee.dat";

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, salary);

        File file = new File(fileName);

        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos =
                     (file.exists() && file.length() > 0)
                             ? new AppendableObjectOutputStream(fos)
                             : new ObjectOutputStream(fos)) {

            oos.writeObject(emp);

            System.out.println("Employee Added Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void displayEmployees() {

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No Employee Records Found");
            return;
        }

        System.out.println("\n----Report-----");

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            while (true) {

                Employee emp = (Employee) ois.readObject();
                emp.display();
            }

        } catch (EOFException e) {

            System.out.println("----End of Report-----");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}