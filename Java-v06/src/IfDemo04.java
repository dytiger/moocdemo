import java.util.Random;

/**
 * 判断某个年份是否是闰年
 * 规则：可以被400整除的年份是闰年，可以被4整除，但不可被100整除的年份也是闰年
 */
public class IfDemo04 {
    public static void main(String[] args) {
        int[] years = {2013, 2014, 2015, 2016};
        Random random = new Random();
        int year = years[random.nextInt(4)];

        // if语句块可以嵌套
        if (year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println(year + "是闰年");
                } else {
                    System.out.println(year + "不是闰年");
                }
            } else {
                System.out.println(year + "不是闰年");
            }
        }

        // 使用复合逻辑表达式来简化以上代码
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
