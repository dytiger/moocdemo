/**
 * 表达式中的自动类型提升
 * 在表达式中如果参与运算的操作数不属于同一类型，则会发生某些类型转换，规则如下：
 * 1. 如果表达式中存在double类型的操作数，则其它操作数提升为double类型，再进行运算
 * 2. 否则，如果表达式中存在float类型的操作数，则其它操作数提升为float类型，再进行运算
 * 3. 否则，如果表达式中存在long类型的操作数，则其它操作数提升为long类型，再进行运算
 * 4. 否则，所有操作数都提升为int类型，再进行运算
 */
public class AutoTypePromoteDemo01 {
    public static void main(String[] args) {
        byte b = 52;
        char c = 'z';
        short s = 2048;
        int i = 20000;
        long l = 100000L;
        float f = 8.28f;
        double d = 5.232;

        double r1 = b * i + (f - d) / l;// double
        float r2 = f / i + (s - c);// float
        long r3 = (s + c) * i + l;// long
        int r4 = i * c / (s + b);// int
    }
}
