package exeptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public void show(){
        System.out.println("All softdrinks have been sold out");
    }
}
