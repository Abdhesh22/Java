package lecture_19_nested_classes;

// Inner class can only use the static function of Outer class or else they will get error because Static class can be create without the object of creating the object of outer class
// if we need to call the any non static function of outer then we need pass the object reference of outer class
class Outer {
    void printOuter() {
        System.out.println("Printing Outer");
    }

    static class Inner {
        void print() {
            System.out.println("Printing the Nested class");
        }

        void printOuterReference(Outer ot) {
            ot.printOuter();
        }

    }
}

public class Static_Nested {
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner ob = new Outer.Inner();
        ob.print();
        ob.printOuterReference(ot);
    }
}

// Use Cases
// As helper class for any outer class
// Builder design Pattern
// Request/Response DTO
// If we want to have static method inside a nested class

// Properties
// 1. Doesn't need an instance of outer class.
// 2. Class can be initialized like normal class
// 3. can access only static members of outer class.
// 4. can access the non-static members by having a reference of outer class
// 5. It is just like a normal class & can do anything a outer class does.
