package OOPSInheritance.Overriding_Polymorphism.ShapeExample;

public class ShapeDemo {
    public static void main(String[] args) {


        Shape s;


        s = new Circle();
        s.draw();
        s.erase();


        s = new Triangle();
        s.draw();
        s.erase();


        s = new Square();
        s.draw();
        s.erase();

    }
}