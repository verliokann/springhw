package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springhw.scanbeans.HelloBean;
import springhw.scanbeans.PrinterBean;

public class AppConfigAutoScan {

    public static void main(String[] args) {
        // Создаем контекст приложения из xml
        // файла("src/main/resources/AppConfigAutoScan.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfigAutoScan.xml");
        // Считываем бины (объекты)
        HelloBean hb = ctx.getBean("helloBean", HelloBean.class);
        PrinterBean printer = ctx.getBean("printerBean", PrinterBean.class);
        // Печатаем объект в консоль
        printer.print(hb);
        // Закрываем контекст приложения
        ctx.close();
    }

}
