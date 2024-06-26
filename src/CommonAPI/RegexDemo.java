package CommonAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        /* 有如下文本： “当好中国式现代化建设的坚定行动派、实干家”，
    这是习近平总书记提出的明确要求。全国两会结束不到一周，习近平总书记赴湖南考察，
    并在长沙主持召开新时代推动中部地区崛起座谈会，强调“地方党委和政府要扛起主体责任，
    坚决贯彻党中央决策部署，推动重点工作任务、重大改革事项落实落地”。*/

        //要统计国字出现的次数
        String str = "当好中国式现代化建设的坚定行动派、实干家，这是习近平总书记提出的明确要求。全国两会结束不到一周，习近平总书记赴湖南考察，并在长沙主持召开新时代推动中部地区崛起座谈会，强调“地方党委和政府要扛起主体责任，坚决贯彻党中央决策部署，推动重点工作任务、重大改革事项落实落地”。";
        //Pattern 是正则表达式
        //Matcher 文本匹配器，作用按照正则表达式的规则从头开始读取字符串
        Pattern p = Pattern.compile("中");
        Matcher m = p.matcher(str);

        boolean b = m.find();
        int count = 0;

        String s = m.group();
        System.out.println(s);


        while (b) {
            count++;
            b = m.find();
        }
        System.out.println("中字出现的次数为：" + count);

        //下面是正则表达式的一些基本规则
        //部分匹配但是只取出来完全匹配的部分
        String str1 = "Java的版本有：Java8、Java11、Java17";
        String regex = "Java(?=8|11|17)";
        Pattern pp = Pattern.compile(regex); //编译正则表达式
        Matcher mm = pp.matcher(str1); //创建匹配器
        while (mm.find()) {
            System.out.println(mm.group());
        }

        //忽略大小写的匹配
        String str2 = "Java的版本有：JAVa8、Java11、Java17";
        String regex2 = "((?i)java)";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str2);
        while (m2.find()) {
            System.out.println(m2.group());
        }
    }





}
