package Dispenser;
import java.util.Scanner;
public class Ushtimi2Main {
    public static void main(String[] args) {
                int Kola = 80;
                int Water = 55;

                System.out.println("Water is 55 lek. Cola is 80 lek.");
                System.out.println("Eneter 1 for Water and 2 for Cola.");

                Scanner scanner = new Scanner(System.in);
                int choiche = scanner.nextInt();

                while (choiche != 1 && choiche != 2) {
                    System.out.println("Incorrect input, please try again!");
                    choiche = scanner.nextInt();
                }

                int balanceDue;
                String Drink;

                if (choiche == 1) {
                    balanceDue = Water;
                    Drink = "Water";
                } else {
                    balanceDue = Kola;
                    Drink = "Cola";
                }

                System.out.println("Balance due " + balanceDue + " Lek");

                int insertedAmount = 0;
                int coin;
                String coinsInserted = "";

                while (balanceDue > 0) {
                    System.out.println("Insert coin: ");
                    coin = scanner.nextInt();

                    while (coin != 5 && coin != 10 && coin != 20 && coin != 50 && coin != 100) {
                        System.out.println("Wrong ammount of currency please try again by inserting a 5,10,20,50 or 100 lek ccoin.");
                        coin = scanner.nextInt();
                    }

                    insertedAmount += coin;
                    coinsInserted += coin + " ";

                    balanceDue -= coin;
                    System.out.println("Balance due " + balanceDue + " Lek");
                }

                int change = -balanceDue;

                System.out.println("Payment complete. Change owed " + change + " Lek.");
                System.out.println("You inserted: " + coinsInserted);
                System.out.println("Change owed: " + change + " Lek.");

            }
        }






