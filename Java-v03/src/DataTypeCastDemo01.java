/**
 * 自动数据类型转换
 * 会发生在兼容的数据类型之间，且目标类型宽度或精度大于源类型的时候
 * 无精度损失的自动数据类型转换
 * 1.byte->short->int->long
 * 2.char->int
 * 3.int->double
 * 4.float->double
 * 可能出现精度损失的自动数据类型转换
 * 1.int->float
 * 2.long->double
 * 3.long->float
 * <p>
 * * 参考doc目录中的AutoDataTypeCast.png图示
 */
public class DataTypeCastDemo01 {
    public static void main(String[] args) {
        byte b = 10;
        char c = 'a';
        short s = b;// byte->short
        int i = s;// short->int
        long l = i;// int->long
        float f = l;// long->float（可能出现精度损失）
        f = i;// int->float（可能出现精度损失）
        double d = f;// float->double
        d = i;// int->double
        d = l;// long->double（可能出现精度损失）
        i = c;// char->int
    }
}
