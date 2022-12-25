package TPMODUL3_BEN.src;

public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("=============================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==============================");
    }

    public void makeFood() {
        synchronized(Restaurants.getLock()) {

            System.out.println("Waiter: The food is ready to deliver");
            Restaurants restaurants = new Restaurants();
            restaurants.setWaitingForPickup(false);
            if (Restaurants.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurants.getLock().notifyAll();
            System.out.println("Waiter: Informing the staff to cook another food\n");

        }
    }
}
