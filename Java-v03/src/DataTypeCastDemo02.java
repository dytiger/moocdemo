/**
 * 强制数据类型转换
 * 会发生在兼容的数据类型之间，且目标类型宽度或精度小于源类型的时候
 * 即把DataTypeCastDemo01注释中的箭头翻转
 * 1.byte<-short<-int<-long
 * 2.char<-int
 * 3.int<-double
 * 4.float<-double
 * 5.int<-float
 * 6.long<-double
 * 7.long<-float
 *
 * 当源类型的值超出目标类型的取值范围时，类型转换的结果通常是不正确的
 * 当浮点类型数据被强制转型成为整型时，小数部分会被截去
 */
public class DataTypeCastDemo02 {
    public static void main(String[] args) {
        double d = 3.68;
        float f = (float)d;// double->float
        long l = (long)d;// double->long
        l = (long)f;// float->long
        int i = (int)d;// double->int
        i = (int)l;// long->int
        i = (int)f;// float->int
        short s = (short)i;// int->short
        byte b = (byte)i;// int->byte
        char c = (char)i;// int->char

        // 当源类型的值超出目标类型的取值范围时，类型转换的结果通常是不正确的
        i = 128;
        // 把int类型的变量i转换成为byte类型的变量b，i的取值超出byte的范围
        b = (byte)i;
        // 结果会输出-128，而不是期待的128，因为128已经超出了byte类型可表示的最大值
        System.out.println(b);
    }
}
