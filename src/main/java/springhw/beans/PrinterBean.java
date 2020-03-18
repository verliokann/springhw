package springhw.beans;

public class PrinterBean {
    private static PrinterBean instance = null;

    private PrinterBean() {
    }

    public static PrinterBean getInstance() {
        if (instance == null)
            instance = new PrinterBean();

        return instance;
    }

    public void print(Object object) {
        System.out.println(object);
    }

}
