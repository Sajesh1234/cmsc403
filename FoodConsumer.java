import java.util.*;
import java.lang.Thread;
public class FoodConsumer extends Thread{

    private FoodBank bank;

    public FoodConsumer(FoodBank bank) {
        this.bank = bank; //Initialize FoodProducer
    }

    @Override
    public void run(){
        //create a random variable
        Random random = new Random();
        while(true) {
            try{
                //add a random amount 1-100 to take from the bank
                bank.takeFood(random.nextInt(100) + 1);
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }

    }
}
