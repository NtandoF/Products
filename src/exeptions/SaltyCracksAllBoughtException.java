package exeptions;

public class SaltyCracksAllBoughtException extends ProductNotFoundException {
    public void show(){
        System.out.println("All salty snacks have been sold out");
    }
}
