package algorithms;

import products.Bread;
import products.Butter;
import products.Meat;
import products.Products;
import products.Tomatoes;

public class info {
    public static void method(){
    Products mt = new Meat();
    System.out.println(mt + ": Цена - "+ mt.returnPrice() + " Вес - " + mt.returnWeight());

    Products brd = new Bread();
    System.out.println(brd + ": Цена - "+ brd.returnPrice() + " Вес - " + brd.returnWeight());

    Products bttr = new Butter();
    System.out.println(bttr + ": Цена - "+ bttr.returnPrice() + " Вес - " + bttr.returnWeight());

    Products tmts = new Tomatoes();
    System.out.println(tmts + ": Цена - "+ tmts.returnPrice() + " Вес - " + tmts.returnWeight());
    }
}
