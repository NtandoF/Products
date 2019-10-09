import exeptions.ChocolatesAllGone;
import exeptions.SaltyCracksAllBoughtException;
import exeptions.SoftDrinksOutOfStockException;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;
import vendingMachines.MaxiVendingMachine;
import vendingMachines.VendingMachine;

public class main {
    public static void main(String[] args) {

        MaxiVendingMachine chocolates = new MaxiVendingMachine();
        MaxiVendingMachine softdrinks = new MaxiVendingMachine();
        MaxiVendingMachine saltySnack = new MaxiVendingMachine();
            try {
                //chocolates
                Chocolates slab = new Chocolates("Hole Nut");
                chocolates.addStock(slab, 0);
                chocolates.buy(slab);
                chocolates.buy(slab);
                chocolates.buy(slab);
                System.out.println(chocolates.getChocolateCount());

            }catch (ChocolatesAllGone choco){
               choco.show();
            }

            try {
                //SoftDrinks
                SoftDrinks fanta = new SoftDrinks("Fanta Grape");
                softdrinks.addStock(fanta, 0);
                softdrinks.buy(fanta);
                softdrinks.buy(fanta);
                System.out.println(softdrinks.getSoftDrinkCount());
            } catch (SoftDrinksOutOfStockException soft){
                soft.show();
            }

            try {
                //Salty Snacks
                SaltySnacks snack = new SaltySnacks("popcorn");
                saltySnack.addStock(snack, 0);
                saltySnack.buy(snack);
                saltySnack.buy(snack);
                System.out.println(saltySnack.getSaltySnacksCount());
            }catch (SaltyCracksAllBoughtException salty){
               salty.show();
            }
        }
    }


