package lecture24_interface;

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying using the Credit Card");
    }
}

class Upi implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying using the upi");
    }
}

// Dynamic Dispatch also know as dynamic polymorphishm
public class DynamicDispatch {
    public static void main(String[] args) {
        /**
         * p1 -> is references of Payment but can call CreditCard
         * p2 -> is reference of payment but can call upi
         * 
         * Means reference of Payment can call the CreditCard and Upi's pay.
         * 
         */
        Payment p1 = new CreditCard();
        p1.pay();

        Payment p2 = new Upi();
        p2.pay();
    }
}
