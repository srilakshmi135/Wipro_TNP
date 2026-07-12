package OOPSInheritance.ClassesObjects;


class Box {

    double width;
    double height;
    double depth;

    // Parameterized constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

   
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box box = new Box(10, 5, 3);

        System.out.println("Width: " + box.width);
        System.out.println("Height: " + box.height);
        System.out.println("Depth: " + box.depth);

        System.out.println("Volume of Box: " + box.volume());
    }
}