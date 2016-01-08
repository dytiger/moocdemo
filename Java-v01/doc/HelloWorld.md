# 第一个Java程序
## 编写源代码
打开任意纯文本编译器编写如下代码：
```
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
    static String msg = "Hello Tsinghua!";

    public static void main(String[] args) {
        System.out.println(msg);
    }

    // 因为Java是大小写字母敏感的，所以main和Main被认为是两个不同的程序成员
    public static void Main(String[] args) {
        System.out.println("你好清华！");
    }
}
```

保存代码到名为HelloWorld.java的文件中。

在Java中源代码文件被称为**编译单元**。在一个源代码文件中可以声明一到多个类（或其它内容），此文件的后缀必须是**.java**。

在Java的源代码文件中虽然可以包含多个类的声明，但只能有一个类可以被声明为`public`。这个类通常被称为源代码文件中的主类。

主类的名字必须与其所在的源代码文件的主文件名相同。由于Java语言对大小写字母是敏感的，所以这两个名字的大小写也要完全匹配，否则不会通过编译。此约定对组织程序和维护工作更加有益。

## 编译程序
为了生成字节码文件，我们需要对编写好的源代码文件进行编译。需要使用javac进行程序的编译工作，它是Java的编译器。

在命令行上运行如下命令，使用此工具对指定的Java源代码文件进行编译：

<kbd>javac HelloWorld.java</kbd>

如果在命令执行后没有任何输出，则表示程序编译成功，每个被声明的类都会被保存到单独的字节码文件（以.class为后缀名的文件）中。此源代码文件被成功编译后，会在磁盘上生成HelloWorld.class和HelloTsinghua.class两个文件，这就是与源代码文件中声明的两个类所对应的字节码文件。

Java的字节码只是程序的中间表示形式，不可以被直接运行，需要使用JVM来解释执行。

>注意：Java既不是编译型语言，也不是解释型语言，而是一种兼有二者特性的程序语言。有些人会担心Java解释运行的特性会影响性能。其实Java很早就引入了即时编译器（JIT）机制来提高字节码的运行速度。能过此机制，Java会在解释字节码之前，通过即时编译器把字节码中不影响移植性的部分直接编译成机器码运行，而只解释那些会影响移植性的部分。

## 运行程序
为了运行Java字节码，需要使用java命令，它是Java应用程序的加载器。

在命令行上运行如下命令，为Java应用程序的加载器指定要加载的字节码文件中的类名：

<kbd>java HelloWorld</kbd>

程序正确执行会得到如下输出：

`Hello World！`

















 01.Java应用程序中的全部内容都必须放置在类中
        1.1 类是一个加载程序逻辑的容器
        1.2 程序逻辑定义了应用程序的行为

    02.Java是大小写字母敏感的语言，对于字母相同，大小写不同的单词，Java认为它们是不同的

    03.在一个Java源代码文件（*.java）中可以定义多个类，但有且仅有一个public的类定义，
       且此类的名称要与源代码的文件名相同

    04.使用class关键字定义类，后续接类的名称，类名要符合Java标识符命名规则，
       并建议每个单词首字母大写，通常使用名词说明类的功能或含义

    05.Java使用一对花括号定义代码块，类名和方法名后的花括号分别表示类主体和方法主体

    06.在类中可以定义方法，方法表示某种行为

    07.在类中可以声明变量，变量表示某种数据状态

    08.JVM会从指定类的主方法（方法签名为public static void main(String[] args)）开始执行程序

    09.Java程序的语句是以分号结束的，换行并不表示某条语句的结束

    10.点号用于访问类或对象的方法或变量，可以理解为自然语言中的“的”

    11.Java有三种注释形式：单行注释、多行注释和Javadoc文档注释
       11.1 单行注释以两条斜线开始，到所在行结束
       11.2 多行注释以斜线加星号开始，以星号加斜线结束
       11.3 Javadoc文档注释以斜线加双星号开始，以星号加斜线结束
       注意：Java编译器在编译字节码时会忽略代码中的所有类型的注释（注释是为人阅读的，字节码是让机器运行的）
            多行注释和Javadoc文档注释都是不可嵌套使用的
       经验：多行注释可以使用在一行代码中的某个局部上，而单行注释没有这个特性
       注释通常有两种用途：
            1）对代码进行文字描述，可以提高源代码的可读性
            2）在开发阶段，可以使用注释暂时屏蔽可能干扰调试的代码