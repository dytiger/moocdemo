/**
 * 赋值运算符
 * 通用赋值运算符：=
 * 算数运算赋值运算符：+=、-=、*=、/=、%=
 * 位运算赋值运算符：&=、|=、^=、>>=、>>>=、<<=
 * 逻辑运算赋值运算符：&=、|=、^=
 */
public class AssignmentOperatorDemo01 {
    public static void main(String[] args) {
        // 通用赋值运算符是最常用的，其它赋值运算符可以被它替代
        // 作用是把右操作数的结果赋值给左侧变量
        int i = 5 + 8;
        int a, b, c, d;
        // 赋值运算符的运算顺序是从右到左
        // 把10/5的结果2先赋值给d，然后再依次赋值给c，b，a
        // a b c d都会被赋值为2
        a = b = c = d = 10 / 5;
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("------------------------------");

        // 其它运算符的作用比较相似，
        // 都是基于左侧变量的原有值，与右操作数进行特定运算，然后把结果再赋值给左侧变量
        // 此类赋值运算符比通用的赋值运算符的效率略高，但可读性较差
        a += 10;// a=a+10;=>12
        b <<= 3;// b=b<<3;=>16
        c |= 15;// c=c|15;=>15
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
