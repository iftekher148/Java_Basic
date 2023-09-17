package basic;

import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) {
       // System.out.println("Hello word");

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter hour");
        int hours = obj.nextInt();

        System.out.println("Enter rate");
        double rate = obj.nextDouble();

        double payment = hours*rate;
        System.out.println(payment);
    }
}
