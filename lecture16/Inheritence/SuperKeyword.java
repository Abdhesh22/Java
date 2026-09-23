package lecture16.Inheritence;

class ParentClass {
    int x = 4;

    void print() {
        System.out.println("Parent class");
        System.out.println(this.x);
    }
}

class ChildClass extends ParentClass {
    int x = 5;

    void printUsingVar() {
        System.out.println("Print Using Parent Var");
        System.out.println(super.x);
    }

    void print() {
        System.out.println("Print Using Parent Method");
        super.print();
    }

    void printX() {
        System.out.println("Printing x");
        System.out.println(this.x);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {

        ParentClass pc = new ParentClass();

        System.out.println(pc.x);
        pc.print();

        ChildClass cc = new ChildClass();
        cc.printUsingVar();
        cc.print();
        cc.printX();

    }
}
