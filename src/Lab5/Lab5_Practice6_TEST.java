package Lab5;

import java.util.Random;
import java.util.Scanner;

public class Lab5_Practice6_TEST {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner input = new Scanner( System.in );
        int n = input.nextInt();

        long current1 = System.currentTimeMillis();
        for ( int j = 0 ; j < n/100 ; j++ ) {
            int m = 0, sum = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                int s = random.nextInt(3);
                m += s;
                a[i] = m;
                sum += m;
            }

            double average = (double) sum / n;
            int db = (int) (average * 2), pairs = 0, pos = n - 1;

            for ( int i = n-1 ; i >= 0 ; i--){
                if( a[i]+a[i-1] < db ){break;}
                for ( int h = i-1 ; h >= 0 ; h--){
                    if( a[h]+a[i] > db ){ pairs++; }
                    else{break;}
                }
            }

            count++;

        }

        long current2 = System.currentTimeMillis();
        System.out.println(count);
        System.out.printf("%.3f s" , (current2-current1)/1000.0d);
    }
}
