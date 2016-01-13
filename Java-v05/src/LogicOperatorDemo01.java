/**
 * 逻辑运算符
 * 只能操作boolean类型的数据，运算结果也是boolean类型
 */
public class LogicOperatorDemo01 {
    public static void main(String[] args) {
        System.out.println("逻辑运算真值表");
        System.out.println("A\tB\tA|B\tA&B\tA^B\t!A");
        System.out.println("F\tF\tF\tF\tF\tT");
        System.out.println("T\tF\tT\tF\tT\tF");
        System.out.println("F\tT\tT\tF\tT\tT");
        System.out.println("T\tT\tT\tT\tF\tF");
        System.out.println("------------------------------");

        boolean a = true;
        boolean b = false;
        // 逻辑或
        boolean c = a | b;
        // 逻辑与
        boolean d = a & b;
        // 逻辑异或
        boolean e = a ^ b;
        // 复合逻辑运算
        boolean f = (!a & b) | (a & !b);
        // 逻辑非
        boolean g = !a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a | b = " + c);
        System.out.println("a & b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("(!a & b) | (a & !b) = " + f);
        System.out.println("!a = " + g);

    }
}
