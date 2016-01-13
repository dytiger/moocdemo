import java.util.Arrays;
import java.util.Random;

/**
 * 模拟双色球随机选号，使用while语句改写了ForDemo15的代码
 * 更好的实现方式会在Collection部分介绍
 * <p>
 * 从1~32中选出6个不重复的数字作为红球号码
 * 从1~16中选出1个数字作为蓝球号码
 */
public class ForDemo16 {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机生成1~16之间的蓝球号码
        int blueBall = random.nextInt(16) + 1;
        // 存储红球号码的数组
        int[] redBalls = new int[6];

        // 用于判断是否已经生成过红球号码的标志数组
        // 初始化都为0，每生成一个红球号码，
        // 就会把这个数组中索引是红球号码的元素变成1
        // 此数组中的第一个元素记录当前已经生成了多少个不重复的红球（后续会作为进行循环的判断条件）
        int[] flags = new int[33];

        // 随机生成1到32之间的6个红球号码
        // 红球存储索引
        int i = 0;
        do{
            // 生成一个号码
            int red = random.nextInt(32) + 1;
            // 如果已经生成过，则重新开始循环
            if(flags[red]==1){
                continue;
            }
            // 红球号码放入数组，存储索引自增1
            redBalls[i++]=red;
            // 与号码相对应的标志位被置1
            flags[red]=1;
            // 当前生成的红球总数加1，赋值给标志数组的第一个元素
            flags[0]++;
        }while(flags[0]<6);

        // 让数组中的元素从小到大排序
        Arrays.sort(redBalls);
        System.out.println(Arrays.toString(redBalls)+" "+blueBall);
    }
}
