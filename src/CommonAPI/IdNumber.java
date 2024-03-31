package CommonAPI;

import java.util.Scanner;

public class IdNumber {

    // 入口
    public static void main(String[] args) {

        // 键盘输入身份证号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String idNumber = scanner.nextLine();

        // 处理最后一位为 x 的情况，小写转大写
        idNumber = idNumber.toUpperCase();

        // 判断身份证号是否合法
        Boolean idLegit = judgeId(idNumber);
        if (idLegit) {
            String address = getAddress(getStr(idNumber, 0, 5));
            String birthday = getBirthday(getStr(idNumber, 6, 13));
            String gender = getGender(getStr(idNumber, 16, 16));
            System.out.println("您的居住地：" + address);
            System.out.println("您的生日：" + birthday);
            System.out.println("您的性别：" + gender);
        } else System.out.println("身份证号有误！请重启程序");

    }

    // 判断身份证号是否合法
    public static Boolean judgeId(String id) {
        Boolean result = true;

        // 长度不等于 18 位
        if (id.length() != 18) return false;

        // 系数算法
        String tempId = getStr(id, 0, 16);
        int[] coeff = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] end = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int sum = 0;
        for (int i = 0; i < tempId.length(); i++) {
            int bye = tempId.charAt(i) - '0';
            sum += bye * coeff[i];
        }
        sum %= 11;
        if (end[sum] != getStr(id, 17, 17).charAt(0)) result = false;

        return result;
    }

    // 截取字符串的方法
    public static String getStr(String str, int a, int b) {
        b++;
        return str.substring(a, b);
    }

    // 获取地址信息
    public static String getAddress(String num) {
        String str0 = getStr(num, 0, 1);
        String str1 = getStr(num, 2, 3);
        String str2 = getStr(num, 4, 5);
        String address = "";
        switch (str0) {
            case "11":
                address += "北京-";
                break;
            case "12":
                address += "天津-";
                break;
            case "13":
                address += "河北-";
                break;
            case "14":
                address += "山西-";
                break;
            case "15":
                address += "内蒙古自治区-";
                switch (str1) {
                    case "01":
                        address += "呼和浩特市-";
                        switch (str2) {
                            case "02":
                                address += "新城区";
                                break;
                            case "03":
                                address += "回民区";
                                break;
                            case "04":
                                address += "玉泉区";
                                break;
                            case "05":
                                address += "赛罕区";
                                break;
                            case "21":
                                address += "土默特左旗";
                                break;
                            case "22":
                                address += "托克托县";
                                break;
                            case "23":
                                address += "和林格尔县";
                                break;
                            case "24":
                                address += "清水河县";
                                break;
                            case "25":
                                address += "武川县";
                                break;
                        }
                        break;
                    case "02":
                        address += "包头市-";
                        switch (str2) {
                            case "02":
                                address += "东河区";
                                break;
                            case "03":
                                address += "昆都仓区";
                                break;
                            case "04":
                                address += "青山区";
                                break;
                            case "05":
                                address += "石拐区";
                                break;
                            case "06":
                                address += "白云鄂博矿区";
                                break;
                            case "07":
                                address += "九原区";
                                break;
                            case "21":
                                address += "土默特右旗";
                                break;
                            case "22":
                                address += "固阳县";
                                break;
                            case "23":
                                address += "达尔罕茂明安联合旗";
                                break;
                        }
                        break;
                    case "03":
                        address += "乌海市-";
                        switch (str2) {
                            case "02":
                                address += "海勃湾区";
                                break;
                            case "03":
                                address += "海南区";
                                break;
                            case "04":
                                address += "乌达区";
                                break;
                        }
                        break;
                    case "04":
                        address += "赤峰市-";
                        switch (str2) {
                            case "02":
                                address += "红山区";
                                break;
                            case "03":
                                address += "元宝山区";
                                break;
                            case "04":
                                address += "松山区";
                                break;
                            case "21":
                                address += "阿鲁科尔沁旗";
                                break;
                            case "22":
                                address += "巴林左旗";
                                break;
                            case "23":
                                address += "巴林右旗";
                                break;
                            case "24":
                                address += "林西县";
                                break;
                            case "25":
                                address += "克什克腾旗";
                                break;
                            case "26":
                                address += "翁牛特旗";
                                break;
                            case "28":
                                address += "喀喇沁旗";
                                break;
                            case "29":
                                address += "宁城县";
                                break;
                            case "30":
                                address += "敖汉旗";
                                break;
                        }
                        break;
                    case "05":
                        address += "通辽市-";
                        switch (str2) {
                            case "02":
                                address += "科尔沁区";
                                break;
                            case "21":
                                address += "科左中旗";
                                break;
                            case "22":
                                address += "科尔沁右翼后旗";
                                break;
                            case "23":
                                address += "开鲁县";
                                break;
                            case "24":
                                address += "库论县";
                                break;
                            case "25":
                                address += "奈曼旗";
                                break;
                            case "26":
                                address += "扎鲁特旗";
                                break;
                            case "81":
                                address += "霍林郭勒市";
                                break;
                        }
                        break;
                    case "06":
                        address += "鄂尔多斯市-";
                        switch (str2) {
                            case "02":
                                address += "东胜区";
                                break;
                            case "21":
                                address += "达拉特旗";
                                break;
                            case "22":
                                address += "准格尔旗";
                                break;
                            case "23":
                                address += "鄂托克前旗";
                                break;
                            case "24":
                                address += "鄂托克旗";
                                break;
                            case "25":
                                address += "杭锦旗";
                                break;
                            case "26":
                                address += "乌审旗";
                                break;
                            case "27":
                                address += "伊金霍洛旗";
                                break;
                        }
                        break;
                    case "07":
                        address += "呼伦贝尔市-";
                        switch (str2) {
                            case "02":
                                address += "海拉尔区";
                                break;
                            case "21":
                                address += "阿荣旗";
                                break;
                            case "22":
                                address += "莫旗";
                                break;
                            case "23":
                                address += "鄂伦春旗";
                                break;
                            case "24":
                                address += "鄂温克族旗";
                                break;
                            case "25":
                                address += "陈巴尔虎旗";
                                break;
                            case "26":
                                address += "新巴尔虎左旗";
                                break;
                            case "27":
                                address += "新巴尔虎右旗";
                                break;
                            case "81":
                                address += "满洲里市";
                                break;
                            case "82":
                                address += "牙克石市";
                                break;
                            case "83":
                                address += "扎兰屯市";
                                break;
                            case "84":
                                address += "额尔古纳市";
                                break;
                            case "85":
                                address += "根河市";
                                break;
                        }
                        break;
                    case "08":
                        address += "巴彦淖尔市-";
                        switch (str2) {
                            case "02":
                                address += "临河区";
                                break;
                            case "21":
                                address += "五原县";
                                break;
                            case "22":
                                address += "磴口县";
                                break;
                            case "23":
                                address += "乌拉特前旗";
                                break;
                            case "24":
                                address += "乌拉特中旗";
                                break;
                            case "25":
                                address += "乌拉特后旗";
                                break;
                            case "26":
                                address += "杭锦后旗";
                                break;
                        }
                        break;
                    case "09":
                        address += "乌兰察布市-";
                        switch (str2) {
                            case "02":
                                address += "集宁区";
                                break;
                            case "21":
                                address += "卓资县";
                                break;
                            case "22":
                                address += "化德县";
                                break;
                            case "23":
                                address += "商都县";
                                break;
                            case "24":
                                address += "兴和县";
                                break;
                            case "25":
                                address += "凉城县";
                                break;
                            case "26":
                                address += "察哈尔右翼前旗";
                                break;
                            case "27":
                                address += "察哈尔右翼中旗";
                                break;
                            case "28":
                                address += "察哈尔右翼后旗";
                                break;
                            case "29":
                                address += "四子王旗";
                                break;
                            case "81":
                                address += "丰镇市";
                                break;
                        }
                        break;
                    case "22":
                        address += "兴安盟-";
                        switch (str2) {
                            case "01":
                                address += "乌兰浩特市";
                                break;
                            case "02":
                                address += "阿尔山市";
                                break;
                            case "21":
                                address += "科尔沁右翼前旗";
                                break;
                            case "22":
                                address += "科尔沁右翼中旗";
                                break;
                            case "23":
                                address += "扎赉特旗";
                                break;
                            case "24":
                                address += "突泉县";
                                break;
                        }
                        break;
                    case "25":
                        address += "锡林郭勒盟-";
                        switch (str2) {
                            case "01":
                                address += "二连浩特市";
                                break;
                            case "02":
                                address += "锡林浩特市";
                                break;
                            case "22":
                                address += "阿巴嘎旗";
                                break;
                            case "23":
                                address += "苏尼特左旗";
                                break;
                            case "24":
                                address += "苏尼特右旗";
                                break;
                            case "25":
                                address += "东乌珠穆沁旗";
                                break;
                            case "26":
                                address += "西乌珠穆沁旗";
                                break;
                            case "27":
                                address += "太仆寺旗";
                                break;
                            case "28":
                                address += "镶黄旗";
                                break;
                            case "29":
                                address += "正镶白旗";
                                break;
                            case "30":
                                address += "正蓝旗";
                                break;
                            case "31":
                                address += "多伦县";
                                break;
                        }
                        break;
                    case "29":
                        address += "阿拉善盟-";
                        switch (str2) {
                            case "21":
                                address += "阿拉善左旗";
                                break;
                            case "22":
                                address += "阿拉善右旗";
                                break;
                            case "23":
                                address += "额济纳旗";
                                break;
                        }
                        break;
                }
                break;
            case "21":
                address += "辽宁-";
                break;
            case "22":
                address += "吉林-";
                break;
            case "23":
                address += "黑龙江-";
                break;
            case "31":
                address += "上海-";
                break;
            case "32":
                address += "江苏-";
                break;
            case "33":
                address += "浙江-";
                break;
            case "34":
                address += "安徽-";
                break;
            case "35":
                address += "福建-";
                break;
            case "36":
                address += "江西-";
                break;
            case "37":
                address += "山东-";
                break;
            case "41":
                address += "河南-";
                break;
            case "42":
                address += "湖北-";
                break;
            case "43":
                address += "湖南-";
                break;
            case "44":
                address += "广西-";
                break;
            case "45":
                address += "广东-";
                break;
            case "46":
                address += "海南-";
                break;
            case "50":
                address += "重庆-";
                break;
            case "51":
                address += "四川-";
                break;
            case "52":
                address += "贵州-";
                break;
            case "53":
                address += "云南-";
                break;
            case "54":
                address += "西藏-";
                break;
            case "61":
                address += "陕西-";
                break;
            case "62":
                address += "甘肃-";
                break;
            case "63":
                address += "青海-";
                break;
            case "64":
                address += "宁夏-";
                break;
            case "65":
                address += "新疆-";

                break;
            case "71":
                address += "台湾-";
                break;
            case "81":
                address += "香港-";
                break;
            case "82":
                address += "澳门-";
                break;
        }
        return address;
    }

    // 获取生日信息
    public static String getBirthday(String num) {
        String y = getStr(num, 0, 3);
        String m = getStr(num, 4, 5);
        String d = getStr(num, 6, 7);
        return y + "-" + m + "-" + d;
    }

    // 获取性别信息
    public static String getGender(String num) {
        int gendetNum = num.charAt(0) - '0';
        return gendetNum % 2 == 0 ? "女" : "男";
    }

}
