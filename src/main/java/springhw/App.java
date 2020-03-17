package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;

public class App {

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Считываем бин (объект)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        // Печатаем объект в консоль
        System.out.println(hb);
        // Закрываем контекст приложения 
        ctx.close();
	}

}
