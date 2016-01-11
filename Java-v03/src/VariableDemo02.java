/**
 * 为变量赋值时，除了可以直接使用数据的字面量外，还可以把表达式的运算结果和方法调用后得到的结果
 */
public class VariableDemo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // 把算数表达式的运算结果赋值给变量sum1
        int sum1 = a + b;
        // 把调用add方法后得到的返回值赋给变量sum2;
        int sum2 = add(a, b);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
