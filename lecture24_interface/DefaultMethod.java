package lecture24_interface;

// This comes after the java8 default, static. after java9 private and public comes
interface Vehicle {
    void drive();

    default void applyBreak() {
        System.out.println("Applying Break");
        boost();
    }

    static void speed() {
        System.out.println("Speeding !!");
    }

    private void boost() {
        System.out.println("Slowing down!!");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        v.applyBreak();

        Vehicle.speed();

    }
}
