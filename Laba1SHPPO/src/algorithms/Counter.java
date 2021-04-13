package algorithms;
import products.Products;
import java.util.ArrayList;
import java.util.Iterator;

public class Counter {

    public static double countWeigth(ArrayList<Products> prods) {
        double weight = 0.0;

        Products products;
        for(Iterator var3 = prods.iterator(); var3.hasNext(); weight += products.returnWeight()) {
            products = (Products)var3.next();
        }

        return weight;
    }

    public static int countPrice(ArrayList<Products> prods) {
        int price = 0;

        Products products;
        for(Iterator var2 = prods.iterator(); var2.hasNext(); price += products.returnPrice()) {
            products = (Products)var2.next();
        }

        return price;
    }
}
