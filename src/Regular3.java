import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular3 {
    public static void main(String[] args) {
        String text = "Это строка , у которой зачем-то ,написаны два пробела     , перед запятой.";
        Pattern p1 = Pattern.compile("\s+,");
        Matcher m = p1.matcher(text);
        while (m.find()) {
            System.out.println(m.replaceAll(","));
        }
    }
}
