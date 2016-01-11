import java.util.Arrays;

/**
 * 二维数组：数组的数组，规则的二维数组就像是一张二维表
 * Java中可以声明和使用多维数组，但在开发工作中极少使用
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        // 声明一个int类型的二维数组
        // 数组中的元素是四个int类型的一维数组
        // 每个一维数组中又包含三个int类型的元素
        // {
        //  {0, 0, 0},
        //  {0, 0, 0},
        //  {0, 0, 0},
        //  {0, 0, 0}
        // }
        int[][] arr1 = new int[4][3];

        // 访问二维数组中的元素需要使用二维索引
        // 第一维度索引定位行，第二个维度索引定位行中的元素
        // 执行以下两行后，数组中的值会变为以下形式：
        // {
        //  {0, 0, 0},
        //  {0, 0, 10},
        //  {0, 0, 0},
        //  {100, 0, 0}
        // }
        arr1[1][2] = 10;
        arr1[3][0] = 100;
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));
        System.out.println(Arrays.toString(arr1[3]));
        System.out.println("------------------------------");

        // 二维数组也可以在声明时进行值的初始化
        // 以下语句声明并初始化了一个二维数组（char[3][4]）
        char[][] arr2 = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));
        System.out.println("------------------------------");

        // 在二维数组声明时直接初始化时，也可以生成不规则的二维数组
        // 在真实开发工作中不常使用
        char[][] arr3 = {{'a', 'b'}, {'c', 'd', 'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(Arrays.toString(arr3[1]));
        System.out.println(Arrays.toString(arr3[2]));
    }
}
