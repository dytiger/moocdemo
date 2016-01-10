public class IntegerDemo01 {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = -5;
        byte b3 = 127;// byte类型可以表示的最大值
        byte b4 = -128;// byte类型可以表示的最小值
        // 以下两条语句的赋值超出了byte类型的范围，所以会出现编译错误
        // byte b5 = 128;
        // byte b6 = -129;

        short s1 = 10;
        short s2 = -1000;
        short s3 = 32767;// short类型可以表示的最大值
        short s4 = -32768;// short类型可以表示的最小值
        // 以下两条语句的赋值超出了short类型的范围，所以会出现编译错误
        // short s5 = 32768;
        // short s6 = -32769;

        int i1 = 100;
        int i2 = -1829;
        int i3 = 2147483647;// int类型可以表示的最大值
        int i4 = -2147483648;// int类型可以表示的最小值
        // 以下两条语句的赋值超出了int类型的范围，所以会出现编译错误
        // int i5 = 2147483648;
        // int i6 = -2147483649;

        long l1 = 1000;
        long l2 = -2000;
        long l3 = 9223372036854775807L;// long类型可以表示的最大值
        long l4 = -9223372036854775808L;// long类型可以表示的最小值
        // 以下两条语句的赋值超出了long类型的范围，所以会出现编译错误
        // long l5 = 9223372036854775808L;
        // long l6 = -9223372036854775809L;
    }
}
