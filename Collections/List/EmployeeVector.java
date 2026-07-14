package Collections.List;


import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;


public class EmployeeVector {


    public static void main(String[] args) {


        Vector<Employee> employees = new Vector<>();


        employees.add(
        new Employee(1,"Sri","sri@gmail.com","Female",45000));


        employees.add(
        new Employee(2,"Lakshmi","lakshmi@gmail.com","Female",55000));



        System.out.println("Using Iterator:");

        Iterator<Employee> itr = employees.iterator();


        while(itr.hasNext()) {

            itr.next().GetEmployeeDetails();
        }



        System.out.println("Using Enumeration:");

        Enumeration<Employee> en = employees.elements();


        while(en.hasMoreElements()) {

            en.nextElement().GetEmployeeDetails();
        }
    }
}