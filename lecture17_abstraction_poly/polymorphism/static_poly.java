package lecture17_abstraction_poly.polymorphism;

class Human {
    void run() {
        System.out.println("Normal running");
    }

    void run(boolean isDogBehind) {
        System.out.println("Dog is behind running fast!!");
    }
}

public class static_poly {
    public static void main(String[] args) {
        Human h = new Human();
        h.run();
        h.run(true);
    }
}
