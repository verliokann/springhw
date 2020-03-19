package springhw.beans;

public class FactoryBean {
    public HelloBean createBean(String message) {
        return new HelloBean(message);
    }
}