import Products.Chocolates;
import Products.SaltySnacks;
import Products.SoftDrinks;

public class main {
    public static void main(String[] args) {


            VendingMachine product = new VendingMachine();

            Chocolates slab = new Chocolates("Hole Nut");
            product.addStock(slab, 2);
            product.buy(slab);
            System.out.println(product.getStock());

            //SoftDrinks
            SoftDrinks Fanta = new SoftDrinks("Fanta Grape");
            product.addStock(Fanta, 1);
            product.buy(Fanta);
            System.out.println(product.getStock());

            //Salty Snacks
            SaltySnacks snack = new SaltySnacks("popcorn");
            product.addStock(snack, 2);
            product.buy(snack);
            System.out.println(product.getStock());
        }

    }


