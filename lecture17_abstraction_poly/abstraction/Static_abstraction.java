package lecture17_abstraction_poly.abstraction;

class Car {

    void start() {
        System.out.println("Starting Car !!");
    }

    void accelerate() {
        System.out.println("Accelerating Car!!!");
    }

    void breakCar() {
        System.out.println("Applying Breaking !!!");
    }

}

class FuelCar extends Car {
    void drive() {
        System.out.println("Driving Car!!!");
    }
}

class ElectricCar extends Car {
    void drive() {
        System.out.println("Driving Electric Car !!");
    }
}

public class Static_abstraction {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.accelerate();
        c.breakCar();

        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();

        FuelCar fc = new FuelCar();
        fc.start();
        fc.drive();

    }
}
