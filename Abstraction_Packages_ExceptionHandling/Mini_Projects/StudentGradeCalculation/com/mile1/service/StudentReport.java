package Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.service;


import Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.bean.Student;


public class StudentReport {


    public void generateReport(Student student) {


        StudentService service = new StudentService();


        try {


            int total = service.findTotal(student);


            String grade = service.findGrade(student);



            System.out.println("Student Name : " + student.getName());

            System.out.println("Total Marks : " + total);

            System.out.println("Grade : " + grade);



        }
        catch(Exception e) {


            System.out.println(e.getMessage());


        }


    }

}