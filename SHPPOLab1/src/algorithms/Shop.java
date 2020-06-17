package algorithms;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import products.Products;

public class Shop {

    public static void startShopping() {
        ArrayList<Products> prods = new ArrayList();
        boolean var1 = false;

        byte c;
        do {
            if (!prods.isEmpty()) {
                System.out.println("Общий вес покупки: " + Counter.countWeigth(prods));
                System.out.println("Общая цена покупки: " + Counter.countPrice(prods));
            }

            System.out.println("Чего хотите?");
            System.out.println("1. Мясо");
            System.out.println("2. Масло");
            System.out.println("3. Хлеб");
            System.out.println("4. Помидоры");
            System.out.println("5. Посмотреть список покупок");
            System.out.println("6. Узнать вес и стоимость продуктов");
            System.out.println("7. Подтвердить покупку");
            System.out.println("8. Выйти");
            System.out.print("> ");

            try {
                Scanner in = new Scanner(System.in);
                c = in.nextByte();
            } catch (InputMismatchException var3) {
                c = 0;
            }

            if (c > 0 && c < 5) {
                System.out.println("Введите вес:");
                double w;
                Scanner in = new Scanner(System.in);
                w = in.nextDouble();
                prods.add(Adder.add(c,w));
            }

            if (c == 5) {
                Pricelist.show(prods);

            }
            if (c == 6) {
                info.method();
            }
            if (c == 7) {
                System.out.println("Ваши товары: ");
                Pricelist.show(prods);
                System.out.println("Стоимость покупки составит: " + Counter.countPrice(prods));
                System.out.println("Подтвердить покупку?");
                System.out.println("1 - Да");
                System.out.println("2 - Нет");
                int a;
                try {
                    Scanner in = new Scanner(System.in);
                    a = in.nextByte();
                }
                catch (InputMismatchException var3) {
                    a = 0;
                   }
                if (a == 1){
                   c = 8;
                }
            }

        }
            while (c != 8) ;
    }
}
