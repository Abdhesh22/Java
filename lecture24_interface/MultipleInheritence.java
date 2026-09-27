package lecture24_interface;

interface A {
    void fun();

    void fun2();
}

interface B extends A {
    void fun();

    void fun2();
}

interface C extends A {
    void fun();

    void fun2();
}

// in this case we must need to override it
class D implements B, C {
    @Override
    public void fun() {
        System.out.println("This is fun");
    }

    @Override
    public void fun2() {
        System.out.println("this is fun2");
    }
}

// Now with default methods
interface C1 {
    void fun();

    void fun2();
}

interface A1 extends C1 {
    default void fun() {
        System.out.println("this fun is from A1");
    }

    default void fun2() {
        System.out.println("this fun2 is from A1");
    }
}

interface B1 extends C1 {
    default void fun() {
        System.out.println("this fun is from B1");
    }

    default void fun2() {
        System.out.println("this fun2 is from B1");
    }
}

class D1 implements A1, B1 {
    @Override
    public void fun() {
        System.out.println("this fun is from D1");
    }

    @Override
    public void fun2() {
        A1.super.fun2();
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        A a = new D();
        a.fun();
        a.fun2();

        A1 a1 = new D1();
        a1.fun();
        a1.fun2();
    }
}
/**
 * Make Interface name like
 * runnable
 * walkable
 * eatable
 * talkable
 */