import java.util.Random;

/**
 * 用户购买商品的总价如果：
 * 在1000以内不打折
 * 在1000~3000之间打95折
 * 在3000~5000之间打9折
 * 在5000~8000之间打85折
 * 在8000以上打8折
 */
public class IfDemo05 {
    public static void main(String[] args) {
        double[] priceArr = {500, 2000, 4000, 6000, 10000, -100};
        Random random = new Random();
        double price = priceArr[random.nextInt(6)];

        if (price > 0 && price <= 1000) {
            System.out.println(price + "的最终价格：" + price);
        } else if (price > 1000 && price <= 3000) {
            System.out.println(price + "的最终价格：" + price * 0.95);
        } else if (price > 3000 && price <= 5000) {
            System.out.println(price + "的最终价格：" + price * 0.9);
        } else if (price > 5000 && price <= 8000) {
            System.out.println(price + "的最终价格：" + price * 0.85);
        } else if (price > 8000) {
            System.out.println(price + "的最终价格：" + price * 0.8);
        } else {
            System.out.println(price + "是非法价格");
        }

        // 调整条件的设置，可以把程序写的更加简洁
        if (price > 8000) {
            System.out.println(price + "的最终价格：" + price * 0.8);
        } else if (price > 5000) {
            System.out.println(price + "的最终价格：" + price * 0.85);
        } else if (price > 3000) {
            System.out.println(price + "的最终价格：" + price * 0.9);
        } else if (price > 1000) {
            System.out.println(price + "的最终价格：" + price * 0.95);
        } else if (price > 0) {
            System.out.println(price + "的最终价格：" + price);
        } else {
            System.out.println(price + "是非法价格");
        }
    }
}
