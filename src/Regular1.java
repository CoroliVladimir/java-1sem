import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular1 {
    public static void main(String[] args) {
        String text = "snc dnc vladimir@gmail.com";
        Pattern p1 = Pattern.compile("\\b[a-z]+@[a-z]+\\.[a-z]{2,4}\\b");
        Matcher m = p1.matcher(text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }
        String text2 = "snc dnc vladimir_000-201@gmail.com";
        Pattern p2 = Pattern.compile("\\b[a-z0-9_-]+@[a-z]+\\.[a-z]{2,4}\\b");
        Matcher m2 = p2.matcher(text2);
        while (m2.find()) {
            System.out.println(text2.substring(m2.start(), m2.end()));
        }
        String text3 = "vladimir_000-201@gmail.com";
        Pattern p3 = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        Matcher m3 = p3.matcher(text3);
        while (m3.find()) {
            System.out.println(text3.substring(m3.start(), m3.end()));
        }
    }

}
