package lecture21_Immutable_class;

class College3 {

    String name;
    String address;

    College3(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

final class Student3 {

    private final String name;
    private final String address;
    private final College3 college;

    Student3(String name, String address, College3 college) {
        this.name = name;
        this.address = address;
        this.college = new College3(college.name, college.address);
    }

    public final String getName() {
        return name;
    }

    public final String getAddress() {
        return address;
    }

    public final College3 getCollege() {
        return new College3(college.name, college.address);
    }

}

// Fully immutable example 2
public class Immutable3 {
    /**
     * This is Method 2
     * Solve it using the defensive copy.
     * Make copy on both sides constructor and while getting.
     */
    public static void main(String[] args) {
        College3 clg = new College3("Eshan college", "Mathura");
        Student3 st = new Student3("Abdhesh", "Agra", clg);

        System.out.println(st.getCollege().name);
        clg.name = "Anand clg";
        st.getCollege().name = "Anand clg";
        System.out.println(clg.name);
        System.out.println(st.getCollege().name);
    }
}
