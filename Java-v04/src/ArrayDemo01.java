import java.util.Arrays;

/**
 * 数组的声明和使用
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        // 声明一个int类型的数组，其中可以包含5个int类型的元素
        // 当声明数组完成后：
        // 整数类型的数组所有元素会被统一赋初值为0
        // 浮点数类型的数组所有元素会被统一赋初值为0.0
        // 字符类型的数组所有元素会被统一赋初值为'\u0000'（Unicode编码为0的空字符）
        // 布尔类型的数组所有元素会被统一赋初值为false
        // 引用类型的数组所有元素会被统一赋初值为null
        int[] arr1 = new int[5];
        // 另外一种数组的声明方式，与第一种声明方式的效果一致
        // 两种数组的声明方式推荐使用第一种，因为int[]的类型表述性更好
        int arr2[] = new int[5];

        double[] arr3 = new double[5];

        char[] arr4 = new char[5];

        boolean[] arr5 = new boolean[5];

        String[] arr6 = new String[5];

        System.out.println(Arrays.toString(arr1));// [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr2));// [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr3));// [0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(arr4));// [ ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(arr5));// [false, false, false, false, false]
        System.out.println(Arrays.toString(arr6));// [null, null, null, null, null]
        System.out.println("------------------------------");

        // 可以通过length属性来访问数组的元素总数
        System.out.println(arr1.length);// 5
        System.out.println(arr2.length);// 5
        System.out.println(arr3.length);// 5
        System.out.println(arr4.length);// 5
        System.out.println(arr5.length);// 5
        System.out.println(arr6.length);// 5
        System.out.println("------------------------------");

        // 每个数组元素都有一个索引值，通过索引值可以访问或修改数组中特定元素的值
        // 数组中的第一个元素的索引值是0，最后一个元素的索引值是元素的总数减1
        // 如果在访问数组元素时使用了超出[0,length-1]的范围区间，则程序会抛出数组越界异常
        arr1[0] = 10;// 把arr1这个数组的第一个元素赋值为10
        arr2[1] = 100;// 把arr2这个数组的第二个元素赋值为100
        arr3[2] = 3.14;// 把arr3这个数组的第三个元素赋值为3.14
        arr4[3] = 'Z';// 把arr4这个数组的第四个元素赋值为'Z'
        arr5[4] = true;// 把arr5这个数组的第五个元素赋值为true
        arr6[2] = "abc";// 把arr6这个数组的第三个元素赋值为"abc"

        // 以下两行语句中使用的数组索引超出了[0,length-1]的范围
        // 所以会抛出java.lang.ArrayIndexOutOfBoundsException异常
        // System.out.println(arr1[-1]);
        // System.out.println(arr1[5]);

        System.out.println(Arrays.toString(arr1));// [10, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr2));// [0, 100, 0, 0, 0]
        System.out.println(Arrays.toString(arr3));// [0.0, 0.0, 3.14, 0.0, 0.0]
        System.out.println(Arrays.toString(arr4));// [ ,  ,  , Z,  ]
        System.out.println(Arrays.toString(arr5));// [false, false, false, false, true]
        System.out.println(Arrays.toString(arr6));// [null, null, abc, null, null]
        System.out.println("------------------------------");

        // 可以在数组的声明时为其初始化所有元素的值
        // 声明一个int类型的数组，为其初始化了5个元素值，分别是1,2,3,4,5
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr7));// [1, 2, 3, 4, 5]
    }
}
