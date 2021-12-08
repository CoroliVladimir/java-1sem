class IntroTask3Digits {
    public static void main(String[] args) {
        int num = 100;
        if (num > 99 && num<1000) {
            System.out.println(num + "- в этом числе ровно три цифры");
        } else {
            System.out.println(num + "- не трехзначное");
        }
    }
}