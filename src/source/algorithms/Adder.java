package source.algorithms;

import org.springframework.context.support.ClassPathXmlApplicationContext;;
import source.beans.Products;

public class Adder {
    public static Products add(int c){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/context.xml");
        if (c == 1) {
            Products prods = ctx.getBean("Мясо", Products.class);
            return prods;
        }else if (c == 2){
            Products prods = ctx.getBean("Масло", Products.class);
            return prods;
        }else if (c == 3){
            Products prods = ctx.getBean("Хлеб", Products.class);
            return prods;
        }else if (c == 4){
            Products prods = ctx.getBean("Томаты", Products.class);
            return prods;
        }
        return null;
    }
}
