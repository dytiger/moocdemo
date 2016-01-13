/**
 * 短路逻辑运算符
 * 短路与（&&）和短路或（||）
 */
public class LogicOperatorDemo02 {
    public static void main(String[] args) {
        // 短路与运算
        // 当短路与运算符的左操作数为false时，会忽略右操作数，而直接返回false
        // 当左操作数为true时，才会让右操作数的结果参与运算，而返回最终结果
        int a = 10;
        int b = 20;

        // 使用逻辑与（非短路与）时，左右操作数都会参与运算
        boolean r = (++a > b) & (++b == 21);
        System.out.println(r);// false
        System.out.println(a);// a=11
        System.out.println(b);// b=21
        System.out.println("------------------------------");

        a = 10;
        b = 20;
        // 使用短路与时，左操作数返回false，直接返回false
        // 此时右侧操作数会被忽略，所以b++不会执行
        r = (++a > b) && (++b == 21);
        System.out.println(r);// false
        System.out.println(a);// a=11
        System.out.println(b);// b=20
        System.out.println("------------------------------");

        a = 10;
        b = 20;
        // 使用短路与时，左操作数返回true，再判断右操作数
        // 此时右侧操作数会参与运算
        r = (++a < b) && (++b == 21);
        System.out.println(r);// true
        System.out.println(a);// a=11
        System.out.println(b);// b=21
        System.out.println("------------------------------");

        // 短路或运算
        // 当短路或运算符的左操作数为true时，会忽略右操作数，而直接返回true
        // 当左操作数为false时，才会让右操作数的结果参与运算，而返回最终结果
        a = 10;
        b = 20;

        // 使用逻辑或（非短路或）时，左右操作数都会参与运算
        r = (++a < b) | (++b == 21);
        System.out.println(r);// true
        System.out.println(a);// a=11
        System.out.println(b);// b=21
        System.out.println("------------------------------");

        a = 10;
        b = 20;
        // 使用短路或时，左操作数返回true，直接返回true
        // 此时右侧操作数会被忽略，所以b++不会执行
        r = (++a < b) || (++b == 21);
        System.out.println(r);// true
        System.out.println(a);// a=11
        System.out.println(b);// b=20
        System.out.println("------------------------------");

        a = 10;
        b = 20;
        // 使用短路或时，左操作数返回false，再判断右操作数
        // 此时右侧操作数会参与运算
        r = (++a > b) || (++b == 21);
        System.out.println(r);// true
        System.out.println(a);// a=11
        System.out.println(b);// b=21
        System.out.println("------------------------------");
    }
}
