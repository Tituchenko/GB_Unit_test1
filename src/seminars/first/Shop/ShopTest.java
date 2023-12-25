package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
//    Shop shop=new Shop();
public static void main(String[] args) {
    List<Product> products=new ArrayList<>();
    products.add(new Product(100,"Карандаш"));
    products.add(new Product(500,"Ручка"));
    products.add(new Product(200,"Бумага"));
    Shop shop=new Shop(products);
    Product maxExpensive=shop.getMostExpensiveProduct();
    System.out.println(maxExpensive.getTitle());
    shop.sortProductsByPrice();
    System.out.println(shop);
    //Проверка самого дорогого
    for (Product p:products) {
        if (p!=maxExpensive)
            assertThat(p).isLessThan(maxExpensive);
    }
    //Проверка сортировки
    if (products.size()>1){
        for (int i = 1; i < products.size(); i++) {
            assertThat(products.get(i-1))
                    .isLessThan(products.get(i));

        }
    }

}




    /*

   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

}