/**
 * 以下程序可以计算在n天中光的传播距离
 * 但由于数据类型使用的不合理，所以得到的结果是不正确的
 */
public class SpeedOfLight01 {
    public static void main(String[] args) {
        int speed=299792458;// 光速，每秒299792458米
        int days;// 天数
        int seconds;// 秒
        int distance;// 距离

        days = 1;
        seconds = days * 24*60*60;// days天中的总秒数
        distance = seconds*speed;
        System.out.println(days+"天光可以传播"+distance+"米。");// 1天光可以传播-879390976米。
    }
}
