package source.algorithms;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import source.beans.Products;

public class Info {
    public static void method(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/context.xml");
        Products mt = ctx.getBean("Мясо", Products.class);
        System.out.println(mt.getType() + ": Цена - "+ mt.getPrice() + " Вес - " + mt.getWeight());

        Products brd = ctx.getBean("Хлеб", Products.class);
        System.out.println(brd.getType() + ": Цена - "+ brd.getPrice() + " Вес - " + brd.getWeight());

        Products bttr = ctx.getBean("Масло", Products.class);
        System.out.println(bttr.getType() + ": Цена - "+ bttr.getPrice() + " Вес - " + bttr.getWeight());

        Products tmts = ctx.getBean("Томаты", Products.class);
        System.out.println(tmts.getType() + ": Цена - "+ tmts.getPrice() + " Вес - " + tmts.getWeight());
    }
}
