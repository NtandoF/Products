import Exeptions.*;
import Products.Chocolates;
import Products.Product;
import Products.SaltySnacks;
import Products.SoftDrinks;

public class VendingMachine {
    public int stockCount = 0;

    public void buy(Product product) throws ProductNotFoundException, InvalidProductException {
        if (product instanceof Product) {
            if (stockCount <= 0) {

                if (product instanceof Chocolates) {
                    throw new ChocolatesAllGone();
                } else if (product instanceof SaltySnacks) {
                    throw new SaltyCracksAllBoughtException();
                } else if (product instanceof SoftDrinks) {
                    throw new SoftDrinksOutOfStockException();
                }
            } else {
                stockCount--;
            }
        }else {
            throw new InvalidProductException();
        }
    }

    public void addStock(Product product, int newStock) {
        stockCount += newStock;
    }
    public int getStock() {
        return stockCount;
    }
}
