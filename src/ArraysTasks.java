import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(even(13)));

        int[] a1 = new int[]{3, 3, 3};
        int[] a2 = new int[]{3, 5, 3, 8};
        int[] a3 = new int[]{9};
        System.out.println(allSimilar(a1));
        System.out.println(allSimilar(a2));
        System.out.println(allSimilar(a3));

        System.out.println(hasSimilar(a1));
        System.out.println(hasSimilar(a2));
        System.out.println(hasSimilar(a3));

        System.out.println(mean(a1));
        System.out.println(mean(a2));
        System.out.println(mean(a3));
    }

    private static int[] even(int n) {
        int[] array = new int[n];
        for (int x = 0; x < n; x++)
            array[x] = 2 * (x+1);
        return array;
    }

    private static boolean allSimilar(int[] a) {
        int y = a[0];
        for (int number:a) {
            if (number != y)
                return false;
        }
        return true;
    }

    private static boolean hasSimilar(int[] a) {
        for (int z = 0; z < a.length - 1; z++) {
            int q = a[z];
            for (int p = z+1; p < a.length; p++) {
                if (a[p] == q)
                    return true;
            }
        }
        return false;
    }

    private static double mean(int[] a) {
        double summa = 0;
        for (int elem: a)
            summa = summa + elem;
        double average = summa / a.length;
        return average;
    }
}
