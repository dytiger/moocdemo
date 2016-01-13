import java.util.Arrays;

/**
 * 新的对数组遍历方式
 */
public class ForDemo06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 流化数组，使用使用forEach方法遍历数组，使用方法引用对数组元素进行输出
        Arrays.stream(arr).forEach(System.out::println);
    }
}
