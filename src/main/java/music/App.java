package music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import music.beans.ComputerBean;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("music.xml");

        ComputerBean computer = ctx.getBean("computer", ComputerBean.class);

        ctx.close();

        computer.playMusic();
    }
}