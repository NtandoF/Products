package vendingMachines;

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

    public VendingMachine(){
        this(6,4,5);
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
            throw new ProductNotFoundException();
        }
    }

    public void addStock(Product product, int newStock) throws InvalidProductException {
        if(product instanceof Product){
            throw new InvalidProductException();
        }
    }
    public int getStock() {
        return chocolateCount + saltySnacksCount + softdrinkCount;
    }
}
