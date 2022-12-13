package Lab5;

import java.util.Arrays;

public class Lab5_Ex1 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = new int[5];
        array2[0] = 6;
        array2[1] = 7;
        array2[2] = 8;
        array2[3] = 9;
        array2[4] = 10;


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        for (int e : array2) {
            System.out.print(e + "\t");
        }
        System.out.println();

        int[] array3 = null;
        System.out.println(array3);

        array3=array2;
        System.out.println(array3);
        System.out.println(Arrays.toString(array3));

        char[] array4 = {'a', 'b', 'c'};
        System.out.println(array4);

    }
}
