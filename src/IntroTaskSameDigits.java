public class IntroTaskSameDigits {
    public static void main(String[] args) {
        int num = 11;
        int module = Math.abs(num);
        int x = (module / 10) % 10;
        if (module % 10 ==x) {
            System.out.println(num + " Последние цифры одинаковы");
        } else {
            System.out.println(num + " Последние две цифры не одинаковы");
        }
    }
}
