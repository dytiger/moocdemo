/**
 * 算出所有3位数字的阿姆斯特朗数，
 * 即每个数字各数位的3次方相加之和恰好等于这个数字，
 * 如153=1的3次方+5的3次方+3的3次方
 */
public class ForDemo14 {
    public static void main(String[] args) {
        // i是百位数、j是十位数、k是个位数
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int armNum = i * 100 + j * 10 + k;
                    int compare = i * i * i + j * j * j + k * k * k;
                    if (armNum == compare)
                        System.out.println(armNum);
                }
            }
        }
        System.out.println("-----------------");
        for(int i = 100;i<=999;i++){
            int x = i%10;// 个位
            int y = i%100/10;// 十位
            int z = i/100;// 百位
            if((x*x*x+y*y*y+z*z*z)==i){
                System.out.println(i);
            }
        }
    }
}
