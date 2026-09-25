package lecture18_autoboxing_abstract_polo;

public class AutBoxing {
    public static void main(String[] args) {

        // Learning 1.
        int x = 10;
        Integer y = x; // auto boxing
        System.out.println(y); // this works as below line internally
        System.out.println(y.intValue());

        Integer a = 12;
        int b = a.intValue(); // unboxing we can also this b = a;
        System.out.println(b);

        // Learning 2
        // Null Pointer exception
        Integer c = null;
        // int z = c; // this will do like null.getValue(); //no can't have any function
        // so throw
        // // error

        // Learning 3
        // difference between == and equals
        Integer a3 = 10;
        Integer b3 = 10;
        // this will give us true because of caching valueOf cache value in some range
        // like -128 to +127 but may be different on compiler, so the compiler is
        // returning the same object in this case. that why it's giving true
        System.out.println(a3 == b3);

        Integer y4 = 200;
        Integer z4 = 200;
        // here range is not working both object is saved in different objects. that why
        // it's giving false. for comparing this we use equals to match values.
        System.out.println(y4 == z4);
        System.out.println(y4.equals(z4));
    }
}

// POJO -> Plant old java objects

// this class is simple which not use any frameworks
// this classes have get, set, vars and constructor and small business logic
// not complex logic

/**
 * 1. Aremic Model
 * a. get, set.
 * b. constructor
 * c. fields
 * 
 * 
 * 2. Rich Domain Model
 * a. set, get
 * b. constructor
 * c. fields
 * d. business logic
 */