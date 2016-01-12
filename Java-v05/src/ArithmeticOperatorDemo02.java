/**
 * 算术运算符
 * 自增自减运算符：前缀++、--和后缀++、--
 */
public class ArithmeticOperatorDemo02 {
    public static void main(String[] args) {
        int i = 10;
        double d = 1.5;
        char c = 'a';
        i++;// i=i+1;结果11
        System.out.println(i);
        ++i;// i=i+1;结果12
        System.out.println(i);
        i--;// i=i-1;结果11
        System.out.println(i);
        --i;// i=i-1;结果10
        System.out.println(i);
        System.out.println("------------------------------");

        d++;// d=d+1;结果2.5
        System.out.println(d);
        ++d;// d=d+1;结果3.5
        System.out.println(d);
        d--;// d=d-1;结果2.5
        System.out.println(d);
        --d;// d=d-1;结果1.5
        System.out.println(d);
        System.out.println("------------------------------");

        c++;// c=c+1;结果b
        System.out.println(c);
        ++c;// c=c+1;结果c
        System.out.println(c);
        c--;// c=c-1;结果b
        System.out.println(c);
        --c;// c=c-1;结果a
        System.out.println(c);
        System.out.println("------------------------------");

        // 在单独使用自增或自减运算符时，无论是前缀还是后缀，结果都是在原变量的值上自增或自减1
        // 而在赋值语句中使用自增自减运算符时，前缀和后缀情况是有区别的
        // 前缀自增自减会先使用变量原值赋值给声明的新变量，再对原有变量做自增自减
        // 后缀自增自减会先会在原有变量上做自增自减，再将变量自增自减后的值赋值给声明的新变量
        // 即前缀自增自减是先用后增减，后缀自增自减是先增减后用
        int j = i++;// 此语句等同于int j=i;i=i+1;（先用后加）
        System.out.println("j=" + j + " i=" + i);// j=10	i=11

        i=10;// 恢复i的值
        j = ++i;// 此语句等同于i=i+1;j=i;（先加后用）
        System.out.println("j=" + j + " i=" + i);// j=11	i=11

        i=10;// 恢复i的值
        j = i--;// 此语句等同于j=i;i=i-1;（先用后减）
        System.out.println("j=" + j + " i=" + i);// j=10	i=9

        i=10;// 恢复i的值
        j = --i;// 此语句等同于i=i-1;j=i;（先减后用）
        System.out.println("j=" + j + "  i=" + i);// j=9	i=9
    }
}
