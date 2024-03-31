package CommonAPI;

public class regularExpression {
    //正则表达式
    public static void main(String[] args) {
        String qq1 = "1234567890";
        String qq2 = "123456a789";
        System.out.println("QQ号码" + qq1 + " " + CheckQQ(qq1));
        System.out.println("QQ号码" + qq2 + " " + CheckQQ(qq2));
    }

    public static boolean CheckQQ(String qq) {
        //正则表达式
        return qq.matches("[1-9][0-9]{5,11}");
//
//        //六位到十二位之间
//        int length = qq.length();
//        if(length < 6 || length > 12) {
//            return false;
//        }
//        //0不能开头
////        char c = qq.charAt(0);
////        if(c == '0') {
////            return false;
////        }
//        //0不能开头
//        if(qq.startsWith("0")) {
//            return false;
//        }
//        //必须全是数字
//        for (int i = 0; i < qq.length(); i++) {
//            char c = qq.charAt(i);
//            if(c < '0' || c > '9') {
//                return false;
//            }
//        }
//        return true;
    }
}
