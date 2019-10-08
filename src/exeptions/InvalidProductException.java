package exeptions;

public class InvalidProductException extends RuntimeException {
    public void show(){
        System.out.println("You have chose a invalid product");
    }
}
