package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentGradeTest {

    StudentService service = new StudentService();

    // Test Case 1 - Grade A
    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("Sri", new int[] {90, 85, 88});
        assertEquals(StudentReport.GRADE_A, service.findGrades(s));
    }

    // Test Case 2 - Grade B
    @Test
    public void testGradeB() throws Exception {
        Student s = new Student("Sai", new int[] {70, 65, 68});
        assertEquals(StudentReport.GRADE_B, service.findGrades(s));
    }

    // Test Case 3 - Grade C
    @Test
    public void testGradeC() throws Exception {
        Student s = new Student("Ram", new int[] {55, 50, 60});
        assertEquals(StudentReport.GRADE_C, service.findGrades(s));
    }

    // Test Case 4 - Fail
    @Test
    public void testFail() throws Exception {
        Student s = new Student("John", new int[] {30, 60, 70});
        assertEquals(StudentReport.FAIL, service.findGrades(s));
    }

    // Test Case 5 - Null Student
    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {
        service.findGrades(null);
    }

    // Test Case 6 - Null Name
    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[] {80, 85, 90});
        service.findGrades(s);
    }

    // Test Case 7 - Null Marks Array
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArray() throws Exception {
        Student s = new Student("Ravi", null);
        service.findGrades(s);
    }

    // Test Case 8 - Boundary Grade A (Average = 80)
    @Test
    public void testBoundaryGradeA() throws Exception {
        Student s = new Student("Anu", new int[] {80, 80, 80});
        assertEquals(StudentReport.GRADE_A, service.findGrades(s));
    }

    // Test Case 9 - Boundary Grade B (Average = 60)
    @Test
    public void testBoundaryGradeB() throws Exception {
        Student s = new Student("Kiran", new int[] {60, 60, 60});
        assertEquals(StudentReport.GRADE_B, service.findGrades(s));
    }
}