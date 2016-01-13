/**
 * 计算1到100的和
 */
public class WhileDemo02 {
    public static void main(String[] args) {
        // 计数器
        int n = 1;
        // 累加和
        int sum = 0;
        // 循环条件判断
        while (n <= 100) {
            // 循环的程序逻辑（累加）
            sum = sum + n;
            // 改变计数器的值（+1）
            n++;
        }
        // 后续逻辑
        System.out.println(sum);
    }
}
