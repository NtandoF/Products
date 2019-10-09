package vendingMachines;

import exeptions.ChocolatesAllGone;
import exeptions.SaltyCracksAllBoughtException;
import exeptions.SoftDrinksOutOfStockException;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;

public class MaxiVendingMachine extends VendingMachine {

    public void buy(SoftDrinks softdrink){
            if (softdrinkCount <= 0) {
                throw new SoftDrinksOutOfStockException();
            } else {
                softdrinkCount--;
            }
        }

    public void buy(SaltySnacks saltySnacks){
            if (saltySnacksCount <= 0){
                throw new SaltyCracksAllBoughtException();
            } else {
               saltySnacksCount--;
            }
        }

    public void buy(Chocolates chocolates){
            if (chocolateCount <= 0){
                throw new ChocolatesAllGone();
            } else {
            chocolateCount--;
        }
    }
}
