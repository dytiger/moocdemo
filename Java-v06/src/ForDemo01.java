/**
 * for循环
 * for循环经常用在循环次数可知的情况下，
 * 此情况下，相比while和do-while，for在语法上更加紧凑，易用
 * 反之，循环次数不定，或求解就的就是循环次数，则使用while或do-while是更好的选择
 * <p>
 * 计算1加到100的和
 */
public class ForDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        // for(初始化计数器;进入循环的条件表达式;修改计数器值)
        // 第一步：初始化计数器
        // 第二步：判断进入循环的条件是否成立，如果不成立则执行循环体后的语句
        // 		否则执行循环体中的语句
        // 第三步：当循环体中的语句执行完毕，会执行修改计数器值部分的操作
        // 第四步：再次进入第二步骤
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // 在for循环的第一部分和第三部分可以定义多个变量的声明和变化，多条语句用逗号分隔
        // 以下循环可以减少一半循环次数
        sum = 0;
        for (int i = 1, j = 100; i < j; i++, j--) {
            sum = sum + i + j;
        }
        System.out.println(sum);
    }
}
