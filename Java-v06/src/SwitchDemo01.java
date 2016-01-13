import java.util.Random;

/**
 * 输入月份
 * <p>
 * 2,3,4月为春季
 * <p>
 * 5,6,7月为夏季
 * <p>
 * 8,9,10月为秋季
 * <p>
 * 11,12,1月为冬季
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        // 得到随机数1到13,13用于测试输入非法月份的情况
        int month = random.nextInt(13) + 1;

        // switch语句只能进行相等性判断
        // 在同一个switch语句中各case关键字后的字面量不能重复

        // switch语句后的圆括号里的变量是要被判断的条件值
        // 变量的类型必须是byte、short、int、char以及它们的包装类的对象、枚举对象；
        // 从Java7以后，可以使用字符串类型

        // switch语句块中有1到多个case块，用于判定条件值等于什么的时候执行的逻辑
        // switch语句块中可以有0到1个default块，其中定义没有符合case中任何值的情况下执行的逻辑
        // 每个case块的最后，应该以一条break语句结束，
        // 否则会把第一个符合条件的case块及其后续的所有case块和default块全部执行一次

        // 对于一系列的嵌套if语句，switch语句通常性能更好
        switch (month) {
            case 2:
                System.out.println("2月春季");
                break;
            case 3:
                System.out.println("3月春季");
                break;
            case 4:
                System.out.println("4月春季");
                break;
            case 5:
                System.out.println("5月夏季");
                break;
            case 6:
                System.out.println("6月夏季");
                break;
            case 7:
                System.out.println("7月夏季");
                break;
            case 8:
                System.out.println("8月秋季");
                break;
            case 9:
                System.out.println("9月秋季");
                break;
            case 10:
                System.out.println("10月秋季");
                break;
            case 11:
                System.out.println("11月冬季");
                break;
            case 12:
                System.out.println("12月冬季");
                break;
            case 1:
                System.out.println("1月冬季");
                break;
            default:
                System.out.println("请输入正确的月份");
                break;
        }
    }
}
