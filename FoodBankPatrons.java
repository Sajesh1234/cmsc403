public class FoodBankPatrons {
    public static void main(String [] args){
        FoodBank bank = new FoodBank();
        FoodProducer prod = new FoodProducer(bank);
        FoodConsumer con = new FoodConsumer(bank);
        prod.start();
        con.start();
    }
}
