package Lab5;

import java.util.Scanner;

public class Lab5_Practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you will input: ");
        int s = input.nextInt();
        int[] a = new int[s];
        for ( int i=0 ; i < a.length ; i++ ){
            a[i] = input.nextInt();
        }

        int n = 0;
        while ( n != s-1 ){
            n = 0 ;
            for ( int i=0 ; i < s-1 ; i++ ) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }else { n++; }
            }
        }

        for( int i : a ){
            System.out.print( i + " ");
        }

    }
}
