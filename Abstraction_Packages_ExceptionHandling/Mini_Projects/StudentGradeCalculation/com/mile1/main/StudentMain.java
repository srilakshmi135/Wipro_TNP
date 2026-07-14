package Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.main;


import Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.bean.Student;

import Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.service.StudentReport;



public class StudentMain {


    public static void main(String[] args) {



        int marks[] = {90,85,95};



        Student student = new Student("Sri Lakshmi", marks);



        StudentReport report = new StudentReport();



        report.generateReport(student);



    }

}