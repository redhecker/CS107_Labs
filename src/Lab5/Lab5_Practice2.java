package Lab5;

import java.util.Scanner;

public class Lab5_Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int s = input.nextInt();
        System.out.printf("Please input %d scores of these students:" , s );
        double [] c = new double[s];
        double min = 100 , max = 0 ;

        for ( int i = 0 ; i < c.length ; i++ ){
            double a = input.nextDouble();
            if ( a < min ){
                min = a ;
            }
            if ( a > max ){
                max = a ;
            }
            c[i] = a ;
        }

        double total = 0 ;
        for ( double i : c ){
            total += i ;
        }
        total -= min ;
        total -= max ;
        total /= (s-2) ;
        System.out.printf("Average score is %.2f " , total );

    }
}
