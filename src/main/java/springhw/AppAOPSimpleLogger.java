package springhw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springhw.aopendtoendservices.BeanConfig;
import springhw.aopendtoendservices.NumGenerator;
import springhw.configurationbeans.SpringConfig;
import springhw.scanbeans.Topic;

public class AppAOPSimpleLogger {

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aspectAutoscanContext.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println(ctx.getBean("idNumGen",NumGenerator.class).getSqrtSum());		
    }
}

