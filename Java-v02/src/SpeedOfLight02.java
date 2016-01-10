/**
 * 以下程序可以计算在n天中光的传播距离
 * 但由于数据类型使用的不合理，所以得到的结果是不正确的
 */
public class SpeedOfLight02 {
    public static void main(String[] args) {
        int speed = 299792458;// 光速，每秒299792458米
        long days;// 天数
        long seconds;// 秒
        long distance;// 距离

        days = 1;
        // 在算数表达式中如果出现了long和int类型数据的混合运算，则会自动把int型数据先提升为long型，再进行运算
        seconds = days * 24 * 60 * 60;// days天中的总秒数
        distance = seconds * speed;
        System.out.println(days + "天光可以传播" + distance + "米。");// 1天光可以传播25902068371200米。
    }
}
