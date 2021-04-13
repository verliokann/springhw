package algorithms;
import products.Bread;
import products.Butter;
import products.Meat;
import products.Products;
import products.Tomatoes;

public class Adder {

    public static Products add(int c) {
        if (c == 1) {
            return new Meat();
        } else if (c == 2) {
            return new Butter();
        } else if (c == 3) {
            return new Bread();
        } else {
            return c == 4 ? new Tomatoes() : null;
        }
    }
}