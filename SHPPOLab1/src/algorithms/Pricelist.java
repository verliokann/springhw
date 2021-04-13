package algorithms;
import products.Products;
import java.util.ArrayList;
import java.util.Iterator;

public class Pricelist {

    public static void show(ArrayList<Products> prods) {
        Iterator var1 = prods.iterator();

        while(var1.hasNext()) {
            Products products = (Products)var1.next();
            System.out.println(products);
        }

        if (prods.isEmpty()) {
            System.out.println("Покупок нет");
        }

    }
}

