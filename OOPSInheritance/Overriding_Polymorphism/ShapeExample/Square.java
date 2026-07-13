package OOPSInheritance.Overriding_Polymorphism.ShapeExample;

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}