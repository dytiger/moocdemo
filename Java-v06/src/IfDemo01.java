import java.util.Random;

/**
 * if语句
 */
public class IfDemo01 {
    public static void main(String[] args) {
        // 得到生成随机值的对象
        Random random = new Random();
        // 随机生成boolean类型的值并赋给sunny变量
        boolean sunny = random.nextBoolean();
        // 对if括号中的逻辑值进行判断，如果为true则执行if语句块中的语句
        // 否则执行if语句块后的其它语句
        // 本例中的if(sunny)也可以写为if(sunny==true)，但在语言表达上比较冗余
        // 如果if语句块中只有一条语句，则可以省略定义if块的一对{}，
        // 但出于程序的可读性考虑，不建议这样做
        if(sunny){
            System.out.println("今天是晴天，可以去爬山。");
        }
        System.out.println("回家睡觉");
    }
}
