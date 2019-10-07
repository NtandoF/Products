import Exeptions.ChocolatesAllGone;
import Exeptions.ProductNotFoundException;
import Exeptions.SaltyCracksAllEatenException;
import Exeptions.SoftDrinksOutOfStockException;
import Products.Product;

public class VendingMachine {
    public int stockCount = 0;

    public void buy(Product product) throws ProductNotFoundException {
        if(stockCount <= 0){
            if(product.equals(new ChocolatesAllGone())){
                throw new ChocolatesAllGone();
            }
            else if (product.equals(new SaltyCracksAllEatenException())){
                throw new SaltyCracksAllEatenException();
            }
            else if(product.equals(new SoftDrinksOutOfStockException())){
                throw new SoftDrinksOutOfStockException();
            }
        }else {
            stockCount--;
        }
    }

    public void addStock(Product product, int newStock) {
        stockCount += newStock;
    }
    public int getStock() {
        return stockCount;
    }
}
