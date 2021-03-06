/**
 * 从10倒数到1
 */
public class WhileDemo01 {
    public static void main(String[] args) {
        // 声明一个变量（计数器）
        int n = 10;
        // while循环体可以执行0到多次，而do-while循环可以执行1到多次
        // 因为while循环是很判断条件再执行，而do-while循环是先执行1次循环体再进行条件判断
        // (n>10)是是否执行循环体的条件表达式，
        // 如果结果是true则进入循环，如果是false则执行循环体后边的其它语句
        while(n>0){
            // 循环体中的程序逻辑
            System.out.println(n);
            // 改变是否进入循环体的条件状态
            n--;
        }
        System.out.println("Boom~~");
    }
}
