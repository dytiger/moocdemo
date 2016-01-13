/**
 * 有10评委为选手打分，去掉一个最高分和一个最低分，计算其它8个分数的平均值
 */
public class ForDemo13 {
    public static void main(String[] args) {
        // 模拟10个数字
        double[] arr = { 9, 8.3, 6.3, 8.2, 7.9, 9.8, 9.2, 9.0, 9.9, 6.9 };
        double temp = 0.0;
        // 由小到大对数组进行排序
        for (int i = arr.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (arr[j + 1] < arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 输出排序后的数组元素
        for (double d : arr) {
            System.out.println(d);
        }
        // 求从第二个元素开始，到倒数第二个元素结束的8个数值的总和
        double sum = 0.0;
        for (int i = 1; i < arr.length-1; i++) {
            sum += arr[i];
        }
        // 计算平均值
        System.out.println(sum/8);
    }
}
