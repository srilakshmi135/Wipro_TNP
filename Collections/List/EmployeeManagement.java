package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;


class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;


    Employee(int empId, String empName, String email, 
             String gender, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }


    void GetEmployeeDetails() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
        System.out.println("--------------------");
    }
}



class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();


    boolean addEmployee(Employee e) {

        return list.add(e);
    }


    boolean deleteEmployee(int empId) {

        Iterator<Employee> itr = list.iterator();

        while(itr.hasNext()) {

            Employee e = itr.next();

            if(e.empId == empId) {
                itr.remove();
                return true;
            }
        }

        return false;
    }


    String showPaySlip(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {

                return "Employee ID : " + e.empId +
                       "\nName : " + e.empName +
                       "\nSalary : " + e.salary;
            }
        }

        return "Employee not found";
    }
}



public class EmployeeManagement {


    public static void main(String[] args) {


        EmployeeDB db = new EmployeeDB();


        Employee e1 = new Employee(
                101,"Sri",
                "sri@gmail.com",
                "Female",
                50000);


        Employee e2 = new Employee(
                102,"Lakshmi",
                "lakshmi@gmail.com",
                "Female",
                60000);



        db.addEmployee(e1);
        db.addEmployee(e2);


        for(Employee e : db.list) {
            e.GetEmployeeDetails();
        }


        System.out.println(db.showPaySlip(101));


        db.deleteEmployee(102);

        System.out.println("After deleting employee:");

        for(Employee e : db.list) {
            e.GetEmployeeDetails();
        }
    }
}