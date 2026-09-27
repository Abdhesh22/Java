package lecture24_interface;

interface MathConstant {
    double PI_VALUE = 3.14; // in compiler it treat as public static final double. means we can't change it
}

public class VariableInsideInterface {
    public static void main(String[] args) {
        System.out.println(MathConstant.PI_VALUE);
    }
}
