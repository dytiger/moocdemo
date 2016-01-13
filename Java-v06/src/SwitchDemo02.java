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
public class SwitchDemo02 {
    public static void main(String[] args) {
        Random random = new Random();
        // 得到随机数1到13,13用于测试输入非法月份的情况
        int month = random.nextInt(13) + 1;

        // 如果在连续多个case块中没有break语句，可以合并它们为一类条件
        switch (month) {
            case 2:
            case 3:
            case 4:
                System.out.println(month + "月春季");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println(month + "月夏季");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println(month + "月秋季");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println(month + "月冬季");
                break;
            default:
                System.out.println("请输入正确的月份");
                break;
        }
    }
}
