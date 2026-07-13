package OOPSInheritance.Overriding_Polymorphism.FruitExample;

public class FruitDemo {

    public static void main(String[] args) {

        Fruit f;

        f = new Apple("Apple", "Sweet", "Medium");
        f.eat();

        f = new Orange("Orange", "Sour", "Medium");
        f.eat();
    }
}