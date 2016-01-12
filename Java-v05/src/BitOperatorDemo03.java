/**
 *  使用异或运算交换两变量的值，而不使用第三变量
 */
public class BitOperatorDemo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
