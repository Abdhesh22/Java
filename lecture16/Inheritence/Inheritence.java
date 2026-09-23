package lecture16.Inheritence;

// Example of Simple Inheritence.
class Student {
    String name;

    void markAttendance() {
        System.out.println("Mark Attendance!!!");
    }
}

class EngineerStudent extends Student {
    void attendLab() {
        System.out.println("Attending lab!!!");
    }
}

// Exmaple of MultiLevel Inheritence
class CseStudent extends EngineerStudent {
    void doCode() {
        System.out.println("AI will code it!!!");
    }
}

// Example of Hierachy Inheritence.
class MedicalStudent extends Student {
    void print() {
        System.out.println("Medical Student!!!");
    }
}

public class Inheritence {
    public static void main(String[] args) {

        // Simple Inheritence
        EngineerStudent es = new EngineerStudent();
        es.attendLab();
        es.markAttendance();

        // Multilevel Inheritence
        CseStudent cse = new CseStudent();
        cse.attendLab();
        cse.doCode();
        cse.markAttendance();

        // Heirachy Inheritence...
        MedicalStudent medical = new MedicalStudent();
        medical.print();

    }
}
