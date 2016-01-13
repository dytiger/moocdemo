import java.util.Random;

/**
 * 随机得一个0到9之间的数字并打印，如果出现5，重新开始下次循环
 */
public class ContinueDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        for (;;) {
            int n = r.nextInt(10);
            if (n == 5) {
                System.out.println("出现5，重新开始循环");
                // 当执行continue后，结束当次循环，不再执行循环体以后的语句，而是开始下次循环
                continue;
            }
            System.out.println(n);
        }
    }
}
