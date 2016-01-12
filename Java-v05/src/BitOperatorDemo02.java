/**
 *
 */
public class BitOperatorDemo02 {
    public static void main(String[] args) {
        // 16个2进制字符串，分别表示10进制的0~15
        // 封装到数组中，恰好可以使用数组元素的索引来表示2进制字符串的10进制数值
        String[] bin = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        // 3和6的2进制位包含了所有4种可能：0-0、0-1、1-1、1-0
        int a = 3;// 0011
        int b = 6;// 0110
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);// 等同于a^b
        int g = ~a & 0x0f;// ~a是-4，可以使用&0x0f来屏蔽高阶位，以便使用1100表示-4，否则不法访问bin[-4]

        System.out.println(bin[a]);// 0011
        System.out.println(bin[b]);// 0110
        System.out.println(bin[c]);// 0111
        System.out.println(bin[d]);// 0010
        System.out.println(bin[e]);// 0101
        System.out.println(bin[f]);// 0101
        System.out.println(bin[g]);// 1100
    }
}
