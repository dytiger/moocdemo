/**
 * 这就是传说中的Hello World程序，也是你的第一个Java程序
 */
public class HelloWorld {
    /*
     * 这是Java程序的主方法，也是Java程序运行的入口
     */
    public static void main(String[] args) {
        // 以下是一条Java程序的语句，功能是在控制台上打印出Hello World!
        System.out.println("Hello World!");
    }
}

/**
 * 这是Hello Tsinghua程序
 */
class HelloTsinghua {
    // 声明了一个字符串类型的变量，并使用了一个字符串字面量对其进行了初始化
    static String msg = "Hello Tsinghua!";

    public static void main(String[] args) {
        System.out.println(msg);
    }

    // 因为Java是大小写字母敏感的，所以main和Main被认为是两个不同的程序成员
    public static void Main(String[] args) {
        System.out.println("你好清华！");
    }
}