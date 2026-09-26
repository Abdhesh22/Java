package lecture20_input_output;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // print only one words
        String name2 = sc.nextLine(); // print the whole string until the enter key press
        int num = sc.nextInt(); // for taking the whole number.

        System.out.println(num);
        System.out.println(name2);
        System.out.println(name);
        sc.close();
    }
}
