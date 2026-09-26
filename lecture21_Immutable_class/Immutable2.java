package lecture21_Immutable_class;

/**
 * Rule of making class immutable
 * 1. Make the class final.
 * 2. Make the variable final and virtual and method final.
 * 3. No Setter
 * 4.
 * Using the above no one can extends the class and make it changes.
 */

class CollegeSolution1 {

    private final String name;
    private final String address;

    CollegeSolution1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public final String getCollegeName() {
        return name;
    }

    public final String getCollegeAddress() {
        return address;
    }

}

final class StudentSolution1 {

    private final String name;
    private final String address;
    private final CollegeSolution1 college;

    StudentSolution1(String name, String address, CollegeSolution1 college) {
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

    public final String getCollegeName() {
        return college.getCollegeName();
    }

    public final String getCollegeAddress() {
        return college.getCollegeAddress();
    }

    public final CollegeSolution1 getCollege() {
        return college;
    }

}

// Fully immutable example 2
public class Immutable2 {
    public static void main(String[] args) {

        // the above things is know as shallow copy cause on memory both refer to same
        // object.
        /**
         * Two solve this we have method.
         * Method 1. Solve it by making the college function and method final and
         * virtual
         */

        CollegeSolution1 clg1 = new CollegeSolution1("Eshan College", "Mathure");
        StudentSolution1 st1 = new StudentSolution1("Abdhesh", "Agra", clg1);

        System.out.println(st1.getCollege().getCollegeName());

    }
}
