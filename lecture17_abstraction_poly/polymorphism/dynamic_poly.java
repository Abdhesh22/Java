package lecture17_abstraction_poly.polymorphism;

class Animal {
    void run() {
        System.out.println("Normal running");
    }
}

class Human extends Animal {
    void run() {
        System.out.println("Human running");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog running");
    }
}

class Duck extends Animal {
    void run() {
        System.out.println("Duck running");
    }
}

// class A {
// static void run() {
// System.out.println("Running A");
// }
// }

// class B extends A {
// static void run() {
// System.out.println("Running B");
// }
// }

// both class function should be treated different
// class A {
// private void run() {
// System.out.println("Running A");
// }
// }

// class B extends A {
// private void run() {
// System.out.println("Running B");
// }
// }

// Final Keyword -> can't be overridden
class A {
    final void run() {
        System.out.println("Running A");
    }
}

class B extends A {
    final void run() {
        System.out.println("Running B");
    }
}

// this is also known as run time polymorphism cause object create during
// runtime as assigned through heap memory
public class dynamic_poly {
    public static void main(String[] args) {
        Animal a = new Human();
        a.run();

        A a1 = new B();
        a1.run();

    }
}

/**
 * Important Notes
 * 
 * private -> can't override
 * final -> can't override since function is write for no change.
 * static -> can't override but if we write static in both class then reference
 * class function will be called
 * A a = new B(); a refer to A so A's static will be called.
 * 
 */