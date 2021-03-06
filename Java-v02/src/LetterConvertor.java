/**
 * 对给出的字母进行大小写转换
 * 利用的是char和int可以进行转换的语言特性
 */
public class LetterConvertor {
    public static void main(String[] args) {
        char letter = '1';

        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + "的小写形式为" + (char) (letter + 32));
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + "的大写形式为" + (char) (letter - 32));
        } else {
            System.out.println(letter + "不支持大小写转换");
        }
    }
}
