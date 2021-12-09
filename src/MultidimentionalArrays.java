import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        printTable(new int[][] {{10, 1, 1000000, 44, 4244}, {111, 432, 44}, {5, 27, 1, 33, 123523, 6}});
        printTableAligned(new int[][] {{10, 1, 1000000, 44, 4244}, {111, 432, 44}, {5, 27, 1, 33, 123523, 6}});

        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }


    private static char[][] createTable(int x, char y) {
        char[][] points = new char[x][x];
        for (char[] array: points)
            for (int q = 0; q < array.length; q++)
                array[q] = y;
        return points;
    }

    private static void printTable(char[][] z) {
        for (char[] string: z) {
            String ready = "";
            for (char symbol: string)
                ready = ready + symbol + ' ';
            System.out.println(ready);
        }
    }

    private static char[][] fillFirstAndLastLines(char[][] m, char z) {
        Arrays.fill(m[0], z);
        Arrays.fill(m[m.length -1], z);
        return m;
    }

    private static char[][] fillFirstAndLastColumns(char[][] m, char z) {
        for (char[] array: m) {
            array[0] = z;
            array[array.length - 1] = z;
        }
        return m;
    }


    private static void printTable(int[][] a) {
        for (int[] string: a) {
            String s = "";
            for (int num: string)
                s = s + num + ' ';
            System.out.println(s);
        }
    }

    public static void printTableAligned(int[][] a) {
        int coln = 0;
        for (int[] array: a) {
            if (array.length > coln)
                coln = array.length;
        }
        int[] coll = new int[coln];
        for (int[] array: a) {
            for (int p = 0; p < array.length; p++) {
                if (Integer.toString(array[p]).length() > coll[p])
                    coll[p] = Integer.toString(array[p]).length();
            }
        }
        for (int[] string: a) {
            String res = "";
            int p = 0;
            for (int i = 0; i < string.length; i++) {
                p = coll[i] - Integer.toString(string[i]).length();
                String s = "";
                for (int j = 0; j < p; j++)
                    s = s + ' ';
                res = res + s + string[i] + "  ";
            }
            System.out.println(res);
        }
    }
}
