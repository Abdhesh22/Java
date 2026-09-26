package lecture19_nested_classes;

/**
 * Person
 */
class Person {
    void greet() {
        System.out.println("printing from person");
    }
}

public class Anonymous {
    public static void main(String[] args) {

        Person p = new Person();
        p.greet();

        // now this is anonymous class
        Person p2 = new Person() {

            void goodMorning() {
                System.out.println("Good Morning");
            }

            void greet() {
                goodMorning();
                System.out.println("/greeting fro guest");
            }
        };

        p2.greet();
        // p2.goodMorning() // we create a extra function but object can only call the
        // function

    }
}
