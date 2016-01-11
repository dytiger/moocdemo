import java.util.Arrays;
import java.util.Random;

/**
 * 随机生成一张8行6列的密保卡
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        // 声明8行6列的一张空卡
        int[][] card = new int[8][6];
        // 得到Java的随机数对象
        Random random = new Random();
        // 打印列号
        System.out.println("   A  B  C  D  E  F");
        // 外层循环数组的第一维度（行）
        for (int i = 0; i < card.length; i++) {
            // 打印行号
            System.out.print((i + 1) + " ");
            // 内层循环数组的第二维度（单元格）
            for (int j = 0; j < card[i].length; j++) {
                // 随机生成0~99之间的一个数字，赋值给当前二维数组元素
                card[i][j] = random.nextInt(100);
                // 如果结果数字小于10，前边补0对齐，否则直接输出
                if (card[i][j] < 10) {
                    System.out.print("0" + card[i][j]);
                } else {
                    System.out.print(card[i][j]);
                }
                // 对齐
                System.out.print(" ");
            }
            // 换行
            System.out.println();
        }

        System.out.println("------------------------------");
        // 从数组中输出所有元素值，可以用于验证
        for (int i = 0; i < card.length; i++) {
            System.out.println(Arrays.toString(card[i]));
        }
    }
}
