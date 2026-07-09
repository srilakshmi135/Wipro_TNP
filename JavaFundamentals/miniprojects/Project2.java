package miniprojects;

public class Project2 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter roll number");
            return;
        }

        int roll = Integer.parseInt(args[0]);

        int rollNo[] = {101, 102, 103, 104, 105};

        String name[] = {
            "Anil", "Balu", "Charan", "Deepa", "Eswar"
        };

        int m1[] = {85, 35, 60, 90, 40};
        int m2[] = {78, 40, 55, 95, 45};
        int m3[] = {88, 30, 65, 85, 50};

        int index = -1;

        for (int i = 0; i < rollNo.length; i++) {
            if (rollNo[i] == roll) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found");
            return;
        }

        int total = m1[index] + m2[index] + m3[index];
        int avg = total / 3;

        String result;

        if (m1[index] >= 40 && m2[index] >= 40 && m3[index] >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("Roll No: " + rollNo[index]);
        System.out.println("Name: " + name[index]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Result: " + result);
    }
}