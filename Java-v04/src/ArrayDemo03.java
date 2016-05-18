/**
 * 声明一个包含12个月英文名称的字符串数组，输入一个数字，输出所对应的月份英文名称
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        // 月份英文名称数组
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        // 输入的数字月份
        int choice = 8;

        // 校验输入的月份是否合法
        if (choice >= 1 && choice <= months.length) {
            // 因为输入的数字在[1,12]范围，而数组索引范围在[0,11]
            // 所以要使用choice-1来访问数组元素的索引
            System.out.println(choice + "月的英文名称是" + months[choice - 1]);
        } else {
            System.out.println("请输入1到12之间的整数");
        }
    }
}
