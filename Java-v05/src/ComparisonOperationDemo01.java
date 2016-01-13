/**
 * 比较运算符
 */
public class ComparisonOperationDemo01 {
    public static void main(String[] args) {
        // 比较运算操作的结果是布尔值
        // 最常用于分支或循环的控制表达式中
        // Java中的任何类型都可以使用比较运算符
        int a = 10;
        int b = 5;
        int c = 15;

        // 相等判断
        System.out.println(a==b);// false
        System.out.println((a+b)==c);// true
        System.out.println("------------------------------");
        // 不等判断
        System.out.println(a!=b);// true
        System.out.println((a+b)!=c);// false
        System.out.println("------------------------------");
        // 大于
        System.out.println(a>b);// true
        System.out.println(b>a);// false
        System.out.println((a+b)>c);// false
        System.out.println("------------------------------");

        // 大于等于
        System.out.println(a>=b);// true
        System.out.println(b>=a);// false
        System.out.println((a+b)>=c);// true
        System.out.println("------------------------------");

        // 小于
        System.out.println(a<b);// false
        System.out.println(b<a);// true
        System.out.println((a+b)<c);// false
        System.out.println("------------------------------");
        // 小于等于
        System.out.println(a<=b);// false
        System.out.println(b<=a);// true
        System.out.println((a+b)<=c);// true
    }
}
