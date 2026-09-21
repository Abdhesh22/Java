package lecture15;

class MathDemo {
    static final double PI;
    // MathDemo(double pi){
    //     this.PI = pi;
    // }
    void print(){
        System.out.println("This pi : " + this.PI);
    }

    static {
        PI = 3.14;
    }
}

public class FinalKeyword {
    public static void main(String [] args){
        MathDemo md = new MathDemo();
        md.print();
    }
}
