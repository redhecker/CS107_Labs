package Lab5;

import java.util.Scanner;

public class Lab5_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int s = input.nextInt();
        int[] a = new int[s];
        int[] b = new int[s];

        System.out.printf("Enter the 1st integer array of size %d: " , s );
        for ( int i = 0 ; i < s ; i++ ){
            a[i] = input.nextInt();
        }

        System.out.printf("Enter the 2nd integer array of size %d: " , s );
        for ( int i = 0 ; i < s ; i++ ){
            b[i] = input.nextInt();
        }
        int m = 0 ;
        for ( int i = 0 ; i < s ; i++ ){
            if( a[i] != b[i] ){
                m++;
            }
        }

        if ( m == 0 ){
            System.out.print("The two arrays are equal.");
        }
        else {
            System.out.print("The two arrays are not equal.");
        }

    }
}