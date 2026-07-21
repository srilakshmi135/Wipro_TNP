package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentService {

    public String findGrades(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int total = 0;

        for (int mark : student.getMarks()) {

            if (mark < 35)
                return StudentReport.FAIL;

            total += mark;
        }

        double average = total / student.getMarks().length;

        if (average >= 80)
            return StudentReport.GRADE_A;

        else if (average >= 60)
            return StudentReport.GRADE_B;

        else
            return StudentReport.GRADE_C;
    }
}