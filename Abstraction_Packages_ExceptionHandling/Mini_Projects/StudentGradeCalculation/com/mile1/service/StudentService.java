package Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.service;


import Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.bean.Student;
import Abstraction_Packages_ExceptionHandling.Mini_Projects.StudentGradeCalculation.com.mile1.exception.*;


public class StudentService {


    public int findTotal(Student student)
            throws NullStudentObjectException, NullMarksArrayException {


        if(student == null) {

            throw new NullStudentObjectException();

        }


        if(student.getMarks() == null) {

            throw new NullMarksArrayException();

        }


        int total = 0;


        for(int mark : student.getMarks()) {

            total = total + mark;

        }


        return total;

    }




    public String findGrade(Student student)
            throws NullStudentObjectException,
                   NullMarksArrayException,
                   NullNameException {



        if(student == null) {

            throw new NullStudentObjectException();

        }


        if(student.getName() == null) {

            throw new NullNameException();

        }


        int total = findTotal(student);


        int average = total / student.getMarks().length;



        String grade;



        if(average >= 90)

            grade = "A+";


        else if(average >= 80)

            grade = "A";


        else if(average >= 70)

            grade = "B";


        else if(average >= 60)

            grade = "C";


        else

            grade = "D";



        student.setGrade(grade);



        return grade;

    }

}