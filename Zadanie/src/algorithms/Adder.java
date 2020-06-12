package algorithms;
import products.Bread;
import products.Butter;
import products.Meat;
import products.Products;
import products.Tomatoes;

public class Adder {

    public static Products add(int c, double w) {
        if (c == 1) {
            Products meat = new Meat();
            meat.setWeight(w);
            return meat;
        } else if (c == 2) {
            Products butter = new Butter();
            butter.setWeight(w);
            return butter;
        } else if (c == 3) {
            Products bread = new Bread();
            bread.setWeight(w);
            return bread;
        } else {
            Products tomatoes = new Tomatoes();
            tomatoes.setWeight(w);
            return c == 4 ? tomatoes : null;
        }
    }
}