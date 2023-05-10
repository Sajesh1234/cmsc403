import java.util.*;
import java.lang.Thread;
public class FoodProducer extends Thread{

    FoodBank bank;

    public FoodProducer(FoodBank bank) {
        this.bank = bank; //Initialize FoodProducer
    }
    @Override
    public void run(){
        Random random = new Random();
        while(true) {
            try{
                bank.giveFood(random.nextInt(100) + 1);
                sleep(100);
            } catch (InterruptedException e) {

            }

        }

    }
}
