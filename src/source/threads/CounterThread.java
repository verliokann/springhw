package source.threads;

import source.algorithms.Counter;
import source.beans.Products;
import java.util.ArrayList;

public class CounterThread extends Thread{
    ArrayList<Products> prods;
    Object lock;

    public CounterThread(Object lock, ArrayList<Products> prods){
        this.lock = lock;
        this.prods = prods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                lock.notify();
                //count++;
                if (!prods.isEmpty()){
                    System.out.println(Counter.countPrice(prods));
                    System.out.println(Counter.countWeight(prods));
                }

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
