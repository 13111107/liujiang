package bookSys;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/13.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String book_sort = "";
        double sum = 0;
        int book_num = 0;

        String s0 = sc.nextLine();
        book_sort = s0.split(":")[0];
        book_num = Integer.parseInt(s0.split(":")[1]);
        if(book_num<0){
            System.out.println("请输入正确的图书个数...");
            return;
        }
        double price[] = new double[book_num];
        for(int i=0;i<book_num;i++){
            price[i] = sc.nextInt();
        }
        double sum1 = computerPrice(book_sort,book_num,price);
        if(sum1 == -1){
            System.out.println("请输入正确的图书种类...");
            return;
        }else if(sum1 == -2){
            System.out.println("请输入正确的图书价格...");
            return;
        }
        sum += sum1;

        sc.nextLine();
        String s1 = sc.nextLine();
        book_sort = s1.split(":")[0];
        book_num = Integer.parseInt(s1.split(":")[1]);
        if(book_num<0){
            System.out.println("请输入正确的图书个数...");
            return;
        }
        double price1[] = new double[book_num];
        for(int i=0;i<book_num;i++){
            price1[i] = sc.nextInt();
        }
        double sum2 = computerPrice(book_sort,book_num,price1);
        if(sum2 == -1){
            System.out.println("请输入正确的图书种类...");
            return;
        }else if(sum2 == -2){
            System.out.println("请输入正确的图书价格...");
            return;
        }
        sum += sum2;

        sc.nextLine();
        String s2 = sc.nextLine();
        book_sort = s2.split(":")[0];
        book_num = Integer.parseInt(s2.split(":")[1]);
        if(book_num<0){
            System.out.println("请输入正确的图书个数...");
            return;
        }
        double price2[] = new double[book_num];
        for(int i=0;i<book_num;i++){
            price2[i] = sc.nextInt();
        }
        double sum3 = computerPrice(book_sort,book_num,price2);
        if(sum3 == -1){
            System.out.println("请输入正确的图书种类...");
            return;
        }else if(sum3 == -2){
            System.out.println("请输入正确的图书价格...");
            return;
        }
        sum += sum3;
        System.out.println("图书总价格为：" + sum);
    }

    public static double computerPrice(String book_sort, int book_num, double[] price) {
        Map<String,Double> m = new HashMap<String,Double>();
        m.put("new_book",1.2);
        m.put("common_book",1.0);
        m.put("unmarketable_book",0.6);
        if((book_sort.equals("new_book") || book_sort.equals("common_book") || book_sort.equals("unmarketable_book"))!=true){
            return -1;
        }
        double sum = 0;
        for(int i=0;i<book_num;i++){
            if(price[i] < 0){
                return -2;
            }
            sum += price[i];
        }

        sum *= m.get(book_sort);
        return sum;
    }
}
