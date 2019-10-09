package vendingMachines;

import exeptions.ChocolatesAllGone;
import exeptions.SaltyCracksAllBoughtException;
import exeptions.SoftDrinksOutOfStockException;
import org.junit.jupiter.api.Test;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxiVendingMachineTest {


    @Test
    public void shouldReturnTheCorrectNumberOfSoftDrinks() {
        MaxiVendingMachine softdrink = new MaxiVendingMachine();
        SoftDrinks coka = new SoftDrinks("Lite Coka");
        softdrink.addStock(coka);
        softdrink.buy(coka);

        assertEquals(4 , softdrink.getSoftDrinkCount());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfChocolates() {
        MaxiVendingMachine chocolates = new MaxiVendingMachine();
        Chocolates slab = new Chocolates("Hole Nut");
        chocolates.addStock(slab);
        chocolates.buy(slab);

        assertEquals(5 , chocolates.getChocolateCount());
    }
    @Test
    public void shouldReturnTheCorrectNumberOfSaltySnacks() {
        MaxiVendingMachine saltysnacks = new MaxiVendingMachine();
        SaltySnacks worms = new SaltySnacks("salty worms");
        saltysnacks.addStock(worms);
        saltysnacks.buy(worms);

        assertEquals(3 , saltysnacks.getSaltySnacksCount());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfAllProducts() {
        MaxiVendingMachine Allproducts = new MaxiVendingMachine();

        assertEquals(15 , Allproducts.getStock());
    }
    @Test
    public void shouldThrowSaltyCracksAllBoughtException() {
        MaxiVendingMachine saltyException = new MaxiVendingMachine();
        SaltySnacks salty = new SaltySnacks("salty salty");
        saltyException.addStock(salty);
        saltyException.buy(salty);
        saltyException.buy(salty);
        saltyException.buy(salty);
        saltyException.buy(salty);
        assertThrows(SaltyCracksAllBoughtException.class,
                () -> saltyException.buy(salty));
    }
    @Test
    public void shouldThrowSoftDrinksOutOfStockException() {
        MaxiVendingMachine softDrinkException = new MaxiVendingMachine();
        SoftDrinks cokaCola = new SoftDrinks("Ice Cold Coca");
        softDrinkException.addStock(cokaCola);
        softDrinkException.buy(cokaCola);
        softDrinkException.buy(cokaCola);
        softDrinkException.buy(cokaCola);
        softDrinkException.buy(cokaCola);
        softDrinkException.buy(cokaCola);
        assertThrows(SoftDrinksOutOfStockException.class,
                () -> softDrinkException.buy(cokaCola));
    }
    @Test
    public void shouldThrowChocolatesAllGone() {
        MaxiVendingMachine chocolateException = new MaxiVendingMachine();
        Chocolates slab = new Chocolates("Hole Nut");
        chocolateException.addStock(slab);
        chocolateException.buy(slab);
        chocolateException.buy(slab);
        chocolateException.buy(slab);
        chocolateException.buy(slab);
        chocolateException.buy(slab);
        chocolateException.buy(slab);
        assertThrows(ChocolatesAllGone.class,
                () -> chocolateException.buy(slab));
    }

}

