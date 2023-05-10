public class FoodBankPatrons {
    public static void main(String [] args){
        //create FoodBank, FoodProducer, FoodConsumer.
        FoodBank bank = new FoodBank();
        FoodProducer prod = new FoodProducer(bank);
        FoodConsumer con = new FoodConsumer(bank);
        //start the threads
        prod.start();
        con.start();
    }
}
