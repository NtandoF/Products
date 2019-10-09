package vendingMachines;

import org.junit.jupiter.api.Test;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxiVendingMachineTest {


    @Test
    public void shouldReturnTheCorrectNumberOfSoftDrinks() {
        MaxiVendingMachine softdrink = new MaxiVendingMachine();
        SoftDrinks coka = new SoftDrinks("Lite Coka");
        softdrink.addStock(coka , 0);
        softdrink.buy(coka);

        assertEquals(4 , softdrink.getSoftDrinkCount());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfChocolates() {
        MaxiVendingMachine chocolates = new MaxiVendingMachine();
        Chocolates slab = new Chocolates("Hole Nut");
        chocolates.addStock(slab , 0);
        chocolates.buy(slab);

        assertEquals(9 , chocolates.getChocolateCount());
    }
    @Test
    public void shouldReturnTheCorrectNumberOfSaltySnacks() {
        MaxiVendingMachine saltysnacks = new MaxiVendingMachine();
        SaltySnacks worms = new SaltySnacks("salty worms");
        saltysnacks.addStock(worms , 0);
        saltysnacks.buy(worms);

        assertEquals(3 , saltysnacks.getSaltySnacksCount());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfAllProducts() {
        MaxiVendingMachine Allproducts = new MaxiVendingMachine();

        assertEquals(19 , Allproducts.getStock());
    }

}

