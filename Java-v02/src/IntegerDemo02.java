public class IntegerDemo02 {
    public static void main(String[] args) {
        // 所有整型字面量默认都是int类型的
        int i1 = 1000;
        int i2 = -2048;

        byte b1 = 100;// 如果字面量在byte数据范围内则可以直接赋值给byte类型变量
        // b1 = 200;// 如果字面量超出byte类型的数据范围则会出现编译错误
        // b1 = -200;// 如果字面量超出byte类型的数据范围则会出现编译错误

        short s1 = 10000;// 如果字面量在short数据范围内则可以直接赋值给short类型变量
        // s1 = 70000;// 如果字面量超出short类型的数据范围则会出现编译错误
        // s1 = -70000;// 如果字面量超出short类型的数据范围则会出现编译错误

        long l1 = 100000;// int字面量可以直接赋值给long类型的变量
        // l1 = 3000000000;// 如果字面量已超出int类型的范围，则会出现编译错误
        l1 = 3000000000L;// 可以在整型字面量后加大小写的L来声明这个字面量属于long类型

        // 8进制字面量表示法：以0开始，后接0~7
        i1 = 010;// 10进制的8
        i1 = 020;// 10进制的16
        i1 = 032;// 10进制的26
        i1 = -032;// 10进制的-26
        // i1 = 08;// 8不是8进制字面量的合法数字，会出现编译错误

        l1 = 0777777777777777777777L;// 8进制的long型字面量，表示10进制的9223372036854775807
        l1 = -01000000000000000000000L;// 8进制的long型字面量，表示10进制的-9223372036854775808

        // 16进制字面量表示法：以0x或0X开始，后接0~9，a~f
        i1 = 0x10;// 10进制的16
        i1 = 0X20;// 10进制的32
        i1 = -0x20;// 10进制的-32
        i1 = 0xff;// 10进制的255
        i1 = -0X100;// 10进制的256

        l1 = 0x7fffffffffffffffL;// 16进制的long型字面量，表示10进制的9223372036854775807
        l1 = -0x8000000000000000L;// 16进制的long型字面量，表示10进制的-9223372036854775808

        // 2进制字面量表示法：以0b或0B开始，后接数字0和1
        i1 = 0b1010;// 10进制的10
        i1 = 0B1111;// 10进制的15
        i1 = -0b1111;// 10进制的-15
        i1 = 0b1111111111110110110110000011111;// 表示10进制的2147183647
        i1 = -0b1111111111110110110110000100000;// 表示10进制的-2147183648

        // 2进制的long型字面量，表示10进制的9223372036854775807
        l1 = 0B111111111111111111111111111111111111111111111111111111111111111L;
        // 2进制的long型字面量，表示10进制的-9223372036854775808
        l1 = 0B1000000000000000000000000000000000000000000000000000000000000000L;

        // 在过长的数字字面量中可以加入下划线作为分隔符
        // 在编译时编译器会丢弃字面量中的下划线
        i1 = 123_456_789;
        // 也可以使用多个下划线作为分隔符
        i1 = 123__456___789;
        i1 = 0b111_1111_1111_1011_0110_1100_0001_1111;
        // 下划线不可以作为数字字面量的开始和结束
        // i1=_123_456_789;
        // i1=123_456_789_;
    }
}
