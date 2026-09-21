package lecture15;

/**
 * InnerStaticKeyword
 */
class Student {
    int roll;
    String name;
    static String collegeName;

    Student(int roll, String name, String collegeName){
        this.roll = roll;
        this.name = name;
        this.collegeName = collegeName;  // can do but not preferred since static is call variable
    }

    void print(){
        System.out.println(this.roll + " name : " + this.name  + " collegeName : " + this.collegeName);
    }

}

public class StaticKeyword {


    public static void main(String[] args){
       Student s1 = new Student(0, "Abdhesh", "xyz");
       s1.print();
       Student.collegeName = "aaa";
       s1.print();

       Student s2 = new Student(0, "Heyy", "ccc");
       s1.print();
       s2.print();

       s1.collegeName = "ddd"; // can do but not preferred since static is call variable
       s2.print();
       s1.print();

    }

    static void print(){
        System.out.println("I am print");
    }

}
