package Collections.Mini_Projects;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Box {

    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Box))
            return false;

        Box b = (Box) obj;

        return Double.compare(getVolume(), b.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }

    @Override
    public String toString() {
        return "Length =" + length +
                " Width =" + width +
                " Height =" + height +
                " Volume =" + String.format("%.2f", getVolume());
    }
}

public class SetOfBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> set = new HashSet<>();

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            set.add(new Box(l, w, h));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {
            System.out.println(b);
        }

        sc.close();
    }
}