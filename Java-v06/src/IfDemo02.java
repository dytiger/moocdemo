import java.util.Random;

/**
 * if-else语句
 */
public class IfDemo02 {
    public static void main(String[] args) {
        // 得到生成随机值的对象
        Random random = new Random();
        // 随机生成boolean类型的值并赋给sunny变量
        boolean sunny = random.nextBoolean();
        // 对if括号中的逻辑值进行判断，如果为true则执行if语句块中的语句
        // 否则执行else语句块中的语句
        // if块与else块是互斥的
        // 如果if语句块和else语句块中只有一条语句，则可以省略定义if和else语句块的一对{}，
        // 但出于程序的可读性考虑，不建议这样做
        if(sunny){
            System.out.println("今天天气不错，可以去郊游。");
        }else{
            System.out.println("今天天气不好，去图书馆看书。");
        }
        System.out.println("回家睡觉");
    }
}
