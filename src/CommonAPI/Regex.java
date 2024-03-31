package CommonAPI;

import java.util.Scanner;

public class Regex {
    //按照一个正确的数据从左到右依次匹配
    public static void main(String[] args) {
        //验证手机号码
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入手机号码：");
            String number = sc.nextLine();
            String regexPhone = "1[3-9]\\d{9}";
            if (!(number.matches(regexPhone))) {
                System.out.println("输入有误，请重新输入");
            } else {
                String regexT = "(133|153|173|177|180|181|189|190|191|193|199)\\d{8}";
                String regexU = "(130|131|132|145|155|156|166|167|171|175|176|185|186|196)\\d{8}";
                String regexC = "(134|135|136|137|138|139|147|148|150|151|152|157|158|159|172|178|182|183|184|187|188|195|197|198)\\d{8}";
                if (number.matches(regexT)) {
                    System.out.println("电信");
                } else if (number.matches(regexU)) {
                    System.out.println("联通");
                } else if (number.matches(regexC)) {
                    System.out.println("移动");
                } else {
                    System.out.println("未知");
                }
            }

        }
        //验证身份证号码


    }
}
