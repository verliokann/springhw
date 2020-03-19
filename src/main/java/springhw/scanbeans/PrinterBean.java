package springhw.scanbeans;

import org.springframework.stereotype.Component;

@Component("printerBean")
public class PrinterBean {

    public void print(Object object) {
        System.out.println(object);
    }

}
