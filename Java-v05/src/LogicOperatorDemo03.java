/**
 * 三目条件运算符
 */
public class LogicOperatorDemo03 {
    public static void main(String[] args) {
        // 表达式1 ? 表达式2 : 表达式3;
        // 表达式1的结果是boolean类型数据
        // 如果表达式1的结果是true则返回表达式2的运算结果
        // 如果表达式1的结果是false则返回表达式3的运算结果
        // 条件运算符可以替代特定类型的if-else语句

        int i = 100;
        // 取i的绝对值赋值给j
        int j = (i < 0) ? -i : i;
        System.out.println("i = " + i + ", j = " + j);// i = 100, j = 100
        i = -200;
        // 取i的绝对值赋值给j
        j = (i < 0) ? -i : i;
        System.out.println("i = " + i + ", j = " + j);// i = -200, j = 200
    }
}
