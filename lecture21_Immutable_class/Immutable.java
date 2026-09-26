package lecture21_Immutable_class;

/**
 * Rule of making class immutable
 * 1. Make the class final.
 * 2. Make the variable final and virtual and method final.
 * 3. No Setter
 * 
 * Using the above no one can extends the class and make it changes.
 */

class College {

    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

final class Student {

    private final String name;
    private final String address;
    private final College college;

    Student(String name, String address, College college) {
        this.name = name;
        this.address = address;
        this.college = college;
    }

    public final String getName() {
        return name;
    }

    public final String getAddress() {
        return address;
    }

    public final College getCollege() {
        return college;
    }

}

public class Immutable {
    public static void main(String[] args) {

        // Currently we have the class which is fully immutable.
        // Student st = new Student("Abdhesh", "Agra");
        // System.out.println(st.getAddress());
        // System.out.println(st.getName());

        // Now lets introduced the college object with { name, address } of it.
        College clg = new College("Eshan college", "Mathura");
        Student st = new Student("Abdhesh", "Agra", clg);

        // This changing the name of college which break the rules of immutable class
        System.out.println(st.getCollege().name);
        st.getCollege().name = "Anand clg";
        System.out.println(st.getCollege().name);

    }
}
