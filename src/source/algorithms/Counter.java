package source.algorithms;
import source.beans.Products;

import java.util.ArrayList;

public class Counter {
    public static double countWeight(ArrayList<Products> prods){
        double weight = 0;
        for (Products products : prods) {
            weight += products.getWeight();
        }
        return weight;
    }
    public static int countPrice(ArrayList<Products> prods){
        int price = 0;
        for (Products products : prods) {
            price += products.getPrice();
        }
        return price;
    }
}
