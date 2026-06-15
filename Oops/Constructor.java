public class Constructor {
    public static void main(String args[]){

        Student s1 = new Student("Abdhesh", "Eshan College of Engineering", 101, 25);
        Student s2 = new Student("Abdhesh", "Eshan College of Engineering", 101);
        Student s3 = new Student("Abdhesh", "Eshan College of Engineering");
        Student s4 = new Student("Abdhesh");
        Student s5 = new Student();


        s1.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();

        
    }
}

class Student {

    Integer rollNo;
    String name;
    String collegeName;
    Integer age;


    Student(){
        this("Unknown");
    }


    Student(String name){
        this(name, "Unknown", 0);
    }

    Student(String name, String collegeName){
        this(name, collegeName, 0);
    }


     Student(String name, String collegeName, Integer rollNo){
        this(name, collegeName, rollNo, 0);
    }


    Student(String name, String collegeName, Integer rollNo, Integer age){
        this.collegeName = collegeName;
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public void print(){
        System.out.println(this.name + " : " + this.collegeName + " : " + this.rollNo +  " : " + this.age);
    }

}