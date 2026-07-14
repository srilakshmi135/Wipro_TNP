package IO_Streams.Mini_Projects;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int employeeId;
    String employeeName;
    int employeeAge;
    double employeeSalary;


    public Employee(int employeeId, String employeeName,
                    int employeeAge, double employeeSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }


    public void display() {

        System.out.println(employeeId + " "
                + employeeName + " "
                + employeeAge + " "
                + employeeSalary);
    }
}