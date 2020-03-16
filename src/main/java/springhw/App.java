package springhw;

import org.omg.CORBA.Context;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springhw.beans.HelloBean;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        System.out.println(hb);
	}

}
