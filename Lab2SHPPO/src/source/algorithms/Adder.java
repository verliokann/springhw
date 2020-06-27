package source.algorithms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import source.beans.Products;

public class Adder {
    public static Products add(int c){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/context.xml");
        if (c == 1) {
            Products prods = ctx.getBean("Meat", Products.class);
            return prods;
        }else if (c == 2){
            Products prods = ctx.getBean("Butter", Products.class);
            return prods;
        }else if (c == 3){
            Products prods = ctx.getBean("Bread", Products.class);
            return prods;
        }else if (c == 4){
            Products prods = ctx.getBean("Tomatoes", Products.class);
            return prods;
        }
        return null;
    }
}
