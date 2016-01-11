/**
 * 变量是Java中数据的基本存储单元
 * 在Java中所有变量都必须先声明再使用，声明时必须指定变量的类型
 */
public class VariableDemo01 {
    public static void main(String[] args) {
        // 在一条语句中可以声明多个变量
        int a, b, c;// 声明a、b、c三个int类型变量
        // 在声明变量的同时也可以对其进行数据初始化
        int d = 10, e = 5, f;// 声明了d、e、f三个int类型变量，并把d初始化为10，e初始化为5
        // 出于程序的可读性考虑，建议每一行只声明一个变量
        byte g = 20;// 声明了一个byte类型的变量g，并初始化为20
        double h = 5.28;// 声明了一个double类型的变量h，并初始化为5.28
        char i = 'A';// 声明了一个char类型的变量i，并初始化为字符A

        // 变量声明的规则也适用于引用类型的变量
        String str = "Hello";// 声明了一个String类型的字符串变量str，初始化为"Hello"
    }
}
