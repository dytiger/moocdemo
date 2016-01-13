/**
 * 算术运算符
 * 参与算术运算符的操作数必须是数值类型和char，boolean不可以进行算术运算
 */
public class ArithmeticOperatorDemo01 {
    public static void main(String[] args) {
        int ai = 10;
        int bi = -10;
        int ci = 6;
        int di = -6;
        // 一元+表示正号，操作数的值不变
        System.out.println(+ai);// 10
        System.out.println(+bi);// -10
        // 一元-表示负号，操作数的值取反
        System.out.println(-ai);// -10
        System.out.println(-bi);// 10
        System.out.println("------------------------------");

        // 二元+、-、*、/、%运算符分别表示算数运算的加、减、乘、除、取余
        System.out.println(ai + ci);// 10+6=16
        System.out.println(ai - bi);// 10-(-10)=20
        System.out.println(ai * ci);// 10*6=60
        // 因为以下语句参与运算的都是int类型，所以结果也是int类型，只保留整数部分
        System.out.println(ai / ci);// 10/6=1
        System.out.println("------------------------------");

        // 取余运算结果的符号由左操作数一致
        // 取余操作通常用于判断某个数字是否能被另一个数字整除，
        // 如果结果是0表示能被整除，否则表示不能被整除
        System.out.println(ai % ci);// 10%6=4
        System.out.println(bi % ci);// -10%6=-4
        System.out.println(ai % di);// 10%-6=4
        System.out.println(bi % di);// -10%-6=-4
        System.out.println("------------------------------");

        double ad = 10.0;
        double bd = -10.0;
        double cd = 3.5;
        double dd = -3.5;
        System.out.println(ad + cd);// 10.0+3.5=13.5
        System.out.println(ad - bd);// 10.0-(-10.0)=20.0
        System.out.println(ad * cd);// 10.0*3.5=35.0
        System.out.println(ad / cd);// 10.0/3.5=2.857142857142857
        System.out.println("------------------------------");
        System.out.println(ad % cd);// 10.0%3.5=3.0
        System.out.println(bd % cd);// -10.0%3.5=-3.0
        System.out.println(ad % dd);// 10.0%-3.5=3.0
        System.out.println(bd % dd);// -10.0%-3.5=-3.0
        System.out.println("------------------------------");

        // 以下运算结果不是期待的0.3，可是一个近似浮点数
        // 这是由于浮点运算的误差造成的
        // 在计算机内部，都是使用二进制来表示数字的，某些十进制浮点数是不可以使用二进制精确表示的
        // 就像十进制中不能精确表示三分之一这个小数一样
        System.out.println(1.1 - 0.8);// 0.30000000000000004
        System.out.println("------------------------------");

        // char类型数据可以参与算术运算，因为char类型是int类型的一个子集
        System.out.println(10 + 'A');// 10+65=75

        // boolean不能参与算术运算
        // 以下语句不能通过编译
        // System.out.println(10+true);
    }
}
