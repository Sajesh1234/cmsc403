import java.util.*;
import java.lang.Thread;
public class FoodProducer extends Thread{

    private FoodBank bank;

    public FoodProducer(FoodBank bank) {
        this.bank = bank; //Initialize FoodProducer
    }
    @Override
    public void run(){
        //create a random variable
        Random random = new Random();
        while(true) {
            try{
                //add a random amount from 1-100 into bank
                bank.giveFood(random.nextInt(100) + 1);
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }

    }
}
