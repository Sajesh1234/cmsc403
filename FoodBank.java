import java.util.*;
import java.util.concurrent.locks.*;
public class FoodBank {

    // declare variables.
    int food;
    Lock lock;
    Condition low;

    //constructor that initializes the values.
    public FoodBank() {

        this.food = 0;
        //lock
        lock = new ReentrantLock();
        //check the condition.
        low = lock.newCondition();
    }

    public void giveFood(int amount) {
        //lock to give food
        lock.lock();
        //add the given amount to food
        //try{
        this.food = food+amount;
        System.out.println("Adding "+ amount +" items of food Balance is now: " + food);
        //low.signalAll();
    //}

        //finally {
           // lock.unlock();
        //}
    }
    public void takeFood(int amount) throws InterruptedException {
        lock.lock();
            try {
                while (food < amount) {
                    System.out.println("waiting for "+ amount + " items of food");
                    low.await();
                }
                    this.food = food-amount;
                    System.out.println("Taking " + amount + " items of food, the balance is now "+ food+ " items");
            } finally {
                lock.unlock();
            }

    }


}