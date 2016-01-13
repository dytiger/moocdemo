import java.util.Arrays;
import java.util.Random;

/**
 * 模拟双色球随机选号
 * <p>
 * 从1~32中选出6个不重复的数字作为红球号码
 * 从1~16中选出1个数字作为蓝球号码
 */
public class ForDemo15 {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机生成1~16之间的蓝球号码
        int blueBall = random.nextInt(16) + 1;
        // 存储红球号码的数组
        int[] redBalls = new int[6];

        // 用于判断是否已经生成过红球号码的标志数组
        // 初始化都为false，生成一个红球号码，
        // 就会把这个数组中索引是红球号码减1的元素变成true
        boolean[] flags = new boolean[32];

        // 随机生成1到32之间的6个红球号码
        for (int i = 0; i < 6; i++) {
            int red = random.nextInt(32) + 1;
            // 如果已选标志位是true，则i-1，并重新开始循环
            if (flags[red - 1]) {
                i--;
                continue;
            }
            // 存入红球号码
            redBalls[i] = red;
            // 把相应的标志位置为true
            flags[red-1]=true;
        }
        // 让数组中的元素从小到大排序
        Arrays.sort(redBalls);
        System.out.println(Arrays.toString(redBalls)+" "+blueBall);
    }
}
