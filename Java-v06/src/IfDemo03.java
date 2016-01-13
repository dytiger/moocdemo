import java.util.Random;

/**
 * if-else if-else语句
 */
public class IfDemo03 {
    public static void main(String[] args) {
        String[] weathers = {"晴", "雨", "雪"};
        // 得到生成随机值的对象
        Random random = new Random();
        // 得到一个0到3之间的随机整型数字
        int w = random.nextInt(4);

        // if-else if-else可以用于对多重分支进行判断
        // 在这种分支语句中所有语句块都是互斥的，无论出现多少语句块，每次运行只能执行其中的一个
        if (w == 0) {
            System.out.println("今天是" + weathers[w] + "天，去郊游。");
        } else if (w == 1) {
            System.out.println("今天是" + weathers[w] + "天，去图书馆看书。");
        } else if (w == 2) {
            System.out.println("今天是" + weathers[w] + "天，去公园打雪仗。");
        } else {
            System.out.println("今天天气未知，在家里发呆。");
        }
        System.out.println("睡觉。");
    }
}
