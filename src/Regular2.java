import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular2 {
    public static void main(String[] args) {
        String text = "25:17 Стой, убью, студент! 22:63 Это же хулиганство получишь пятнадцать суток 02:48 Если я встану - ты у меня ляжешь.";
        Pattern p1 = Pattern.compile("(\\d\\d):(\\d\\d)");
        Matcher m = p1.matcher(text);
        while (m.find()) {
            int h= Integer.parseInt(m.group(1));
            int min = Integer.parseInt(m.group(2));
            if (h < 25 && min < 61)
                System.out.println(m.group(1)+":"+m.group(2)+"- соответствует корректному указанию времени");
            else
                System.out.println(m.group(1)+":"+m.group(2)+"- не соответствует корректному указанию времени");
            }
        }
    }

