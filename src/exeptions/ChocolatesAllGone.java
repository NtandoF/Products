package exeptions;

public class ChocolatesAllGone extends ProductNotFoundException {
    public void show(){
        System.out.println("All chocolates have been sold out");
    }
}
