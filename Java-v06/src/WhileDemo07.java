import java.util.Random;

/**
 * 随机得到一个0到19999之间的数字，求这个数字有多少位
 */
public class WhileDemo07 {
    public static void main(String[] args) {
        Random r = new Random();
        // 随机出一个0到19999之间的数
        int n = r.nextInt(20000);
        System.out.print(n);
        int x = 0;// 数字的位数
        // 当n不等于0时会进入循环
        while (n != 0) {
            x++;// 位数自增
            n = n / 10;// 数字循环整除10，并赋值给原有数字变量
        }
        System.out.println("的位数是" + x);
    }
}
