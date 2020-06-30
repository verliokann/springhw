package source.algorithms;

import source.beans.Products;

import java.util.ArrayList;

public class Pricelist {
    public static void show(ArrayList<Products> prods){
        for (Products products : prods) {
            System.out.println(products);
        }
        if (prods.isEmpty()){
            System.out.println("Покупок нет");
        }
    }
}
