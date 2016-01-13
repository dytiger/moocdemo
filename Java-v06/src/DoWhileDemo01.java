/**
 * do-while语句块与while语句块很相似，
 * 区别在于while先判断进行循环的条件是否成立，
 * 而do-while先执行一次循环体再判断进入循环的条件是否成立
 * <p>
 * while执行循环体的次数可能是0到多次，
 * 而do-while可能执行的循环体次数是1到多次
 */
public class DoWhileDemo01 {
    public static void main(String[] args) {
        // 声明一个变量（计数器）
        int n = 0;
        // 直接执行循环体
        do {
            // 循环体中的程序逻辑
            System.out.println(n);
            // 变化是否进入循环体的条件状态
            n--;
            // (n>0)是是否执行循环体的条件表达式，
            // 如果结果是true则再次进入循环，如果是false则执行循环体后边的其它语句
            // 虽然n的初始值为0，不符合以下进入循环的条件，但循环体中的语句还是执行了一次
        } while (n > 0);
        System.out.println("Boom~~");
    }
}
