package Zodiac;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date (between 1 and 31): ");
        int date = scanner.nextInt();


        System.out.print("Enter the month: ");
        String month = scanner.next();

        SignFinder checker = new SignFinder();
        boolean valid = checker.rightday(date);

        if (valid) {
            String rightsign = checker.findsign(date, month);
            System.out.println("Zodiac sign: " + rightsign);
        } else {
            System.out.println("Wrong day. Try again!");
        }

        scanner.close();
    }
}
