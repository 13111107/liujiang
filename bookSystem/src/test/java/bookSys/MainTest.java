package bookSys;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/13.
 */
public class MainTest {

    @Test
    public void computerPrice() throws Exception {
        double sum = 0;
        String book_sort = "new_book";
        int book_num = 2;
        double[] price = new double[book_num];
        price[0] = 10;
        price[1] = 10;
        double sum1 = new Main().computerPrice(book_sort,book_num,price);
        System.out.println("new_book的总价格为：" + sum1);

        String book_sort2 = "common_book";
        int book_num2 = 2;
        double[] price2 = new double[book_num2];
        price2[0] = 10;
        price2[1] = 10;
        double sum2 = new Main().computerPrice(book_sort2,book_num2,price2);
        System.out.println("common_book的总价格为：" + sum2);

        String book_sort3 = "unmarketable_book";
        int book_num3 = 2;
        double[] price3 = new double[book_num2];
        price3[0] = 10;
        price3[1] = 10;
        double sum3 = new Main().computerPrice(book_sort3,book_num3,price3);
        System.out.println("unmarketable_book的总价格为：" + sum3);
        sum = sum1+sum2+sum3;

        System.out.println("图书总价格为：" +  sum);
    }

    @Before
    public void setUp() throws Exception {

    }

}