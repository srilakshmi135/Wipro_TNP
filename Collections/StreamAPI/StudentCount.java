package Collections.StreamAPI;

import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentCount {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ram", 45));
        list.add(new Student(2, "Hari", 70));
        list.add(new Student(3, "Kiran", 55));
        list.add(new Student(4, "Anu", 30));
        list.add(new Student(5, "Priya", 90));

        long count = list.stream()
                .filter(s -> s.marks >= 50)
                .count();

        System.out.println("Students passed: " + count);
    }
}