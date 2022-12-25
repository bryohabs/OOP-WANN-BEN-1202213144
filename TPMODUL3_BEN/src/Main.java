package TPMODUL3_BEN.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurants restaurants = new Restaurants();
            int customerID, orderQty;
            try {

                System.out.println("What is your Customer ID ? ");
                customerID = input.nextInt();

                System.out.println("How much food do you want to cook ? ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(restaurants);
                Waiters waiters = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiters);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("Input must be Number or Integer !!!");
            }
        }

    }

}