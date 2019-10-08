package exeptions;

public class ProductNotFoundException extends RuntimeException {
    public void show(){
        System.out.println("All products have been sold out");
    }
}
