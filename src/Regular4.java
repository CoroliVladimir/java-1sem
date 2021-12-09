import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular4 {
    public static void main(String[] args) {
        System.out.println("Какая-то сине-зеленая трава.".replaceAll("([а-яА-Я]+)-([а-яА-Я]+)", "$2-$1"));
    }
}
