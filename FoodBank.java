import java.util.*;
import java.util.concurrent.locks.*;
public class FoodBank {

    // declare variables.
    private int food;


    //constructor that initializes the values.
    public FoodBank() {
        this.food = 0;
    }

    synchronized public void giveFood(int amount) {
       //add amount into the bank
        this.food += amount;
        System.out.println("Adding "+ amount +" items of food");
        //notify() method for waking up threads
            notify();

    }
    synchronized public void takeFood(int amount) {

            try {
                ////Check if food taken is more than food available
                while (food < amount) {
                    System.out.println("waiting for "+ amount + " items of food");
                    //Wait for more food to be added
                    wait();
                }
                //take the food
                    this.food -= amount;
                    System.out.println("Taking " + amount + " items of food, the balance is now "+ food + " items");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

    }


}