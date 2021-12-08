import java.text.DecimalFormat;

public class IntroTaskQuadraticEquation {
    public static void main(String[] args) {

        int a = 1;
        int b = -8;
        int c = 8;
        double d = b * b - 4 * a * c;
        DecimalFormat df = new DecimalFormat("#.##");
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            if (x1 > x2)
                System.out.println("два решения: x2 = " + df.format(x2) + ", x1 = " + df.format(x1));
            else
                System.out.println("два решения: x1 = " + df.format(x1) + ", x2 = " + df.format(x2));
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("одно решение: x = " + df.format(x));
        } else {
            System.out.println("решений нет");
        }
    }
}
