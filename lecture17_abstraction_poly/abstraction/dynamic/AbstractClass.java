package lecture17_abstraction_poly.abstraction.dynamic;

// can have all abstract function or single function.
abstract class Car {
    void start() {
        System.out.println("Starting Car!!!");
    }

    void stop() {
        System.out.println("Stopping Car!!!");
    }

    void accelerate() {
        System.out.println("Accelerating Car !!!");
    }

    abstract void changeGear();

}

// We get error until the changeGear implement inside the subclass
class ElectricCar extends Car {
    void changeGear() {
        System.out.println("Changing Gear");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new ElectricCar();
        c.accelerate();
        c.changeGear();
    }
}
