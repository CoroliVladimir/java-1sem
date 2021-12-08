public class IntroTaskCat {
    public static void main(String[] args) {
        int num = 24;
        if (num == 0 || 5 <= num && num <= 20 || 5 <= num % 10 && num % 10 <= 9 || num % 100 == 0 || num % 10 == 0 || 5< num % 100 && num % 100 < 19)
            System.out.println(num + " котов");
        else if (num == 1 || num % 10 == 1)
            System.out.println(num + " кот");
        else if (2 <= num && num <= 4 || 2<= num % 10 && num% 10 <= 4)
            System.out.println(num + " кота");

    }
}
