import java.util.*;
import java.lang.Thread;
public class FoodConsumer extends Thread{

    FoodBank bank;

    public FoodConsumer(FoodBank bank) {
        this.bank = bank; //Initialize FoodProducer
    }

    @Override
    public void run(){
        Random random = new Random();
        while(true) {
            try{
                bank.takeFood(random.nextInt(100) + 1);
                sleep(100);
            } catch (InterruptedException e) {

            }

        }

    }
}
