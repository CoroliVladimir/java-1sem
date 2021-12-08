public class IntroTaskLeap {
    public static void main(String[] args) {
        int num = 2020;
        if (num % 100==0 && num % 400 ==0 )
            System.out.println(num + "- високосный год");
        else if (num % 4 == 0 && num % 100 > 0)
            System.out.println(num + "- високосный год");
        else if (num % 100 == 0)
            System.out.println(num + "- не високосный год");
        else
            System.out.println(num + "- не високосный год");
    }
}
