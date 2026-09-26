package lecture_19_nested_classes;

class Outer {
    private int x = 14;

    void greet() {

        System.out.println("hello");

        class Local {
            void sayHello() {
                System.out.println("Saying Hello!!!");
            }
        }

        Local lc = new Local();
        lc.sayHello();

    }
}

/***
 * 
 * ## Rule of Effectively Final Variable
 * 
 * When a **local variable** of a method is used inside a **Local Class or
 * Anonymous Class**, that variable must be either:
 * 
 * 1. `final`, or
 * 2. **Effectively final** — assigned once and never modified.
 * 
 * ### Example
 * 
 * ```java
 * void greet() {
 * int x = 14; // effectively final
 * 
 * class Local {
 * void show() {
 * System.out.println(x); // ✅
 * }
 * }
 * }
 * ```
 * 
 * Here, `x` is effectively final because its value is never changed.
 * 
 * ### Not Allowed
 * 
 * ```java
 * void greet() {
 * int x = 14;
 * 
 * x = 20; // ❌ x is no longer effectively final
 * 
 * class Local {
 * void show() {
 * System.out.println(x); // ❌
 * }
 * }
 * }
 * ```
 * 
 * ### Why?
 * 
 * A Local/Anonymous Class can continue to exist even after the method finishes.
 * Java captures the **value** of the local variable. Therefore, Java does not
 * allow that captured local variable to be modified.
 * 
 * ### Important
 * 
 * This rule applies to **local variables**, not instance variables.
 * 
 * ```java
 * class Outer {
 * int x = 14; // instance variable
 * 
 * void greet() {
 * class Local {
 * void show() {
 * System.out.println(x); // ✅
 * }
 * }
 * 
 * x = 20; // ✅ allowed
 * }
 * }
 * ```
 * 
 * ### Remember 🧠
 * 
 * ```text
 * Local variable + Local/Anonymous Class
 * ↓
 * final OR effectively final
 * 
 * Instance variable
 * ↓
 * No effectively-final restriction
 * ```
 ** 
 * Effectively final = a variable that behaves like `final` even though the
 * `final` keyword is not written.**
 * 
 */

class Outer2 {

    void greet() {

        int x = 14;
        // x = 20; // ❌ x is no longer effectively final

        class Local {

            void sayHello() {
                System.out.println("hello" + x);
                System.out.println("Saying Hello!!!");
            }
        }

        Local lc = new Local();
        lc.sayHello();

    }
}

public class Local {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.greet();

        Outer2 ot2 = new Outer2();
        ot2.greet();
    }
}
