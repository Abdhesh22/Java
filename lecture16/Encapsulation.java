package lecture16;
// import lecture16.College.Student;

// import lecture16.School.Student;

class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println(balance);
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.printBalance();
        b.withdraw(500);
        b.printBalance();

        lecture16.School.Student s = new lecture16.School.Student();
        lecture16.College.Student s2 = new lecture16.College.Student();
        s.print();
        s2.print();

    }
}
