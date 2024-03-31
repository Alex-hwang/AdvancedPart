package CommonAPI;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        String s = "dvs154224@126.com,DSBHhello123hello2253940186@qq.com,ccvhvbkhj135554@qq.com";
        Pattern pattern = Pattern.compile("(\\d+)@((\\w+)(\\.)(\\w+))");

        ArrayList<String> matchedStrings = new ArrayList<>();

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            matchedStrings.add(matcher.group(1) + matcher.group(2));
        }

        // 输出匹配结果
        for (String match : matchedStrings) {
            System.out.println(match);
        }
    }
}