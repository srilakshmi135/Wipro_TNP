package IO_Streams.Mini_Projects;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String fileName = "employee.dat";


    public static void main(String[] args) {


        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");


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
                    System.exit(0);


                default:
                    System.out.println("Invalid Choice");
            }
        }
    }



    public static void addEmployee() {


        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();


        System.out.print("Enter Employee Name: ");
        String name = sc.next();


        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();


        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();



        Employee emp =
                new Employee(id, name, age, salary);



        try {

            FileOutputStream fos =
                    new FileOutputStream(fileName, true);


            ObjectOutputStream oos =
                    new ObjectOutputStream(fos) {

                protected void writeStreamHeader()
                        throws IOException {

                    reset();
                }
            };


            oos.writeObject(emp);

            oos.close();
            fos.close();


            System.out.println("Employee Added Successfully");

        }

        catch(IOException e) {

            e.printStackTrace();
        }
    }




    public static void displayEmployees() {


        System.out.println("\n----Report-----");


        try {


            FileInputStream fis =
                    new FileInputStream(fileName);


            ObjectInputStream ois =
                    new ObjectInputStream(fis);



            while (true) {


                Employee emp =
                        (Employee) ois.readObject();


                emp.display();
            }


        }

        catch(EOFException e) {

            System.out.println("----End of Report-----");

        }

        catch(Exception e) {

            System.out.println("No Employee Records Found");
        }
    }
}