import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular5 {
    public static void main(String[] args) {
        String text = "Кот кОторый ел котлеты упал в котёл и коТопультировался.";
        Pattern p1 = Pattern.compile("[Кк][Оо][Тт]");
        Matcher m = p1.matcher(text);
        int cat = 0;
        while (m.find()) {
            cat = cat + 1;
        }
        System.out.println(cat + "- столько котов мы встретили");
        String text2 = "Кот который ел котлеты упал в котёл и котопультировался.";
        Pattern p2 = Pattern.compile("\\b[Кк][Оо][Тт]\\b");
        Matcher m2 = p2.matcher(text2);
        int cat2 = 0;
        while (m2.find()) {
            cat2 = cat2 + 1;
        }
        System.out.println(cat2 + "- столько котов мы встретили");
    }
}
