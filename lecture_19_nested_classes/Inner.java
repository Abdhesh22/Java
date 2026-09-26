package lecture_19_nested_classes;

class Outer {
    class Inner {
        void func() {
            System.out.println("inside the func");
        }
    }
}

/**
 * Outer2
 */
class Outer2 {
    int x = 10;

    /**
     * Inner2
     */
    class Inner2 {
        int x = 20;

        void func() {
            System.out.println((x));
            System.out.println(Outer2.this.x);
        }
    }
}

// Before Java 16 version there is rule that we can't make static method and
// members
// inside the inner class.

// Java < 16
// Non-static inner class
// ├── static int x ❌
// ├── static method ❌
// └── static final constant ✅

// Java 16+
// Non-static inner class
// ├── static int x ✅
// ├── static method ✅
// └── static final constant ✅

// Before Java 16, a non-static inner class
// could not declare static members or static methods.

class A {
    class B {
        static int x = 10; // ❌ Error before Java 16

        static void func() { // ❌ Error before Java 16
            System.out.println("Hello");
        }
    }
}

/**
 * ### Why were static members not allowed in Inner Classes before Java 16?
 * 
 * First understand that a **non-static inner class belongs to an object of the
 * outer class**:
 * 
 * ```java
 * class A {
 * class B {
 * // B object is associated with an A object
 * }
 * }
 * ```
 * 
 * For example:
 * 
 * ```java
 * A a = new A();
 * A.B b = a.new B();
 * ```
 * 
 * But a `static` member belongs to the **class itself**, not to an object.
 * 
 * ```java
 * class B {
 * static int x = 10; // belongs to B class
 * }
 * ```
 * 
 * So historically Java kept these concepts separate:
 * 
 * ```text
 * Inner class → associated with Outer object
 * Static member → associated with Class
 * ```
 * 
 * Therefore, before **Java 16**, general static members were not allowed inside
 * non-static inner classes:
 * 
 * ```java
 * class A {
 * class B {
 * static int x = 10; // ❌ Before Java 16
 * }
 * }
 * ```
 * 
 * From **Java 16**, this restriction was removed:
 * 
 * ```java
 * class A {
 * class B {
 * static int x = 10; // ✅ Java 16+
 * }
 * }
 * ```
 ** 
 * Important:** `static final` compile-time constants were already allowed
 * before Java 16.
 * 
 * 👉 Don't memorize "static is not allowed in inner classes."
 * Remember: **Java 16 removed the old restriction on static members in
 * non-static inner classes.**
 */

// Efficient Final Rule

public class Inner {

    public static void main(String[] args) {

        Outer ot = new Outer();
        Outer.Inner inner = ot.new Inner();
        inner.func();

        // onliner
        Outer.Inner inn = new Outer().new Inner();
        inn.func();

        Outer2.Inner2 inn2 = new Outer2().new Inner2();
        inn2.func();

        A.B ab = new A().new B();
        ab.func();

    }

}
