package lecture22_ObjectClass;

/**
 * Object class is the parent of each class its the following things below we
 * overwrite this.
 * 
 * Core-Methods
 * 1. toString()
 * 2. equals()
 * 3. hashCode()
 * 4. getClass()
 * 
 * Garbage Collection
 * 1. finalize()
 * 
 * Threads
 * 1. wait()
 * 2. notify()
 * 3. notifyAll()
 * 
 * Cloning ->
 * 1. clone()
 */

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class OverrideStudent extends Object implements Cloneable {

    String name;
    int age;

    OverrideStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return (this.name + " " + this.age);
    }

    @Override
    public boolean equals(Object ob) {
        if (ob.getClass() != this.getClass()) {
            return false;
        }
        if (this == ob)
            return true;

        OverrideStudent s = (OverrideStudent) ob; // type casting the object ob

        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + this.age;
        result = result * 31 + this.name.hashCode(); // hashcode is from string
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Abdhesh", 25);
        Student s2 = new Student("Abdhesh", 25);

        OverrideStudent s3 = new OverrideStudent("Abdhesh", 25);
        OverrideStudent s4 = new OverrideStudent("Abdhesh", 25);

        // toString() comparison convert the object to string
        // System.out.println(s1.toString());
        // System.out.println(s3.toString());

        // equals() : compare 2 objects return true and false.
        // System.out.println(s1.equals(s2));
        // System.out.println(s3.equals(s4));

        // hasCode() return an integer of an object -> hexadecimal format if equals
        // gives true then hashCode of both should be same
        // System.out.println(s3.hashCode());
        // System.out.println(s3.hashCode());

        // getClass we can't extends the getClass cause it finalized in objects this
        // function return the class of an object

        // System.out.println(s1.getClass());
        // System.out.println(s3.getClass());

        // instanceOf -> check if an object is instance of a class or any of
        // its subclass
        if (s3 instanceof OverrideStudent) {
            System.out.println("Written true");
        }

        if (s3 instanceof Object) {
            System.out.println("Written true");
        }

        // clone method -> CloneNotSupportedException
        // Default bevahiour of clone
        // if(this object implement cloneable){
        // allow it.
        // } else throw error
        OverrideStudent s5 = (OverrideStudent) s3.clone();
        System.out.println(s5.name);

    }
}
