import java.util.Random;

/**
 * 随机得一个0到9之间的数字并打印，如果出现5，终止方法的执行
 */
public class ReturnDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        for (;;) {
            int n = r.nextInt(10);
            if (n == 5) {
                // 当执行return后，当前方法会终止执行
                // return是一种方法执行的结束方式，也可以理解为方法的一种出口
                return;
            }
            System.out.println(n);
        }
        // 因为在循环体中出现了return语句，以下语句可能不可到达，会出现编译错误
        // System.out.println("出现5");
    }
}
