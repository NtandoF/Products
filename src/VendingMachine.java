import exeptions.*;
import products.Chocolates;
import products.Product;
import products.SaltySnacks;
import products.SoftDrinks;

public class VendingMachine {
    public int chocolateCount;
    public int saltySnacksCount;
    public int softdrinkCount;

    VendingMachine(int chocolateCount, int saltySnacksCount, int softdrinkCount){
        this.chocolateCount = chocolateCount;
        this.saltySnacksCount = saltySnacksCount;
        this.softdrinkCount = softdrinkCount;
    }

    VendingMachine(){
        this(5,4,5);
    }

    public int getChocolateCount(){
        return chocolateCount;
    }

    public int getSaltySnacksCount(){
        return saltySnacksCount;
    }

    public int getSoftDrinkCount(){
        return softdrinkCount;
    }

    public void buy(Product product) throws ProductNotFoundException, InvalidProductException {
        if (product instanceof Product){
            if (product instanceof Chocolates) {
                if (chocolateCount <= 0) {
                    throw new ChocolatesAllGone();
                } else {
                    chocolateCount--;
                }
            }
            if (product instanceof SaltySnacks) {
                if (saltySnacksCount <= 0) {
                    throw new SaltyCracksAllBoughtException();
                } else {
                    saltySnacksCount--;
                }
            }
            if (product instanceof SoftDrinks) {
                if (softdrinkCount <= 0) {
                    throw new SoftDrinksOutOfStockException();
                } else {
                    softdrinkCount--;
                }
            }
        } else {
            throw new InvalidProductException();
        }

    }

    public void addStock(Product product, int newStock) {
        if(product instanceof Chocolates){
            chocolateCount += newStock;
        } else if (product instanceof SoftDrinks){
            softdrinkCount += newStock;
        }else if (product instanceof SaltySnacks){
            saltySnacksCount += newStock;
        }
    }
    public int getStock() {
        return chocolateCount + saltySnacksCount + softdrinkCount;
    }
}
