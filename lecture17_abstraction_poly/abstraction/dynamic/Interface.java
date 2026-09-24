package lecture17_abstraction_poly.abstraction.dynamic;

// we can't create a object through direct interface

interface Car {
    void start();

    void stop();
}

class ElectricCar implements Car {
    @Override()
    public void start() {
        System.out.println("Starting the Car");
    }

    @Override()
    public void stop() {
        System.out.println("Stopping Car");
    }
}

public class Interface {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.stop();
    }
}
