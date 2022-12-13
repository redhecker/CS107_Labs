package lab6;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = arr[0];
        arr[2] = new int[]{3, 4, 5, 6};

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        System.out.println("\n--------foreach 1---------");

        for (int e : arr[1]) {
            e = 0;
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("\n--------foreach 2---------");

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            a = new int[2];
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("\n--------foreach 3---------");

        for (int[] a : arr) {
            for (int i = 0; i < a.length; i++) {
                a[i]++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
