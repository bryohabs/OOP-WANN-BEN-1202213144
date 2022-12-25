package TPMODUL3_BEN.src;

public class Restaurants implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(Restaurants.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: The Waiter is delivering the food");
                    Restaurants.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + foodNumber++);
            Restaurants.lock.notifyAll();
            System.out.println("Restaurant: Notifying the Waiter, the food is cooked\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}