package OOPSInheritance.Overriding_Polymorphism.FruitExample;

class Orange extends Fruit {

    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Eating Orange - It tastes juicy");
    }
}