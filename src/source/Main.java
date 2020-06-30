package source;

import source.beans.Products;
import source.threads.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Products> prods = new ArrayList();
        final Object lock = new Object();
        Thread t1 = new Thread(new ShopThread(lock, prods));
        Thread t2 = new Thread(new CounterThread(lock, prods));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
