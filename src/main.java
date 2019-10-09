import exeptions.ChocolatesAllGone;
import exeptions.SaltyCracksAllBoughtException;
import exeptions.SoftDrinksOutOfStockException;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;
import vendingMachines.VendingMachine;

public class main {
    public static void main(String[] args) {

            VendingMachine product = new VendingMachine();
            try {
                //chocolates
                Chocolates slab = new Chocolates("Hole Nut");
                product.addStock(slab, 0);
                product.buy(slab);
                product.buy(slab);
                product.buy(slab);
                System.out.println(product.getChocolateCount());

            }catch (ChocolatesAllGone choco){
               choco.show();
            }

            try {
                //SoftDrinks
                SoftDrinks fanta = new SoftDrinks("Fanta Grape");
                product.addStock(fanta, 0);
                product.buy(fanta);
                product.buy(fanta);
                System.out.println(product.getSoftDrinkCount());
            } catch (SoftDrinksOutOfStockException soft){
                soft.show();
            }

            try {
                //Salty Snacks
                SaltySnacks snack = new SaltySnacks("popcorn");
                product.addStock(snack, 0);
                product.buy(snack);
                product.buy(snack);
                System.out.println(product.getSaltySnacksCount());
            }catch (SaltyCracksAllBoughtException salty){
               salty.show();
            }
        }
    }


