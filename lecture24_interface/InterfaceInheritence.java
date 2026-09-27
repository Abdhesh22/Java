package lecture24_interface;

interface Animal {
    void eat();

    void bark();
}

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog {
    @Override
    public void eat() {
        System.out.println("Eating food");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
}

public class InterfaceInheritence {
    public static void main(String[] args) {
        Dog dg = new StreetDog();
        dg.eat();
        dg.bark();
    }
}
